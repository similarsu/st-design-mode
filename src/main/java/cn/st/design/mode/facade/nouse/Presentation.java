package cn.st.design.mode.facade.nouse;

/**
 * <p>
 * desciption: 生成表现层模块
 * </p>
 * 
 * @author coolearth
 * @date 2015年9月29日
 */
public class Presentation {
    public void generate() {
        ConfigModel configModel = ConfigManager.getInstance().getConfigData();
        if (configModel.isNeedGenPresentation()) {
            System.out.println("正在生成表现层代码文件……");
        }
    }
}
