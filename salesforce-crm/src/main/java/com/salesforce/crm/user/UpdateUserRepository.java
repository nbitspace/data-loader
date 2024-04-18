package com.salesforce.crm.user;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UpdateUserRepository extends JpaRepository<UpdateUserEntity, Long> {
 UpdateUserEntity findByEmail(String email);
}

