package com.wisely.highlight_spring4.ch1.javaconfig;

public class UseFunctionService {

    // 依赖关系注入
    // 但是还没有真正的实例，真正的 bean 实例在 JavaConfig 中配置
    FunctionService functionService;
    public void setFunctionService(FunctionService functionService){
        this.functionService = functionService;
    }

    public String SayHello(String word){
        return functionService.sayHello(word);
    }
}
