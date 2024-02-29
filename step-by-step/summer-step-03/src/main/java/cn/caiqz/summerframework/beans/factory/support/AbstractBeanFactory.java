package cn.caiqz.summerframework.beans.factory.support;

import cn.caiqz.summerframework.beans.factory.BeanFactory;
import cn.caiqz.summerframework.beans.factory.config.BeanDefinition;

/**
 * @author caiqingzhou/成都三合力通科技有限公司
 * @version v1.0
 * @describe
 * @date 2024-02-29 10:23
 */
public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {
    @Override
    public Object getBean(String name) {
        return this.doGetBean(name, null);
    }

    @Override
    public Object getBean(String name, Object... args) {
        return this.doGetBean(name, args);
    }

    protected <T> T doGetBean(String name, Object... args) {
        Object bean = super.getSingleton(name);
        if (bean != null) {
            return (T) bean;
        }
        BeanDefinition beanDefinition = this.getBeanDefinition(name);
        return (T) this.createBean(name, beanDefinition, args);
    }

    protected abstract BeanDefinition getBeanDefinition(String beanName);

    protected abstract Object createBean(String beanName, BeanDefinition beanDefinition, Object[] args);
}
