import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterOutlet } from '@angular/router';
import { ContribuyenteComponent } from './components/contribuyente/contribuyente.component';
import { ContribuyentesComponent } from './components/contribuyentes/contribuyentes.component';
import { HttpClientModule } from '@angular/common/http';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [CommonModule, RouterOutlet,ContribuyenteComponent,ContribuyentesComponent,HttpClientModule],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {





  welcome = 'Aqui podrá consultar la siguiente información:';
  tasks = [
    'Responsabilidades actuales del contribuyente',
    'Saldos pendiente por pagar',
  ]


}
