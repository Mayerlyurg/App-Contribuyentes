package com.app.contribuyente.repository;


import com.app.contribuyente.domain.Contribuyente;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Contribuyente,Integer> {



    @Modifying
    @Transactional
    @Query(value = " INSERT INTO contribuyente (numero_documento,name,responsabilidad,saldo) VALUES(?1,?2,?3,?4); ", nativeQuery = true)
     void insertCliente( Integer numDocumento, String name, String responsabilidad, Double saldo );


}
