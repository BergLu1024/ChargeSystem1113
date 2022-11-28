package com.prac.chargesys.dao.impl;

import com.prac.chargesys.dao.FeedbackDAO;
import com.prac.chargesys.pojo.Feedback;
import com.prac.chargesys.pojo.User;

import java.util.List;

/**
 * @ClassName FeedbackDAOImpl
 * @Description
 * @Date 2022/11/28 9:14
 * @Version 1.0
 */
public class FeedbackDAOImpl extends BaseDao implements FeedbackDAO {
    @Override
    public List<Feedback> getFeedbackList(Integer author) {
        String sql = "select * from t_feedback where author = ?";
        List<Feedback> feedbackList = queryForList(Feedback.class, sql, author);
        return feedbackList;
    }

    @Override
    public Feedback getFeedback(Integer id) {
        String sql = "select * from t_feedback where id = ?";
        Feedback feedback = queryForOne(Feedback.class, sql, id);
        return feedback;
    }

    @Override
    public void addFeedback(Feedback feedback) {
        String sql = "insert into t_feedback(content, telnumber, author) values(?, ?, ?)";
        update(sql, feedback.getContent(), feedback.getTelnumber(), feedback.getAuthor());
    }
}
