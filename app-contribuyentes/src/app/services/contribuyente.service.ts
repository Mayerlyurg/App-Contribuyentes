import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { environment } from '../../environments/environment';
import { Contribuyente } from '../models/contribuyente.model';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ContribuyenteService {

  constructor(private readonly Http: HttpClient ) { }

  private readonly resourceUrl= environment.api;
  private readonly document= 0;


createContribuyente ( contribuyente: Contribuyente):Observable <Contribuyente> {

  return this.Http.post<Contribuyente>(`${this.resourceUrl}clients`,contribuyente);
}



getContribuyentes():Observable<Contribuyente[]>{
  return this.Http.get<Contribuyente[]>(`${this.resourceUrl}clients`);
}




getContribuyentesById(document:number):Observable<Contribuyente>{
  console.log(this.resourceUrl)
  return this.Http.get<Contribuyente>(`${this.resourceUrl}clients/${document}`);
}






}

