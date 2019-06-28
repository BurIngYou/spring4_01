package com.burning.car;

import org.springframework.stereotype.Service;

/**
 * @author huyou
 * @ProjectName demo
 * @Description: TODO
 * @date 2019/6/28上午11:53
 */
@Service
public class BenzCar implements ICar {

    @Override
    public String type() {
        return "2";
    }

    @Override
    public void driver() {
        System.out.println("Benz");
    }


}
