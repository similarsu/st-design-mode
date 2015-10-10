package cn.st.design.mode.singleton.nouse;

import org.junit.Test;

/**
 * <p>
 * desciption:
 * </p>
 * 
 * @author coolearth
 * @date 2015年9月30日
 */
public class Client {
    @Test
    public void test() {
        AppConfig appConfig = new AppConfig();
        String parameterA = appConfig.getParameterA();
        String parameterB = appConfig.getParameterB();
        System.out.println("parameterA=" + parameterA + ",parameterB=" + parameterB);
    }
}
