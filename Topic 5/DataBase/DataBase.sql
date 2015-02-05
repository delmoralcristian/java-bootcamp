-- MySQL dump 10.13  Distrib 5.6.22, for Win64 (x86_64)
--
-- Host: localhost    Database: highschool
-- ------------------------------------------------------
-- Server version	5.6.22-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `assists`
--

DROP TABLE IF EXISTS `assists`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `assists` (
  `id_course` int(11) NOT NULL,
  `id_student` int(11) NOT NULL,
  `partial` int(11) DEFAULT NULL,
  `recuperatorio` int(11) DEFAULT NULL,
  `pre_final` int(11) DEFAULT NULL,
  `final` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_course`,`id_student`),
  KEY `id_student` (`id_student`),
  CONSTRAINT `assists_ibfk_1` FOREIGN KEY (`id_course`) REFERENCES `course` (`id_course`),
  CONSTRAINT `assists_ibfk_2` FOREIGN KEY (`id_student`) REFERENCES `student` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `assists`
--

LOCK TABLES `assists` WRITE;
/*!40000 ALTER TABLE `assists` DISABLE KEYS */;
INSERT INTO `assists` VALUES (1,1,6,NULL,NULL,7),(1,2,6,NULL,NULL,7),(1,3,6,NULL,NULL,7),(1,4,6,NULL,NULL,7),(1,5,5,NULL,NULL,8),(1,6,2,5,NULL,8),(1,7,2,5,NULL,8),(1,8,2,4,NULL,8),(1,9,2,4,NULL,8),(1,10,2,4,NULL,7),(1,11,2,4,NULL,4),(1,12,2,4,NULL,4),(1,13,2,4,NULL,4),(1,14,2,2,4,4),(1,15,2,2,6,4),(1,16,2,2,6,4),(1,17,2,2,6,4),(1,18,2,2,6,4),(1,19,2,2,6,4),(1,20,2,2,6,4),(2,1,2,2,NULL,9),(2,2,2,2,NULL,9),(2,3,2,2,NULL,9),(2,4,2,2,NULL,9),(2,5,2,2,NULL,6),(2,6,2,2,NULL,6),(2,7,2,2,NULL,6),(2,8,2,2,NULL,6),(2,9,2,2,NULL,6),(2,10,2,2,NULL,6),(2,11,2,2,NULL,6),(2,12,2,2,NULL,6),(2,13,2,2,NULL,6),(2,14,2,2,6,2),(2,15,2,2,6,2),(2,16,2,2,6,2),(2,17,2,2,6,2),(2,18,2,2,6,2),(2,19,2,2,6,2),(2,20,2,2,6,4),(3,1,2,2,NULL,6),(3,2,2,2,NULL,6),(3,3,2,2,NULL,6),(3,4,2,2,NULL,6),(3,5,2,2,NULL,6),(3,6,2,2,NULL,6),(3,7,2,2,NULL,6),(3,8,2,2,NULL,6),(3,9,2,2,NULL,6),(3,10,2,2,6,4),(3,11,2,2,6,4),(3,12,2,2,6,4),(3,13,2,2,6,4),(3,14,2,2,6,4),(3,15,2,2,6,4),(3,16,2,2,6,4),(3,17,2,2,6,4),(3,18,2,2,6,4),(3,19,2,2,6,4),(3,20,2,2,6,4),(4,1,2,NULL,NULL,6),(4,2,2,NULL,NULL,6),(4,3,4,NULL,NULL,6),(4,4,4,NULL,NULL,6),(4,5,4,NULL,NULL,6),(4,6,4,NULL,NULL,7),(4,7,4,NULL,NULL,7),(4,8,4,NULL,NULL,7),(4,9,4,NULL,NULL,7),(4,10,4,NULL,NULL,7),(4,11,4,NULL,NULL,7),(4,12,4,NULL,NULL,7),(4,13,8,NULL,NULL,10),(4,14,8,NULL,NULL,10),(4,15,8,NULL,NULL,10),(4,16,8,NULL,NULL,10),(4,17,8,NULL,NULL,10),(4,18,8,NULL,NULL,10),(4,19,8,NULL,NULL,10),(4,20,8,NULL,NULL,10),(5,1,7,NULL,NULL,8),(5,2,7,NULL,NULL,8),(5,3,7,NULL,NULL,8),(5,4,7,NULL,NULL,8),(5,5,7,NULL,NULL,8),(5,6,7,NULL,NULL,8),(5,7,7,NULL,NULL,8),(5,8,7,NULL,NULL,8),(5,9,7,NULL,NULL,8),(5,10,7,NULL,NULL,8),(5,11,7,NULL,NULL,8),(5,12,7,NULL,NULL,8),(5,13,7,NULL,NULL,8),(5,14,7,NULL,NULL,8),(5,15,5,NULL,NULL,6),(5,16,5,NULL,NULL,6),(5,17,5,NULL,NULL,6),(5,18,5,NULL,NULL,6),(5,19,5,NULL,NULL,6),(5,20,5,NULL,NULL,6);
/*!40000 ALTER TABLE `assists` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `course`
--

DROP TABLE IF EXISTS `course`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `course` (
  `name` varchar(30) NOT NULL,
  `id_course` int(11) NOT NULL AUTO_INCREMENT,
  `assigned_teacher` int(11) NOT NULL,
  `hours_week` int(11) NOT NULL,
  `schedule_time` int(11) NOT NULL,
  PRIMARY KEY (`id_course`),
  KEY `assigned_teacher` (`assigned_teacher`),
  CONSTRAINT `course_ibfk_1` FOREIGN KEY (`assigned_teacher`) REFERENCES `teacher` (`id_teacher`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `course`
--

LOCK TABLES `course` WRITE;
/*!40000 ALTER TABLE `course` DISABLE KEYS */;
INSERT INTO `course` VALUES ('Matematica',1,1,8,32),('Fisica',2,2,8,32),('Quimica',3,1,7,28),('Geografia',4,3,9,36),('Historia',5,3,9,36);
/*!40000 ALTER TABLE `course` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `student`
--

DROP TABLE IF EXISTS `student`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `student` (
  `first_name` varchar(30) NOT NULL,
  `last_name` varchar(30) NOT NULL,
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `date_of_birth` date NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student`
--

LOCK TABLES `student` WRITE;
/*!40000 ALTER TABLE `student` DISABLE KEYS */;
INSERT INTO `student` VALUES ('Cristian','del Moral',1,'1991-01-26'),('Alejandro','Garcia',2,'1991-01-20'),('Cristian','Roldan',3,'1990-01-23'),('Cristian','Roldan',4,'1990-01-23'),('Rodrigo','Leonardo',5,'1990-07-14'),('Federico','Iacono',6,'1990-09-17'),('Alan','Gonzales',7,'1991-02-06'),('Lisandro','Carea',8,'1991-02-06'),('Nicolas','Diorio',9,'1990-04-06'),('Mariano','Rando',10,'1991-05-16'),('Mariela','Maciel',11,'1990-05-16'),('Carina','Fuentes Molina',12,'1991-06-14'),('Walter','Molinero',13,'1990-04-14'),('Martin','del Moral',14,'1991-04-14'),('Alfredo','Blasco',15,'1991-09-25'),('Agustin','Gabiola',16,'1990-10-27'),('Martin','Amat',17,'1990-10-27'),('Nicolas','Ripa',18,'1991-11-26'),('Agustin','Alvarez',19,'1990-10-25'),('Santiago','Pcinger',20,'1991-11-25');
/*!40000 ALTER TABLE `student` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `teacher`
--

DROP TABLE IF EXISTS `teacher`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `teacher` (
  `first_name` varchar(30) NOT NULL,
  `last_name` varchar(30) NOT NULL,
  `id_teacher` int(11) NOT NULL AUTO_INCREMENT,
  `date_of_birth` date NOT NULL,
  PRIMARY KEY (`id_teacher`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `teacher`
--

LOCK TABLES `teacher` WRITE;
/*!40000 ALTER TABLE `teacher` DISABLE KEYS */;
INSERT INTO `teacher` VALUES ('Juan','Ottiniano',1,'1964-12-28'),('Liliana','Lomi',2,'1964-12-11'),('Maria','Alfano',3,'1974-10-02');
/*!40000 ALTER TABLE `teacher` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2015-01-28 20:24:19
