package com.bbxx.bean_instantiation;

import com.bbxx.pojo.User;

public class StaticFactory {

    public static User getUser() {
        return new User();
    }

}
