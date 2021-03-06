/*
 * http://localhost:8080/h2-console
 * 
 * JDBC URL: jdbc:h2:mem:testdb
 * 
 */

DROP TABLE SECUENCIAS 			IF EXISTS;
DROP TABLE PRODUCTOS 			IF EXISTS;
DROP TABLE PLAZAS 			    IF EXISTS;
DROP TABLE USUARIOS 			IF EXISTS;
DROP TABLE RESERVAS 			IF EXISTS;

CREATE TABLE PLAZAS (
	CODIGO			BIGINT			NOT NULL,
	PLANTA			VARCHAR(100)			NOT NULL,
	PROPIETARIO			VARCHAR(100)	NOT NULL,
	TELEFONO			VARCHAR(100)	NOT NULL,
	EMAIL  				VARCHAR(100)	NOT NULL,
	DISPONIBLE			BOOLEAN	NOT NULL,
	PRIMARY KEY(CODIGO)
);

CREATE TABLE USUARIOS (
	CODIGO			BIGINT			NOT NULL,
	NOMBRE			VARCHAR(100)	NOT NULL,
	APELLIDO1			VARCHAR(100)	NOT NULL,
	APELLIDO2  				VARCHAR(100)	NOT NULL,
	PRIMARY KEY(CODIGO)
);

CREATE TABLE RESERVAS (
	CODIGO					BIGINT			NOT NULL,
	CODIGO_USUARIO			BIGINT			NOT NULL,
	CODIGO_PLAZA			BIGINT			NOT NULL,
	FECHA_INI				DATETIME	NOT NULL,
	FECHA_FIN  				DATETIME	NOT NULL,
	PRIMARY KEY(CODIGO),
	FOREIGN KEY (CODIGO_USUARIO) REFERENCES USUARIOS(CODIGO),
	FOREIGN KEY (CODIGO_PLAZA) REFERENCES PLAZAS(CODIGO)
);

CREATE TABLE SECUENCIAS(
	SEQ_NAME	VARCHAR(100)	NOT NULL,
	SEQ_NUMBER	BIGINT			NOT NULL
);

