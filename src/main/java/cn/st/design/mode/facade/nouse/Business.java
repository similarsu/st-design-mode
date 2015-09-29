package cn.st.design.mode.facade.nouse;

/**
 * <p>
 * desciption: 生成逻辑层模块
 * </p>
 * 
 * @author coolearth
 * @date 2015年9月29日
 */
public class Business {
    public void generate() {
        ConfigModel configModel = ConfigManager.getInstance().getConfigData();
        if (configModel.isNeedGenBusiness()) {
            System.out.println("正在生成逻辑层代码文件……");
        }
    }
}
