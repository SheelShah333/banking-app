package net.javaguides.banking.entity;

import java.util.Calendar;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="current_accounts")
public class CurrentAccount{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int current_account_id;
	@Column(name = "OverDraftLimit")
	private double OverDraftLimit;
	@Column(name = "InterestRate")
	private double InterestRate;
	@Column(name = "OverDraftAmount")
	private double OverDraftAmount;
	
	@OneToOne(cascade = {
			CascadeType.MERGE,
			CascadeType.PERSIST,
			CascadeType.REFRESH }) 
	@JoinColumn(name = "account_id") 
	private Account account;
	
	
	
	public CurrentAccount() {
		super();	}
	
	public CurrentAccount(int current_account_id, double overDraftLimit, double interestRate, double overDraftAmount,Account account) {
		super();
		this.current_account_id = current_account_id;
		OverDraftLimit = overDraftLimit;
		InterestRate = interestRate;
		OverDraftAmount = overDraftAmount;
		this.account = account;
	}
	
	
	
	
	
	public CurrentAccount(Account account) {
		super();
		this.account = account;
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
		OverDraftLimit = overDraftLimit;
	}
	public double getInterestRate() {
		return InterestRate;
	}
	public void setInterestRate(double interestRate) {
		InterestRate = interestRate;
	}
	public double getOverDraftAmount() {
		return OverDraftAmount;
	}
	public void setOverDraftAmount(double overDraftAmount) {
		OverDraftAmount = overDraftAmount;
	}
	
	

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	@Override
	public String toString() {
		return "CurrentAccount [current_account_id=" + current_account_id + ", OverDraftLimit=" + OverDraftLimit
				+ ", InterestRate=" + InterestRate + ", OverDraftAmount=" + OverDraftAmount + "]";
	}

	
	
	
	
	

}
