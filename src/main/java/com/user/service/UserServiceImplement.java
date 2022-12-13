package com.user.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.entity.User;
import com.user.repository.UserRepository;

@Service
public class UserServiceImplement implements UserService {
  @Autowired
  UserRepository userRepo;
	@Override
	public void saveUserDetails(User user) {
	userRepo.save(user);
		
	}
	@Override
	public List<User> readAllUser() {
		List<User> user = userRepo.findAll();
		return user;
		
	}
	@Override
	public void deleteById(long id) {
		userRepo.deleteById(id);
		
	}
	@Override
	public User getId(long id) {
		Optional<User> findById = userRepo.findById(id);
		User user = findById.get();
		return user;
	}

}
