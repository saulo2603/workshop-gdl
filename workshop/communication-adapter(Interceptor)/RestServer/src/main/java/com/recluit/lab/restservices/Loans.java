package com.recluit.lab.restservices;

public class Loans {
	int    bankCode;
	private String rfc;
	private String name;
	private String addres;
	private double loanAmount;
	private String date;
	private String qualification;
	private String statusActive;
	
	//constructor
	public Loans(int bankCode, String rfc, String name, String addres,
				double loanAmount, String date, String qualification,
				String statusActive) {
		super();
		this.bankCode = bankCode;
		this.rfc = rfc;
		this.name = name;
		this.addres = addres;
		this.loanAmount = loanAmount;
		this.date = date;
		this.qualification = qualification;
		this.statusActive = statusActive;
	}

	public Loans(String string) {
		this.bankCode = Integer.parseInt(string.split("\\|")[0]);
		this.rfc = string.split("\\|")[1];
		this.name = string.split("\\|")[2];
		this.addres = string.split("\\|")[3];
		this.loanAmount = Integer.parseInt(string.split("\\|")[4]);
		this.date = string.split("\\|")[5];
		this.qualification = string.split("\\|")[6];
		this.statusActive = string.split("\\|")[7];
	}

	public int getBankCode() {
		return bankCode;
	}

	public void setBankCode(int bankCode) {
		this.bankCode = bankCode;
	}

	public String getRfc() {
		return rfc;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddres() {
		return addres;
	}

	public void setAddres(String addres) {
		this.addres = addres;
	}

	public double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getStatusActive() {
		return statusActive;
	}

	public void setStatusActive(String statusActive) {
		this.statusActive = statusActive;
	}
	
	
}
