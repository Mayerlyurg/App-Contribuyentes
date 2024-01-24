package com.app.contribuyente.web.rest;


import com.app.contribuyente.domain.TipoDocumento;
import com.app.contribuyente.repository.TipoDocumentoRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/api")
public class TipoDocumentoResource {


    private TipoDocumentoRepository tipoDocumentoRepository;

    public TipoDocumentoResource(TipoDocumentoRepository tipoDocumentoRepository) {
        this.tipoDocumentoRepository = tipoDocumentoRepository;
    }

    @GetMapping("/documents")
    public ResponseEntity<List<TipoDocumento>> getAllDocuments(){
        List<TipoDocumento> query= tipoDocumentoRepository.findAll();
        return ResponseEntity.ok().body(query);

    }


    @GetMapping("/documents/{id}")
    public ResponseEntity <TipoDocumento>getDocumentType(@PathVariable Integer id){

        Optional<TipoDocumento > query= this.tipoDocumentoRepository.findById( id);
        if(query.isPresent()){
            return ResponseEntity.ok().body(query.orElse(null));

        }else {
            return ResponseEntity.badRequest().build();
        }


    }
}
