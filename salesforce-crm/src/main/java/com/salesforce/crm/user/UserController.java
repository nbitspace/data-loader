package com.salesforce.crm.user;

//UserController.java
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



//UserController.java (continued)
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

 @Autowired
 private UserService userService;

 @Autowired
 private UpdateUserService updateUserService;

 @Autowired
 private CurrentUserDataService currentUserDataService;

 @PostMapping("/save")
 public UserEntity saveUser(@RequestBody UserEntity userEntity) {
     // Save userEntity to database
     return userService.save(userEntity);
 }

 @GetMapping("/getByEmail")
 public UserEntity getUserByEmail(@RequestParam String email) {
     return userService.getUserByEmail(email);
 }

 @GetMapping("/getUpdateUserByEmail")
 public UpdateUserEntity getUpdateUserByEmail(@RequestParam String email) {
     return updateUserService.getUpdateUserByEmail(email);
 }

 @PostMapping("/compareAndSave")
 public String compareAndSave(@RequestParam String email, @RequestParam String action) {
     if (action.equals("user")) {
         UserEntity userEntity = userService.getUserByEmail(email);
         currentUserDataService.saveCurrentUser(userEntity);
         return "User data saved in CurrentUserData table.";
     } else if (action.equals("updateUser")) {
         UpdateUserEntity updateUserEntity = updateUserService.getUpdateUserByEmail(email);
         currentUserDataService.saveCurrentUser(updateUserEntity);
         return "UpdateUser data saved in CurrentUserData table.";
     } else {
         return "Invalid action.";
     }
 }
}
