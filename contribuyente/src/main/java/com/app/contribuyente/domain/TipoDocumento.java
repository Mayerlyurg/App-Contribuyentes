package com.app.contribuyente.domain;


import jakarta.persistence.*;
import jakarta.validation.constraints.Size;

import java.io.Serializable;

@Entity
@Table(uniqueConstraints = {

        @UniqueConstraint(columnNames = {"name"})

})
public class TipoDocumento implements Serializable {

    private static long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer  id;

    @Size(max = 50)
    @Column(name = "name" ,nullable = false, length = 20)
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "TipoDocumento{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
