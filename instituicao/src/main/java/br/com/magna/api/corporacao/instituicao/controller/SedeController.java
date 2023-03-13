package br.com.magna.api.corporacao.instituicao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.magna.api.corporacao.instituicao.sede.DadosCadastroSede;
import br.com.magna.api.corporacao.instituicao.sede.Sede;
import br.com.magna.api.corporacao.instituicao.sede.SedeRepository;

@RestController
@RequestMapping("sedes")
public class SedeController {

	@Autowired
	private SedeRepository sedeRepository;


}