package cn.st.design.mode.facade.rewrite;

/**
 * <p>
 * desciption:外观对象
 * </p>
 * 
 * @author coolearth
 * @date 2015年9月29日
 */
public class Facade {
    public void generate() {
        new Presentation().generate();
        new Business().generate();
        new DAO().generate();
    }
}
