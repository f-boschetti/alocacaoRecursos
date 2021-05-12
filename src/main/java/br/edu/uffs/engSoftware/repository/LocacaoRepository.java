package br.edu.uffs.engSoftware.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.uffs.engSoftware.model.Locacao;

/**
 * @author felip
 * Repositorys são interfaces gerenciadas pelo spring. Já vem um monte de buscas no banco pré configuradas com elas
 * exemplos: findAll() retorna uma lista de todos os objetos do tipo do repositorio
 * 			findByQualquerAtributoDoObjeto('x') retorna o obgeto que tem 'x' no atributo 'QualquerAtributoDoObjeto' e assim vai
 * 
 * pra saber bem pode olhar a documentacao 
 * @see https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#appendix.query.method.subject
 */
public interface LocacaoRepository extends JpaRepository<Locacao, Long>{
	
	public Locacao findByRecursoLocado(String recursoLocado);
	
	public Locacao findByHorarioLocacao(LocalDateTime data);
	
	public Locacao findByHorarioLocacaoBetween(LocalDateTime horarioInicioPesquisa, LocalDateTime horarioFimPesquisa);
	
	public List<Locacao> findAllByRecursoLocado(String recursoLocado);
}
