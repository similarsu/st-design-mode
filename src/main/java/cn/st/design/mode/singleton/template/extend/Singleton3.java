package cn.st.design.mode.singleton.template.extend;

/**
 * <p>
 * desciption: Lazy initialization holder class 模式
 * </p>
 * 
 * @author coolearth
 * @date 2015年10月10日
 */
public class Singleton3 {

    /**
     * 
     * <p>
     * desciption:类级别内部类，即静态的成员式内部类，该内部类的实例与外部类的实例没有绑定关系，只有被调用到时才会被加载，实现了延迟加载
     * </p>
     * 
     * @author coolearth
     * @date 2015年10月10日
     */
    private static class SingletonHandler {
        /**
         * 静态初始化器，有JVM来保证线程安全
         */
        private static Singleton3 uniqueInstance = new Singleton3();
    }


    /**
     * 私有化构造函数，控制创建实例数目
     */
    private Singleton3() {

    }

    /**
     * 提供类实例
     * 
     * @return
     */
    public static Singleton3 getInstance() {
        return SingletonHandler.uniqueInstance;
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
