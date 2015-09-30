package cn.st.design.mode.adapter.rewrite;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

/**
 * <p>
 * desciption:
 * </p>
 * 
 * @author coolearth
 * @date 2015年9月30日
 */
public class LogFileOperate implements LogFileOperateApi {

    private String logFilePathName = "adapterLog.log";

    /**
     * @param logFilePathName
     */
    public LogFileOperate(String logFilePathName) {
        if (!StringUtils.isBlank(logFilePathName)) {
            this.logFilePathName = logFilePathName;
        }
    }

    @Override
    public List<LogModel> readLogFile() {
        // TODO Auto-generated method stub
        List<LogModel> list = null;
        File file = new File(logFilePathName);
        ObjectInputStream ois = null;
        try {
            if (file.exists()) {

                ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)));
                list = (List<LogModel>) ois.readObject();

            }
        } catch (Exception e) {

        } finally {
            try {
                if (ois != null) {
                    ois.close();
                }

            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        return list;
    }

    @Override
    public void writeLogFile(List<LogModel> list) {
        // TODO Auto-generated method stub
        File file = new File(logFilePathName);
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
            oos.writeObject(list);
        } catch (Exception e) {

        } finally {
            try {
                if (oos != null) {
                    oos.close();
                }
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

}
