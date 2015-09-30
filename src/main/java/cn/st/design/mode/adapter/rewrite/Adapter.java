package cn.st.design.mode.adapter.rewrite;

import java.util.List;

/**
 * <p>
 * desciption:适配器对象，将日志的读写功能适配到需要的增删改查功能
 * </p>
 * 
 * @author coolearth
 * @date 2015年9月30日
 */
public class Adapter implements LogDbOperateApi {

    private LogFileOperateApi logFileOperateApi;

    public Adapter(LogFileOperateApi logFileOperateApi) {
        // TODO Auto-generated constructor stub
        this.logFileOperateApi = logFileOperateApi;
    }

    @Override
    public void createLog(LogModel logModel) {
        // TODO Auto-generated method stub
        List<LogModel> list = logFileOperateApi.readLogFile();
        list.add(logModel);
        logFileOperateApi.writeLogFile(list);
    }

    @Override
    public void removeLog(LogModel logModel) {
        // TODO Auto-generated method stub
        List<LogModel> list = logFileOperateApi.readLogFile();
        list.remove(logModel);
        logFileOperateApi.writeLogFile(list);
    }

    @Override
    public void updateLog(LogModel logModel) {
        // TODO Auto-generated method stub
        List<LogModel> list = logFileOperateApi.readLogFile();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getLogId().equals(logModel.getLogId())) {
                list.set(i, logModel);
                break;
            }
        }
        logFileOperateApi.writeLogFile(list);
    }


    @Override
    public List<LogModel> getAllLog() {
        // TODO Auto-generated method stub
        return logFileOperateApi.readLogFile();
    }

}
