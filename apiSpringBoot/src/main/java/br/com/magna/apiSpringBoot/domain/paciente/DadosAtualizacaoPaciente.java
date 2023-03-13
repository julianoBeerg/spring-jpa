package br.com.magna.apiSpringBoot.domain.paciente;

import br.com.magna.apiSpringBoot.domain.endereco.DadosEndereco;
import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoPaciente(

		@NotNull Long id, String nome, String telefone, DadosEndereco endereco) {
}
