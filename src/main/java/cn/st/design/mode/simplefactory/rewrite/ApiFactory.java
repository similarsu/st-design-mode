package cn.st.design.mode.simplefactory.rewrite;

/**
 * <p>
 * desciption: 工厂类 用来选择实现
 * </p>
 * 
 * @author coolearth
 * @date 2015年8月26日
 */
public class ApiFactory {
    public static Api createApi() {
        Api api = null;
        api = new Impl();
        return api;
    }
}
