package com.app.contribuyente.service;


import com.app.contribuyente.repository.ClienteRepository;
import org.springframework.stereotype.Service;

@Service
public class ClientService {

    private final ClienteRepository clienteRepository;


    public ClientService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    /*
    @Transactional
    public void  insertClientes(){
        clienteRepository.insertClient(1,"mayerly","222","renta","no tiene saldo ");
    }

    */

}
