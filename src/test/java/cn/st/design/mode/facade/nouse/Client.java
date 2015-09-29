package cn.st.design.mode.facade.nouse;

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
        // 客户端必须对这些模块都有所了解，才能正确使用它们
        new Presentation().generate();
        new Business().generate();
        new DAO().generate();
    }
}
