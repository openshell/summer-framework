package cn.caiqz.summerframework;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * <p>
 * 模拟Spring 的BeanFactory
 * </p>
 *
 * @author caiqingzhou
 * @since 2024-01-20
 */
public class BeanFactory {
    private Map<String, BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<>();

    public void registerBeanDefinition(String name, BeanDefinition beanDefinition) {
        this.beanDefinitionMap.put(name, beanDefinition);
    }

    public Object getBean(String name) {
        return this.beanDefinitionMap.get(name).getBean();
    }
}
