package util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Set;

/**
 * 类加载器
 * Created by 陈亮 on 2016/11/29.
 */
public final class ClassUtil {
    private static final Logger LOGGER= LoggerFactory.getLogger(ClassUtil.class);

    //获取类加载器
    public static ClassLoader getClassLoader(){
        return Thread.currentThread().getContextClassLoader();
    }

    //加载类(是否初始化:即执行静态)
    public static Class<?> loadClass(String classname,boolean isInnitialized){
        Class<?> clazz;
        try {
            clazz=Class.forName(classname,false,getClassLoader());
        } catch (ClassNotFoundException e) {
            LOGGER.error("load class failure",e);
            throw new RuntimeException(e);
        }
        return clazz;
    }

    //获取指定包下的所有类
    public static Set<Class<?>> getClassSet(String packageName){
        Set<Class<?>> classSet=new HashSet<Class<?>>();
        try {
            //返回表示 URL 搜索路径中具有指定名称的所有资源的 URL 枚举
            Enumeration<URL> urls=getClassLoader().getResources(packageName.replace(".","/"));
            while (urls.hasMoreElements()){
                URL url=urls.nextElement();
                if(url !=null){
                    String protocol=url.getProtocol();//获取资源类型
                    if (protocol.equals("file")){
                      String packagePath=url.getPath().replace("%20","");
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
