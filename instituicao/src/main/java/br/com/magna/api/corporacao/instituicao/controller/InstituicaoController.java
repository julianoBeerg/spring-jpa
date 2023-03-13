package br.com.magna.api.corporacao.instituicao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.magna.api.corporacao.instituicao.instituicao.DadosCadastroInstituicao;
import br.com.magna.api.corporacao.instituicao.instituicao.Instituicao;
import br.com.magna.api.corporacao.instituicao.instituicao.InstituicaoRepository;

@RestController
@RequestMapping("instituicoes")
public class InstituicaoController {

	@Autowired
	private InstituicaoRepository instituicaoRepository;

	@PostMapping
	public void cadastrar(@RequestBody DadosCadastroInstituicao dados) {
		instituicaoRepository.save(new Instituicao(dados));
		
	}
}
