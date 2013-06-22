package com.recluit.lab.action;

import java.util.Scanner;
import com.opensymphony.xwork2.ActionSupport;
import com.recluit.lab.restclient.rfcRestClient;


public class RfcActionRest extends ActionSupport {
	private static final long serialVersionUID = 1L;
	private String rfcQuery;
	private Integer operations;
	private String rfcResult;
	private String rfcSplit[];
	private String rfcSplit1[][];
	private int a=0,b=0;
	
	

	public String execute() throws Exception{							
		System.out.println("\n\n"+rfcQuery+" "+operations);		
		
		switch (operations) {
		case 1:
				rfcRestClient loans = new rfcRestClient();
				rfcResult = loans.closeLoans(rfcQuery);
				if(rfcResult != null){	
					rfcSplit  = new String [rfcResult.split("\n\n").length];					
					rfcSplit1 = new String [rfcResult.split("\n\n").length][8];
					
					for(a=0;a<=rfcResult.split("\n\n").length-1;a++){
						rfcSplit[a] = rfcResult.split("\n\n")[a];
						
						
						rfcSplit1[a]= rfcSplit[a].split("\\|");
						for(b=0;b<=8;b++){
						//System.out.println(rfcSplit1[a][0]+" "+rfcSplit1[a][1]+" "+rfcSplit1[a][2]+" "+rfcSplit1[a][3]+" "+rfcSplit1[a][4]+" "+"ssssss\n");
						System.out.print(rfcSplit1[a][b]+" ");
						}
						System.out.println("");
						
						//System.out.println(rfcSplit1[1][8]);
					}				
					
					return "closeLoan";
				}
				else{
					return "error";
				}						
		case 2:							
				return "getNewLoan";
		
		case 3:
				return "paymentForm";							
		
		case 4:
			return "displayForm";		
				

		default: return "HEY DUDE;";
				
		}
	}

	public String[][] getRfcSplit1() {
		return rfcSplit1;
	}

	public void setRfcSplit1(String[][] rfcSplit1) {
		this.rfcSplit1 = rfcSplit1;
	}

	public String[] getRfcSplit() {
		return rfcSplit;
	}

	public void setRfcSplit(String[] rfcSplit) {
		this.rfcSplit = rfcSplit;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public String getRfcResult() {
		return rfcResult;
	}

	public void setRfcResult(String rfcResult) {
		this.rfcResult = rfcResult;
	}

	public Integer getOperations() {
		return operations;
	}

	public void setOperations(Integer operations) {
		this.operations = operations;
	}

	public String getRfcQuery() {
		return rfcQuery;
	}

	public void setRfcQuery(String rfcQuery) {
		this.rfcQuery = rfcQuery;
	}
	
	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}


}
