package cn.st.design.mode.singleton.template.extend;

/**
 * <p>
 * desciption: 使用枚举方式实现单例模式
 * </p>
 * 
 * @author coolearth
 * @date 2015年10月10日
 */
public enum Singleton4 {
    /**
     * 定义一个元素，代表一个实例
     */
    uniqueInstance;

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
