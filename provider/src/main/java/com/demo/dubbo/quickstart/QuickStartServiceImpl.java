package com.demo.dubbo.quickstart;

import com.demo.dubbo.ServiceAPI;

/**
 * @Author Elvis Chen
 * @Date 2019/1/14 14:35
 * @Version 1.0
 **/
public class QuickStartServiceImpl implements ServiceAPI{

    @Override
    public String sendMessage(String message) {
        return "quickstart-provider-message="+message;
    }
}
