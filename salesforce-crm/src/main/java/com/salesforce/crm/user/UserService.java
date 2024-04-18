package com.salesforce.crm.user;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

 @Autowired
 private UserRepository userRepository;

 public UserEntity getUserByEmail(String email) {
     return userRepository.findByEmail(email);
 }

public UserEntity save(UserEntity userEntity) {
	return userRepository.save(userEntity);
}
}
