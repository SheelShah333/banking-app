package net.javaguides.banking.controller;

import net.javaguides.banking.dto.AccountDto;
import net.javaguides.banking.dto.CurrentAccountDto;
import net.javaguides.banking.entity.CurrentAccount;
import net.javaguides.banking.service.AccountService;
import net.javaguides.banking.service.CurrentAccountService;

import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/currentaccounts")
public class CurrentAccountController {
    private CurrentAccountService currentaccountService;

    public CurrentAccountController(CurrentAccountService currentaccountService) {
        this.currentaccountService = currentaccountService;
    }
    
    
 // Get All Accounts REST API
    @GetMapping
    public ResponseEntity<List<CurrentAccount>> getALlCurrentAccounts(){
    	List<CurrentAccount> currentaccounts= currentaccountService.getAllCurrentAccounts();
    	return ResponseEntity.ok(currentaccounts);
    }
    
    @PostMapping
    public ResponseEntity<CurrentAccount> addCurrentAccount(@RequestBody CurrentAccountDto accountDto){
        return new ResponseEntity<>(currentaccountService.createCurrentAccount(accountDto), HttpStatus.CREATED);
    }
    
	 
}
