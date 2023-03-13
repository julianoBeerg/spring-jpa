package br.com.magna.apiSpringBoot.domain.paciente;

import br.com.magna.apiSpringBoot.domain.endereco.DadosEndereco;

public record DadosCadastroPaciente(String nome, String email, String telefone, String cpf, DadosEndereco endereco) {
}
