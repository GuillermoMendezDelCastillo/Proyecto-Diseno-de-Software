CREATE DATABASE  IF NOT EXISTS `tienda_virtual` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `tienda_virtual`;
-- MySQL dump 10.13  Distrib 8.0.36, for Win64 (x86_64)
--
-- Host: localhost    Database: tienda_virtual
-- ------------------------------------------------------
-- Server version	8.0.36

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
-- Table structure for table `cliente`
--

DROP TABLE IF EXISTS `cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cliente` (
  `idCliente` bigint NOT NULL AUTO_INCREMENT,
  `apodo` varchar(200) NOT NULL,
  `contrasena` varchar(200) NOT NULL,
  `correo` varchar(500) NOT NULL,
  `nacimiento` date NOT NULL,
  PRIMARY KEY (`idCliente`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cliente`
--

LOCK TABLES `cliente` WRITE;
/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
INSERT INTO `cliente` VALUES (1,'Paco','12345','correo@gmail.com','2000-04-01'),(2,'Karen','12345','ejemplo@hotmail.com','2000-04-01'),(3,'Mario','12345','mario@gmail.com','2000-04-07');
/*!40000 ALTER TABLE `cliente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cliente_producto`
--

DROP TABLE IF EXISTS `cliente_producto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cliente_producto` (
  `producto_id` bigint NOT NULL,
  `cliente_id` bigint NOT NULL,
  PRIMARY KEY (`producto_id`,`cliente_id`),
  KEY `FK_cliente_producto_cliente_id` (`cliente_id`),
  CONSTRAINT `FK_cliente_producto_cliente_id` FOREIGN KEY (`cliente_id`) REFERENCES `cliente` (`idCliente`),
  CONSTRAINT `FK_cliente_producto_producto_id` FOREIGN KEY (`producto_id`) REFERENCES `producto` (`idProducto`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cliente_producto`
--

LOCK TABLES `cliente_producto` WRITE;
/*!40000 ALTER TABLE `cliente_producto` DISABLE KEYS */;
INSERT INTO `cliente_producto` VALUES (5,3);
/*!40000 ALTER TABLE `cliente_producto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pago`
--

DROP TABLE IF EXISTS `pago`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pago` (
  `idPago` bigint NOT NULL AUTO_INCREMENT,
  `metodo` varchar(50) NOT NULL,
  `total` float NOT NULL,
  `idCliente` bigint NOT NULL,
  PRIMARY KEY (`idPago`),
  KEY `FK_PAGO_idCliente` (`idCliente`),
  CONSTRAINT `FK_PAGO_idCliente` FOREIGN KEY (`idCliente`) REFERENCES `cliente` (`idCliente`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pago`
--

LOCK TABLES `pago` WRITE;
/*!40000 ALTER TABLE `pago` DISABLE KEYS */;
INSERT INTO `pago` VALUES (4,'Tarjeta Bancaria',25,1),(5,'Transferencia Bancaria',40,2);
/*!40000 ALTER TABLE `pago` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pago_producto`
--

DROP TABLE IF EXISTS `pago_producto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pago_producto` (
  `producto_id` bigint NOT NULL,
  `pago_id` bigint NOT NULL,
  PRIMARY KEY (`producto_id`,`pago_id`),
  KEY `FK_pago_producto_pago_id` (`pago_id`),
  CONSTRAINT `FK_pago_producto_pago_id` FOREIGN KEY (`pago_id`) REFERENCES `pago` (`idPago`),
  CONSTRAINT `FK_pago_producto_producto_id` FOREIGN KEY (`producto_id`) REFERENCES `producto` (`idProducto`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pago_producto`
--

LOCK TABLES `pago_producto` WRITE;
/*!40000 ALTER TABLE `pago_producto` DISABLE KEYS */;
INSERT INTO `pago_producto` VALUES (2,4),(4,4),(1,5),(3,5);
/*!40000 ALTER TABLE `pago_producto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `producto`
--

DROP TABLE IF EXISTS `producto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `producto` (
  `idProducto` bigint NOT NULL AUTO_INCREMENT,
  `cantidad` int NOT NULL,
  `costo` float NOT NULL,
  `nombre` varchar(200) NOT NULL,
  `urlImagen` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`idProducto`),
  UNIQUE KEY `nombre` (`nombre`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `producto`
--

LOCK TABLES `producto` WRITE;
/*!40000 ALTER TABLE `producto` DISABLE KEYS */;
INSERT INTO `producto` VALUES (1,50,10,'Manzana','https://www.recetasnestle.com.mx/sites/default/files/inline-images/tipos-de-manzana-royal-gala.jpg'),(2,30,20,'Pelota','https://lamariposa.com.mx/11704-large_default/pelota-de-pl%C3%A1stico.jpg'),(3,10,30,'Flores','https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRdBC1SIqhr3x5uFIpbGu44QpKsbRC_YDxn7EPmou90XQ&s'),(4,60,5,'Lapiz','https://clipspapeleria.com.mx/wp-content/uploads/2020/06/90860_2-1-324x324.png'),(5,5,100,'Reloj','https://www.zurichvirtual.com.mx/wp-content/uploads/2023/07/TB09802OG_a.jpg');
/*!40000 ALTER TABLE `producto` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-04-19 22:39:13
