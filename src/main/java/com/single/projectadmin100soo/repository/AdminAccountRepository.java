package com.single.projectadmin100soo.repository;

import com.single.projectadmin100soo.domain.AdminAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminAccountRepository extends JpaRepository<AdminAccount, String> {
}
