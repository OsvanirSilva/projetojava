package com.projeto.java.entity;

public class Produto {

    private Long id;
    private String nome;
    private Double preco;
    private Categoria categoria;

}

/*package com.projeto.java.entity;

import jakarta.persistence.*;

@Entity
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private Double preco;

    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;

}*/