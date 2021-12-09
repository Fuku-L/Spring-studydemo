package com.wisely.highlight_spring4.ch3.forTest2;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {test2Config.class})
@ActiveProfiles("prod")
public class BeanIntergrationTest2 {

    @Autowired
    test2Bean test2Bean;

    @Test
    public void devBeanShouldInject(){
        String expected = "from dev Test2Bean";
        String actual = test2Bean.getContent();
        Assert.assertEquals(expected,actual);
    }
}
