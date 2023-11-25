
CREATE DATABASE club_deportivo;

------------------------------------------------------------------------
-- CREACION DE TABLAS socio Y deporte:
------------------------------------------------------------------------

-----------------------
-- TABLA socio:
-----------------------

DROP TABLE IF EXISTS socio;

CREATE TABLE socio (
	idsocio int(11) NOT NULL AUTO_INCREMENT,
	nro_socio int(11) DEFAULT NULL,
	nombre varchar(45) DEFAULT NULL,
	apellido varchar(45) DEFAULT NULL,
	categoria int(11) DEFAULT NULL,
	deporte int(11) DEFAULT NULL,
	PRIMARY KEY (idsocio)
	) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;


-----------------------
-- TABLA deporte:
-----------------------

DROP TABLE IF EXISTS deporte;

CREATE TABLE deporte (
	iddeporte int(11) NOT NULL AUTO_INCREMENT,
	descripcion varchar(45) DEFAULT NULL,
	idsocio int(11) DEFAULT NULL,
	PRIMARY KEY (iddeporte),
	CONSTRAINT idsocio
	FOREIGN KEY (iddeporte)
	REFERENCES socio (idsocio)
	ON DELETE NO ACTION
	ON UPDATE NO ACTION
	) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

------------------------------------------------------------------------
-- Finalizacion de creacion de tablas.
------------------------------------------------------------------------


------------------------------------------------------------------------
-- INSERTANDO ALGUNOS DATOS:
------------------------------------------------------------------------

-----------------------
-- TABLA socio:
-----------------------

INSERT INTO socio (idsocio, nro_socio, nombre, apellido, categoria, deporte)
VALUES
(1, 100, "Raul", "Gomez", 1, 1),
(2, 200, "Roberto", "Gimenez", 3, 2),
(3, 300, "Juan", "Fulano", 3, 3),
(4, 400, "Federico", "Fulanito", 4, 4);

-----------------------
-- TABLA deporte:
-----------------------

INSERT INTO deporte (iddeporte, descripcion, idsocio)
VALUES
(1, "Rugby", 1),
(2, "Basquet", 2),
(3, "Tenis", 3),
(4, "Natacion", 4);

------------------------------------------------------------------------
-- Finalizacion de insercion de datos.
------------------------------------------------------------------------

------------------------------------------------------------------------
-- CONSULTAS:
------------------------------------------------------------------------

SELECT * FROM socio;

SELECT * FROM deporte;

SELECT s.nro_socio, s.nombre, s.apellido, s.categoria FROM socio s JOIN deporte d ON s.idsocio = d.idsocio WHERE s.nro_socio = 100;