package com.projeto.java.model;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;

    @JsonIgnore //Evita loop infinito no JSON
    @OneToMany(mappedBy = "categoria")
    private List<Produto> produtos;

}