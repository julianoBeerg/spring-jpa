package br.com.magna.apiSpringBoot.domain.paciente;

import br.com.magna.apiSpringBoot.domain.endereco.Endereco;

public record DadosListagemPaciente(Long id, String nome, String email, String cpf, Endereco endereco) {

	public DadosListagemPaciente(Paciente paciente) {
		this(paciente.getId(), paciente.getNome(), paciente.getEmail(), paciente.getCpf(), paciente.getEndereco());
	}
}
