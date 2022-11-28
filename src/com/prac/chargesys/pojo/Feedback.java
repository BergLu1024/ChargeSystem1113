package com.prac.chargesys.pojo;

/**
 * @ClassName Feedback
 * @Description
 * @Date 2022/11/14 17:49
 * @Version 1.0
 */
public class Feedback {
    private Integer id;         //订单id，主键，不可见
    private Integer author;         //反馈者
    private String content;         //反馈的内容
    private String telnumber;           //反馈者的联系方式

    public Feedback() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAuthor() {
        return author;
    }

    public void setAuthorId(Integer author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTelnumber() {
        return telnumber;
    }

    public void setTelnumber(String telnumber) {
        this.telnumber = telnumber;
    }

    @Override
    public String toString() {
        return "Feedback{" +
                "id=" + id +
                ", author=" + author +
                ", content='" + content + '\'' +
                ", telnumber='" + telnumber + '\'' +
                '}';
    }
}
