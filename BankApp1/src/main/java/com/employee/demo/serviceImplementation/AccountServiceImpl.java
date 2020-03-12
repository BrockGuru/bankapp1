package com.employee.demo.serviceImplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.employee.demo.entities.Account;
import com.employee.demo.exception.AccountNotFoundException;
import com.employee.demo.repository.AccountRepository;
import com.employee.demo.service.AccountService;
import com.employee.demo.dto.*;
@Service
@Transactional
public class AccountServiceImpl implements AccountService{
	@Autowired
	private AccountRepository accountRepository;
	@Override
	public Account createAccount(Account account) {
		
		return accountRepository.save(account);
	}

	@Override
	public Account UpdateAccount(UpdateAccount req) {
		
		Account account=accountRepository.findById(req.getAccNo()).orElseThrow(AccountNotFoundException::new);
		account.setAccountStatus(req.getAccountStatus());
		accountRepository.save(account);
		return account;
	}

	@Override
	public void deleteAccount(Long Accno) {
		Account account=accountRepository.findById(Accno).orElseThrow(AccountNotFoundException::new);
		accountRepository.delete(account);
	}

	@Override
	public List<Account> retriveAccount(String ifsc) {
		@SuppressWarnings("unchecked")
		List<Account> account=accountRepository.findByIfsc(ifsc);
		return account;
	}

	@Override
	public Account AccountretriveAccountUsingAccountNo(Long accno) {
		Account accounts=accountRepository.findById(accno).orElseThrow(AccountNotFoundException::new);
		return accounts;
	}



}
