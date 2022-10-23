-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema evona
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema evona
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `evona` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci ;
USE `evona` ;

-- -----------------------------------------------------
-- Table `evona`.`achievements`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `evona`.`achievements` (
  `ach_id` INT NOT NULL AUTO_INCREMENT,
  `ach_points` VARCHAR(45) NULL DEFAULT NULL,
  `ach_name` VARCHAR(45) NULL DEFAULT NULL,
  `type` INT NULL DEFAULT NULL,
  PRIMARY KEY (`ach_id`))
ENGINE = InnoDB
AUTO_INCREMENT = 2
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `evona`.`levels`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `evona`.`levels` (
  `id` INT NOT NULL,
  `rangeFrom` INT NULL DEFAULT NULL,
  `rangeTo` INT NULL DEFAULT NULL,
  `levelName` VARCHAR(45) NULL DEFAULT NULL,
  `points` INT NULL DEFAULT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `evona`.`player_achievements`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `evona`.`player_achievements` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `player_id` VARCHAR(45) NULL DEFAULT NULL,
  `achievement_id` INT NULL DEFAULT NULL,
  `current_points` INT NULL DEFAULT NULL,
  `is_collected` TINYINT NULL DEFAULT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `evona`.`player_data`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `evona`.`player_data` (
  `id` VARCHAR(45) NOT NULL,
  `username` VARCHAR(45) NULL DEFAULT NULL,
  `points` INT NULL DEFAULT NULL,
  `level_id` INT NULL DEFAULT NULL,
  `cash` DOUBLE NULL DEFAULT '0',
  PRIMARY KEY (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `evona`.`user_log`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `evona`.`user_log` (
  `id` INT NOT NULL,
  `user_id` INT NULL DEFAULT NULL,
  `log_time` DATETIME NULL DEFAULT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
