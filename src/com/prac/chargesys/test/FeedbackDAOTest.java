package com.prac.chargesys.test;

import com.prac.chargesys.dao.FeedbackDAO;
import com.prac.chargesys.dao.impl.FeedbackDAOImpl;
import com.prac.chargesys.pojo.Feedback;
import org.junit.Test;

import java.util.List;

/**
 * @ClassName FeedbackDAOTest
 * @Description
 * @Date 2022/11/28 9:20
 * @Version 1.0
 */
public class FeedbackDAOTest {
    FeedbackDAO feedbackDAO = new FeedbackDAOImpl();

    @Test
    public void test1(){
        List<Feedback> feedbackList = feedbackDAO.getFeedbackList(2);
        for (Feedback feedback : feedbackList){
            System.out.println(feedback);
        }
    }

    @Test
    public void test2(){
        Feedback feedback = feedbackDAO.getFeedback(1);
        System.out.println(feedback);
    }
}
