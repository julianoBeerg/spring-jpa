package br.com.magna.apiSpringBoot.domain.medico;

import br.com.magna.apiSpringBoot.domain.endereco.DadosEndereco;
import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoMedico(

		@NotNull Long id, String nome, String telefone, DadosEndereco endereco) {

}
