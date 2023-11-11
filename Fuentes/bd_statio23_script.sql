-- MySQL dump 10.13  Distrib 8.0.34, for Win64 (x86_64)
--
-- Host: localhost    Database: station_23
-- ------------------------------------------------------
-- Server version	8.0.34

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `administrador`
--

DROP TABLE IF EXISTS `administrador`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `administrador` (
  `id_administrador` int NOT NULL AUTO_INCREMENT,
  `username` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  `UsuCrea` varchar(45) DEFAULT NULL,
  `FecCrea` datetime DEFAULT NULL,
  `UsuModif` varchar(45) DEFAULT NULL,
  `FecModif` datetime DEFAULT NULL,
  PRIMARY KEY (`id_administrador`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `administrador`
--

LOCK TABLES `administrador` WRITE;
/*!40000 ALTER TABLE `administrador` DISABLE KEYS */;
/*!40000 ALTER TABLE `administrador` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cupon`
--

DROP TABLE IF EXISTS `cupon`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cupon` (
  `id_cupon` varchar(10) NOT NULL,
  `descuento` double NOT NULL,
  `UsuCrea` varchar(45) DEFAULT NULL,
  `FecCrea` datetime DEFAULT NULL,
  `UsuModif` varchar(45) DEFAULT NULL,
  `FecModif` datetime DEFAULT NULL,
  PRIMARY KEY (`id_cupon`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cupon`
--

LOCK TABLES `cupon` WRITE;
/*!40000 ALTER TABLE `cupon` DISABLE KEYS */;
/*!40000 ALTER TABLE `cupon` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pago`
--

DROP TABLE IF EXISTS `pago`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pago` (
  `id_pago` varchar(15) NOT NULL,
  `modalidad` varchar(30) NOT NULL,
  `pago_total` double NOT NULL,
  `hora_pago` datetime NOT NULL,
  `UsuCrea` varchar(45) DEFAULT NULL,
  `FecCrea` datetime DEFAULT NULL,
  `UsuModif` varchar(45) DEFAULT NULL,
  `FecModif` datetime DEFAULT NULL,
  PRIMARY KEY (`id_pago`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pago`
--

LOCK TABLES `pago` WRITE;
/*!40000 ALTER TABLE `pago` DISABLE KEYS */;
/*!40000 ALTER TABLE `pago` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `registro_estacionamiento`
--

DROP TABLE IF EXISTS `registro_estacionamiento`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `registro_estacionamiento` (
  `id_registro_estacionamiento` int NOT NULL AUTO_INCREMENT,
  `id_administrador` int NOT NULL,
  `id_vehiculo` varchar(15) NOT NULL,
  `id_ubicacion` varchar(3) NOT NULL,
  `id_tarifa` int NOT NULL,
  `hora_entrada` datetime NOT NULL,
  `hora_salida` datetime NOT NULL,
  `id_cupon` varchar(8) NOT NULL,
  `id_pago` varchar(15) NOT NULL,
  `UsuCrea` varchar(45) DEFAULT NULL,
  `FecCrea` datetime DEFAULT NULL,
  `UsuModif` varchar(45) DEFAULT NULL,
  `FecModif` datetime DEFAULT NULL,
  PRIMARY KEY (`id_registro_estacionamiento`,`id_administrador`,`id_vehiculo`,`id_ubicacion`,`id_tarifa`,`id_cupon`,`id_pago`),
  KEY `fk_registro_estacionamiento_vehiculo1_idx` (`id_vehiculo`),
  KEY `fk_registro_estacionamiento_tarifario1_idx` (`id_tarifa`),
  KEY `fk_registro_estacionamiento_ubicacion1_idx` (`id_ubicacion`),
  KEY `fk_registro_estacionamiento_pago1_idx` (`id_pago`),
  KEY `fk_registro_estacionamiento_administrador1_idx` (`id_administrador`),
  KEY `fk_registro_estacionamiento_cupon1_idx` (`id_cupon`),
  CONSTRAINT `fk_registro_estacionamiento_administrador1` FOREIGN KEY (`id_administrador`) REFERENCES `administrador` (`id_administrador`),
  CONSTRAINT `fk_registro_estacionamiento_cupon1` FOREIGN KEY (`id_cupon`) REFERENCES `cupon` (`id_cupon`),
  CONSTRAINT `fk_registro_estacionamiento_pago1` FOREIGN KEY (`id_pago`) REFERENCES `pago` (`id_pago`),
  CONSTRAINT `fk_registro_estacionamiento_tarifario1` FOREIGN KEY (`id_tarifa`) REFERENCES `tarifario` (`id_tarifa`),
  CONSTRAINT `fk_registro_estacionamiento_ubicacion1` FOREIGN KEY (`id_ubicacion`) REFERENCES `ubicacion` (`id_ubicacion`),
  CONSTRAINT `fk_registro_estacionamiento_vehiculo1` FOREIGN KEY (`id_vehiculo`) REFERENCES `vehiculo` (`id_vehiculo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `registro_estacionamiento`
--

LOCK TABLES `registro_estacionamiento` WRITE;
/*!40000 ALTER TABLE `registro_estacionamiento` DISABLE KEYS */;
/*!40000 ALTER TABLE `registro_estacionamiento` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tarifario`
--

DROP TABLE IF EXISTS `tarifario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tarifario` (
  `id_tarifa` int NOT NULL AUTO_INCREMENT,
  `id_tipo_vehiculo` int NOT NULL,
  `tarifa_hora` double NOT NULL,
  `comision` double NOT NULL,
  `UsuCrea` varchar(45) DEFAULT NULL,
  `FecCrea` datetime DEFAULT NULL,
  `UsuModif` varchar(45) DEFAULT NULL,
  `FecModif` datetime DEFAULT NULL,
  PRIMARY KEY (`id_tarifa`,`id_tipo_vehiculo`),
  KEY `fk_tarifario_tipo_vehiculo_idx` (`id_tipo_vehiculo`),
  CONSTRAINT `fk_tarifario_tipo_vehiculo` FOREIGN KEY (`id_tipo_vehiculo`) REFERENCES `tipo_vehiculo` (`id_tipo_vehiculo`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tarifario`
--

LOCK TABLES `tarifario` WRITE;
/*!40000 ALTER TABLE `tarifario` DISABLE KEYS */;
INSERT INTO `tarifario` VALUES (1,1,70,5,'root@localhost','2023-11-11 00:11:15','root@localhost','2023-11-11 00:11:15'),(2,2,90,8,'root@localhost','2023-11-11 00:11:15','root@localhost','2023-11-11 00:11:39'),(3,3,100,10,'root@localhost','2023-11-11 00:11:15','root@localhost','2023-11-11 00:11:15');
/*!40000 ALTER TABLE `tarifario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tipo_vehiculo`
--

DROP TABLE IF EXISTS `tipo_vehiculo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tipo_vehiculo` (
  `id_tipo_vehiculo` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(30) NOT NULL,
  `UsuCrea` varchar(45) DEFAULT NULL,
  `FecCrea` datetime DEFAULT NULL,
  `UsuModif` varchar(45) DEFAULT NULL,
  `FecModif` datetime DEFAULT NULL,
  PRIMARY KEY (`id_tipo_vehiculo`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tipo_vehiculo`
--

LOCK TABLES `tipo_vehiculo` WRITE;
/*!40000 ALTER TABLE `tipo_vehiculo` DISABLE KEYS */;
INSERT INTO `tipo_vehiculo` VALUES (1,'moto','root@localhost','2023-11-11 00:10:07','root@localhost','2023-11-11 00:10:07'),(2,'auto','root@localhost','2023-11-11 00:10:07','root@localhost','2023-11-11 00:10:07'),(3,'camioneta','root@localhost','2023-11-11 00:10:07','root@localhost','2023-11-11 00:10:07');
/*!40000 ALTER TABLE `tipo_vehiculo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ubicacion`
--

DROP TABLE IF EXISTS `ubicacion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ubicacion` (
  `id_ubicacion` varchar(3) NOT NULL,
  `estado` varchar(45) DEFAULT NULL,
  `tipo_vehiculo_id_tipo_vehiculo` int NOT NULL,
  `UsuCrea` varchar(45) DEFAULT NULL,
  `FecCrea` datetime DEFAULT NULL,
  `UsuModif` varchar(45) DEFAULT NULL,
  `FecModif` datetime DEFAULT NULL,
  PRIMARY KEY (`id_ubicacion`,`tipo_vehiculo_id_tipo_vehiculo`),
  KEY `fk_ubicacion_tipo_vehiculo1_idx` (`tipo_vehiculo_id_tipo_vehiculo`),
  CONSTRAINT `fk_ubicacion_tipo_vehiculo1` FOREIGN KEY (`tipo_vehiculo_id_tipo_vehiculo`) REFERENCES `tipo_vehiculo` (`id_tipo_vehiculo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ubicacion`
--

LOCK TABLES `ubicacion` WRITE;
/*!40000 ALTER TABLE `ubicacion` DISABLE KEYS */;
/*!40000 ALTER TABLE `ubicacion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vehiculo`
--

DROP TABLE IF EXISTS `vehiculo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `vehiculo` (
  `id_vehiculo` varchar(15) NOT NULL,
  `id_tipo_vehiculo` int NOT NULL,
  `placa` varchar(6) NOT NULL,
  `UsuCrea` varchar(45) DEFAULT NULL,
  `FecCrea` datetime DEFAULT NULL,
  `UsuModif` varchar(45) DEFAULT NULL,
  `FecModif` datetime DEFAULT NULL,
  PRIMARY KEY (`id_vehiculo`,`id_tipo_vehiculo`),
  KEY `fk_vehiculo_tipo_vehiculo1_idx` (`id_tipo_vehiculo`),
  CONSTRAINT `fk_vehiculo_tipo_vehiculo1` FOREIGN KEY (`id_tipo_vehiculo`) REFERENCES `tipo_vehiculo` (`id_tipo_vehiculo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vehiculo`
--

LOCK TABLES `vehiculo` WRITE;
/*!40000 ALTER TABLE `vehiculo` DISABLE KEYS */;
/*!40000 ALTER TABLE `vehiculo` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-11-11  1:19:26
