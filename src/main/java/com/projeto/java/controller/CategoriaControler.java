package com.projeto.java.controller;
import com.projeto.java.model.Categoria;
import com.projeto.java.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/categorias")
public class CategoriaControler {

    @Autowired
    private CategoriaRepository categoriaRepository;

    @GetMapping
    public List<Categoria> listarTodos() {
        return categoriaRepository.findAll();
    }

    @PostMapping
    public List<Categoria> addCategoria(@RequestBody List<Categoria> novaCategoria){
        return categoriaRepository.saveAll(novaCategoria);
    }

    @PutMapping
    public List<Categoria> edtCategoria(@RequestBody List<Categoria> attCategoria) {
        return categoriaRepository.saveAll(attCategoria);
    }

    @DeleteMapping
    public void delCategoria(@RequestBody List<Long> delCategoriaId) {
        categoriaRepository.deleteAllById(delCategoriaId);
    }
}
