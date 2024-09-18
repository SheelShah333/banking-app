/**
 * 
 */
package net.javaguides.banking.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import net.javaguides.banking.dto.AccountDto;
import net.javaguides.banking.dto.CurrentAccountDto;
import net.javaguides.banking.entity.Account;
import net.javaguides.banking.entity.CurrentAccount;
import net.javaguides.banking.mapper.AccountMapper;
import net.javaguides.banking.mapper.CurrentAccountMapper;
import net.javaguides.banking.repository.AccountRepository;
import net.javaguides.banking.repository.CurrentAccountRepository;
import net.javaguides.banking.service.CurrentAccountService;

/**
 * 
 */

@Service
public class CurrentAccountServiceImpl implements CurrentAccountService{
	
	private CurrentAccountRepository currentaccountRepository;
	private AccountRepository accountrepository;

    public CurrentAccountServiceImpl(CurrentAccountRepository currentaccountRepository) {
        this.currentaccountRepository = currentaccountRepository;
    }
    
//    public void AccountServiceImpl(AccountRepository accountRepository) {
//        this.accountrepository = accountRepository;
//    }

    public CurrentAccount createCurrentAccount(CurrentAccountDto currentaccountDto) {
    	
    	
        CurrentAccountDto currentaccount= CurrentAccountMapper.mapToCurrentAccountDto(currentaccountDto);
        
        Account acc = new Account((Long)currentaccountDto.getAccount_id(),"", 0);
        System.out.println("Before  +  " + acc);
        Account savedaccount = accountrepository.save(acc);
        AccountDto a = AccountMapper.mapToAccountDto(savedaccount);
        System.out.println("After  +  " + acc);
        
        CurrentAccount savedcurrentAccount=currentaccountRepository.save(currentaccountDto);
        return CurrentAccountMapper.mapToCurrentAccount(savedcurrentAccount);
    }


	
	@Override
	public List<CurrentAccount> getAllCurrentAccounts() {
		List<CurrentAccount> currentaccounts = currentaccountRepository.findAll();
        return currentaccounts.stream().map((currentaccount) -> CurrentAccountMapper.mapToCurrentAccount(currentaccount))
                .collect(Collectors.toList());
	}


//	@Override
//	public void deleteCurrentAccount(Long id) {
//		// TODO Auto-generated method stub
//		
//	}



}
