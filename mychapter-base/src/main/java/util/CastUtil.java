package util;

/**
 * Created by 陈亮 on 2016/11/22.
 * 转型操作工具类
 */
public final class CastUtil {
    /*
    * 转String
    * */
    public static String castString(Object obj) {
        return CastUtil.castString(obj, "");
    }

    /*
    * 转String(提供默认值)
    * */
    public static String castString(Object obj, String defaultValue) {
        return obj != null ? String.valueOf(obj) : defaultValue;
    }

    /*
   * 转Double
   * */
    public static double castDouble(Object obj) {
        return CastUtil.castDouble(obj, 0);
    }

    /*
    * 转Double(提供默认值)
    * */
    public static double castDouble(Object obj, double defaultValue) {
        double doubleValue=defaultValue;
        if(obj!=null){
            String strval=castString(obj);
            if (StringUtil.isNotEmpty(strval)){
                try {
                    doubleValue=Double.parseDouble(strval);
                }catch (NumberFormatException e){
                    doubleValue=defaultValue;
                }
            }
        }
        return doubleValue;
    }

    /*
  * 转Long
  * */
    public static long castLong(Object obj) {
        return CastUtil.castLong(obj, 0);
    }

    /*
    * 转String(提供默认值)
    * */
    public static long castLong(Object obj, long defaultValue) {
        long longval=defaultValue;
        if(obj!=null){
            String strval=castString(obj);
            if(StringUtil.isNotEmpty(strval)){
                try {
                    longval=Long.parseLong(strval);
                }catch (NumberFormatException e){
                    longval=defaultValue;
                }
            }
        }
        return longval;
    }


    public static int castInt(Object obj){
        return castInt(obj,0);
    }
    public static int castInt(Object obj,int defa){
        int value=defa;
        if(obj!=null){
            String val=castString(obj);
            if(StringUtil.isNotEmpty(val)){
                try {
                    value=Integer.parseInt(val);
                }catch (NumberFormatException e){
                    value=defa;
                }
            }
        }
        return castInt(obj,0);
    }

    public static boolean castBoolean(Object obj){
        return castBoolean(obj,false);
    }

    public static boolean castBoolean(Object obj,Boolean defa){
        boolean value=defa;
        if(obj!=null){
            String val=castString(obj);
            if(StringUtil.isNotEmpty(val)){
                value=Boolean.parseBoolean(val);
            }
        }
        return value;
    }
}
