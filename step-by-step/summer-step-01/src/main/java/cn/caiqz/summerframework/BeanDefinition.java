package cn.caiqz.summerframework;

/**
 * <p>
 * 模拟Spring的BeanDefinition
 * </p>
 *
 * @author caiqingzhou
 * @since 2024-01-20
 */
public class BeanDefinition {

    private Object bean;

    public BeanDefinition(Object bean) {
        this.bean = bean;
    }

    public Object getBean() {
        return bean;
    }
}
