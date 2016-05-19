
CREATE TABLE IF NOT EXISTS `city_china` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `ename` varchar(12) DEFAULT NULL COMMENT '省的简称',
  `ecityname` varchar(12) DEFAULT NULL COMMENT '市的名称',
  `ccityname` varchar(12) DEFAULT NULL COMMENT '市的中文',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;


INSERT INTO `city_china` (`id`, `ename`, `ecityname`, `ccityname`) VALUES
	(1, 'beijing', 'changping', '昌平'),
	(2, 'beijing', 'haidian', '海淀'),
	(3, 'beijing', 'chanyang', '朝阳'),
	(4, 'henan', 'zhengzhou', '郑州'),
	(5, 'henan', 'shangqiu', '商丘'),
	(6, 'henan', 'kaifeng', '开封'),
	(7, 'hebei', 'shijiazhuang', '石家庄'),
	(8, 'hebei', 'tangshan', '唐山'),
	(9, 'hebei', 'qinhuangdao', '秦皇岛'),
	(10, 'hunan', 'changsha', '长沙'),
	(11, 'hunan', 'yueyang', '岳阳'),
	(12, 'hunan', 'hengyang', '衡阳');

