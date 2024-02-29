package cn.caiqz.summerframework.bean;

/**
 * @author caiqingzhou/成都三合力通科技有限公司
 * @version v1.0
 * @describe
 * @date 2024-02-29 15:28
 */
public class UserService {
    private String name;

    public UserService() {
        System.out.println("无参构造函数");
    }

    public UserService(String name) {
        this.name = name;
    }
    public void queryUserInfo() {
        System.out.println("查询用户信息：" + name);
    }
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("");
        sb.append("").append(name);
        return sb.toString();
    }
}
