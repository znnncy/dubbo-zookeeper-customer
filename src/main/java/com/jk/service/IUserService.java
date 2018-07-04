package com.jk.service;

import com.jk.model.User;

import java.util.List;

public interface IUserService {

    public List<User> getInfo(User user) throws Exception;

}
