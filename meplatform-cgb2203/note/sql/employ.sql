/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50505
Source Host           : localhost:3306
Source Database       : employ

Target Server Type    : MYSQL
Target Server Version : 50505
File Encoding         : 65001

Date: 2022-07-26 19:48:54
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `account`
-- ----------------------------
DROP TABLE IF EXISTS `account`;
CREATE TABLE `account` (
  `id` bigint(11) NOT NULL AUTO_INCREMENT COMMENT '流水id',
  `transaction_amount` int(16) DEFAULT NULL COMMENT '交易金额',
  `time` datetime DEFAULT NULL COMMENT '交易时间',
  `detail_id` int(11) DEFAULT NULL COMMENT '任务id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='资金流水表';

-- ----------------------------
-- Records of account
-- ----------------------------

-- ----------------------------
-- Table structure for `admin`
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '管理员id',
  `admin_name` varchar(50) DEFAULT NULL COMMENT '管理员名称',
  `admin_pw` varchar(255) DEFAULT NULL COMMENT '管理员密码',
  `role` int(8) DEFAULT NULL COMMENT '管理员角色',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='管理员信息';

-- ----------------------------
-- Records of admin
-- ----------------------------

-- ----------------------------
-- Table structure for `admin_role`
-- ----------------------------
DROP TABLE IF EXISTS `admin_role`;
CREATE TABLE `admin_role` (
  `root` int(8) DEFAULT NULL COMMENT '系统管理员',
  `admin_finance` int(8) DEFAULT NULL COMMENT '财务管理员',
  `admin_checker` int(8) DEFAULT NULL COMMENT '审核管理员'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='管理员角色\r\n';

-- ----------------------------
-- Records of admin_role
-- ----------------------------

-- ----------------------------
-- Table structure for `category`
-- ----------------------------
DROP TABLE IF EXISTS `category`;
CREATE TABLE `category` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '类别id',
  `name` varchar(50) DEFAULT NULL COMMENT '用户名称',
  `parent_id` bigint(20) unsigned DEFAULT 0 COMMENT '父级类别id，如果无父级，则为0',
  `depth` tinyint(3) unsigned DEFAULT 1 COMMENT '深度，最顶级类别的深度为1，次级为2，以此类推',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='类别信息';

-- ----------------------------
-- Records of category
-- ----------------------------

-- ----------------------------
-- Table structure for `category_order`
-- ----------------------------
DROP TABLE IF EXISTS `category_order`;
CREATE TABLE `category_order` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '记录id',
  `category_id` bigint(20) unsigned DEFAULT NULL COMMENT '类别id',
  `detail_id` bigint(20) unsigned DEFAULT NULL COMMENT '详情单号id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='类别与任务关联表';

-- ----------------------------
-- Records of category_order
-- ----------------------------

-- ----------------------------
-- Table structure for `comment`
-- ----------------------------
DROP TABLE IF EXISTS `comment`;
CREATE TABLE `comment` (
  `id` int(11) NOT NULL,
  `order_id` bigint(20) DEFAULT NULL COMMENT '任务单id',
  `use_time` datetime DEFAULT NULL COMMENT '使用时间',
  `comments` varchar(255) DEFAULT NULL COMMENT '评价',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='任务单评价表';

-- ----------------------------
-- Records of comment
-- ----------------------------

-- ----------------------------
-- Table structure for `order`
-- ----------------------------
DROP TABLE IF EXISTS `order`;
CREATE TABLE `order` (
  `id` bigint(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '任务单号id',
  `user_id` int(11) DEFAULT NULL COMMENT '发布者id',
  `picture` varchar(255) DEFAULT NULL COMMENT '图片地址',
  `reward` int(16) DEFAULT NULL COMMENT '佣金金额',
  `description` varchar(255) DEFAULT NULL COMMENT '任务单描述',
  `time` time DEFAULT NULL COMMENT '接单后限制的时间',
  `number` int(8) DEFAULT NULL COMMENT '限制接单人数',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='任务单发布表';

-- ----------------------------
-- Records of order
-- ----------------------------

-- ----------------------------
-- Table structure for `order_detail`
-- ----------------------------
DROP TABLE IF EXISTS `order_detail`;
CREATE TABLE `order_detail` (
  `order_id` bigint(11) unsigned DEFAULT NULL COMMENT '任务id',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `is_accept` int(1) DEFAULT 1 COMMENT '是否接单',
  `is_finish` int(1) DEFAULT 0 COMMENT '是否完成',
  `is_acceptance` int(1) DEFAULT 0 COMMENT '是否验收',
  `is_deleted` int(1) DEFAULT 0 COMMENT '是否撤单',
  KEY `order_id` (`order_id`),
  CONSTRAINT `order_detail_ibfk_1` FOREIGN KEY (`order_id`) REFERENCES `order` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='任务单细节表';

-- ----------------------------
-- Records of order_detail
-- ----------------------------

-- ----------------------------
-- Table structure for `order_user`
-- ----------------------------
DROP TABLE IF EXISTS `order_user`;
CREATE TABLE `order_user` (
  `id` bigint(11) unsigned NOT NULL AUTO_INCREMENT,
  `user_id` int(11) DEFAULT NULL COMMENT '接单者id',
  `order_id` int(11) DEFAULT NULL COMMENT '任务id',
  `create_time` datetime DEFAULT NULL COMMENT '接单时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='佣兵与任务中间表';

-- ----------------------------
-- Records of order_user
-- ----------------------------

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '用户id',
  `username` varchar(50) DEFAULT NULL COMMENT '用户名称',
  `password` varchar(255) DEFAULT NULL COMMENT '用户密码',
  `picture` varchar(255) DEFAULT NULL COMMENT '头像图片路径',
  `is_promulgator` int(10) unsigned DEFAULT 0 COMMENT '是否为商家）',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='用户信息';

-- ----------------------------
-- Records of user
-- ----------------------------

-- ----------------------------
-- Table structure for `user_detail`
-- ----------------------------
DROP TABLE IF EXISTS `user_detail`;
CREATE TABLE `user_detail` (
  `user_id` bigint(11) unsigned DEFAULT NULL COMMENT '用户id',
  `phone` varchar(11) DEFAULT NULL COMMENT '手机号',
  `address` varchar(255) DEFAULT NULL COMMENT '地址',
  `credit` int(8) DEFAULT NULL COMMENT '信用分',
  KEY `user_id` (`user_id`),
  CONSTRAINT `user_detail_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='用户详细信息表';

-- ----------------------------
-- Records of user_detail
-- ----------------------------

-- ----------------------------
-- Table structure for `wallet`
-- ----------------------------
DROP TABLE IF EXISTS `wallet`;
CREATE TABLE `wallet` (
  `id` bigint(11) NOT NULL AUTO_INCREMENT COMMENT '钱包id',
  `user_id` int(11) DEFAULT NULL COMMENT '用户id',
  `money` int(16) DEFAULT NULL COMMENT '余额',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='钱包';

-- ----------------------------
-- Records of wallet
-- ----------------------------
