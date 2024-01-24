import { Component, Input, ViewChild } from '@angular/core';
import { ContribuyenteService } from '../../services/contribuyente.service';
import { Contribuyente } from '../../models/contribuyente.model';
import { CommonModule } from '@angular/common';
import { HttpClient, HttpClientModule } from '@angular/common/http';

@Component({
  selector: 'app-contribuyente',
  standalone: true,
  imports: [CommonModule,HttpClientModule],
  providers:[ContribuyenteService],
  templateUrl: './contribuyente.component.html',
  styleUrl: './contribuyente.component.css'
})
export class   ContribuyenteComponent {



  documento!:number
  @Input() contribuyente!:Contribuyente|undefined
  contribuyentes : Contribuyente[]=[];




  constructor(private readonly contribuyenteService: ContribuyenteService, private readonly httpCliente : HttpClient){


  }


  getContribuyentes (){

    this.contribuyenteService.getContribuyentes().subscribe(response=>{
      console.log(response)
    })
  }


  getContribuyente(){
    console.log(this.contribuyente)
  }

  resetearContribuyente(){
    this.contribuyente= undefined;
  }

}
