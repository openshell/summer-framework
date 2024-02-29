package cn.caiqz.summerframework.beans.factory;

/**
 * @author caiqingzhou/成都三合力通科技有限公司
 * @version v1.0
 * @describe
 * @date 2024-02-29 10:21
 */
public interface BeanFactory {
    Object getBean(String name);

    Object getBean(String name, Object... arg);
}
