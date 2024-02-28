package cn.caiqz.summerframework.beans.factory.config;

/**
 * @author caiqingzhou/成都三合力通科技有限公司
 * @version v1.0
 * @describe
 * @date 2024-02-26 16:58
 */
public interface SingletonBeanRegistry {
     Object getSingleton(String beanName);
}
