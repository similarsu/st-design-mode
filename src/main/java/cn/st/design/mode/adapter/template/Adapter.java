package cn.st.design.mode.adapter.template;

/**
 * <p>
 * desciption:适配器
 * </p>
 * 
 * @author coolearth
 * @date 2015年9月30日
 */
public class Adapter implements Target {
    /**
     * 持有需要被适配的接口对象
     */
    private Adaptee adaptee;

    /**
     * 传入被适配的对象
     * 
     * @param adaptee
     */
    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        // TODO Auto-generated method stub
        // 转调已经实现的方法，进行适配
        adaptee.specialRequest();
    }
}
