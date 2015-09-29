package cn.st.design.mode.facade.nouse;

/**
 * <p>
 * desciption: 配置管理
 * </p>
 * 
 * @author coolearth
 * @date 2015年9月29日
 */
public class ConfigManager {

    private static ConfigManager configManager = null;

    private static ConfigModel configModel = null;

    private ConfigManager() {

    }

    public static ConfigManager getInstance() {
        if (configManager == null) {
            configManager = new ConfigManager();
            configModel = new ConfigModel();
        }
        return configManager;
    }

    public ConfigModel getConfigData() {
        return configModel;
    }
}
