create database bixsecurestorage;

CREATE USER 'storageuser1'@'localhost' IDENTIFIED BY 'storageuser1';
GRANT ALL ON bixsecurestorage.* TO 'storageuser1'@'localhost';


use bixsecurestorage;

CREATE TABLE `bixsecurestorage`.`user` (
  `id` INT NOT NULL,
  `name` VARCHAR(45) NULL,
  `address` VARCHAR(455) NULL,
  PRIMARY KEY (`id`));
  
INSERT INTO `bixsecurestorage`.`user` (`id`, `name`, `address`) VALUES ('100', 'Pradeep', 'Sollentuna');
INSERT INTO `bixsecurestorage`.`user` (`id`, `name`) VALUES ('200', 'Yohan');