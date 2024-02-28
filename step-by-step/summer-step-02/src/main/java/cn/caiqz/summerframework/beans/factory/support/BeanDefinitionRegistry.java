package cn.caiqz.summerframework.beans.factory.support;

import cn.caiqz.summerframework.beans.factory.config.BeanDefinition;

/**
 * @author caiqingzhou/成都三合力通科技有限公司
 * @version v1.0
 * @describe
 * @date 2024-02-27 14:50
 */
public interface BeanDefinitionRegistry {
    void registerBeanDefinition(String name, BeanDefinition beanDefinition);
}
