package br.edu.ifpi.biblioteca.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.ifpi.biblioteca.entidades.Usuario;

public interface UsuarioRepostiory extends JpaRepository<Usuario, Long> {

  List<Usuario> findByNome(String nome);

}
