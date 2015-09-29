package cn.st.design.mode.facade.rewrite;

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
        new Facade().generate();
    }
}
