create database projeto_AcessaMais;

use projeto_AcessaMais;


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




-- gustavo
CREATE TABLE funcionario(
nome_completo VARCHAR(255),
unidade_cras CHAR(10),
email_institucional VARCHAR(100),
senha VARCHAR (30)
);

CREATE TABLE projeto_social(
num_projeto INT AUTO_INCREMENT UNIQUE, 
nome_fantasia VARCHAR (100),
cnpj CHAR (18),
razao_social VARCHAR (100),
atividade_projeto VARCHAR (20),
endereco_projeto VARCHAR (50),
bairro_projeto VARCHAR (50),
uf_projeto CHAR (2),
cep_projeto CHAR (9),
num_telefoneFixo VARCHAR (20),
num_celular VARCHAR (20),
nome_contato VARCHAR (100),
email VARCHAR (100),
rede_social VARCHAR (50)
);


select *from projeto_social;


CREATE TABLE projeto_atendimento(
fk_atendimento INT,
fk_projeto INT
);



 -- TESTE
create table sobre_projeto (
missao_projeto VARCHAR (255),
sobre_projeto VARCHAR (255)
);
select * from sobre_projeto;


select missao_projeto from sobre_projeto;