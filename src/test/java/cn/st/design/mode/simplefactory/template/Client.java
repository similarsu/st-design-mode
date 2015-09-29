package cn.st.design.mode.simplefactory.template;

import org.junit.Test;

/**
 * <p>
 * desciption:
 * </p>
 * 
 * @author coolearth
 * @date 2015年9月29日
 */
public class Client {
    @Test
    public void test() {
        Api api = Factory.createApi(1);
        api.operation("正在使用简单工厂……");
    }
}
