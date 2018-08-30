package com.qa.DVDSystem.Controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	public AccountModel addAccount(@Valid @RequestBody AccountModel acm)
	{	
		return accountsRepo.save(acm);
	} 
	
	@GetMapping("/accounts/{id}")
	public AccountModel getPersonByID(@PathVariable(value = "id")long id)
	{
		return accountsRepo.getOne(id);
	}
	
	@DeleteMapping("/accounts/{id}")
	public ResponseEntity<Void> deleteAccount(@PathVariable ("id") long id) {
		Optional<AccountModel> delete =accountsRepo.findById(id);
		accountsRepo.deleteById(id);
		return ResponseEntity.ok().build();
	}
}
