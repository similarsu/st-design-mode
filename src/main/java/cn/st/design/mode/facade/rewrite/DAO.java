package cn.st.design.mode.facade.rewrite;

/**
 * <p>
 * desciption: 生成数据层模块
 * </p>
 * 
 * @author coolearth
 * @date 2015年9月29日
 */
public class DAO {
    public void generate() {
        ConfigModel configModel = ConfigManager.getInstance().getConfigData();
        if (configModel.isNeedGenDAO()) {
            System.out.println("正在生成数据层代码文件……");
        }
    }
}
