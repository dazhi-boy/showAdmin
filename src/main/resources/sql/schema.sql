-- 用户表
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
 `id` bigint(20) NOT NULL PRIMARY KEY AUTO_INCREMENT,
 `version` bigint(20) NOT NULL DEFAULT 0,
 `del_time` varchar(30),
 `username` varchar(30) NOT NULL COMMENT '用户名',
 `password` varchar(30) NOT NULL COMMENT '密码'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT '用户表';

-- 公司表
DROP TABLE IF EXISTS `company`;
CREATE TABLE `company` (
 `id` bigint(20) NOT NULL PRIMARY KEY AUTO_INCREMENT,
 `version` bigint(20) NOT NULL DEFAULT 0,
 `del_time` varchar(30),
 `name` varchar(30) NOT NULL COMMENT '公司名',
 `type` varchar(30) NOT NULL COMMENT '公司类型',
 `ceo` varchar(30) NOT NULL COMMENT '总裁',
 `ceo_phone` varchar(30) NOT NULL COMMENT '总裁电话',
 `createtime` TIMESTAMP NOT NULL DEFAULT current_timestamp COMMENT '创建时间'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT '公司表';

-- 无限级商品分类表
DROP TABLE IF EXISTS `shop_category`;
CREATE TABLE IF NOT EXISTS `shop_category` (
 `id` bigint(20) NOT NULL PRIMARY KEY AUTO_INCREMENT,
 `version` bigint(20) NOT NULL DEFAULT 0,
 `del_time` varchar(30),
 `company_id` BIGINT NOT NULL COMMENT '公司id',
 `title` VARCHAR(32) NOT NULL DEFAULT '' COMMENT '标题',
 `parentid` BIGINT UNSIGNED NOT NULL DEFAULT '0' COMMENT '父级id',
 `createtime` TIMESTAMP NOT NULL DEFAULT current_timestamp COMMENT '创建时间'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT '无限级商品分类表';

-- 商品表
DROP TABLE IF EXISTS `shop_product`;
CREATE TABLE `shop_product` (
 `id` bigint(20) NOT NULL PRIMARY KEY AUTO_INCREMENT,
 `version` bigint(20) NOT NULL DEFAULT 0,
 `del_time` varchar(30),
 `company_id` BIGINT NOT NULL COMMENT '公司id',
 `category_id` BIGINT UNSIGNED NOT NULL DEFAULT '0' COMMENT '商品分类id',
 `title` VARCHAR(200) NOT NULL DEFAULT '' COMMENT '商品标题',
 `description` TEXT COMMENT '商品描述',
 `num` BIGINT UNSIGNED NOT NULL DEFAULT '0' COMMENT '库存',
 `price` DECIMAL(10, 2) NOT NULL DEFAULT '0.00' COMMENT '价格',
 `cover` VARCHAR(200) NOT NULL DEFAULT '' COMMENT '封面图',
 `pics` TEXT COMMENT '图片集合',
 `issale` ENUM('0', '1') NOT NULL DEFAULT '0' COMMENT '是否促销',
 `saleprice` DECIMAL(10, 2) NOT NULL DEFAULT '0.00' COMMENT '促销价格',
 `ishot` ENUM('0', '1') NOT NULL DEFAULT '0' COMMENT '是否热卖',
 `ison` ENUM('0', '1') NOT NULL DEFAULT '0' COMMENT '是否上架',
 `istui` ENUM('0', '1') NOT NULL DEFAULT '0' COMMENT '是否推荐',
 `createtime` TIMESTAMP NOT NULL DEFAULT current_timestamp COMMENT '创建时间'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT '商品表';

-- 客户表
DROP TABLE IF EXISTS `consumer`;
CREATE TABLE `consumer` (
 `id` bigint(20) NOT NULL PRIMARY KEY AUTO_INCREMENT,
 `version` bigint(20) NOT NULL DEFAULT 0,
 `del_time` varchar(30),
 `username` varchar(30) NOT NULL COMMENT '用户名',
 `password` varchar(30) NOT NULL COMMENT '密码'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT '客户表';

-- 商品评论表
DROP TABLE IF EXISTS `shop_comment`;
CREATE TABLE `shop_comment` (
 `id` bigint(20) NOT NULL PRIMARY KEY AUTO_INCREMENT,
 `version` bigint(20) NOT NULL DEFAULT 0,
 `del_time` varchar(30),
 `consumer_id` BIGINT NOT NULL COMMENT '评论人Id',
 `consumer_name` VARCHAR(200) NOT NULL DEFAULT '' COMMENT '评论人名称',
 `product_id` BIGINT NOT NULL COMMENT '评论的商品id',
 `product_title` VARCHAR(200) NOT NULL DEFAULT '' COMMENT '评论的商品标题',
 `parent_comment_id` BIGINT NOT NULL DEFAULT 0 COMMENT '父评论id',
 `parent_comment_consumer_id` BIGINT NOT NULL DEFAULT 0 COMMENT '父评论的用户id',
 `reply_comment_id` BIGINT NOT NULL DEFAULT 0 COMMENT '被回复的评论id',
 `reply_comment_consumer_id` BIGINT NOT NULL DEFAULT 0 COMMENT '被回复的评论用户id',
 `comment_level` BIGINT NOT NULL DEFAULT 1 COMMENT '评论等级[ 1 一级评论 默认 ，2 二级评论]',
 `content` VARCHAR(200) NOT NULL DEFAULT '' COMMENT '评论的内容',
 `praise_num` BIGINT NOT NULL DEFAULT 0 COMMENT '点赞数',
 `top_status` BIGINT NOT NULL DEFAULT 0 COMMENT '置顶状态[ 1 置顶，0 不置顶 默认 ]',
 `createtime` TIMESTAMP NOT NULL DEFAULT current_timestamp COMMENT '创建时间'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT '商品评论表';


