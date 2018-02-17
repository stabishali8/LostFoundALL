-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 25, 2018 at 03:30 PM
-- Server version: 10.1.28-MariaDB
-- PHP Version: 5.6.32

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `lost_and_found`
--
CREATE DATABASE IF NOT EXISTS `lost_and_found` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `lost_and_found`;

-- --------------------------------------------------------

--
-- Table structure for table `formdata`
--

CREATE TABLE `formdata` (
  `name` varchar(25) NOT NULL,
  `email` varchar(60) NOT NULL,
  `title` varchar(40) NOT NULL,
  `description` varchar(300) NOT NULL,
  `status` varchar(5) NOT NULL,
  `image` longblob
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `formdata`
--

INSERT INTO `formdata` (`name`, `email`, `title`, `description`, `status`, `image`) VALUES
('ali', 'alishaheer71@gmail.com', 'bag', 'I have lost my bag', 'Found', NULL),
('ali', 'alishaheer71@gmail.com', 'bag', 'I have lost my bag', 'Found', NULL);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
