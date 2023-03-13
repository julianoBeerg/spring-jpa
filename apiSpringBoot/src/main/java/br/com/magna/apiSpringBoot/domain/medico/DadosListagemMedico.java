package br.com.magna.apiSpringBoot.domain.medico;

import br.com.magna.apiSpringBoot.domain.endereco.Endereco;

public record DadosListagemMedico(Long id, String nome, String email, String crm, Especialidade especialidade,
		Endereco endereco) {

	public DadosListagemMedico(Medico medico) {
		this(medico.getId(), medico.getNome(), medico.getEmail(), medico.getCrm(), medico.getEspecialidade(),
				medico.getEndereco());
	}

}