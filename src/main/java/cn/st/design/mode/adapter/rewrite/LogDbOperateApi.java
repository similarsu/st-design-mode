package cn.st.design.mode.adapter.rewrite;

import java.util.List;

/**
 * <p>
 * desciption: 数据库操作接口
 * </p>
 * 
 * @author coolearth
 * @date 2015年9月30日
 */
public interface LogDbOperateApi {
    /**
     * 添加日志
     * 
     * @param logModel
     */
    void createLog(LogModel logModel);

    /**
     * 删除日志
     * 
     * @param logModel
     */
    void removeLog(LogModel logModel);

    /**
     * 更新日志
     * 
     * @param logModel
     */
    void updateLog(LogModel logModel);

    /**
     * 获取所有日志
     * 
     * @return
     */
    List<LogModel> getAllLog();
}
