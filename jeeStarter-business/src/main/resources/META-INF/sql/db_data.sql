-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Versión del servidor:         10.3.14-MariaDB - mariadb.org binary distribution
-- SO del servidor:              Win64
-- HeidiSQL Versión:             9.5.0.5196
-- --------------------------------------------------------

USE colegio_db;


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

-- Volcando datos para la tabla colegio_db.dominio_tipodocumento: ~7 rows (aproximadamente)
/*!40000 ALTER TABLE `dominio_tipodocumento` DISABLE KEYS */;
INSERT INTO `dominio_tipodocumento` (`ID`, `CODIGO`, `NOMBRE`) VALUES
	(1, 'RC', 'REGISTRO CIVIL'),
	(2, 'TI', 'TARJETA DE IDENTIDAD'),
	(3, 'CC', 'CEDULA DE CIUDADANIA'),
	(4, 'CE', 'CEDULA DE EXTRANGERIA'),
	(5, 'PA', 'PASAPORTE'),
	(6, 'MS', 'MENOR SIN IDENTIFICACION'),
	(7, 'AS', 'ADULTO SIN IDENTIFICACION');
/*!40000 ALTER TABLE `dominio_tipodocumento` ENABLE KEYS */;

-- Volcando datos para la tabla colegio_db.personas: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `personas` DISABLE KEYS */;
INSERT INTO `personas` (`ID`, `DOMINIO_TIPODOCUMENTO_ID`, `NUMERO_DOCUMENTO`, `NOMBRE`, `APELLIDOS`, `EMAIL`, `FECHA_NACIMIENTO`, `DIRECCION`, `TEL_FIJO`, `TEL_CELULAR`,  `USUARIO_LOG`, `FOTO`) VALUES
	(1, 1, '15173361', 'WILMAN JOSE', 'VEGA CASTILLA', 'WILMANVEGA@GMAIL.COM', '2019-05-15', 'Calle 127 A No. 53A-45, Torre 2, Piso 9', '57 1 611 9600', '611 9600',  1, NULL);
/*!40000 ALTER TABLE `personas` ENABLE KEYS */;

-- Volcando datos para la tabla colegio_db.roles: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `roles` DISABLE KEYS */;
INSERT INTO `roles` (`ID`, `NOMBRE_ROL`, `DESCRIPCION`) VALUES
	(1, 'ADMINISTRADOR', 'ROL DE ADMINISTRADOR');
/*!40000 ALTER TABLE `roles` ENABLE KEYS */;

-- Volcando datos para la tabla colegio_db.usuarios: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `usuarios` DISABLE KEYS */;
INSERT INTO `usuarios` (`ID`, `NOMBRE_USUARIO`, `PASSWORD`, `FECHA_EXPIRACION`, `PERSONAS_ID`, `USUARIOS_ID`) VALUES
	(1, 'wilmanvega@gmail.com', '8df1ec6532b6cccf453fbdd08bc29e038066d8a9', '5019-05-15', 1, 1);
/*!40000 ALTER TABLE `usuarios` ENABLE KEYS */;

-- Volcando datos para la tabla colegio_db.usuarios_roles: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `usuarios_roles` DISABLE KEYS */;
INSERT INTO `usuarios_roles` (`USUARIOS_ID`, `ROLES_ID`) VALUES (1, 1);
/*!40000 ALTER TABLE `usuarios_roles` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
