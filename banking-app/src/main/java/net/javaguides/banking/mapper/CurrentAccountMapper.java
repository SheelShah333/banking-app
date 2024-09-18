package net.javaguides.banking.mapper;

import net.javaguides.banking.entity.CurrentAccount;
import net.javaguides.banking.dto.CurrentAccountDto;

public class CurrentAccountMapper {

	public static CurrentAccount mapToCurrentAccount(CurrentAccount savedcurrentAccount){
        CurrentAccount currentaccount = new CurrentAccount(
        		savedcurrentAccount.getCurrent_account_id(),
        		savedcurrentAccount.getOverDraftLimit(),
        		savedcurrentAccount.getInterestRate(),
        		savedcurrentAccount.getOverDraftAmount(),
        		savedcurrentAccount.getAccount()
        );

        return currentaccount;
    }
    public static CurrentAccountDto mapToCurrentAccountDto(CurrentAccountDto currentaccount){
        CurrentAccountDto currentaccountDto = new CurrentAccountDto(
        		currentaccount.getCurrent_account_id(),
        		currentaccount.getOverDraftLimit(),
        		currentaccount.getInterestRate(),
        		currentaccount.getOverDraftAmount(),
        		currentaccount.getAccount_id()
        );
        return currentaccountDto;
    }
	
}
