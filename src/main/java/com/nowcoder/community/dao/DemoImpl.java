package com.nowcoder.community.dao;

import org.springframework.stereotype.Repository;

@Repository("date")
public class DemoImpl implements DemoDao{
    @Override
    public String select() {
        return "date";
    }
}
