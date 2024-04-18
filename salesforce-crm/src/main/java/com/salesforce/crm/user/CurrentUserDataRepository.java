package com.salesforce.crm.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CurrentUserDataRepository extends JpaRepository<CurrentUser, Long> {
}
