package br.com.magna.api.corporacao.instituicao.instituicao;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record DadosCadastroInstituicao(
		
		@NotBlank
        @Pattern(regexp = "\\d{14,17}")
		String cnpj, 
		
		@NotBlank
		String nome, 
		
		@NotBlank
		String nomeFantasia, 
		
		@NotBlank
		String fundador,
		
		@NotBlank
		String diretor,
		
		@NotNull 
		Long sede_id
		) {

}
