-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 06, 2019 at 10:06 PM
-- Server version: 10.1.38-MariaDB
-- PHP Version: 7.3.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `java_project_hotel_uni_database`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `admin_id` int(20) NOT NULL,
  `admin_username` varchar(255) NOT NULL,
  `admin_password` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`admin_id`, `admin_username`, `admin_password`) VALUES
(1, 'admin', '123456');

-- --------------------------------------------------------

--
-- Table structure for table `guesttable`
--

CREATE TABLE `guesttable` (
  `gID` int(15) NOT NULL,
  `first_name` varchar(255) NOT NULL,
  `last_name` varchar(255) NOT NULL,
  `gsm` varchar(15) NOT NULL,
  `email` varchar(255) NOT NULL,
  `guest_rating` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `guesttable`
--

INSERT INTO `guesttable` (`gID`, `first_name`, `last_name`, `gsm`, `email`, `guest_rating`) VALUES
(4, 'James', 'Doe', '0889735612', 'jamesdoe@gmail.com', '0'),
(9, 'Ivan', 'Ivanov', '0887443345', 'ivanivanov@abv.bg', '0'),
(10, 'Stoyan', 'Petkov', '0884131313', 'stoyan@gmail.com', '0'),
(11, 'Viktor', 'Kirilov', '0887412143', 'viktorkirilov@gmail.com', '0'),
(12, 'Petyr', 'Stoyanov', '0887531232', 'petyrstoqnov@gmail.com', '0'),
(13, 'Elisaveta', 'Petkov', '0887736212', 'elisavetapetkova@abv.bg', '2'),
(14, 'Viktoria', 'Vasileva', '0889721321', 'viktoriqvasileva@abv.bg', '0'),
(15, 'Gloria', 'Rinova', '0886252525', 'gloria@abv.bg', '0'),
(16, 'dddsds', 'dsdsdsd', '0999123456', 'dsdsdds@gmail.com', '0');

-- --------------------------------------------------------

--
-- Table structure for table `manager`
--

CREATE TABLE `manager` (
  `manager_id` int(20) NOT NULL,
  `manager_username` varchar(255) NOT NULL,
  `manager_password` varchar(255) NOT NULL,
  `manager_hotel_name` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `manager`
--

INSERT INTO `manager` (`manager_id`, `manager_username`, `manager_password`, `manager_hotel_name`) VALUES
(1, 'manager', '123456', ''),
(2, 'manager100', '123456', 'melia'),
(3, 'manager200', '123456', ''),
(4, 'manager300', '123456', 'melia');

-- --------------------------------------------------------

--
-- Table structure for table `owners`
--

CREATE TABLE `owners` (
  `owners_id` int(20) NOT NULL,
  `owners_username` varchar(255) NOT NULL,
  `owners_password` varchar(255) NOT NULL,
  `hotel_name` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `owners`
--

INSERT INTO `owners` (`owners_id`, `owners_username`, `owners_password`, `hotel_name`) VALUES
(1, 'owner', '123456', ''),
(2, 'owner1', '123456', ''),
(3, 'owner2', '123456', 'melia');

-- --------------------------------------------------------

--
-- Table structure for table `reservations`
--

CREATE TABLE `reservations` (
  `id` int(20) NOT NULL,
  `guestID` int(20) NOT NULL,
  `rNumber` int(20) NOT NULL,
  `date_came` date NOT NULL,
  `date_went` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `reservations`
--

INSERT INTO `reservations` (`id`, `guestID`, `rNumber`, `date_came`, `date_went`) VALUES
(22, 10, 1, '2019-11-01', '2019-11-30'),
(23, 11, 5, '2019-11-27', '2019-11-30'),
(24, 16, 4, '2019-12-07', '2019-12-27'),
(25, 15, 2, '2019-12-07', '2019-12-20');

-- --------------------------------------------------------

--
-- Table structure for table `rooms`
--

CREATE TABLE `rooms` (
  `Rnumber` int(15) NOT NULL,
  `Rtype` int(15) NOT NULL,
  `RGSM` varchar(20) NOT NULL,
  `Rreserved` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `rooms`
--

INSERT INTO `rooms` (`Rnumber`, `Rtype`, `RGSM`, `Rreserved`) VALUES
(1, 1, '0888273111', 'Yes'),
(2, 5, '0889755125', 'Yes'),
(3, 4, '0889734333', 'Not Free'),
(4, 5, '0889886433', 'Yes'),
(5, 3, '0888628777', 'Yes');

-- --------------------------------------------------------

--
-- Table structure for table `roomtype`
--

CREATE TABLE `roomtype` (
  `Rid` int(15) NOT NULL,
  `Rlabel` varchar(255) NOT NULL,
  `Rprice` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `roomtype`
--

INSERT INTO `roomtype` (`Rid`, `Rlabel`, `Rprice`) VALUES
(1, 'single', '35'),
(2, 'double', '70'),
(3, 'triple', '105'),
(4, 'group', '140'),
(5, 'entourage', '175');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `id` int(15) NOT NULL,
  `user` varchar(20) NOT NULL,
  `pass` varchar(20) NOT NULL,
  `user_first_name` varchar(50) NOT NULL,
  `user_last_name` varchar(50) NOT NULL,
  `receptionist_hotel_name` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`id`, `user`, `pass`, `user_first_name`, `user_last_name`, `receptionist_hotel_name`) VALUES
(1, 'hoteltest', 'testpass', '', '', ''),
(2, 'receptionist1', '123456', 'John', 'Dow', ''),
(3, 'receptionist100', '123456', 'Johny', 'Dow', ''),
(4, 'receptionist400', '123456', 'Peter', 'Dow', 'melia');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`admin_id`);

--
-- Indexes for table `guesttable`
--
ALTER TABLE `guesttable`
  ADD PRIMARY KEY (`gID`);

--
-- Indexes for table `manager`
--
ALTER TABLE `manager`
  ADD PRIMARY KEY (`manager_id`);

--
-- Indexes for table `owners`
--
ALTER TABLE `owners`
  ADD PRIMARY KEY (`owners_id`);

--
-- Indexes for table `reservations`
--
ALTER TABLE `reservations`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_guest_id` (`guestID`),
  ADD KEY `fk_rNumber` (`rNumber`);

--
-- Indexes for table `rooms`
--
ALTER TABLE `rooms`
  ADD PRIMARY KEY (`Rnumber`),
  ADD KEY `fk_roomTypeID` (`Rtype`);

--
-- Indexes for table `roomtype`
--
ALTER TABLE `roomtype`
  ADD PRIMARY KEY (`Rid`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `admin`
--
ALTER TABLE `admin`
  MODIFY `admin_id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `guesttable`
--
ALTER TABLE `guesttable`
  MODIFY `gID` int(15) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;

--
-- AUTO_INCREMENT for table `manager`
--
ALTER TABLE `manager`
  MODIFY `manager_id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `owners`
--
ALTER TABLE `owners`
  MODIFY `owners_id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `reservations`
--
ALTER TABLE `reservations`
  MODIFY `id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=26;

--
-- AUTO_INCREMENT for table `roomtype`
--
ALTER TABLE `roomtype`
  MODIFY `Rid` int(15) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `id` int(15) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `reservations`
--
ALTER TABLE `reservations`
  ADD CONSTRAINT `fk_guest_id` FOREIGN KEY (`guestID`) REFERENCES `guesttable` (`gID`) ON DELETE CASCADE,
  ADD CONSTRAINT `fk_rNumber` FOREIGN KEY (`rNumber`) REFERENCES `rooms` (`Rnumber`) ON DELETE CASCADE;

--
-- Constraints for table `rooms`
--
ALTER TABLE `rooms`
  ADD CONSTRAINT `fk_roomTypeID` FOREIGN KEY (`Rtype`) REFERENCES `roomtype` (`Rid`) ON DELETE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
