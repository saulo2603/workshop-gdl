package com.recluit.lab.action;

import com.opensymphony.xwork2.ActionSupport;

public class actionRegisterNewLoan extends ActionSupport{
	private String newRfc;
	private String newName;
	private String newLastName;
	private String newSalary;
	private String newAmount;
	private Integer newBankCode;
	

	public String execute() throws Exception{
		
		if(newBankCode>0){
		System.out.println(newRfc+" "+newName+" "+newLastName+" "+newSalary+" "+newAmount+" "+newBankCode);		
		return "registerLoanSuccess";
		}
		else return "error";
	}
	
	
	public Integer getNewBankCode() {
		return newBankCode;
	}

	public void setNewBankCode(Integer newBankCode) {
		this.newBankCode = newBankCode;
	}
		
	public String getNewRfc() {
		return newRfc;
	}
	public void setNewRfc(String newRfc) {
		this.newRfc = newRfc;
	}
	public String getNewName() {
		return newName;
	}
	public void setNewName(String newName) {
		this.newName = newName;
	}
	public String getNewLastName() {
		return newLastName;
	}
	public void setNewLastName(String newLastName) {
		this.newLastName = newLastName;
	}
	public String getNewSalary() {
		return newSalary;
	}
	public void setNewSalary(String newSalary) {
		this.newSalary = newSalary;
	}
	public String getNewAmount() {
		return newAmount;
	}
	public void setNewAmount(String newAmount) {
		this.newAmount = newAmount;
	}
	
	
}
