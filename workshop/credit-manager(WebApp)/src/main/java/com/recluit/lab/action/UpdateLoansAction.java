package com.recluit.lab.action;

import com.opensymphony.xwork2.ActionSupport;

public class UpdateLoansAction extends ActionSupport{
private String ss;
	
	public String execute() throws Exception{
		
		System.out.println("ID: " + ss);
		return SUCCESS;	
		
	}

	public String getId() {
		return ss;
	}

	public void setId(String ss) {
		this.ss = ss;
	}
}
