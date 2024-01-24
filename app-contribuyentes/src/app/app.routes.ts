import { Routes } from '@angular/router';
import { ContribuyenteComponent } from './components/contribuyente/contribuyente.component';
import { ContribuyentesComponent } from './components/contribuyentes/contribuyentes.component';
import { ConsultasComponent } from './componentes/consultas/consultas.component';
export const routes: Routes = [


  {
    path :'',component:ContribuyentesComponent,  pathMatch:'full',data:{
      preload:true
    }
  },
  {


  path : 'app-contribuyente',component:ContribuyenteComponent, data:{
    preload:true
  },


  },

  {

    path : 'app-consultas',component:ConsultasComponent, data:{
      preload:true
    }
  }




];
