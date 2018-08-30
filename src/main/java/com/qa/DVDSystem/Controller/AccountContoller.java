package com.qa.DVDSystem.Controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.DVDSystem.Model.AccountModel;
import com.qa.DVDSystem.Repo.AccountRepostitory;


@RestController
@RequestMapping("/")
public class AccountContoller {
	
	@Autowired
	AccountRepostitory accountsRepo; 
	
	@GetMapping("/accounts")
	public List<AccountModel> getAllAccounts()
	{
		return accountsRepo.findAll();
	}
	
	@PostMapping("/addAccount")
	public AccountModel createPerson(@Valid @RequestBody AccountModel acm)
	{	
		return accountsRepo.save(acm);
	} 
}
