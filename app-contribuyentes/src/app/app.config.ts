import { ApplicationConfig, importProvidersFrom } from '@angular/core';
import { provideRouter } from '@angular/router';

import { routes } from './app.routes';
import { provideClientHydration } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';
import { CommonModule } from '@angular/common';
import { ContribuyentesComponent } from './components/contribuyentes/contribuyentes.component';
import { ContribuyenteComponent } from './components/contribuyente/contribuyente.component';
import { ContribuyenteService } from './services/contribuyente.service';

export const appConfig: ApplicationConfig = {
  providers: [provideRouter(routes), provideClientHydration(),importProvidersFrom (HttpClientModule,CommonModule,ContribuyenteService)]


};
