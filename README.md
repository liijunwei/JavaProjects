# JavaProjects

My Pet Java Projects

2019-09-07 19:37:45 summary

+ 这个项目主要的功能模块为：

1. 查看所有的话题
2. 发布新话题
3. 对选中的话题可以进行回复

项目对应的jsp页面：

1. index.jsp 首页
2. topic-list.jsp 显示话题列表
3. topic-info 显示某个话题的详细信息所有回复信息，并且在这个页面上可以进行回复
4. topic-add.jsp 新增话题

+ 功能模块1的实现思路：

在首页中点击”show Topics“发送请求到”/showTopics“这个控制器，查询所有的话题信息，返回列表
之后控制器将数据和页面转发到topic-list.jsp ,在这个页面中进行显示

+ 功能模块2的实现思路：

在topic-list.jsp中点击”我要发帖“，发送请求至“/add-topic”这个控制器，他将页面转发到add-topic.jsp中去
在这个页面中填表单并提交至“/createTopic”这个控制器，进行数据库操作，操作成功后重定向到显示话题列表的页面

+ 功能模块3的实现思路：

在显示话题列表的页面点击某条话题，发送请求至“/showTopic?topicId=${topic.topicId}”，带上该条话题的id
控制其接受请求并查询数据，将数据返回给“topic-info.jsp”，在这个页面接收并显示话题信息和回复信息，并且可以添加回复；
回复时，填写表单并提交，发送请求至“/createReply”控制器，控制器接收并处理表单信息，操作数据库。

详细的后端实现在代码的注释中。

功能很简陋，应该也有不少缺陷，作为练习很不错。加油ovo


note：

MySql的时间类型有 | Java中与之对应的时间类型
------------------|---------------------------
date              | java.sql.Date
Datetime          | java.sql.Timestamp
Timestamp         | java.sql.Timestamp
Time              | java.sql.Time
Year              | java.sql.Date

ref : https://www.cnblogs.com/BearOcean/archive/2007/04/09/705751.html





