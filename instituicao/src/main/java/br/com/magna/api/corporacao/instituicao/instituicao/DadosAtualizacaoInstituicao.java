package br.com.magna.api.corporacao.instituicao.instituicao;

import br.com.magna.api.corporacao.instituicao.sede.DadosCadastroSede;
import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoInstituicao(

		@NotNull Long id, String nomeFantasia, DadosCadastroSede sede) {

}