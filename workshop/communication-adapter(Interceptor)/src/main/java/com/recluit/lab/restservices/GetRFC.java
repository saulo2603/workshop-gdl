package com.recluit.lab.restservices;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.charset.Charset;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import com.recluit.lab.restservices.*;

@Path("/rfc")
public class GetRFC {
	
	@GET
	@Path("/{rfc}")
	@Consumes(MediaType.TEXT_PLAIN)  //return the content in plain text
	public String searchRfc(@PathParam("rfc") String rfc){
		System.out.println("RFC to search:"+ rfc);
		String totalCalif=null;
		
		
		if(rfc.length()>0){
			totalCalif=establishConnection(rfc);
			System.out.println(totalCalif+" \n\n");
			return totalCalif;
		}				
		else return null;
	}
	
	
	
	String establishConnection(String rfc){		
		String ip = "127.0.0.1";
		//String ip = "192.168.10.136";
		String finalDec=null;
		//String msg = "hello from client";
		String msg = rfc;
		int port  = 2007;
		Socket	socket;
		OutputStreamWriter out;
		InputStreamReader in;
		PrintWriter pw;
		BufferedReader br;
		Loans loans = null;
		String reply="";
		
		
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
			reply = new String(buffer,0,count);
			System.out.println("After receiving msj: "+reply.length());
			//System.out.print(reply+"\n");
			
			
			//Split the reply string into separate elements
			int a=0;			
			double[] arrLoans = new double[reply.split("\n\n").length];
			String[] arrStatus = new String[reply.split("\n\n").length];
			String[] arrQualification = new String[reply.split("\n\n").length];
			String arr[] = new String [reply.split("\n\n").length];			
			for(a=0;a<=reply.split("\n\n").length-1;a++){
				arr[a] = reply.split("\n\n")[a];
				System.out.println(arr[a]);
				
				
				//sending line by line to get the objects							
				loans = new Loans(arr[a]);
				arrLoans[a] = loans.getLoanAmount();
				arrQualification[a] = loans.getQualification();
				arrStatus[a]=loans.getStatusActive();													
				
			}	
			final LoanAlgorit loanA = new LoanAlgorit();
			finalDec = loanA.returnQualification(arrLoans,arrQualification,arrStatus);
			finalDec = "USER: "+loans.getRfc()+" "+finalDec;
			//System.out.println("CALIF ES : "+total);			
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//System.out.println(reply);
		return reply;
	}	
}
