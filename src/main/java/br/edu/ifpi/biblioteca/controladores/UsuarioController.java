package br.edu.ifpi.biblioteca.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifpi.biblioteca.entidades.Usuario;
import br.edu.ifpi.biblioteca.repositorios.UsuarioRepostiory;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

  @Autowired
  private UsuarioRepostiory usuarioRepostiory;

  @GetMapping()
  public List<Usuario> listaTodosUsuarios(@RequestParam(required = false) String nome) {
    if (nome != null) {
      return usuarioRepostiory.findByNome(nome);
    }
    return usuarioRepostiory.findAll();
  }

  @PostMapping
  public ResponseEntity<String> addUsuario(@RequestBody Usuario usuario) {
    usuarioRepostiory.save(usuario);
    return ResponseEntity.ok().build();
  }

}
