package br.edu.ifpi.biblioteca.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifpi.biblioteca.entidades.Usuario;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

  List<Usuario> usuarios = new ArrayList<>();

  @GetMapping()
  public List<Usuario> listaTodosUsuarios() {
    return usuarios;
  }

  @PostMapping
  public ResponseEntity<String> addUsuario(@RequestBody Usuario usuario) {
    usuarios.add(usuario);
    return ResponseEntity.ok().build();
  }

}
