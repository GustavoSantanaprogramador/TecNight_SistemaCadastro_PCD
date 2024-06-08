CREATE DATABASE TecNigt_projetoDB;
USE TecNigt_projetoDB;

CREATE TABLE funcionario(
nome_completo VARCHAR(255),
unidade_cras CHAR(10),
email_institucional VARCHAR(100),
senha VARCHAR (30)
);

CREATE TABLE projeto_social(
num_projeto INT AUTO_INCREMENT UNIQUE, 
num_telefone VARCHAR (20),
nome_projeto VARCHAR (100)
);

CREATE TABLE projeto_atendimento(
fk_atendimento INT,
fk_projeto INT
);

