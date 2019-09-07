package com.goal.controller;

import com.goal.pojo.SysReply;
import com.goal.pojo.SysTopic;
import com.goal.service.ReplyService;
import com.goal.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;

@Controller
public class TopicController {
    @Autowired
    private TopicService topicService;
    @Autowired
    private ReplyService replyService;

    @RequestMapping("/")
    public String Welcome() {
        return "index";
    }

    /*显示所有的话题*/
    @RequestMapping("/showTopics")
    public String showTopics(Model model) {
        List<SysTopic> sysTopics = topicService.retrieveAllTopics();

        model.addAttribute("topics", sysTopics);
        return "topic-list";
    }

    /*转发到发帖的jsp*/
    @RequestMapping("/add-topic")
    public String showCreatingPage() {
        return "add-topic";
    }

    @RequestMapping("/createTopic")
    public String createTopic(String title, String content, String author) {
        SysTopic sysTopic = new SysTopic(null, title, content, author, new Date(System.currentTimeMillis()), null);

        Integer result = topicService.createTopic(sysTopic);
        if (result == 1) {
            System.out.println("发帖成功^.^");
        } else {
            System.out.println("发帖失败X.X");
        }
        return "redirect:/showTopics";
    }

    /*查询话题详细信息并转发到话题信息页面，展示查询到的结果*/
    @RequestMapping("/showTopic")
    public String showTopic(Model model, Integer topicId) {
        SysTopic topicInfo = topicService.retrieveTopicById(topicId);
        Integer updateClicks = topicService.updateClicks(topicId);
        if (updateClicks == 1) {
            System.out.println("更新点击量成功");
        } else {
            System.out.println("更新点击量失败");
        }
        model.addAttribute("topicInfo", topicInfo);
        return "topic-info";
    }

    @RequestMapping("/createReply")
    public String createReply(Integer topicId, String author, String content) {
        SysReply sysReply = new SysReply(null, topicId, author, content, new Timestamp(System.currentTimeMillis()));
        Integer result = replyService.createReply(sysReply);
        //2019-09-07 17:51:56  明明添加成功了，为什么result 为null 呢
        // 因为愚蠢，mapper.xml里面那句sql明明是insert，却套了个select标签
        if (result == 1) {
            System.out.println("评论成功^.^");
        } else {
            System.out.println("评论失败X.X");
        }
        return "redirect:/showTopic?topicId=" + topicId;
    }
}
