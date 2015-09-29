package cn.st.design.mode.facade.template;

/**
 * <p>
 * desciption:外观对象
 * </p>
 * 
 * @author coolearth
 * @date 2015年9月29日
 */
public class Facade {
    public void test() {
        AModuleApi aModuleApi = new AModuleImpl();
        aModuleApi.testA();
        BModuleApi bModuleApi = new BModuleImpl();
        bModuleApi.testB();
        CModuleApi cModuleApi = new CModuleImpl();
        cModuleApi.testC();
    }
}
