package sys;

/**
 * 提供相关配置项常量
 * Created by 陈亮 on 2016/11/29.
 */
public interface ConfigConstant {
    String CONFIG_FILE="framework.properties";

    String JDBC_DRIVER="com.shizhi.framework.jdbc.driver";
    String JDBC_URL="com.shizhi.framework.jdbc.url";
    String JDBC_USERNAME="com.shizhi.framework.jdbc.username";
    String JDBC_PASSWORD="com.shizhi.framework.jdbc.password";

    String APP_BASE_PACKAGE="com.shizhi.app.base_package";
    String APP_JSP_PATH="com.shizhi.app.jsp_path";
    String JDBC_ASSET_PATH="com.shizhi.app.asset_path";
}
