create table sys_topic(
topicid int(10) primary key auto_increment,
title varchar(128) not null,
content varchar(2056) not null,
author varchar(32) not null,
createdate date not null,
clickamount int(10)
);

insert into sys_topic values(default, '国庆假期干点什么？', '马上到国庆了，回家吗？', '菜鸡小李', '2019-07-21', 0);
insert into sys_topic values(default, '早睡早起？', '早睡早起身体好还是顺其自然好？', '大铁棍子', '2019-09-01', 0);
insert into sys_topic values(default, '发工资了该存百分之几？', '发工资了该存百分之几？？', '野虎', '2018-07-11', 0);
insert into sys_topic values(default, '中彩票了该怎么办？', '天降横财', '李小双', '2019-7-8', 0);

select * from sys_topic order by createdate desc
drop table sys_topic
desc sys_topic

create table sys_reply(
replyid int(10) primary key auto_increment,
topicid int(10) not null,
author varchar(32) not null,
content varchar(1028) not null,
createdate datetime not null,
constraint fk_topic_reply foreign key (topicid) references sys_topic(topicid)
);

insert into sys_reply values (default, 1, 'lijunwei', '测试回复', NOW());
desc sys_reply
