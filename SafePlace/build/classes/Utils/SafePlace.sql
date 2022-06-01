CREATE DATABASE a3;

USE a3;

/* Usar a tabela USUARIO no lugar
CREATE TABLE Admin(
	idAdmin INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(100),
    senha VARCHAR(50)
);*/

--#DROP TABLE Condominio;
CREATE TABLE Condominio(
    idCondominio INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(100),
    endereco VARCHAR(200)
);

-- <<<<<<< HEAD
-- INSERT INTO Condominio(nome,endereco)(?,?);

-- UPDATE  Condominio 
-- SET     nome= ?,
--         endereco= ?,
-- WHERE   idCondominio = x;

-- DELETE *
-- FROM   Condominio
-- WHERE  idCondominio = x;

-- #DROP TABLE Usuario;
-- =======
-- --INSERT INTO Condominio(nome,endereco)(?,?);

-- --UPDATE  Condominio 
-- --SET     nome= ?,
-- --      endereco= ?,
-- --WHERE   idCondominio = x;

-- --DELETE *
-- --FROM   Condominio
-- --WHERE  idCondominio = x;

-- --#DROP TABLE Usuario;
-- >>>>>>> ec9298b177961f18967fe79b3ceffc6a9692c186
CREATE TABLE Usuario(
    idUsuario INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(100),
    senha VARCHAR(50),
    tipo  VARCHAR(20)
);

-- <<<<<<< HEAD
-- INSERT INTO Usuario(nome,senha,tipo)(?,?,?);

-- #DROP TABLE Area;
-- CREATE TABLE Area(
--     idArea INT PRIMARY KEY AUTO_INCREMENT,
--     descricao VARCHAR(200),
--     dosesRequisitadas INT
-- );
-- INSERT INTO Area(descriçao,dosesRequisitadas)(?,?);

-- UPDATE Area 
-- SET     descriçao = ?,
--         dosesRequisitadas= ?,
-- WHERE   idArea = x;

-- DELETE *
-- FROM   Area
-- WHERE  idArea = x;

-- #DROP TABLE Vacina;
-- =======
-- --INSERT INTO Usuario(nome,senha,tipo)(?,?,?);

-- --#DROP TABLE Area;
-- --REATE TABLE Area(
-- --  idArea INT PRIMARY KEY AUTO_INCREMENT,
-- --  descricao VARCHAR(200),
-- --  dosesRequisitadas INT
-- );
-- --INSERT INTO Area(descriçao,dosesRequisitadas)(?,?);

-- --UPDATE Area 
-- --SET     descriçao = ?,
--         dosesRequisitadas= ?,
-- --WHERE   idArea = x;

-- --DELETE *
-- --FROM   Area
-- --WHERE  idArea = x;

-- --#DROP TABLE Vacina;
-- >>>>>>> ec9298b177961f18967fe79b3ceffc6a9692c186
CREATE TABLE Vacina(
    idVacina INT PRIMARY KEY AUTO_INCREMENT,
    tipo VARCHAR(19),
    qtdDose INT
);

-- <<<<<<< HEAD
-- INSERT INTO Vacina(tipo,qtdDose)(?,?);

-- UPDATE Vacina 
-- SET     tipo = ?,
--         qtdDose= ?,
-- WHERE   idVacina = x;

-- DELETE *
-- FROM   Vacina
-- WHERE  idVacina = x;

-- #DROP TABLE Inquilino;
-- =======
-- --INSERT INTO Vacina(tipo,qtdDose)(?,?);

-- --UPDATE Vacina 
-- --SET     tipo = ?,
--         qtdDose= ?,
-- --WHERE   idVacina = x;

-- --DELETE *
-- --FROM   Vacina
-- --WHERE  idVacina = x;

-- --#DROP TABLE Inquilino;
-- >>>>>>> ec9298b177961f18967fe79b3ceffc6a9692c186
CREATE TABLE Inquilino(
    idInquilino INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(100),
    cpf VARCHAR(14),
    aprtNumero INT
);
-- <<<<<<< HEAD
-- INSERT INTO Inquilino(tipo,qtdDose)(?,?);

-- UPDATE Inquilino 
-- SET     nome = ?,
--         cpf= ?,
--         aprtNumero= ?,
-- WHERE   idInquilino = x;

-- DELETE *
-- FROM   Inquilino
-- WHERE  idInquilino = x;
-- =======
-- --INSERT INTO Inquilino(tipo,qtdDose)(?,?);

-- --UPDATE Inquilino 
-- --SET     nome = ?,
--         cpf= ?,
--         aprtNumero= ?,
-- --WHERE   idInquilino = x;

-- --DELETE *
-- --FROM   Inquilino
-- --WHERE  idInquilino = x;
-- >>>>>>> ec9298b177961f18967fe79b3ceffc6a9692c186
--#DROP TABLE InquilinoVacinado
--CREATE TABLE InquilinoVacinado(
--    idVacinado INT PRIMARY KEY AUTO_INCREMENT,
--    idInquilino INT,
--    idVacina INT,
--    FOREIGN KEY (idInquilino) REFERENCES inquilino (idInquilino),
--    FOREIGN KEY (idVacina) REFERENCES Vacina (idVacina)
--);

-- <<<<<<< HEAD
-- #DROP TABLE AcessoArea;
-- =======
-- --DROP TABLE AcessoArea;
-- >>>>>>> ec9298b177961f18967fe79b3ceffc6a9692c186
CREATE TABLE AcessoArea(
    idAcesso INT PRIMARY KEY AUTO_INCREMENT,
    idInquilino INT,
    idArea INT,
    hrIni DATETIME,
    hrFim DATETIME,
    numDoses INT,
    FOREIGN KEY (idInquilino) REFERENCES inquilino (idInquilino),
    FOREIGN KEY (idArea) REFERENCES Area (idArea)
);
