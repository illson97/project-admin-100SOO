package com.single.projectadmin100soo.repository;

import com.single.projectadmin100soo.domain.UserAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserAccountRepository extends JpaRepository<UserAccount, String> {
}
