package cn.caiqz.summerframework.beans.factory.support;

import cn.caiqz.summerframework.beans.factory.config.BeanDefinition;

/**
 * @author caiqingzhou/成都三合力通科技有限公司
 * @version v1.0
 * @describe
 * @date 2024-02-27 11:42
 */
public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory {

    @Override
    protected Object createBean(String beanName, BeanDefinition beanDefinition) {
        Object bean = null;
        try {
            bean = beanDefinition.getBeanClass().newInstance();

        } catch (InstantiationException | IllegalAccessException e) {
            throw new RuntimeException("InstantiationException|IllegalAccessException", e);
        }
        super.addSingleton(beanName, bean);
        return bean;
    }
}
