package cn.st.design.mode.simplefactory.rewrite;

import org.junit.Test;

import cn.st.design.mode.simplefactory.rewrite.Api;
import cn.st.design.mode.simplefactory.rewrite.ApiFactory;

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
        Api api = ApiFactory.createApi();
        api.say("Jim");
    }
}
