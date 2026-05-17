package br.com.pinotti.account.repo;

import org.springframework.data.repository.ListCrudRepository;

import br.com.pinotti.account.model.Account;

public interface AccountRepo extends ListCrudRepository<Account, Integer>{
	

}
