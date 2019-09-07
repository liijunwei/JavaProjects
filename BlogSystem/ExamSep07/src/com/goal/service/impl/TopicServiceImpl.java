package com.goal.service.impl;

import com.goal.mapper.ReplyMapper;
import com.goal.mapper.TopicMapper;
import com.goal.pojo.SysReply;
import com.goal.pojo.SysTopic;
import com.goal.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TopicServiceImpl implements TopicService {
    @Autowired
    private TopicMapper topicMapper;
    @Autowired
    private ReplyMapper replyMapper;

    @Override
    public List<SysTopic> retrieveAllTopics() {
        return topicMapper.retrieveAllTopics();
    }

    @Override
    public Integer createTopic(SysTopic sysTopic) {
        return topicMapper.createTopic(sysTopic);
    }

    /*之前用的是业务装配方式，那样有个问题，就是如果一个话题如果连一条回复都没有的话，就无法查询到详细的（包含话题信息和回复信息的）话题信息*/
    /*======业务装配方式======*/
    @Override
    public SysTopic retrieveTopicById(Integer topicId) {
        /*根据topic id查询对应的回复信息*/
        List<SysReply> replyList = replyMapper.retrieveReplyByTid(topicId);
        /*根据topic id查询对应的话题信息*/
        SysTopic topicFound = topicMapper.retrieveTopicById(topicId);
        /*如果reply list 部位空，则将两者装配起来*/
        if (replyList != null) {
            topicFound.setReplyList(replyList);
        }
        return topicFound;
    }

    @Override
    public Integer updateClicks(Integer topicId) {
        return topicMapper.updateClicks(topicId);
    }
}
