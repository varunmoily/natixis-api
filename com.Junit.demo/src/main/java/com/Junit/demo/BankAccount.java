package com.Junit.demo;

import javax.naming.LimitExceededException;

public class BankAccount {
		private String name;
		private int balanceAmount;
		public BankAccount(String name, int balanceAmount) {
			super();
			this.name = name;
			this.balanceAmount = balanceAmount;
			
		}
		

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
		public int getBalanceAmount() {
			return balanceAmount;
		}
		public void setBalanceAmount(int balanceAmount) {
			this.balanceAmount = balanceAmount;
		}
		
		
		public int deposit(int amt) throws LimitExceededException{
			
			if(this.balanceAmount<50000) this.balanceAmount = this.balanceAmount+amt;
			else {
				throw new LimitExceededException("limit exceeded");
		}
		return this.balanceAmount;
		}
			public int withdraw(int amt) throws WithdrawException{
		
				if(this.balanceAmount<=amt) throw new WithdrawException("balance low");
				else {
					this.balanceAmount=this.balanceAmount-amt;
				}
			return this.balanceAmount;
			}


			@Override
			public String toString() {
				return "BankAccount [name=" + name + ", balanceAmount=" + balanceAmount + "]";
			}
			
			
	}


