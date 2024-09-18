package net.javaguides.banking.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import net.javaguides.banking.entity.Account;

@Data
@AllArgsConstructor
public class CurrentAccountDto {
	
	private int current_account_id;
	private double OverDraftLimit;
	private double InterestRate;
	private double OverDraftAmount;
	private Long account_id;
	

	public CurrentAccountDto() {
		super();
	}



	public CurrentAccountDto(int current_account_id, double overDraftLimit, double interestRate,
			double overDraftAmount) {
		super();
		this.current_account_id = current_account_id;
		this.OverDraftLimit = overDraftLimit;
		this.InterestRate = interestRate;
		this.OverDraftAmount = overDraftAmount;
	}
	
	



	public CurrentAccountDto(int current_account_id, double overDraftLimit, double interestRate, double overDraftAmount,
			Long account_id) {
		super();
		this.current_account_id = current_account_id;
		OverDraftLimit = overDraftLimit;
		InterestRate = interestRate;
		OverDraftAmount = overDraftAmount;
		this.account_id = account_id;
	}



	public int getCurrent_account_id() {
		return current_account_id;
	}



	public void setCurrent_account_id(int current_account_id) {
		this.current_account_id = current_account_id;
	}



	public double getOverDraftLimit() {
		return OverDraftLimit;
	}



	public void setOverDraftLimit(double overDraftLimit) {
		this.OverDraftLimit = overDraftLimit;
	}



	public double getInterestRate() {
		return InterestRate;
	}



	public void setInterestRate(double interestRate) {
		this.InterestRate = interestRate;
	}



	public double getOverDraftAmount() {
		return OverDraftAmount;
	}



	public void setOverDraftAmount(double overDraftAmount) {
		this.OverDraftAmount = overDraftAmount;
	}
	
	


	public Long getAccount_id() {
		return account_id;
	}



	public void setAccount_id(Long account_id) {
		this.account_id = account_id;
	}



	@Override
	public String toString() {
		return "CurrentAccountDto [current_account_id=" + current_account_id + ", OverDraftLimit=" + OverDraftLimit
				+ ", InterestRate=" + InterestRate + ", OverDraftAmount=" + OverDraftAmount + "]";
	}
	
	
	
}
