package br.com.magna.api.corporacao.instituicao.sede;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "tb_sedes")
@Entity (name = "Sede")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Sede {
	
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String pais;
	private String estado;
	private String cidade;
	private String logradouro;
	private Integer numero;
	private Integer cep; 
	private String complemento;
	
	public void atualizarInformacoes(DadosCadastroSede dados) {
		 if (dados.pais() != null) {
	            this.pais = dados.pais();
	        }
		 if (dados.estado() != null) {
	            this.estado = dados.estado();
	        }
		 if (dados.cidade() != null) {
	            this.cidade = dados.cidade();
	        }
		if (dados.logradouro() != null) {
            this.logradouro = dados.logradouro();
        } if (dados.numero() != null) {
            this.numero = dados.numero();
        }
        if (dados.cep() != null) {
            this.cep = dados.cep();
        }
        if (dados.complemento() != null) {
            this.complemento = dados.complemento();
        }
    }
}
