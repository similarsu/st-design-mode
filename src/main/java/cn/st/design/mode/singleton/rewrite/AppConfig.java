package cn.st.design.mode.singleton.rewrite;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * <p>
 * desciption: 读取应用配置文件,懒汉式单例模式
 * </p>
 * 
 * @author coolearth
 * @date 2015年10月9日
 */
public class AppConfig {

    private static AppConfig uniqueInstance = new AppConfig();

    public static AppConfig getInstance() {
        return uniqueInstance;
    }

    private String parameterA;
    private String parameterB;

    private AppConfig() {
        readConfig();
    }



    public String getParameterA() {
        return parameterA;
    }



    public String getParameterB() {
        return parameterB;
    }



    /**
     * 读取配置文件
     */
    private void readConfig() {
        // TODO Auto-generated method stub
        Properties properties = new Properties();
        InputStream inputStream = null;
        try {
            inputStream = AppConfig.class.getResourceAsStream("appConfig.properties");
            properties.load(inputStream);
            parameterA = properties.getProperty("parameterA");
            parameterB = properties.getProperty("parameterB");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            System.out.println("装载配置文件错误");
            e.printStackTrace();
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
    }
}
