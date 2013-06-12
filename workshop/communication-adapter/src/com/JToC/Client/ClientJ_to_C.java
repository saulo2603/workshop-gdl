package com.JToC.Client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.charset.Charset;


public class ClientJ_to_C {

	public void establishConnection(String rfc){		
		String ip = "127.0.0.1";
		//String msg = "hello from client";
		String msg = rfc;
		int port  = 2007;
		Socket	socket;
		OutputStreamWriter out;
		InputStreamReader in;
		PrintWriter pw;
		BufferedReader br;
		
		try {
			socket = new Socket(ip,port);
			out = new OutputStreamWriter(socket.getOutputStream());
			in = new InputStreamReader(socket.getInputStream(),Charset.forName("UTF-8").newDecoder());								
			
			
			//send 
			pw = new PrintWriter(out,true);
			System.out.println("Before sending msj: "+msg.length());
			pw.print(msg);
			pw.flush();
			
			
			//receive to reply
			br = new BufferedReader(in);
			char[] buffer = new char[1024];
			int count = br.read(buffer,0,1024);
			String reply = new String(buffer,0,count);
			System.out.println("After receiving msj: "+reply.length());
			//System.out.print(reply+"\n");
			
			
			//Split the reply string into separate elements
			int a=0;
			double total=0;
			double[] arrLoans = new double[reply.split("\n\n").length];
			String[] arrStatus = new String[reply.split("\n\n").length];
			String[] arrQualification = new String[reply.split("\n\n").length];
			String arr[] = new String [reply.split("\n\n").length];			
			for(a=0;a<=reply.split("\n\n").length-1;a++){
				arr[a] = reply.split("\n\n")[a];
				System.out.println(arr[a]);
				
				//sending line by line to get the objects							
				Loans loans = new Loans(arr[a]);
				arrLoans[a] = loans.getLoanAmount();
				arrQualification[a] = loans.getQualification();
				arrStatus[a]=loans.getStatusActive();
				
				//System.out.println(loans.getBankCode()+" "+loans.getRfc());
				//getting the qualification 
				//final LoanAlgorit loanA = new LoanAlgorit();
				//total = loanA.returnQualification(loans.getStatusActive(),loans.getQualification(),total);	
					
			}	
			final LoanAlgorit loanA = new LoanAlgorit();
			total = loanA.returnQualification(arrLoans,arrQualification,arrStatus);
			System.out.println("CALIF ES : "+total);
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}	

	public void initialization(){
		String rfc = "ROMS260389JSAULO1";
		ClientJ_to_C connection = new ClientJ_to_C();
		
		System.out.println("Insert your RFC: ");
		connection.establishConnection(rfc);						
	}
	
	public static void main(String[] args) {	
		//new ClientJ_to_C().establishConnection();
		ClientJ_to_C init = new ClientJ_to_C();
		init.initialization();
	}
}
