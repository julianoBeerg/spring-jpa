package br.com.magna.api.corporacao.instituicao.instituicao;

import br.com.magna.api.corporacao.instituicao.sede.Sede;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "tb_instituicoes")
@Entity(name = "Instituicao")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Instituicao {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String cnpj;
	private String nome;

	@JoinColumn(name = "nome_fantasia")
	private String nomeFantasia;
	private String fundador;
	private String diretor;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "sede_id")
	private Sede sede;

	public Instituicao(DadosCadastroInstituicao dados) {
		this.cnpj = dados.cnpj();
		this.nome = dados.nome();
		this.nomeFantasia = dados.nomeFantasia();
		this.fundador = dados.fundador();
		this.diretor = dados.diretor();
		//this.sede = new Sede(dados.sede_id()));
	}

	public void atualizarInformacoes(@Valid DadosAtualizacaoInstituicao dados) {
		if (dados.nomeFantasia() != null) {
			this.nomeFantasia = dados.nomeFantasia();
		}
		if (dados.sede() != null) {
			this.sede.atualizarInformacoes(dados.sede());
		}
	}

	

}
