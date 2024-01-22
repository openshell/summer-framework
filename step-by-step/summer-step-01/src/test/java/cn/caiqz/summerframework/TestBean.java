package cn.caiqz.summerframework;

import org.junit.Test;
/**
 * <p>
 * 
 * </p>
 *
 * @author caiqingzhou
 * @since 2024-01-20
 */
public class TestBean {
    @Test
    public void testBeanFactory() {
        BeanFactory beanFactory = new BeanFactory();

        BeanDefinition beanDefinition = new BeanDefinition(new UserService());
        beanFactory.registerBeanDefinition("UserService", beanDefinition);

        UserService userService = (UserService) beanFactory.getBean("UserService");
        userService.queryUserInfo();
    }
}
