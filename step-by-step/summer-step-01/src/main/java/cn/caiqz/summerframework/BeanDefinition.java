package cn.caiqz.summerframework;

/**
 * <p>
 * 
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
