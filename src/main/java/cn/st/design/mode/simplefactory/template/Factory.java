package cn.st.design.mode.simplefactory.template;

/**
 * <p>
 * desciption: 用来创建Api对象
 * </p>
 * 
 * @author coolearth
 * @date 2015年9月29日
 */
public class Factory {
    /**
     * 具体创建Api对象的方法
     * 
     * @param condition 外部传入的选择条件
     * @return
     */
    public static Api createApi(int condition) {
        Api api = null;
        if (condition == 1) {
            api = new ImplA();
        } else if (condition == 2) {
            api = new ImplB();
        }
        return api;
    }
}
