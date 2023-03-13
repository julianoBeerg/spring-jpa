package br.com.magna.api.corporacao.instituicao.instituicao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InstituicaoRepository extends JpaRepository<Instituicao, Long> {
	
	Page<Instituicao> findAllByAtivoTrue(Pageable paginacao);

}
