package cn.st.design.mode.adapter.nouse;

import java.util.ArrayList;
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
        List<LogModel> list = new ArrayList<LogModel>();
        list.add(logModel);
        LogFileOperateApi logFileOperateApi = new LogFileOperate(null);
        logFileOperateApi.writeLogFile(list);

        List<LogModel> readLog = logFileOperateApi.readLogFile();
        System.out.println("readLog=" + readLog);
    }
}
