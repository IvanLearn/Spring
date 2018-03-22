/**
 * Project Name:Spring_IOC_01
 * Package Name:com.spring.ioc
 * File Name:SpringIOCTest.java
 * Date:2018年3月22日 下午2:58:39
 * 
 */
package com.spring.ioc;

import javax.annotation.Resource;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.spring.staticFactory.StaticFactory;

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
    
    /*@Resource(name = "springIOC_api")
    private SpringIOC ioc_api;*/
    
    private ApplicationContext context;
    
    @Before
    public void init() {
//    	context = new ClassPathXmlApplicationContext("applicationContext.xml");
    }
    
    @After
    public void destroy() {
//    	ClassPathXmlApplicationContext classContext = (ClassPathXmlApplicationContext)context;
//    	classContext.close();
    }
    
    /**
     * 
     * testContructor:利用默认的构造器注册bean <br/>
     */
    @Test
    public void testContructor() {
        ioc.say();
//        ioc_api.say();
    }
    
    @Test
    public void testStaticFactory() {
    	SpringIOC springIoc = (SpringIOC) context.getBean("staticFactory");
    	
    	springIoc.say();
    }
    
    @Test
    public void testInstanceFactory() {
    	SpringIOC springIoc = (SpringIOC) context.getBean("instanceFactory_springIOC");
    	springIoc.say();
    }
    
    @Test
    public void testLazyInit() {
    	StaticFactory factory = (StaticFactory) context.getBean("staticFactory");
    	ioc.say();
    	factory.say();
    }
    
    @Test
    public void testLifeCycle() {
    	ioc.say();
    }

}
