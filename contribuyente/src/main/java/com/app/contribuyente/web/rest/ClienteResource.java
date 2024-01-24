package com.app.contribuyente.web.rest;


import com.app.contribuyente.domain.Contribuyente;
import com.app.contribuyente.repository.ClienteRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/api")
public class ClienteResource {

   private ClienteRepository clienteRepository;

   public ClienteResource(ClienteRepository clienteRepository) {
      this.clienteRepository = clienteRepository;
   }

   @GetMapping("/clients")
    public ResponseEntity <List <Contribuyente>> getAllClients(){
       List<Contribuyente> query= clienteRepository.findAll();
       return ResponseEntity.ok().body(query);

   }

   @GetMapping("/clients/{document}")
   public ResponseEntity <Contribuyente>getClientDocumentId(@PathVariable Integer document){

      Optional <Contribuyente> query= this.clienteRepository.findById( document);
      if(query.isPresent()){
         return ResponseEntity.ok().body(query.orElse(null));

      }else {
         return ResponseEntity.badRequest().build();
      }


   }
}
