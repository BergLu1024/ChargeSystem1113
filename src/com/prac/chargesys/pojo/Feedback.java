package com.prac.chargesys.pojo;

/**
 * @ClassName Feedback
 * @Description
 * @Date 2022/11/14 17:49
 * @Version 1.0
 */
public class Feedback {
    private Integer userid;         //反馈者的id
    private String content;         //反馈的内容
    private String telnumber;           //反馈者的联系方式

    public Feedback() {
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
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
}
