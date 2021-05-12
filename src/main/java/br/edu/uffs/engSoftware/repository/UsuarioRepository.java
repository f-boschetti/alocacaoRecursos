package br.edu.uffs.engSoftware.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.uffs.engSoftware.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	
	public Usuario findByNome(String nome);
	
	public List<Usuario> findAllByNomeContains(String nome);
	
	public List<Usuario> findAllByFuncao(String funcao);
	
}
