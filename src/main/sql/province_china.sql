
CREATE TABLE IF NOT EXISTS `province_china` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `ename` varchar(12) DEFAULT NULL COMMENT '省的拼音',
  `cname` varchar(12) DEFAULT NULL COMMENT '省的中文',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COMMENT='活动基本信息表';



INSERT INTO `province_china` (`id`, `ename`, `cname`) VALUES
	(1, 'beijing', '北京'),
	(2, 'henan', '河南'),
	(3, 'hebei', '河北'),
	(4, 'hunan', '湖南');

