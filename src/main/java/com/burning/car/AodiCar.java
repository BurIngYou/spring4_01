package com.burning.car;

import org.springframework.stereotype.Service;

/**
 * @author huyou
 * @ProjectName demo
 * @Description: TODO
 * @date 2019/6/28上午11:52
 */
@Service
public class AodiCar implements ICar {

    @Override
    public String type() {
        return "1";
    }

    @Override
    public void driver() {
        System.out.println("AodiCar");
    }
}
