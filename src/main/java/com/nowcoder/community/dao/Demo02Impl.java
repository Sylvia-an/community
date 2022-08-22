package com.nowcoder.community.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository
@Primary
public class Demo02Impl implements DemoDao{
    @Override
    public String select() {
        return "bbb";
    }
}
