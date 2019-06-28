package com.burning.car;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * @author huyou
 * @ProjectName demo
 * @Description: 多个实现类动态加载及维护
 *               不在需要维护 bean 和type的关系
 * @date 2019/6/28下午2:03
 */
@Component
public class CarFactory  implements InitializingBean {

    private static Map<String,ICar>  stringICarMap = new HashMap<String,ICar>();

    @Autowired
    public ApplicationContext applicationContext;

    @Override
    public void afterPropertiesSet() throws Exception {

        //获取ICar实现类
        Map map  = applicationContext.getBeansOfType(ICar.class);

        for(Object obj:map.entrySet()){
            Map.Entry entry = (Map.Entry) obj;
            ICar value = (ICar) entry.getValue();
            stringICarMap.put(value.type(), value);//动态维护
        }

    }


    public static ICar getBeanByType(String type) {

        return stringICarMap.get(type);
    }
}
