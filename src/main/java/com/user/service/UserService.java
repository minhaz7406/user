package com.user.service;

import java.util.List;

import com.user.entity.User;

public interface UserService {

public void saveUserDetails(User user);

public List<User> readAllUser();

public void deleteById(long id);

public User getId(long id);

}
