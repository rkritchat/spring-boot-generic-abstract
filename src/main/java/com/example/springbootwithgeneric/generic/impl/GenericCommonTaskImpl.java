package com.example.springbootwithgeneric.generic.impl;

import com.example.springbootwithgeneric.generic.GenericCommonTask;
import com.example.springbootwithgeneric.model.Mock;

public abstract class GenericCommonTaskImpl<RE extends Mock, RS extends Mock> extends GenericCommonTask {

    public void execute() throws IllegalAccessException, InstantiationException {
        Mock x = getRequestClass().getClass().newInstance();
        Mock y = getResponseClass().getClass().newInstance();
        showLog();
    }

    public abstract RE getRequestClass();
    public abstract RS getResponseClass();
    public abstract void showLog();
}
