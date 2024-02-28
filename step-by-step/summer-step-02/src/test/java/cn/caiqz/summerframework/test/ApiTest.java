package cn.caiqz.summerframework.test;

import cn.caiqz.summerframework.beans.factory.config.BeanDefinition;
import cn.caiqz.summerframework.beans.factory.support.DefaultListableBeanFactory;
import cn.caiqz.summerframework.test.bean.UserService;
import org.junit.Test;

/**
 * @author caiqingzhou/成都三合力通科技有限公司
 * @version v1.0
 * @describe
 * @date 2024-02-27 17:37
 */
public class ApiTest {
    @Test
    public void testBeanFactory() {
        //1. 初始化beanfactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        //2.注册bean
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        //3.第一次获取bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();

        //4. 第二次获取bean
        UserService userService_singleton = (UserService) beanFactory.getSingleton("userService");
        userService_singleton.queryUserInfo();

    }
}
