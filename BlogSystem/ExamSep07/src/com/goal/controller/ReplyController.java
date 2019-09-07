package com.goal.controller;

import com.goal.pojo.SysReply;
import com.goal.service.ReplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ReplyController {
    @Autowired
    private ReplyService replyService;

    @RequestMapping("/reply")
    public String reply(SysReply sysReply) {
        Integer replyResult = replyService.createReply(sysReply);
        if (replyResult == 1) {
            System.out.println("回复成功");
        } else {
            System.out.println("回复失败");
        }
        return "/showTopics";
    }
}
