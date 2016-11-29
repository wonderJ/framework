package util;

import org.apache.commons.lang3.StringUtils;

/**
 * Created by 陈亮 on 2016/11/23.
 * 字符串工具类
 */
public final class StringUtil {
    /*
    * 判断是否为空
    * */
    public static boolean isEmpty(String str) {
        if (str != null) {
            str = str.trim();
        }
        return StringUtils.isEmpty(str);
    }

    public static boolean isNotEmpty(String str){
        return !isEmpty(str);
    }
}
