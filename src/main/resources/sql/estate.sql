/*
Navicat MySQL Data Transfer

Source Server         : localDB
Source Server Version : 50719
Source Host           : localhost:3306
Source Database       : estate

Target Server Type    : MYSQL
Target Server Version : 50719
File Encoding         : 65001

Date: 2019-06-06 17:59:58
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for house
-- ----------------------------
DROP TABLE IF EXISTS `house`;
CREATE TABLE `house` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(255) DEFAULT NULL,
  `total_amount` decimal(10,2) DEFAULT NULL,
  `house_type_id` int(11) DEFAULT NULL,
  `area` double(5,2) DEFAULT NULL,
  `unit_price` int(10) DEFAULT NULL,
  `sale_at` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `towards` varchar(10) DEFAULT NULL,
  `floor_level` varchar(10) DEFAULT NULL,
  `decoration` varchar(20) DEFAULT NULL,
  `usage` varchar(20) DEFAULT NULL,
  `elevator` int(1) DEFAULT NULL,
  `create_date` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `update_date` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for house_tag_mapping
-- ----------------------------
DROP TABLE IF EXISTS `house_tag_mapping`;
CREATE TABLE `house_tag_mapping` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `house_id` int(11) NOT NULL,
  `tag_id` int(11) NOT NULL,
  `create_date` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for house_type
-- ----------------------------
DROP TABLE IF EXISTS `house_type`;
CREATE TABLE `house_type` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `create_date` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `update_date` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for residential_estate
-- ----------------------------
DROP TABLE IF EXISTS `residential_estate`;
CREATE TABLE `residential_estate` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) DEFAULT NULL,
  `age` varchar(20) DEFAULT NULL,
  `ownership` varchar(20) DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for tag
-- ----------------------------
DROP TABLE IF EXISTS `tag`;
CREATE TABLE `tag` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) NOT NULL,
  `password` varchar(32) NOT NULL,
  `status` int(1) DEFAULT '1',
  `create_date` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `update_date` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
