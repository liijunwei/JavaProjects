/*
Navicat MySQL Data Transfer

Source Server         : test0
Source Server Version : 50712
Source Host           : localhost:3306
Source Database       : db4mocking_sep07

Target Server Type    : MYSQL
Target Server Version : 50712
File Encoding         : 65001

Date: 2019-09-07 20:11:13
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `sys_reply`
-- ----------------------------
DROP TABLE IF EXISTS `sys_reply`;
CREATE TABLE `sys_reply` (
  `replyid` int(10) NOT NULL AUTO_INCREMENT,
  `topicid` int(10) NOT NULL,
  `author` varchar(32) NOT NULL,
  `content` varchar(1028) NOT NULL,
  `createdate` datetime NOT NULL,
  PRIMARY KEY (`replyid`),
  KEY `fk_topic_reply` (`topicid`),
  CONSTRAINT `fk_topic_reply` FOREIGN KEY (`topicid`) REFERENCES `sys_topic` (`topicid`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_reply
-- ----------------------------
INSERT INTO `sys_reply` VALUES ('6', '3', '山阴路', '一点也不存啊！！！', '2019-09-07 17:50:01');
INSERT INTO `sys_reply` VALUES ('8', '11', '山阴路1', '原来错在了mapper。xml里的增加标签写错了吗？增加的标签应该用“insert” 我用成了select for some reason', '2019-09-07 18:38:51');
INSERT INTO `sys_reply` VALUES ('9', '11', '山阴路2', '原来错在了mapper。xml里的增加标签写错了吗？增加的标签应该用“insert” 我用成了select for some reason', '2019-09-07 18:39:50');
INSERT INTO `sys_reply` VALUES ('10', '11', '山阴路', 'you are done!', '2019-09-07 18:40:18');
INSERT INTO `sys_reply` VALUES ('11', '14', '睡不醒', '看我昵称', '2019-09-07 18:40:59');
INSERT INTO `sys_reply` VALUES ('12', '6', 'hello', 'world', '2019-09-07 18:47:49');
INSERT INTO `sys_reply` VALUES ('13', '12', '夏天夏天', '应该是死神吧', '2019-09-07 18:51:00');
INSERT INTO `sys_reply` VALUES ('14', '6', '山阴路的夏天', '对面走来的人都眯着眼', '2019-09-07 19:03:45');
INSERT INTO `sys_reply` VALUES ('17', '6', '山阴路', '这次你离开了没有向以前那样说再见', '2019-09-07 19:34:22');

-- ----------------------------
-- Table structure for `sys_topic`
-- ----------------------------
DROP TABLE IF EXISTS `sys_topic`;
CREATE TABLE `sys_topic` (
  `topicid` int(10) NOT NULL AUTO_INCREMENT,
  `title` varchar(128) NOT NULL,
  `content` varchar(2056) NOT NULL,
  `author` varchar(32) NOT NULL,
  `createdate` date NOT NULL,
  `clickamount` int(10) DEFAULT NULL,
  PRIMARY KEY (`topicid`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_topic
-- ----------------------------
INSERT INTO `sys_topic` VALUES ('1', '国庆假期干点什么？', '马上到国庆了，回家吗？', 'caijixiaoli', '2019-07-21', '3');
INSERT INTO `sys_topic` VALUES ('2', '早睡早起？', '早睡早起身体好还是顺其自然好？', '大铁棍子', '2019-09-01', '1');
INSERT INTO `sys_topic` VALUES ('3', '发工资了该存百分之几？', '发工资了该存百分之几？？', '野虎', '2018-07-11', '8');
INSERT INTO `sys_topic` VALUES ('6', '你好', '明天', '菜鸡小李', '2019-09-07', '21');
INSERT INTO `sys_topic` VALUES ('10', '中彩票了该怎么办？', '天降横财', '李小双', '2019-07-08', '1');
INSERT INTO `sys_topic` VALUES ('11', '南京李志先生复活计划', '保持理智', 'ljw', '2019-09-07', '8');
INSERT INTO `sys_topic` VALUES ('12', '二次元', '假面军团是什么动漫里的角色呢', '死神迷', '2019-09-07', '4');
INSERT INTO `sys_topic` VALUES ('14', '怎么参能早晨5点起床呢', '5点起床会有好几个小时可以自有安排的时间，想想就激动呢。不过我怎么起不来啊', '小蜜蜂', '2019-09-07', '2');
INSERT INTO `sys_topic` VALUES ('16', '墙上的向日葵', '什么是我们分开的借口\r\n什么能让我为谁停留\r\n时光就这样，悄悄地溜走...', '汪汪', '2019-09-07', '0');
