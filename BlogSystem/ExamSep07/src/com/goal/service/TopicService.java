package com.goal.service;

import com.goal.pojo.SysTopic;

import java.util.List;

public interface TopicService {
    /**
     * 获取所有的话题信息
     * @return 包含所有的话题的list，不含话题的回复信息
     */
    List<SysTopic> retrieveAllTopics();

    /**
     * 发表新的话题
     * @param sysTopic 根据表单信息封装的topic对象
     * @return 1表示发表成功
     */
    Integer createTopic(SysTopic sysTopic);

    /**
     *  在业务层中做了业务装配
     * 根据topic id查询出完整的话题信息，包括话题表中和回复表中的信息
     * @param topicId 话题id
     * @return 完整的话题信息
     */
    SysTopic retrieveTopicById(Integer topicId);

    /**
     * 每次查看话题，查看数都会增加
     * @param topicId 根据话题id更新数据库中的数据信息
     * @return 1代表更新成功
     */
    Integer updateClicks(Integer topicId);

}
