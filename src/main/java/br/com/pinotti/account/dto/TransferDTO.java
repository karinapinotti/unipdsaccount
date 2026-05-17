package br.com.pinotti.account.dto;

public record TransferDTO(Integer debitAccountNumber, Integer creditAccountNumber, Double amount) {

}
