package com.nowcoder.community;

import com.nowcoder.community.config.DemoConfig;
import com.nowcoder.community.dao.DemoDao;
import com.nowcoder.community.service.DemoService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.SimpleDateFormat;
import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = CommunityApplication.class)
class CommunityApplicationTests implements ApplicationContextAware {

    private ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    @Test
    public void testApplicationContext() {
        System.out.println(applicationContext);

        DemoDao demoDao = applicationContext.getBean(DemoDao.class);
        System.out.println(demoDao.select());

        DemoDao demoDao1 = applicationContext.getBean("date", DemoDao.class);
        System.out.println(demoDao1.select());
    }

    @Test
    public void testBeanManagement() {
        DemoService demoService = applicationContext.getBean(DemoService.class);
        System.out.println(demoService);
    }

    @Test
    public void testBeanConfig() {
        SimpleDateFormat simpleDateFormat = applicationContext.getBean(SimpleDateFormat.class);
        System.out.println(simpleDateFormat.format(new Date()));
    }

    @Autowired
    private DemoDao demoDao;

    @Autowired
    @Qualifier("date")
    private DemoDao demoDao1;

    @Test
    public void test() {
        System.out.println(demoDao);
        System.out.println(demoDao1);
    }
}
