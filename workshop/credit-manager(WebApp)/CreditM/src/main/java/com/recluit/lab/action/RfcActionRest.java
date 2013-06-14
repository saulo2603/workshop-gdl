package com.recluit.lab.action;

import java.util.Scanner;
import com.opensymphony.xwork2.ActionSupport;


public class RfcActionRest extends ActionSupport {
	private static final long serialVersionUID = 1L;
	private String rfcQuery;
	
	public String execute() throws Exception{							
		System.out.println("\n\n"+rfcQuery+"\n\n");		
		//if(rfcQuery.length()>0){
			return SUCCESS;
		//}		
		/*else{
			return ERROR;
		}*/
	}

	public String getRfcQuery() {
		return rfcQuery;
	}

	public void setRfcQuery(String rfcQuery) {
		this.rfcQuery = rfcQuery;
	}

}
