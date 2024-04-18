package com.salesforce.crm.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UpdateUserService {

 @Autowired
 private UpdateUserRepository updateUserRepository;

 public UpdateUserEntity getUpdateUserByEmail(String email) {
     return updateUserRepository.findByEmail(email);
 }
}

