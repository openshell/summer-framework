package cn.caiqz.summerframework.beans.factory.support;

import cn.caiqz.summerframework.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

/**
 * @author caiqingzhou/成都三合力通科技有限公司
 * @version v1.0
 * @describe
 * @date 2024-02-29 10:50
 */
public interface InstantiationStrategy {
    /***
     * 实例化策略
     * @param beanDefinition
     * @param beanName
     * @param ctor
     * @param args
     * @return: java.lang.Object
     * @author openshell
     * @date: 2024-02-29 10:54
     */
    Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor ctor, Object[] args);
}
