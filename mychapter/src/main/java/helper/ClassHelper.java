package helper;

import util.ClassUtil;
import util.ConfigHelper;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by 陈亮 on 2016/11/30.
 */
public final class ClassHelper {
    //定义类集合(用于存放所加载的类)
    private static final Set<Class<?>> CLASS_SET;

    static {
        String basePackage = ConfigHelper.getAppBasePackage();
        CLASS_SET = ClassUtil.getClassSet(basePackage);
    }

    //获取应用包名下的所有类
    public static Set<Class<?>> getClassSet() {
        return CLASS_SET;
    }

    //获取应用包名下的所有SERVICE类
    public static Set<Class<?>> getServiceClassSet() {
        Set<Class<?>> classSet = new HashSet<Class<?>>();
        for (Class<?> cls : CLASS_SET) {
            classSet.add(cls);
        }
        return classSet;
    }
    //获取应用包名下的所有BEAN(包括SERVICE,Controller等)
    public static Set<Class<?>> getBeanClassSet(){
        Set<Class<?>> beanClassSet=new HashSet<Class<?>>();
        beanClassSet.addAll(getServiceClassSet());
        beanClassSet.addAll(getControllerClassSet());
        return beanClassSet;
    }

    //Controller
    private static Set<Class<?>> getControllerClassSet() {
        Set<Class<?>> classSet=new HashSet<Class<?>>();
        for (Class<?> cls:CLASS_SET){
            classSet.add(cls);
        }
        return classSet;
    }
}
