import { Component, Input ,OnInit} from '@angular/core';
import { ContribuyenteService } from '../../services/contribuyente.service';
import { Contribuyente } from '../../models/contribuyente.model';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-consultas',
  standalone: true,
  imports: [CommonModule],
  providers:[ContribuyenteService],
  templateUrl: './consultas.component.html',
  styleUrl: './consultas.component.css'
})
export class ConsultasComponent {


  contribuyentes !: Contribuyente[]

constructor(private readonly service: ContribuyenteService){

    this.getContribuyentes()
}


  getContribuyentes (){

    this.service.getContribuyentes().subscribe(response=>{
      this.contribuyentes= response;
    })
  }

}
