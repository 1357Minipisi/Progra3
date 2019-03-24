CREATE DATABASE Base_Datos;
USE Base_Datos;
DROP TABLE IF EXISTS puesto;
CREATE TABLE puesto (
	codigo_puesto VARCHAR(20)  NOT NULL,
    nombre_puesto VARCHAR(60),
    PRIMARY KEY (codigo_puesto)
    ) ENGINE=InnoDB DEFAULT CHARSET=latin1;
    
DROP TABLE IF EXISTS departamento;
CREATE TABLE departamento (
	codigo_departamento VARCHAR(20) NOT NULL,
    nombre_departamento VARCHAR(60),
    PRIMARY KEY (codigo_departamento)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

DROP TABLE IF EXISTS empleado_nomina;
CREATE TABLE empleado_nomina (
	codigo_empleado VARCHAR(10) NOT NULL,
    nombre_empleado VARCHAR(60) NOT NULL,
    sueldo_empleado FLOAT(10),
    codigo_puesto VARCHAR(10) NOT NULL,
    codigo_departamento VARCHAR(10) NOT NULL,
    PRIMARY KEY (codigo_empleado),
    CONSTRAINT FK_puestoempleado FOREIGN KEY (codigo_puesto) REFERENCES puesto (codigo_puesto),
    CONSTRAINT FK_departamentoempleado FOREIGN KEY (codigo_departamento) REFERENCES departamento (codigo_departamento)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

DROP TABLE IF EXISTS encabezado_nomina;
CREATE TABLE encabezado_nomina (
	codigo_nomina VARCHAR(10) NOT NULL,
    fecha_inicial_nomina DATE,
    fecha_final_nomina DATE,
    valor_nomina FLOAT(10) NOT NULL,
    PRIMARY KEY (codigo_nomina)
    ) ENGINE=InnoDB DEFAULT CHARSET=latin1;
    
DROP TABLE IF  EXISTS usuario_nomina;
CREATE TABLE  usuario_nomina(
	codigo_usuario VARCHAR(10) NOT NULL,
	nombre_usuario VARCHAR(30) NOT NULL,
    clave_usuario VARCHAR(20) NOT NULL,
	estado_usuario VARCHAR(20),
	codigo_empleado VARCHAR(10) NOT NULL,
    PRIMARY KEY (codigo_usuario),
    CONSTRAINT FK_usuarionomina FOREIGN KEY (codigo_empleado) REFERENCES empleado_nomina (codigo_empleado)
)ENGINE=InnoDB DEFAULT CHARSET=latin1;
    
DROP TABLE IF EXISTS detalle_nomina;
CREATE TABLE detalle_nomina (
	codigo_nomina VARCHAR(5) NOT NULL,
    codigo_empleado VARCHAR(10) NOT NULL,
	codigo_concepto VARCHAR(10) NOT NULL,
    valor_nominadetalle DOUBLE(10,2),
    PRIMARY KEY (codigo_nomina, codigo_empleado),
    CONSTRAINT FK_encabezadodetallenomina FOREIGN KEY (codigo_nomina) REFERENCES encabezado_nomina (codigo_nomina),
    CONSTRAINT FK_empleadodetallenomina FOREIGN KEY (codigo_empleado) REFERENCES empleado_nomina (codigo_empleado)
    ) ENGINE=InnoDB DEFAULT CHARSET=latin1;
    
DROP TABLE IF EXISTS concepto_nomina;
CREATE TABLE  concepto_nomina(
	codigo_concepto VARCHAR(10) NOT NULL,
	nombre_concepto VARCHAR(40) NOT NULL,
    efecto_concepto VARCHAR(20) NOT NULL,
    PRIMARY KEY (codigo_concepto)
)ENGINE=InnoDB DEFAULT CHARSET=latin1;
