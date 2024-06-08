SHOW databases;

create database projeto_AcessaMais;

use projeto_AcessaMais;

DROP DATABASE projeto_acessamais;

CREATE TABLE usuario (
  id_usuario INT not null AUTO_INCREMENT,
  id_unidade_cras INT,
  tipo_cadastro VARCHAR(25),
  nome_usuario VARCHAR(35),
  email_usuario VARCHAR(35),
  senha_temp_usuario VARCHAR(10),
  senha_usuario VARCHAR(10),
  PRIMARY KEY(id_usuario)
);

CREATE TABLE cadastro_civil (
  id_civil INT NOT NULL AUTO_INCREMENT,
  cpf_civil VARCHAR(11),
  date_criacao DATETIME,
  nome_civil VARCHAR(35),
  sobrenome_civil VARCHAR(35), 
  nome_tutor_civil VARCHAR(35),
  cpf_tutor_civil VARCHAR(11), 
  data_nasc DATE, 
  possui_deficiencia BOOLEAN,
  tipo_deficiencia VARCHAR(50),
  nome_deficiencia VARCHAR(50), 
  nivel_autonomia VARCHAR(30), 
  sexo_civil CHAR, 
  bairro_civil VARCHAR(45),
  municipio_civil VARCHAR(45),
  cep_civil VARCHAR(8),
  rua_civil VARCHAR(50),
  localidade_civil VARCHAR(25),
  tipo_res_civil VARCHAR(15),
  numero_res_civil VARCHAR(15),
  nivel_esc CHAR NULL,
  status_civil CHAR,
  foto_civil LONGBLOB,
  recebe_aux BOOLEAN,
  possui_cuidador BOOLEAN,
  num_cel CHAR(11), 
  PRIMARY KEY(id_civil)
);


CREATE TABLE relatorio_fisica_civil(
fk_id_civil INT,
FOREIGN KEY (fk_id_civil) REFERENCES cadastro_civil(id_civil)
);



CREATE TABLE cadastro_projetos (
id_projeto INT NOT NULL AUTO_INCREMENT,
cnpj_projeto CHAR(14),
razao_social VARCHAR(100),
atividade_projeto VARCHAR(50),
endereco_projeto VARCHAR(50),
logradouro_projeto VARCHAR(50),
bairro_projeto VARCHAR(50),
uf_projeto VARCHAR(25),
telefone_projeto VARCHAR(15),
celular_ptojeto VARCHAR(15),
  PRIMARY KEY(id_projeto)
);



CREATE TABLE projeto_atendimento(
fk_atendimento INT,
fk_projeto INT
);

SHOW TABLES;
select * FROM cadastro_civil;

-- primeira insercao
INSERT INTO cadastro_civil(cpf_civil,date_criacao, nome_civil, sobrenome_civil, possui_deficiencia, tipo_deficiencia, nome_deficiencia)
value ("17304174773",now(), "Lahra", "Souza", true, "intelectual", "autismo");
