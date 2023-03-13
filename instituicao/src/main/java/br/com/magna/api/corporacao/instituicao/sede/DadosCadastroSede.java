package br.com.magna.api.corporacao.instituicao.sede;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosCadastroSede(
		
		@NotBlank
		String pais,
		
		@NotBlank
		String estado,
		
		@NotBlank
		String cidade,
		
		@NotBlank
		String logradouro,
		
		@NotNull
		Integer numero,
		
		@NotNull
		Integer cep, 
		
		@NotBlank
		String complemento
		) {

	
}
