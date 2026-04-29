package com.projeto.java.controller;
import com.projeto.java.model.Produto;
import com.projeto.java.model.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/produtos")
public class LanchoneteController {

    @Autowired
    private ProdutoRepository produtoRepository;

    @GetMapping // Mapeia requisições GET para /produtos
    public List<Produto> listarTodos() {
        return produtoRepository.findAll(); // O JPA busca tudo no banco e converte em JSON
    }


}
