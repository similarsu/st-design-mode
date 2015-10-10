package cn.st.design.mode.singleton.template;

/**
 * <p>
 * desciption: 懒汉式单例实现
 * </p>
 * 
 * @author coolearth
 * @date 2015年10月10日
 */
public class Singleton1 {
    /**
     * 定义一个变量来存储创建好的类实例
     */
    private static Singleton1 uniqueInstance = null;

    /**
     * 私有化构造函数，控制创建实例数目
     */
    private Singleton1() {

    }

    /**
     * 提供类实例
     * 
     * @return
     */
    public static synchronized Singleton1 getInstance() {
        // 判断实例是否为空
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton1();
        }
        return uniqueInstance;
    }

    /**
     * 示意方法
     */
    public void singletonOperation() {

    }

    /**
     * 示意属性
     */
    private String singleData;

    public String getSingleData() {
        return singleData;
    }

}
