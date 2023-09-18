-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1:3306
-- Tiempo de generación: 17-09-2023 a las 23:12:30
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `ahorro`
--


DROP DATABASE IF EXISTS ahorro;
CREATE DATABASE IF NOT EXISTS ahorro;
USE ahorro;


-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cajero`
--

CREATE TABLE `cajero` (
  `usuario` int(11) NOT NULL,
  `cajeroId` int(11) NOT NULL,
  `fecha` date NOT NULL,
  `tipoTran` int(11) NOT NULL,
  `codigoS` int(11) DEFAULT NULL,
  `codigoO` int(11) DEFAULT NULL,
  `valor` float DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cuenta`
--

CREATE TABLE `cuenta` (
  `cuentaid` int(11) NOT NULL,
  `codigoSocio` int(11) NOT NULL,
  `codigoMod` int(11) DEFAULT NULL,
  `codigoProd` int(11) DEFAULT NULL,
  `codigoM` int(11) DEFAULT NULL,
  `codigoS` int(11) DEFAULT NULL,
  `codigoO` int(11) DEFAULT NULL,
  `fechaApertura` date DEFAULT NULL,
  `oficialCuenta` int(11) DEFAULT NULL,
  `estado` int(11) DEFAULT NULL,
  `saldoEfectivo` float DEFAULT NULL,
  `saldoCheque24` float DEFAULT NULL,
  `saldoCheque48` float DEFAULT NULL,
  `saldoCheque` float DEFAULT NULL,
  `saldoLibreta` float DEFAULT NULL,
  `fechaUltimoMov` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `dirección`
--

CREATE TABLE `dirección` (
  `codigoSocio` int(11) NOT NULL,
  `tipoDireccion` varchar(45) NOT NULL,
  `pais` varchar(45) DEFAULT NULL,
  `departamento` varchar(45) DEFAULT NULL,
  `ciudad` varchar(45) DEFAULT NULL,
  `barrioComarca` varchar(45) DEFAULT NULL,
  `direccionDomiciliar` varchar(45) DEFAULT NULL,
  `tipoPropiedad` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `documentos`
--

CREATE TABLE `documentos` (
  `codigoSocio` int(11) NOT NULL,
  `tipoDocumento` int(11) NOT NULL,
  `fechaReferencia` date DEFAULT NULL,
  `fechaCaducidad` date DEFAULT NULL,
  `paisEmision` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empleado`
--

CREATE TABLE `empleado` (
  `CodigoE` int(11) NOT NULL,
  `Nombre` varchar(255) NOT NULL,
  `Identificacion` varchar(255) NOT NULL,
  `sexo` varchar(20) NOT NULL,
  `estadoCivil` varchar(15) NOT NULL,
  `Profesion` varchar(30) DEFAULT NULL,
  `Nacionalidad` varchar(40) DEFAULT NULL,
  `FechaNacimiento` date DEFAULT NULL,
  `FechaIngreso` date DEFAULT NULL,
  `FechaSalida` date DEFAULT NULL,
  `MailInterno` varchar(40) DEFAULT NULL,
  `MailPersonal` varchar(40) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `empleado`
--

INSERT INTO `empleado` (`CodigoE`, `Nombre`, `Identificacion`, `sexo`, `estadoCivil`, `Profesion`, `Nacionalidad`, `FechaNacimiento`, `FechaIngreso`, `FechaSalida`, `MailInterno`, `MailPersonal`) VALUES
(1, 'Faustino López', '17-00665-0', 'Hombre', 'Soltero', 'Ingeniero', 'Nicaraguense', '1992-01-01', '2023-09-11', '2023-10-16', 'faustino.lopez17@est.unanleon.edu.ni', 'faustino.lopez17@est.unanleon.edu.ni'),
(2, 'John', '18-01355-0', 'Hombre', 'Soltero', 'Ingeniero', 'Nicaragüense', '1999-10-11', '2023-07-11', '2023-11-12', 'ejemplo@gmail.com', 'ejemplo2@gmail.com');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `modulo`
--

CREATE TABLE `modulo` (
  `codigoMod` int(11) NOT NULL,
  `descripcion` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `movimiento`
--

CREATE TABLE `movimiento` (
  `codigoS` varchar(45) DEFAULT NULL,
  `codigoO` int(11) DEFAULT NULL,
  `codigoSocio` int(11) NOT NULL,
  `cuentaid` int(11) NOT NULL,
  `id` int(11) NOT NULL,
  `fecha` date NOT NULL,
  `codigoMov` int(11) DEFAULT NULL,
  `codigoProd` int(11) DEFAULT NULL,
  `valor` float DEFAULT NULL,
  `tipo` varchar(45) DEFAULT NULL,
  `cotizacion` float DEFAULT NULL,
  `codigoR` int(11) NOT NULL,
  `codigoTran` int(11) NOT NULL,
  `codigoMod` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `natural`
--

CREATE TABLE `natural` (
  `codigoSocio` int(11) NOT NULL,
  `apellidoPaterno` varchar(45) DEFAULT NULL,
  `apellidoMaterno` varchar(45) DEFAULT NULL,
  `nombres` varchar(45) DEFAULT NULL,
  `nacionalidad` varchar(45) DEFAULT NULL,
  `profesion` varchar(45) DEFAULT NULL,
  `nivelEducacional` varchar(45) DEFAULT NULL,
  `estadoCivil` varchar(45) DEFAULT NULL,
  `fechaNacimiento` date DEFAULT NULL,
  `tipoVivienda` varchar(45) DEFAULT NULL,
  `numeroDependencia` int(11) DEFAULT NULL,
  `estado` varchar(45) DEFAULT NULL,
  `sectorEconomico` varchar(45) DEFAULT NULL,
  `actividadPrincipal` varchar(45) DEFAULT NULL,
  `actividadSecundaria` varchar(45) DEFAULT NULL,
  `ocupacion` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto`
--

CREATE TABLE `producto` (
  `codigoProd` int(11) NOT NULL,
  `codigoMod` int(11) NOT NULL,
  `descripcion` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `referencia`
--

CREATE TABLE `referencia` (
  `Socio_codigoSocio` int(11) NOT NULL,
  `tipoReferencia` int(11) NOT NULL,
  `nombre` varchar(45) DEFAULT NULL,
  `nombreTrabajo` varchar(45) DEFAULT NULL,
  `mail` varchar(45) DEFAULT NULL,
  `telefono` varchar(45) DEFAULT NULL,
  `observacion` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `rol`
--

CREATE TABLE `rol` (
  `CodigoRol` int(11) NOT NULL,
  `NombreRol` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `rol`
--

INSERT INTO `rol` (`CodigoRol`, `NombreRol`) VALUES
(1, 'ADMINISTRADOR'),
(2, 'CUIDADOR');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `rubros`
--

CREATE TABLE `rubros` (
  `codigoR` int(11) NOT NULL,
  `codigoMod` int(11) NOT NULL,
  `codigoTran` int(11) NOT NULL,
  `descripcion` varchar(255) DEFAULT NULL,
  `mnemonico` varchar(4) DEFAULT NULL,
  `tipoMovimiento` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `socio`
--

CREATE TABLE `socio` (
  `codigoSocio` int(11) NOT NULL,
  `tipoId` int(11) DEFAULT NULL,
  `identificacion` varchar(45) DEFAULT NULL,
  `nombreUsual` varchar(45) DEFAULT NULL,
  `relacion` varchar(45) DEFAULT NULL,
  `grupoEconomico` varchar(45) DEFAULT NULL,
  `exoneradoImpuesto` varchar(45) DEFAULT NULL,
  `relacionAseguradora` varchar(45) DEFAULT NULL,
  `sucursalOrigen` int(11) DEFAULT NULL,
  `oficinaOrigen` int(11) DEFAULT NULL,
  `fechaIngreso` date DEFAULT NULL,
  `ejecutivo` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `socio`
--

INSERT INTO `socio` (`codigoSocio`, `tipoId`, `identificacion`, `nombreUsual`, `relacion`, `grupoEconomico`, `exoneradoImpuesto`, `relacionAseguradora`, `sucursalOrigen`, `oficinaOrigen`, `fechaIngreso`, `ejecutivo`) VALUES
(1, 12, 'ABC', 'Juan', 'Social', 'R', 'No', 'Comun', 12, 1, '2023-09-03', 32);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `teléfono`
--

CREATE TABLE `teléfono` (
  `codigoSocio` int(11) NOT NULL,
  `tipoTelefono` varchar(45) NOT NULL,
  `numero` varchar(45) DEFAULT NULL,
  `extension` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `trabajo`
--

CREATE TABLE `trabajo` (
  `codigoSocio` int(11) NOT NULL,
  `tipoEmpresa` int(11) NOT NULL,
  `nombreEmpresa` varchar(45) DEFAULT NULL,
  `direccion` varchar(45) DEFAULT NULL,
  `telefono` varchar(45) DEFAULT NULL,
  `funcion` varchar(45) DEFAULT NULL,
  `tipoContrato` int(11) DEFAULT NULL,
  `cargo` varchar(45) DEFAULT NULL,
  `fechaIngreso` date DEFAULT NULL,
  `fechaSalida` date DEFAULT NULL,
  `actividad` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `transaccion`
--

CREATE TABLE `transaccion` (
  `codigoTran` int(11) NOT NULL,
  `codigoMod` int(11) NOT NULL,
  `descripcion` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `transaccionxrol`
--

CREATE TABLE `transaccionxrol` (
  `codigoRol` int(11) NOT NULL,
  `codigoMod` int(11) NOT NULL,
  `codigoTran` int(11) NOT NULL,
  `montoPermitido` float DEFAULT NULL,
  `requiereAutorizacion` tinyint(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarioxrol`
--

CREATE TABLE `usuarioxrol` (
  `Codigo` int(11) NOT NULL,
  `Usuario` varchar(30) NOT NULL,
  `CodigoRol` int(11) NOT NULL,
  `CodigoEmp` int(11) NOT NULL,
  `Clave` varchar(50) NOT NULL,
  `FechaInicio` date DEFAULT NULL,
  `FechaFin` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `usuarioxrol`
--

INSERT INTO `usuarioxrol` (`Codigo`, `Usuario`, `CodigoRol`, `CodigoEmp`, `Clave`, `FechaInicio`, `FechaFin`) VALUES
(1, 'faustino', 1, 1, 'faustino1234', '2023-09-11', '2023-10-16'),
(2, 'John', 1, 2, 'qwe', '2023-07-11', '2023-11-12');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `cajero`
--
ALTER TABLE `cajero`
  ADD PRIMARY KEY (`cajeroId`,`fecha`,`tipoTran`),
  ADD KEY `fk_Cajero_usuarioxrol1_idx` (`usuario`);

--
-- Indices de la tabla `cuenta`
--
ALTER TABLE `cuenta`
  ADD PRIMARY KEY (`cuentaid`),
  ADD KEY `fk_Cuenta_Socio1_idx` (`codigoSocio`);

--
-- Indices de la tabla `dirección`
--
ALTER TABLE `dirección`
  ADD PRIMARY KEY (`tipoDireccion`),
  ADD KEY `fk_Dirección_Socio1_idx` (`codigoSocio`);

--
-- Indices de la tabla `documentos`
--
ALTER TABLE `documentos`
  ADD PRIMARY KEY (`tipoDocumento`),
  ADD KEY `fk_Documentos_Socio1_idx` (`codigoSocio`);

--
-- Indices de la tabla `empleado`
--
ALTER TABLE `empleado`
  ADD PRIMARY KEY (`CodigoE`);

--
-- Indices de la tabla `modulo`
--
ALTER TABLE `modulo`
  ADD PRIMARY KEY (`codigoMod`);

--
-- Indices de la tabla `movimiento`
--
ALTER TABLE `movimiento`
  ADD PRIMARY KEY (`id`,`fecha`),
  ADD KEY `fk_Movimiento_Cuenta1_idx` (`cuentaid`),
  ADD KEY `fk_Movimiento_Cuenta2_idx` (`codigoSocio`),
  ADD KEY `fk_Movimiento_rubros1_idx` (`codigoR`,`codigoTran`,`codigoMod`);

--
-- Indices de la tabla `natural`
--
ALTER TABLE `natural`
  ADD KEY `fk_Natural_Socio1_idx` (`codigoSocio`);

--
-- Indices de la tabla `producto`
--
ALTER TABLE `producto`
  ADD PRIMARY KEY (`codigoProd`),
  ADD KEY `codigoMod` (`codigoMod`);

--
-- Indices de la tabla `referencia`
--
ALTER TABLE `referencia`
  ADD PRIMARY KEY (`tipoReferencia`),
  ADD KEY `fk_Referencia_Socio1_idx` (`Socio_codigoSocio`);

--
-- Indices de la tabla `rol`
--
ALTER TABLE `rol`
  ADD PRIMARY KEY (`CodigoRol`);

--
-- Indices de la tabla `rubros`
--
ALTER TABLE `rubros`
  ADD PRIMARY KEY (`codigoR`,`codigoTran`,`codigoMod`),
  ADD KEY `codigoMod` (`codigoMod`),
  ADD KEY `codigoTran` (`codigoTran`);

--
-- Indices de la tabla `socio`
--
ALTER TABLE `socio`
  ADD PRIMARY KEY (`codigoSocio`);

--
-- Indices de la tabla `teléfono`
--
ALTER TABLE `teléfono`
  ADD KEY `fk_Teléfono_Socio1_idx` (`codigoSocio`);

--
-- Indices de la tabla `trabajo`
--
ALTER TABLE `trabajo`
  ADD PRIMARY KEY (`tipoEmpresa`),
  ADD KEY `fk_Trabajo_Socio1_idx` (`codigoSocio`);

--
-- Indices de la tabla `transaccion`
--
ALTER TABLE `transaccion`
  ADD PRIMARY KEY (`codigoTran`),
  ADD KEY `codigoMod` (`codigoMod`);

--
-- Indices de la tabla `transaccionxrol`
--
ALTER TABLE `transaccionxrol`
  ADD KEY `codigoRol` (`codigoRol`),
  ADD KEY `codigoMod` (`codigoMod`),
  ADD KEY `codigoTran` (`codigoTran`);

--
-- Indices de la tabla `usuarioxrol`
--
ALTER TABLE `usuarioxrol`
  ADD PRIMARY KEY (`Codigo`),
  ADD KEY `CodigoRol` (`CodigoRol`),
  ADD KEY `CodigoEmp` (`CodigoEmp`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `empleado`
--
ALTER TABLE `empleado`
  MODIFY `CodigoE` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `modulo`
--
ALTER TABLE `modulo`
  MODIFY `codigoMod` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `producto`
--
ALTER TABLE `producto`
  MODIFY `codigoProd` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `cuenta`
--
ALTER TABLE `cuenta`
  MODIFY `cuentaid` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `rol`
--
ALTER TABLE `rol`
  MODIFY `CodigoRol` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `rubros`
--
ALTER TABLE `rubros`
  MODIFY `codigoR` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `socio`
--
ALTER TABLE `socio`
  MODIFY `codigoSocio` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `transaccion`
--
ALTER TABLE `transaccion`
  MODIFY `codigoTran` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `usuarioxrol`
--
ALTER TABLE `usuarioxrol`
  MODIFY `Codigo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;


--
-- AUTO_INCREMENT de la tabla `movimiento`
--
ALTER TABLE `movimiento`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `cajero`
--
ALTER TABLE `cajero`
  ADD CONSTRAINT `fk_Cajero_usuarioxrol1` FOREIGN KEY (`usuario`) REFERENCES `usuarioxrol` (`Codigo`);

--
-- Filtros para la tabla `cuenta`
--
ALTER TABLE `cuenta`
  ADD CONSTRAINT `fk_Cuenta_Socio1` FOREIGN KEY (`codigoSocio`) REFERENCES `socio` (`codigoSocio`);

--
-- Filtros para la tabla `dirección`
--
ALTER TABLE `dirección`
  ADD CONSTRAINT `fk_Direccion_Socio1` FOREIGN KEY (`codigoSocio`) REFERENCES `socio` (`codigoSocio`);

--
-- Filtros para la tabla `documentos`
--
ALTER TABLE `documentos`
  ADD CONSTRAINT `fk_Documentos_Socio1` FOREIGN KEY (`codigoSocio`) REFERENCES `socio` (`codigoSocio`);

--
-- Filtros para la tabla `movimiento`
--
ALTER TABLE `movimiento`
  ADD CONSTRAINT `fk_Movimiento_Cuenta1` FOREIGN KEY (`cuentaid`) REFERENCES `cuenta` (`cuentaid`),
  ADD CONSTRAINT `fk_Movimiento_Cuenta2` FOREIGN KEY (`codigoSocio`) REFERENCES `cuenta` (`codigoSocio`),
  ADD CONSTRAINT `fk_Movimiento_rubros1` FOREIGN KEY (`codigoR`,`codigoTran`,`codigoMod`) REFERENCES `rubros` (`codigoR`, `codigoTran`, `codigoMod`);

--
-- Filtros para la tabla `natural`
--
ALTER TABLE `natural`
  ADD CONSTRAINT `fk_Natural_Socio1` FOREIGN KEY (`codigoSocio`) REFERENCES `socio` (`codigoSocio`);

--
-- Filtros para la tabla `producto`
--
ALTER TABLE `producto`
  ADD CONSTRAINT `producto_ibfk_1` FOREIGN KEY (`codigoMod`) REFERENCES `modulo` (`codigoMod`);

--
-- Filtros para la tabla `referencia`
--
ALTER TABLE `referencia`
  ADD CONSTRAINT `fk_Referencia_Socio1` FOREIGN KEY (`Socio_codigoSocio`) REFERENCES `socio` (`codigoSocio`);

--
-- Filtros para la tabla `rubros`
--
ALTER TABLE `rubros`
  ADD CONSTRAINT `rubros_ibfk_1` FOREIGN KEY (`codigoMod`) REFERENCES `transaccion` (`codigoMod`),
  ADD CONSTRAINT `rubros_ibfk_2` FOREIGN KEY (`codigoTran`) REFERENCES `transaccion` (`codigoTran`);

--
-- Filtros para la tabla `teléfono`
--
ALTER TABLE `teléfono`
  ADD CONSTRAINT `fk_Telefono_Socio1` FOREIGN KEY (`codigoSocio`) REFERENCES `socio` (`codigoSocio`);

--
-- Filtros para la tabla `trabajo`
--
ALTER TABLE `trabajo`
  ADD CONSTRAINT `fk_Trabajo_Socio1` FOREIGN KEY (`codigoSocio`) REFERENCES `socio` (`codigoSocio`);

--
-- Filtros para la tabla `transaccion`
--
ALTER TABLE `transaccion`
  ADD CONSTRAINT `transaccion_ibfk_1` FOREIGN KEY (`codigoMod`) REFERENCES `modulo` (`codigoMod`);

--
-- Filtros para la tabla `transaccionxrol`
--
ALTER TABLE `transaccionxrol`
  ADD CONSTRAINT `transaccionxrol_ibfk_1` FOREIGN KEY (`codigoRol`) REFERENCES `rol` (`CodigoRol`),
  ADD CONSTRAINT `transaccionxrol_ibfk_2` FOREIGN KEY (`codigoMod`) REFERENCES `transaccion` (`codigoMod`),
  ADD CONSTRAINT `transaccionxrol_ibfk_3` FOREIGN KEY (`codigoTran`) REFERENCES `transaccion` (`codigoTran`);

--
-- Filtros para la tabla `usuarioxrol`
--
ALTER TABLE `usuarioxrol`
  ADD CONSTRAINT `usuarioxrol_ibfk_1` FOREIGN KEY (`CodigoRol`) REFERENCES `rol` (`CodigoRol`),
  ADD CONSTRAINT `usuarioxrol_ibfk_2` FOREIGN KEY (`CodigoEmp`) REFERENCES `empleado` (`CodigoE`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
