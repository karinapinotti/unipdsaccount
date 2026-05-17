package br.com.pinotti.account.repo;

import org.springframework.data.repository.ListCrudRepository;

import br.com.pinotti.account.model.Transaction;

public interface TransactionRepo extends ListCrudRepository<Transaction, Integer>{

}
