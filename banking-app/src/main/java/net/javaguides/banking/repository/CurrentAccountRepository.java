package net.javaguides.banking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.javaguides.banking.dto.CurrentAccountDto;
import net.javaguides.banking.entity.CurrentAccount;

public interface CurrentAccountRepository extends JpaRepository<CurrentAccount, Integer> {

	CurrentAccount save(CurrentAccountDto currentaccountDto);

}
