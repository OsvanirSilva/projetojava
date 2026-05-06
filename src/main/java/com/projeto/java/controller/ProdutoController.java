package com.projeto.java.controller;
import com.projeto.java.model.Produto;
import com.projeto.java.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;

    @GetMapping // Mapeia requisições GET para /produtos
    public List<Produto> listarTodos() {
        return produtoRepository.findAll(); // O JPA busca tudo no banco e converte em JSON
    }

    @PostMapping
    public List<Produto> addProduto(@RequestBody List<Produto> novoProduto){
        return produtoRepository.saveAll(novoProduto); //JSON com [] obrigatorio (lista) sem ID produto (gerado automaticamente)
    }

    @PutMapping
    public List<Produto> editProduto(@RequestBody List<Produto> attProduto){
        return produtoRepository.saveAll(attProduto); //JSON com ID do produto para atualizacao
    }

    @DeleteMapping
    public void delProduto(@RequestBody List<Long> delProdutoId){
        produtoRepository.deleteAllById(delProdutoId);
    }
}
