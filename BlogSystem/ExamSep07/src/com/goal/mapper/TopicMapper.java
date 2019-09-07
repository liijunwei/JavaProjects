package com.goal.mapper;

import com.goal.pojo.SysTopic;

import java.util.List;

public interface TopicMapper {
    /**
     * 查询所有的话题信息,不包括评论信息
     * @return 包含一条条话题信息的list
     */
    List<SysTopic> retrieveAllTopics();

    /**
     * 根据表单传来的帖子信息新增一个帖子
     * @param sysTopic 接收表单传来信息封装而成的对象
     * @return 1表示新增成功，其它表示失败
     */
    Integer createTopic(SysTopic sysTopic);


    /**
     * 根据话题id查询话题的详细信息，不包括回复信息
     * @param topicId 话题id
     * @return 话题的详细信息,不包含回复
     */
    SysTopic retrieveTopicById(Integer topicId);

    /**
     * 更新查看数
     * @param topicId
     * @return 1表示更新成功
     */
    Integer updateClicks(Integer topicId);


}
