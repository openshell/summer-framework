package cn.caiqz.summerframework.beans.factory.support;

import cn.caiqz.summerframework.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

/**
 * @author caiqingzhou/成都三合力通科技有限公司
 * @version v1.0
 * @describe
 * @date 2024-02-27 11:42
 */
public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory {
    private InstantiationStrategy instantiationStrategy = new CglibSubclassingInstantiationStrategy();

    @Override
    protected Object createBean(String beanName, BeanDefinition beanDefinition, Object[] args) {
        Object bean = null;
        bean = this.createBeanInstance(beanDefinition, beanName, args);
        super.addSingleton(beanName, bean);
        return bean;
    }

    protected Object createBeanInstance(BeanDefinition beanDefinition, String beanName, Object[] args) {
        Constructor constructor = null;
        Class beanClass = beanDefinition.getBeanClass();
        Constructor[] declaredConstructors = beanClass.getDeclaredConstructors();
        for (Constructor ctor : declaredConstructors) {
            if (null != args && args.length == ctor.getParameterTypes().length) {
                constructor = ctor;
                break;
            }
        }
        return this.getInstantiationStrategy().instantiate(beanDefinition, beanName, constructor, args);
    }

    public InstantiationStrategy getInstantiationStrategy() {
        return this.instantiationStrategy;
    }

    public void setInstantiationStrategy(InstantiationStrategy instantiationStrategy) {
        this.instantiationStrategy = instantiationStrategy;
    }
}
