package com.goal.pojo;

import java.sql.Timestamp;
// 对应数据库中的sys_reply表
public class SysReply {
    private Integer replyId;
    private Integer topicId;
    private String author;
    private String content;
    private Timestamp createDate; /*对应mysql中的datetime*/

    public SysReply() {
    }

    public SysReply(Integer replyId, Integer topicId, String author, String content, Timestamp createDate) {
        this.replyId = replyId;
        this.topicId = topicId;
        this.author = author;
        this.content = content;
        this.createDate = createDate;
    }

    public Integer getReplyId() {
        return replyId;
    }

    public void setReplyId(Integer replyId) {
        this.replyId = replyId;
    }

    public Integer getTopicId() {
        return topicId;
    }

    public void setTopicId(Integer topicId) {
        this.topicId = topicId;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Timestamp getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        return "SysReply{" +
                "replyId=" + replyId +
                ", topicId=" + topicId +
                ", author='" + author + '\'' +
                ", content='" + content + '\'' +
                ", createDate=" + createDate +
                '}';
    }
}