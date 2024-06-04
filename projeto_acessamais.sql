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
celular_ptojeto VARCHAR(15)

);

DROP TABLE civil_com_deficiencia;

SHOW TABLES;

-- primeira insercao
INSERT INTO civil_sem_deficiencia(cpf, nome_civil, sobrenome_civil, possui_deficiencia)
value ("17304174773", "Lahra", "Souza", "1");

-- segunda insercao
INSERT INTO civil_com_deficiencia(tipo_def, grau_def, num_laudo)
value ("mental", "severa", "1505545884425");

-- terceira insercao
INSERT INTO funcionario (cpf, nome_civil, sobrenome_civil, possui_deficiencia)
value ("17304174773", "Lahra", "Souza", "1");

DROP DATABASE projeto;

SELECT * FROM civil_com_deficiencia;
SELECT * FROM civil_sem_deficiencia;SHOW databases;

create database projeto;

use projeto;
CREATE TABLE funcionario (
  id_funcionario INT not null,
  id_unidade_cras INT,
  nome_funcionario VARCHAR(25),
  email_funcionario VARCHAR(25),
  senha_funcionario VARCHAR(10),
  PRIMARY KEY(id_funcionario)
);

CREATE TABLE civil_sem_deficiencia (
  id_civil INT NOT NULL AUTO_INCREMENT,
  cpf VARCHAR(11),
  nome_civil VARCHAR(25),
  data_nasc DATE,
  sexo CHAR,
  bairro VARCHAR(45),
  cep VARCHAR(8),
  nivel_esc CHAR NULL,
  status_civil CHAR,
  recebe_aux BOOLEAN,
  possui_deficiencia INT,
  num_cel CHAR,
  PRIMARY KEY(id_civil)
);

CREATE TABLE civil_com_deficiencia (
 id_civil_deficiencia INT NOT NULL AUTO_INCREMENT,
 id_civil INT,
 tipo_def VARCHAR(15),
 grau_def VARCHAR(15),
 num_laudo VARCHAR(40),
 deficiencia INT,
 FOREIGN KEY (id_civil) REFERENCES civil_sem_deficiencia(id_civil),
 PRIMARY KEY(id_civil_deficiencia)
);

DROP TABLE civil_com_deficiencia;

SHOW TABLES;

-- primeira insercao
INSERT INTO civil_sem_deficiencia(cpf, nome_civil, sobrenome_civil, possui_deficiencia)
value ("17304174773", "Lahra", "Souza", "1");

-- segunda insercao
INSERT INTO civil_com_deficiencia(tipo_def, grau_def, num_laudo)
value ("mental", "severa", "1505545884425");

-- terceira insercao
INSERT INTO funcionario (cpf, nome_civil, sobrenome_civil, possui_deficiencia)
value ("17304174773", "Lahra", "Souza", "1");

DROP DATABASE projeto;

SELECT * FROM civil_com_deficiencia;
SELECT * FROM civil_sem_deficiencia;