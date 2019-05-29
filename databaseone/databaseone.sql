-- MySQL dump 10.13  Distrib 8.0.15, for Win64 (x86_64)
--
-- Host: localhost    Database: yazar-takip-sistemi
-- ------------------------------------------------------
-- Server version	8.0.15

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `kitapbilgi`
--

DROP TABLE IF EXISTS `kitapbilgi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `kitapbilgi` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `kitap_sayfa` int(11) DEFAULT NULL,
  `kitap_basim_yili` int(11) DEFAULT NULL,
  `kitap_ozeti` varchar(45) CHARACTER SET utf8 COLLATE utf8_turkish_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=latin5;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `kitapbilgi`
--

LOCK TABLES `kitapbilgi` WRITE;
/*!40000 ALTER TABLE `kitapbilgi` DISABLE KEYS */;
INSERT INTO `kitapbilgi` VALUES (1,500,1995,'intibah ozet'),(2,450,1906,'vatan yahut silitsre ozet'),(3,250,1993,'bes sehir ozet'),(4,350,1998,'huzur ozet'),(10,250,2005,'Benim Adim Kirmizi ozet');
/*!40000 ALTER TABLE `kitapbilgi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `yazarbilgi`
--

DROP TABLE IF EXISTS `yazarbilgi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `yazarbilgi` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `yazar_adi` varchar(45) CHARACTER SET utf8 COLLATE utf8_turkish_ci DEFAULT NULL,
  `yazar_soyadi` varchar(45) CHARACTER SET utf8 COLLATE utf8_turkish_ci DEFAULT NULL,
  `kitap_adi` varchar(45) CHARACTER SET utf8 COLLATE utf8_turkish_ci DEFAULT NULL,
  `kitap_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_details_id` (`kitap_id`),
  CONSTRAINT `fk_details_id` FOREIGN KEY (`kitap_id`) REFERENCES `kitapbilgi` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=latin5;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `yazarbilgi`
--

LOCK TABLES `yazarbilgi` WRITE;
/*!40000 ALTER TABLE `yazarbilgi` DISABLE KEYS */;
INSERT INTO `yazarbilgi` VALUES (1,'Namık','Kemal','intibah',1),(2,'Namık','Kemal','Vatan Yahut Silistre',2),(3,'Ahmet Hamdi','Tanpınar','Beş Şehir',3),(4,'Ahmet Hamdi','Tanpınar','Huzur',4),(13,'Orhan','Pamuk','Benim Adim Kirmizi',10);
/*!40000 ALTER TABLE `yazarbilgi` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-05-29  4:43:24
