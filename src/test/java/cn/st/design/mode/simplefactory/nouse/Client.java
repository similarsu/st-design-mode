package cn.st.design.mode.simplefactory.nouse;

import org.junit.Test;

/**
 * <p>
 * desciption:
 * </p>
 * 
 * @author coolearth
 * @date 2015年8月26日
 */
public class Client {
    @Test
    public void test() {
        // 客户端不但要知道接口 还需要知道 具体的实现类
        Api api = new Impl();
        api.say("John");
    }
}
