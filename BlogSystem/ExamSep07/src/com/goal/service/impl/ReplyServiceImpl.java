package com.goal.service.impl;

import com.goal.mapper.ReplyMapper;
import com.goal.pojo.SysReply;
import com.goal.service.ReplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReplyServiceImpl implements ReplyService {
    @Autowired
    private ReplyMapper replyMapper;

    // 添加回复有问题
    @Override
    public Integer createReply(SysReply sysReply) {
        return replyMapper.createReply(sysReply);

    }
}
