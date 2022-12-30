package com.example.demonstrativo.controllers;


import com.example.demonstrativo.dto.Usuario;
import com.example.demonstrativo.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UsuarioController {

    @Autowired
    UsuarioRepository repository;

    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    public List<Usuario> getAllUsers() {
        return repository.findAll();
    }


    @GetMapping("/{id}")
    public Optional<Usuario> buscarUsuario(@PathVariable("id") Long id, @RequestBody Usuario user) {
        return repository.findById(id);

    }

    @PostMapping
    public Usuario postUser(@RequestBody Usuario usuario) {
        return repository.save(usuario);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Usuario> atualizarUsuario(@PathVariable("id") Long id, @RequestBody Usuario user) throws ConfigDataResourceNotFoundException {
        Usuario usuario = repository.findById(id).orElseThrow(() -> new RuntimeException("Employee not found for this id :: " + id));

        usuario.setNome(user.getNome());
        usuario.setIdade(user.getIdade());

        final Usuario usuarioAtualizado = repository.save(usuario);
        return ResponseEntity.ok(usuarioAtualizado);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable("id") Long id) {
        repository.deleteById(id);
    }

    }









