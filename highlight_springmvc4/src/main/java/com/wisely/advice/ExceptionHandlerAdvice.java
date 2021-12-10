package com.wisely.advice;

import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

/**
 *  @ControllerAdvice: 作用：将对控制器的全局配置放在同一个位置
 *
 *  @ExceptionHandler(value=Exception.class):  全局处理控制器中的异常，可以通过value来过滤拦截天降
 *  @ModelAttribute: 将键值对添加到全局，所有注解了 @RequeMapping()的方法，都可以通过@ModelAttribute("xxx")获取对用值。
 *  @InitBinder: 用来设置 WebDataBinder，绑定前台请求参数到 Model 中
 *
 *
 */
@ControllerAdvice // 控制器建言，组合了 Component注解，自动注册为 Spring 的 Bean
public class ExceptionHandlerAdvice {

    @ExceptionHandler(value = Exception.class)
    public ModelAndView exception(Exception exception, WebRequest request){
        ModelAndView modelAndView = new ModelAndView("error"); // error 页面
        modelAndView.addObject("errorMessage",exception.getMessage());
        return modelAndView;
    }

    @ModelAttribute
    public void addAttributes(Model model){
        model.addAttribute("msg","额外信息");
    }

    @InitBinder
    public void initBinder(WebDataBinder webDataBinder){
        webDataBinder.setDisallowedFields("id");
    }
}
