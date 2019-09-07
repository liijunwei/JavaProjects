package com.goal.pojo;

import java.sql.Date;
import java.util.List;

// 对应数据库中的sys_topic表
public class SysTopic {
    private Integer topicId;
    private String title;
    private String content;
    private String author;
    private Date createDate;  /*对应mysql中的date*/
    private Integer clickAmount;

    /*话题---回复 为一对多关系，每个话题可以有多个回复*/
    /*这种在pojo类里耦合其它类对象的做法好像不太好，但不目前不知道别的更好的做法*/
    private List<SysReply> replyList;

    public SysTopic() {
    }

    public SysTopic(Integer topicId, String title, String content, String author, Date createDate, Integer clickAmount, List<SysReply> replyList) {
        this.topicId = topicId;
        this.title = title;
        this.content = content;
        this.author = author;
        this.createDate = createDate;
        this.clickAmount = clickAmount;
        this.replyList = replyList;
    }

    public SysTopic(Integer topicId, String title, String content, String author, Date createDate, Integer clickAmount) {
        this.topicId = topicId;
        this.title = title;
        this.content = content;
        this.author = author;
        this.createDate = createDate;
        this.clickAmount = clickAmount;
    }

    public Integer getTopicId() {
        return topicId;
    }

    public void setTopicId(Integer topicId) {
        this.topicId = topicId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Integer getClickAmount() {
        return clickAmount;
    }

    public void setClickAmount(Integer clickAmount) {
        this.clickAmount = clickAmount;
    }

    public List<SysReply> getReplyList() {
        return replyList;
    }

    public void setReplyList(List<SysReply> replyList) {
        this.replyList = replyList;
    }

    @Override
    public String toString() {
        return "SysTopic{" +
                "topicId=" + topicId +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", author='" + author + '\'' +
                ", createDate=" + createDate +
                ", clickAmount=" + clickAmount +
                ", replyList=" + replyList +
                '}';
    }
}


