package cn.st.design.mode.adapter.nouse;

import java.util.List;

/**
 * <p>
 * desciption:日志文件操作接口
 * </p>
 * 
 * @author coolearth
 * @date 2015年9月30日
 */
public interface LogFileOperateApi {
    /**
     * 读取日志文件
     * 
     * @return
     */
    List<LogModel> readLogFile();

    /**
     * 写日志文件
     * 
     * @param list
     */
    void writeLogFile(List<LogModel> list);
}
