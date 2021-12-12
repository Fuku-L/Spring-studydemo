package com.wisely.web.controller;

import com.wisely.web.service.PushService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.async.DeferredResult;

@Controller
public class AsyncController {
    @Autowired
    PushService pushService;

    // 异步任务的实现：通过控制器从另外一个线程返回一个 DeferredResult， 这里的 DeferredResult 是从 pushService 中获得。
    @RequestMapping("/defer")
    @ResponseBody
    public DeferredResult<String> deferredCall(){
        return pushService.getAsyncUpdate();
    }
}
