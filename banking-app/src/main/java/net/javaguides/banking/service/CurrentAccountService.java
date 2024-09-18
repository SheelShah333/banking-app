package net.javaguides.banking.service;

import java.util.List;

import net.javaguides.banking.dto.AccountDto;
import net.javaguides.banking.dto.CurrentAccountDto;
import net.javaguides.banking.entity.CurrentAccount;

public interface CurrentAccountService {
	
	CurrentAccount createCurrentAccount(CurrentAccountDto currentaccountDto);
    List<CurrentAccount> getAllCurrentAccounts();
    //void deleteAccount(Long id);
	
}
