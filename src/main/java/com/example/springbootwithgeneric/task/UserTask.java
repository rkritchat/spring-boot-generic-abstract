package com.example.springbootwithgeneric.task;

import com.example.springbootwithgeneric.generic.impl.GenericCommonTaskImpl;
import com.example.springbootwithgeneric.model.UserRequest;
import com.example.springbootwithgeneric.model.UserResponse;
import org.springframework.stereotype.Component;


@Component
public class UserTask extends GenericCommonTaskImpl<UserRequest, UserResponse> {

    @Override
    public UserRequest getRequestClass() {
        return new UserRequest();
    }

    @Override
    public UserResponse getResponseClass() {
        return new UserResponse();
    }

    @Override
    public void showLog() {
        System.out.println("TESTTTT");
    }


}
