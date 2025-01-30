-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: localhost:8889
-- Generation Time: Jun 05, 2019 at 12:00 PM
-- Server version: 5.7.25
-- PHP Version: 7.3.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `movies`
--

DELIMITER $$
--
-- Functions
--
DROP FUNCTION IF EXISTS `full_name`$$
CREATE DEFINER=`root`@`localhost` FUNCTION `full_name` (`first_nm` CHAR(20), `last_nm` CHAR(30)) RETURNS CHAR(55) CHARSET utf8 RETURN CONCAT(first_nm, ' ', last_nm)$$

DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `a`
--

DROP TABLE IF EXISTS `a`;
CREATE TABLE `a` (
  `id` int(10) UNSIGNED NOT NULL,
  `name` varchar(20) NOT NULL,
  `enemy` int(10) UNSIGNED NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `a`
--

INSERT INTO `a` (`id`, `name`, `enemy`) VALUES
(1, 'Archer', 6),
(2, 'Lana', 5),
(3, 'Cheryl', 4),
(4, 'Mallory', 3),
(5, 'Krieger', 2),
(6, 'Barry', 1);

-- --------------------------------------------------------

--
-- Table structure for table `b`
--

DROP TABLE IF EXISTS `b`;
CREATE TABLE `b` (
  `id` int(10) UNSIGNED NOT NULL,
  `name` varchar(20) NOT NULL,
  `best_friend` int(10) UNSIGNED DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `b`
--

INSERT INTO `b` (`id`, `name`, `best_friend`) VALUES
(1, 'Luke', NULL),
(2, 'Leia', 3),
(3, 'Han', 2),
(4, 'Rey', NULL),
(5, 'Finn', 6),
(6, 'Poe', 5);

-- --------------------------------------------------------

--
-- Table structure for table `c`
--

DROP TABLE IF EXISTS `c`;
CREATE TABLE `c` (
  `id` int(10) UNSIGNED NOT NULL,
  `name` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `c`
--

INSERT INTO `c` (`id`, `name`) VALUES
(1, 'Phoebe'),
(2, 'Chandler'),
(3, 'Joey'),
(4, 'Ross'),
(5, 'Rachel'),
(6, 'Monica');

-- --------------------------------------------------------

--
-- Table structure for table `characters`
--

DROP TABLE IF EXISTS `characters`;
CREATE TABLE `characters` (
  `character_id` int(10) UNSIGNED NOT NULL,
  `character_name` varchar(50) NOT NULL,
  `race_id` tinyint(3) UNSIGNED NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `characters`
--

INSERT INTO `characters` (`character_id`, `character_name`, `race_id`) VALUES
(1, 'Aragorn', 12),
(2, 'Bilbo', 3),
(3, 'Gimli', 1),
(4, 'Legolas', 4);

-- --------------------------------------------------------

--
-- Table structure for table `genres`
--

DROP TABLE IF EXISTS `genres`;
CREATE TABLE `genres` (
  `genre_id` int(11) UNSIGNED NOT NULL,
  `genre_title` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `genres`
--

INSERT INTO `genres` (`genre_id`, `genre_title`) VALUES
(1, 'Fantasy'),
(2, 'Sci-Fi'),
(3, 'Action'),
(4, 'Comedy'),
(5, 'Drama'),
(6, 'Horror'),
(7, 'Romance'),
(8, 'Family');

-- --------------------------------------------------------

--
-- Table structure for table `movies`
--

DROP TABLE IF EXISTS `movies`;
CREATE TABLE `movies` (
  `movie_id` int(11) NOT NULL,
  `movie_title` varchar(100) NOT NULL,
  `director` varchar(50) NOT NULL,
  `year` year(4) NOT NULL,
  `genre_id` int(11) UNSIGNED DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `movies`
--

INSERT INTO `movies` (`movie_id`, `movie_title`, `director`, `year`, `genre_id`) VALUES
(1, 'Labyrinth', 'Jim Henson', 1986, 1),
(2, 'Highlander', 'Russell Mulcahy', 1986, 1),
(3, 'Alien', 'Ridley Scott', 1979, 2),
(4, 'Conan the Barbarian', 'John Milius', 1982, 1),
(5, 'The Hobbit: An Unexpected Journey', 'Peter Jackson', 2012, 1),
(6, 'The Dark Crystal', 'Jim Henson', 1982, 1),
(7, 'Star Wars: A New Hope', 'George Lucas', 1977, 2),
(8, 'Harry Potter and the Order of the Phoenix', 'David Yates', 2007, 1),
(9, 'Fantastic Beasts and Where to Find Them ', 'David Yates', 2016, 1),
(10, 'Excalibur', 'John Boorman', 1981, 1),
(11, 'Time Bandits', 'Terry Gilliam', 1981, 1),
(12, 'Pan\'s Labyrinth', 'Guillermo Del Toro', 2006, 1),
(13, 'Blade Runner', 'Ridley Scott', 1982, 2),
(14, 'Interstellar', 'Christopher Nolan', 2014, 2),
(15, 'A.I. Artificial Intelligence', 'Steven Spielberg', 2001, 2),
(16, 'The Matrix', 'The Wachowskis', 1999, 2),
(17, 'Gattaca', 'Andrew Niccol', 1997, 2),
(18, 'Avatar', 'James Cameron', 2009, 2),
(19, 'Moon', 'Duncan Jones', 2009, 2),
(20, 'Galaxy Quest', 'Dean Parisot', 1999, 2),
(21, 'The Fifth Element', 'Luc Besson', 1997, 2),
(22, 'Inception', 'Christopher Nolan', 2010, 2),
(23, 'District 9', 'Neill Blokamp', 2009, 2),
(24, 'Her', 'Spike Jonez', 2013, 2),
(25, 'Pulp Fiction', 'Quentin Tarantino', 1994, 5),
(26, 'Reservoir Dogs', 'Quentin Tarantino', 1992, 5),
(27, 'Transcendence', 'Wally Pfister', 2014, 2),
(28, 'Contact', 'Robert Zemekis', 1997, 2);

-- --------------------------------------------------------

--
-- Table structure for table `people`
--

DROP TABLE IF EXISTS `people`;
CREATE TABLE `people` (
  `person_id` int(10) UNSIGNED NOT NULL,
  `first_name` varchar(50) NOT NULL,
  `last_name` varchar(50) NOT NULL,
  `account_type` tinyint(1) UNSIGNED NOT NULL DEFAULT '1',
  `dob` year(4) NOT NULL DEFAULT '2000'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `people`
--

INSERT INTO `people` (`person_id`, `first_name`, `last_name`, `account_type`, `dob`) VALUES
(10000, 'Henry', 'Smith', 1, 2000);

-- --------------------------------------------------------

--
-- Table structure for table `products`
--

DROP TABLE IF EXISTS `products`;
CREATE TABLE `products` (
  `product_id` int(10) UNSIGNED NOT NULL,
  `product_name` varchar(100) NOT NULL,
  `product_category` varchar(50) DEFAULT NULL,
  `product_price` decimal(10,2) NOT NULL,
  `product_sku` char(10) NOT NULL,
  `short_description` varchar(500) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `races`
--

DROP TABLE IF EXISTS `races`;
CREATE TABLE `races` (
  `race_id` tinyint(3) UNSIGNED NOT NULL,
  `race_name` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `races`
--

INSERT INTO `races` (`race_id`, `race_name`) VALUES
(1, 'Dwarves'),
(3, 'Hobbits'),
(4, 'Elves'),
(12, 'Men');

-- --------------------------------------------------------

--
-- Table structure for table `shows`
--

DROP TABLE IF EXISTS `shows`;
CREATE TABLE `shows` (
  `show_id` int(10) UNSIGNED NOT NULL,
  `show_title` varchar(120) NOT NULL,
  `num_seasons` tinyint(4) NOT NULL DEFAULT '1',
  `initial_year` year(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `shows`
--

INSERT INTO `shows` (`show_id`, `show_title`, `num_seasons`, `initial_year`) VALUES
(1, 'Supernatural', 15, 2005),
(2, 'Heroes', 4, 2006),
(3, 'Star Trek', 3, 1966),
(4, 'That \'70s Show', 8, 1997),
(5, 'Game of Thrones', 8, 2011),
(6, 'Breaking Bad', 5, 2008),
(7, 'Better Call Saul', 5, 2015),
(8, 'Stranger Things', 2, 2016),
(9, 'Black Mirror', 5, 2011),
(10, 'Westworld', 3, 2016);

-- --------------------------------------------------------

--
-- Table structure for table `tv`
--

DROP TABLE IF EXISTS `tv`;
CREATE TABLE `tv` (
  `tv_id` int(10) UNSIGNED NOT NULL DEFAULT '0',
  `tv_title` varchar(120) NOT NULL,
  `num_seasons` tinyint(4) NOT NULL DEFAULT '1'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `tv`
--

INSERT INTO `tv` (`tv_id`, `tv_title`, `num_seasons`) VALUES
(1, 'Supernatural', 15),
(2, 'Heroes', 4),
(3, 'Star Trek', 3),
(4, 'That \'70s Show', 8),
(5, 'Game of Thrones', 8),
(6, 'Breaking Bad', 5),
(7, 'Better Call Saul', 5),
(8, 'Stranger Things', 2),
(9, 'Black Mirror', 5),
(10, 'Westworld', 3);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `a`
--
ALTER TABLE `a`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `b`
--
ALTER TABLE `b`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `c`
--
ALTER TABLE `c`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `characters`
--
ALTER TABLE `characters`
  ADD PRIMARY KEY (`character_id`),
  ADD KEY `idx_race` (`race_id`);

--
-- Indexes for table `genres`
--
ALTER TABLE `genres`
  ADD PRIMARY KEY (`genre_id`);

--
-- Indexes for table `movies`
--
ALTER TABLE `movies`
  ADD PRIMARY KEY (`movie_id`);

--
-- Indexes for table `people`
--
ALTER TABLE `people`
  ADD PRIMARY KEY (`person_id`);

--
-- Indexes for table `products`
--
ALTER TABLE `products`
  ADD PRIMARY KEY (`product_id`),
  ADD UNIQUE KEY `idx_sku` (`product_sku`),
  ADD KEY `idx_names` (`product_name`,`product_category`),
  ADD KEY `idx_sku_three` (`product_sku`(3));
ALTER TABLE `products` ADD FULLTEXT KEY `idx_text` (`short_description`);

--
-- Indexes for table `races`
--
ALTER TABLE `races`
  ADD PRIMARY KEY (`race_id`);

--
-- Indexes for table `shows`
--
ALTER TABLE `shows`
  ADD PRIMARY KEY (`show_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `a`
--
ALTER TABLE `a`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `b`
--
ALTER TABLE `b`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `c`
--
ALTER TABLE `c`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `characters`
--
ALTER TABLE `characters`
  MODIFY `character_id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `genres`
--
ALTER TABLE `genres`
  MODIFY `genre_id` int(11) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT for table `movies`
--
ALTER TABLE `movies`
  MODIFY `movie_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=29;

--
-- AUTO_INCREMENT for table `people`
--
ALTER TABLE `people`
  MODIFY `person_id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10001;

--
-- AUTO_INCREMENT for table `products`
--
ALTER TABLE `products`
  MODIFY `product_id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `races`
--
ALTER TABLE `races`
  MODIFY `race_id` tinyint(3) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `shows`
--
ALTER TABLE `shows`
  MODIFY `show_id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `characters`
--
ALTER TABLE `characters`
  ADD CONSTRAINT `fk_character_race` FOREIGN KEY (`race_id`) REFERENCES `races` (`race_id`) ON UPDATE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
