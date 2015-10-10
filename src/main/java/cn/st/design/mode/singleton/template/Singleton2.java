package cn.st.design.mode.singleton.template;

/**
 * <p>
 * desciption: 饿汉式单例实现
 * </p>
 * 
 * @author coolearth
 * @date 2015年10月10日
 */
public class Singleton2 {
    /**
     * 定义一个变量来存储创建好的类实例,直接在此创建实例
     */
    private static Singleton2 uniqueInstance = new Singleton2();

    /**
     * 私有化构造函数，控制创建实例数目
     */
    private Singleton2() {

    }

    /**
     * 提供类实例
     * 
     * @return
     */
    public static synchronized Singleton2 getInstance() {
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
