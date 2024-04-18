package com.salesforce.crm.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CurrentUserDataService {

 @Autowired
 private CurrentUserDataRepository currentUserDataRepository;

 public void saveCurrentUser(UserEntity userEntity) {
     CurrentUser currentUserData = new CurrentUser();
     currentUserData.setEmail(userEntity.getEmail());
     currentUserData.setName(userEntity.getName());
     currentUserData.setCompany(userEntity.getCompany());

     currentUserDataRepository.save(currentUserData);
 }

 public void saveCurrentUser(UpdateUserEntity updateUserEntity) {
     CurrentUser currentUserData = new CurrentUser();
     currentUserData.setEmail(updateUserEntity.getEmail());
     currentUserData.setName(updateUserEntity.getName());
     currentUserData.setCompany(updateUserEntity.getCompany());

     currentUserDataRepository.save(currentUserData);
 }
}
