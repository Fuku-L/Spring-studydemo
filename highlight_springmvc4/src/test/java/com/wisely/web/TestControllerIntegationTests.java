package com.wisely.web;

import com.wisely.config.MyMvcConfig;
import com.wisely.web.service.TestDemoService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpSession;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {MyMvcConfig.class})
@WebAppConfiguration("src/main/resources")
// 用来声明加载的“上下文容器”是一个“Web容器”
// 属性指定web资源的位置，默认是"src/main/webapp",由于没有真实启动，测试需要改成 "src/main/resources"
public class TestControllerIntegationTests {

    private MockMvc mockMvc;

    @Autowired
    private TestDemoService testDemoService;

    @Autowired
    WebApplicationContext wac;

    /**
     * 可以注入模拟的 http session 和 http request，本案例中没有使用
    @Autowired
    MockHttpSession session;

    @Autowired
    MockHttpServletRequest request;
     * */

    // 测试开始之前的初始化工作，
    @Before
    public void setup(){
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
    }

    @Test
    public void testNormalController() throws Exception{
        // 模拟像 /normal 进行get请求
        // 预期控制返回状态为 200
        // 预期 view 的名称为 page
        // 预期页面转向的真正路径为 "/WEB-INF/classes/views/page.jsp"
        // 预期model中的值为 testDemoService.saySomething() 返回值 hello
        mockMvc.perform(get("/normal"))
                .andExpect(status().isOk())
                .andExpect(view().name("page"))
                .andExpect(forwardedUrl("/WEB-INF/classes/views/page.jsp"))
                .andExpect(model().attribute("msg", testDemoService.saySomething()));
    }


    @Test
    public void testRestController() throws Exception{
        // 模拟像 /testRest 进行get请求
        // 预期返回值的媒体类型为 "text/plain;charset=UTF-8"
        // 由于预期返回值内容为 testDemoService.saySomething() 的返回值 "hello"
        mockMvc.perform(get("/testRest"))
                .andExpect(status().isOk())
                .andExpect(content().contentType("text/plain;charset=UTF-8"))
                .andExpect(content().string(testDemoService.saySomething()));
    }


}
