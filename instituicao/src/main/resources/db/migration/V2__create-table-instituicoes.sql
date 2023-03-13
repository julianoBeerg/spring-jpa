CREATE TABLE tb_instituicoes(
	id SERIAL PRIMARY KEY,
	cnpj VARCHAR(30) NOT NULL UNIQUE,
	nome VARCHAR(255) NOT NULL UNIQUE,
	nome_fantasia VARCHAR(255) NOT NULL ,
	fundador VARCHAR(255) NOT NULL,
	diretor VARCHAR(255),
	sede_id BIGINT,
	
	CONSTRAINT fk_instituicao_sede_id FOREIGN KEY(sede_id) REFERENCES tb_sedes(id)
)