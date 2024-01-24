package com.app.contribuyente.domain;


import jakarta.persistence.*;
import jakarta.validation.constraints.Size;

import java.io.Serializable;

@Entity
@Table(uniqueConstraints = {

        @UniqueConstraint(columnNames = {"numero_documento","name","responsabilidad","saldo"})

})
public class Contribuyente implements Serializable {

    private static long serialVersionUID = 1L;

    @Id
    @Column(name = "numero_documento" ,nullable = false, unique = true)
    private Integer numDocumento;

    @Size(max = 50)
    @Column(name = "name" ,nullable = false, length = 20)
    private String name;


    @Size(max = 50)
    @Column(name = "responsabilidad" ,nullable = false)
    private String responsabilidad;

    @Size(max = 50)
    @Column(name = "saldo" ,nullable = false)
    private Double saldo;

    public Integer getNumDocumento() {
        return numDocumento;
    }

    public void setNumDocumento(Integer numDocumento) {
        this.numDocumento = numDocumento;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getResponsabilidad() {
        return responsabilidad;
    }

    public void setResponsabilidad(String responsabilidad) {
        this.responsabilidad = responsabilidad;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "numDocumento=" + numDocumento +
                ", name='" + name + '\'' +
                ", responsabilidad='" + responsabilidad + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
