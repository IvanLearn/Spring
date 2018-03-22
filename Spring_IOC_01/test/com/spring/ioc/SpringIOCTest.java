/**
 * Project Name:Spring_IOC_01
 * Package Name:com.spring.ioc
 * File Name:SpringIOCTest.java
 * Date:2018年3月22日 下午2:58:39
 * 
 */
package com.spring.ioc;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * ClassName: SpringIOCTest <br/>
 * Description: TODO <br/>
 * Date: 2018年3月22日 下午2:58:39 <br/>
 * <br/>
 * 
 * @author admin(邮箱)
 * 
 * 修改记录
 * @version 2018年3月22日 admin Initial version<br/>
 * 
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class SpringIOCTest {
    
//    @Autowired
    @Resource(name = "springIOC")
    private SpringIOC ioc;
    
    @Resource(name = "springIOC_api")
    private SpringIOC ioc_api;
    
    /**
     * 
     * testContructor:利用默认的构造器注册bean <br/>
     */
    @Test
    public void testContructor() {
//        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        SpringIOC ioc = (SpringIOC) context.getBean("springIOC");
        
        ioc.say();
        ioc_api.say();
    }

}
