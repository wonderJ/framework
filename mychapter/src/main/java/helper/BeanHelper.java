package helper;

import util.ReflectionUtil;

import java.util.HashMap;
import java.util.Map;
import java.util.Observable;
import java.util.Set;

/**
 * Created by 陈亮 on 2016/11/30.
 */
public final class BeanHelper {
    private static final Map<Class<?>,Object> BEAN_MAP=new HashMap<Class<?>,Object>();
    static {
        Set<Class<?>> beanClassSet=ClassHelper.getBeanClassSet();
        for (Class<?> beanClass:beanClassSet){
            Object obj= ReflectionUtil.newInstance(beanClass);
            BEAN_MAP.put(beanClass,obj);
        }
    }
    //⁽⁽ଘ( ˊᵕˋ )ଓ⁾⁾*
    /*
    *                          .-._
    *                        {_} ^ )o
    *               {\________//~`
    *                (         )
    *                /||~~~~~||\
    *               |_\\_    \\_\_
    *               "' ""'    ""'"'
    * 获取Bean映射
    * */
    public static Map<Class<?>,Object> getBeanMap(){
        return BEAN_MAP;
    }

    //获取Bean实例
    //屏蔽警告信息
    @SuppressWarnings("unchecked")
    public static <T> T getBean(Class<T> cls){
        if(!BEAN_MAP.containsKey(cls)){
            throw new RuntimeException("can not get been by class:"+cls);
        }
        return (T) BEAN_MAP.get(cls);
    }
}
