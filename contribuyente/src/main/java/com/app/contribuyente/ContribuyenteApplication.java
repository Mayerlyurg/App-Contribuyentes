package com.app.contribuyente;

import com.app.contribuyente.repository.ClienteRepository;
import com.app.contribuyente.repository.TipoDocumentoRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ContribuyenteApplication {



	private final ClienteRepository clienteRepository;
	private final TipoDocumentoRepository tipoDocumentoRepository;

	public ContribuyenteApplication(ClienteRepository clienteRepository1, TipoDocumentoRepository tipoDocumentoRepository1){

		this.clienteRepository = clienteRepository1;
		this.tipoDocumentoRepository= tipoDocumentoRepository1;
	}


	@PostConstruct
	public void insertClient(){




		clienteRepository.insertCliente(14455777,"mayerly","renta",1.000000);
		clienteRepository.insertCliente(231111,"andres","renta",0.0);
		clienteRepository.insertCliente(446666,"arley","renta",3.000);
		clienteRepository.insertCliente(77666,"cristian","renta",200.000);
		clienteRepository.insertCliente(2355666,"jhon","renta",100.000);
		tipoDocumentoRepository.insertDocumento(1, "NIT");
		tipoDocumentoRepository.insertDocumento(2,"CEDULA");
		tipoDocumentoRepository.insertDocumento(3,"TARJETA DE IDENTIDAD");
		tipoDocumentoRepository.insertDocumento(4,"CEDULA EXTRANJERIA");
		tipoDocumentoRepository.insertDocumento(5,"PASAPORTE");







	}



	public static void main(String[] args) {
		SpringApplication.run(ContribuyenteApplication.class, args);
	}

	@RequestMapping(value = "/app")
	public String hello(){
		return  "app-running";
	}


}
