/**
 * 
 * Project Name:Spring_IOC_01
 * Package Name:com.spring.ioc
 * File Name:SpringIOC.java
 * Date:2018年3月22日 下午2:46:33
 * 
 */
package com.spring.ioc;

import org.apache.log4j.Logger;

/**
 * ClassName: SpringIOC <br/>
 * Description: TODO <br/>
 * Date: 2018年3月22日 下午2:46:33 <br/>
 * <br/>
 * 
 * @author admin(邮箱)
 * 
 * 修改记录
 * @version 2018年3月22日 admin Initial version<br/>
 * 
 */

public class SpringIOC {
    
    private static final Logger logger = Logger.getLogger(SpringIOC.class);
    
    public SpringIOC() {
    	System.out.println("SpringIOC start==========");
    }
    
    public void say() {
        System.out.println(this.getClass().getName() + "say==========");
    }
    
    public void init() {
    	System.out.println(this.getClass().getName() + "init==========");
    }
    
    public void destory() {
    	System.out.println(this.getClass().getName() + "destory==========");
    }
    
}
