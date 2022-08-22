package com.nowcoder.community.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service
@Scope("prototype")
public class DemoService {

    public DemoService() {
        System.out.println("实例化DemoService");
    }

    @PostConstruct
    public void init() {
        System.out.println("初始化DemoService");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("销毁DemoService");
    }
}
