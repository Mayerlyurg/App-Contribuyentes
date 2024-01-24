import { CommonModule } from '@angular/common';
import { HttpClient } from '@angular/common/http';
import { Component, Input, Output } from '@angular/core';
import { ContribuyenteService } from '../../services/contribuyente.service';
import { FormBuilder, FormsModule ,FormGroup, ReactiveFormsModule} from '@angular/forms';
import { RouterModule } from '@angular/router';
import { ContribuyenteComponent } from '../contribuyente/contribuyente.component';
import { Contribuyente } from '../../models/contribuyente.model';


@Component({
  selector: 'app-contribuyentes',
  standalone: true,
  imports: [CommonModule,ReactiveFormsModule,RouterModule,ContribuyenteComponent],
  providers:[ContribuyenteService,FormsModule],
  templateUrl: './contribuyentes.component.html',
  styleUrl: './contribuyentes.component.css'
})
export class ContribuyentesComponent {




 document!:number;
contactForm!:FormGroup
contribuyente !:Contribuyente



  constructor( private readonly serviceDocument : ContribuyenteService ,private readonly fb: FormBuilder,private readonly http:HttpClient ,private readonly service: ContribuyenteService){

  }


  ngOnInit():void{
      this.contactForm=this.initForm()
  }


  welcome = 'Aqui podrá consultar la siguiente información:';
  tasks = [
    'Responsabilidades actuales del contribuyente',
    'Saldos pendiente por pagar',
  ]



  getContribuyentesById(){

    this.document=this.contactForm.value.document
    this.service.getContribuyentesById(this.document).subscribe(response=>{
      console.log(response)
      this.contribuyente = response;


    })



  }

imprimirCliente(){
  console.log (this.contribuyente)
}


  initForm():FormGroup{

    return this.fb.group({

      document:['']


  })

  }



}
