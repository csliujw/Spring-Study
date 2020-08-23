package com.bbxx.bean_instantiation;

import com.bbxx.pojo.User;

public class Factory {
    public User getUser() {
        return new User();
    }
}
