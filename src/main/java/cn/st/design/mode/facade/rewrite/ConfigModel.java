package cn.st.design.mode.facade.rewrite;

/**
 * <p>
 * desciption: 配置信息
 * </p>
 * 
 * @author coolearth
 * @date 2015年9月29日
 */
public class ConfigModel {
    /**
     * 是否生成表现层
     */
    private boolean needGenPresentation = true;
    /**
     * 是否生成逻辑层
     */
    private boolean needGenBusiness = true;
    /**
     * 是否生成DAO
     */
    private boolean needGenDAO = true;


    public boolean isNeedGenPresentation() {
        return needGenPresentation;
    }

    public void setNeedGenPresentation(boolean needGenPresentation) {
        this.needGenPresentation = needGenPresentation;
    }

    public boolean isNeedGenBusiness() {
        return needGenBusiness;
    }

    public void setNeedGenBusiness(boolean needGenBusiness) {
        this.needGenBusiness = needGenBusiness;
    }

    public boolean isNeedGenDAO() {
        return needGenDAO;
    }

    public void setNeedGenDAO(boolean needGenDAO) {
        this.needGenDAO = needGenDAO;
    }

}
