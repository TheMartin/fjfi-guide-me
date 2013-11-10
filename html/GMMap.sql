SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;


DROP TABLE IF EXISTS `GMMap`;
CREATE TABLE IF NOT EXISTS `GMMap` (
  `Guid` varchar(64) COLLATE utf8_czech_ci NOT NULL,
  `Name` varchar(80) COLLATE utf8_czech_ci NOT NULL,
  `GpsCoords` varchar(23) COLLATE utf8_czech_ci NOT NULL,
  `Description` varchar(2000) COLLATE utf8_czech_ci DEFAULT NULL,
  `AuthorID` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`Guid`),
  UNIQUE KEY `Guid` (`Guid`),
  KEY `Guid_2` (`Guid`),
  KEY `Guid_3` (`Guid`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_czech_ci;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;