-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: localhost:8889
-- Generation Time: May 20, 2019 at 06:28 PM
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

-- --------------------------------------------------------

--
-- Table structure for table `genres`
--

DROP TABLE IF EXISTS `genres`;
CREATE TABLE `genres` (
  `genre_id` int(11) NOT NULL,
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
  `genre_id` int(11) NOT NULL
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
  `email` varchar(100) NOT NULL,
  `first_name` varchar(30) NOT NULL,
  `last_name` varchar(30) NOT NULL,
  `common_name` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `people`
--

INSERT INTO `people` (`email`, `first_name`, `last_name`, `common_name`) VALUES
('arya@stark.org', 'Arya', 'Stark', ''),
('brandon@stark.org', 'Brandon', 'Stark', 'Bran'),
('bronn@blackwater.info', 'Bronn', 'Blackwater', ''),
('cersei@lannister.com', 'Cersei', 'Lannister', ''),
('daenerys@dragonstone.org', 'Daenerys', 'Targaryen', ''),
('davos@seaworth.org', 'Davos', 'Seaworth', 'The Onion Knight'),
('gregor@clegane.org', 'Gregor', 'Clegane', ''),
('jaime@lannister.org', 'Jaime', 'Lannister', ''),
('jon@snow.org', 'Jon', 'Snow', 'King Jon the First'),
('samwell@nights-watch.org', 'Samwell', 'Tarley', ''),
('sandor@clegane.org', 'Sandor', 'Clegane', ''),
('sansa@stark.org', 'Sansa', 'Stark-Bolton', '');

--
-- Indexes for dumped tables
--

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
  ADD PRIMARY KEY (`email`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `genres`
--
ALTER TABLE `genres`
  MODIFY `genre_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT for table `movies`
--
ALTER TABLE `movies`
  MODIFY `movie_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=29;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
