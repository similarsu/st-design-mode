package cn.st.design.mode.simplefactory.rewrite;

/**
 * <p>
 * desciption:
 * </p>
 * 
 * @author coolearth
 * @date 2015年8月26日
 */
public class Impl implements Api {

    @Override
    public void say(String name) {
        // TODO Auto-generated method stub
        System.out.println("impl say welcome " + name);
    }

}
