package br.com.pinotti.account.service;

import br.com.pinotti.account.dto.TransferDTO;
import br.com.pinotti.account.model.Transaction;

public interface ITransferService {
	public Transaction transferValues(TransferDTO transferDto);

}
