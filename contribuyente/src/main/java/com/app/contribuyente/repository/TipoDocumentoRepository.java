package com.app.contribuyente.repository;


import com.app.contribuyente.domain.TipoDocumento;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoDocumentoRepository extends JpaRepository <TipoDocumento,Integer> {

    @Modifying
    @Transactional
    @Query(value = " INSERT INTO tipo_documento (id,name) VALUES(?1,?2); ", nativeQuery = true)
    void insertDocumento( Integer id , String name );

}
