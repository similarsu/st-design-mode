package cn.st.design.mode.adapter.rewrite;

import java.util.List;

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
        LogModel logModel = new LogModel();
        logModel.setLogId("001");
        logModel.setOperateUser("admin");
        logModel.setOperateTime("2015-09-30 11:30:30");
        logModel.setLogContent("这是一个测试");
        LogFileOperateApi logFileOperateApi = new LogFileOperate(null);
        LogDbOperateApi logDbOperateApi = new Adapter(logFileOperateApi);
        logDbOperateApi.createLog(logModel);
        List<LogModel> allLog = logDbOperateApi.getAllLog();
        System.out.println("readLog=" + allLog);
    }
}
