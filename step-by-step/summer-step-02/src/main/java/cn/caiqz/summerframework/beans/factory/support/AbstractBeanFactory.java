package cn.caiqz.summerframework.beans.factory.support;

import cn.caiqz.summerframework.beans.factory.BeanFactory;
import cn.caiqz.summerframework.beans.factory.config.BeanDefinition;

/**
 * @author caiqingzhou/成都三合力通科技有限公司
 * @version v1.0
 * @describe
 * @date 2024-02-26 17:10
 */
public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {
    @Override
    public Object getBean(String name) {
        Object bean = super.getSingleton(name);
        if (bean != null) {
            return bean;
        }
        BeanDefinition beanDefinition = this.getBeanDefinition(name);
        return this.createBean(name, beanDefinition);
    }

    protected abstract BeanDefinition getBeanDefinition(String beanName);

    protected abstract Object createBean(String beanName, BeanDefinition beanDefinition);
}
