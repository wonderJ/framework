package helper;

import annotation.Inject;
import com.sun.deploy.util.ArrayUtil;
import org.apache.commons.lang3.ArrayUtils;
import util.CollectionUtil;

import java.lang.reflect.Field;
import java.util.Map;

/**
 * 依赖注入工具类
 * Created by 陈亮 on 2016/11/30.
 */
public final class IocHelper {
    static {
        //获取所有的Bean和bean实例之间的映射关系
        Map<Class<?>, Object> beanMap = BeanHelper.getBeanMap();
        if (CollectionUtil.isNotEmpty(beanMap)) {
            //遍历
            for (Map.Entry<Class<?>, Object> beanEntry : beanMap.entrySet()) {
                //从BeanMap中取出Bean和bean实例
                Class<?> beanClass = beanEntry.getKey();
                Object beanInstance = beanEntry.getValue();
                //获取Bean类定义的所有成员变量(简称Bean Field)
                Field[] beanFields = beanClass.getDeclaredFields();
                if (ArrayUtils.isNotEmpty(beanFields)) {
                    //遍历Bean Field
                    for (Field beanField : beanFields) {
                        //判断当前Bean Field 是否带有Inject注解
                        if(beanField.isAnnotationPresent(Inject.class)){
                            //在Bean Map中获取Bean field 对应的实例
                        }
                    }
                }
            }
        }
    }
}
