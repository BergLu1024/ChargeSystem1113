package com.prac.chargesys.dao;

import com.prac.chargesys.pojo.Feedback;
import com.prac.chargesys.pojo.User;

import java.util.List;

/**
 * @interfaceName FeedbackDAO
 * @Description
 * @Date 2022/11/24 15:53
 * @Version 1.0
 */
public interface FeedbackDAO {

    /**
     * 获取用户反馈信息列表。
     * @param author
     * @return 成功则返回List，失败返回null
     */
    List<Feedback> getFeedbackList(Integer author);

    /**
     * 根据反馈信息id，获取反馈信息具体内容
     * @param id
     * @return
     */
    Feedback getFeedback(Integer id);

    /**
     * 添加新的反馈信息
     * @param feedback
     */
    void addFeedback(Feedback feedback);
}
