package br.edu.uffs.engSoftware.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.uffs.engSoftware.enums.Categoria;
import br.edu.uffs.engSoftware.model.Recurso;

/**
 * @author felip
 * Repositorys são interfaces gerenciadas pelo spring. Já vem um monte de buscas no banco pré configuradas com elas
 * exemplos: findAll() retorna uma lista de todos os objetos do tipo do repositorio
 * 			findByQualquerAtributoDoObjeto('x') retorna o obgeto que tem 'x' no atributo 'QualquerAtributoDoObjeto' e assim vai
 * 
 * pra saber bem pode olhar a documentação
 * @see https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#appendix.query.method.subject
 */
public interface RecursoRepository extends JpaRepository<Recurso, Long>{
	
	public Recurso findByNome (String nome);
	
	public Recurso findByTipo(String tipo);
	
	public List<Recurso> findAllByCategoria(Categoria categoria);
	
	
}
