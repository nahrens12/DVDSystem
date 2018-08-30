package com.qa.DVDSystem.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qa.DVDSystem.Model.AccountModel;


@Repository
public interface AccountRepostitory extends JpaRepository<AccountModel,Long> {

	
}
