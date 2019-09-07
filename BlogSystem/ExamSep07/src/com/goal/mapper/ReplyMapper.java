package com.goal.mapper;

import com.goal.pojo.SysReply;

import java.util.List;

public interface ReplyMapper {

    /**
     * 新增回复信息
     * @param sysReply 封装好的回复对象
     * @return 1表示新增数据成功
     */
    Integer createReply(SysReply sysReply);

    /**
     * 根据话题id查询回复的信息
     * @param topicId 话题id
     * @return 回复的list
     */
    List<SysReply> retrieveReplyByTid(Integer topicId);

}
