package com.JToC.Client;

public class LoanAlgorit {
	
	
	//public int returnQualification(String status,String qualif,int loan){
	public double returnQualification(double[] loanArr,String[] qualifArr, String[] statusArr){
		int[] califArr = new int[loanArr.length];
		/*totalLoan = loan;
		//System.out.println(totalLoan+"\n");
		
		//System.out.println(status+" "+qualif+" "+loan);
		if (status.equals("N") && qualif.equals("VERY GOOD"))
			totalLoan = totalLoan+4;
		if (status.equals("N") && qualif.equals("GOOD"))
			totalLoan = totalLoan+2;
		if (status.equals("N") && qualif.equals("BAD"))
			totalLoan = totalLoan-2;
		if (status.equals("N") && qualif.equals("VERY BAD"))
			totalLoan = totalLoan-4;
		
		if (status.equals("Y") && qualif.equals("VERY GOOD"))
			totalLoan = totalLoan+2;
		if (status.equals("Y") && qualif.equals("GOOD"))
			totalLoan = totalLoan+1;
		if (status.equals("Y") && qualif.equals("BAD"))
			totalLoan = totalLoan-1;
		if (status.equals("Y") && qualif.equals("VERY BAD"))
			totalLoan = totalLoan-3;*/
		int a=0;
		double finalCalif=0;
		//Ciclo para asignar puntos para el promedio final
		for(a=0;a<loanArr.length;a++){			
			if (statusArr[a].equals("N") && qualifArr[a].equals("VERY GOOD"))
				califArr[a] =6;
			if (statusArr[a].equals("N") && qualifArr[a].equals("GOOD"))
				califArr[a] =4;
			if (statusArr[a].equals("N") && qualifArr[a].equals("BAD"))
				califArr[a] =2;
			if (statusArr[a].equals("N") && qualifArr[a].equals("VERY BAD"))
				califArr[a] =1;
			
			if (statusArr[a].equals("Y") && qualifArr[a].equals("VERY GOOD"))
				califArr[a] =5;
			if (statusArr[a].equals("Y") && qualifArr[a].equals("GOOD"))
				califArr[a] =3;
			if (statusArr[a].equals("Y") && qualifArr[a].equals("BAD"))
				califArr[a] =1;
			if (statusArr[a].equals("Y") && qualifArr[a].equals("VERY BAD"))
				califArr[a] =1;			
			System.out.println(loanArr[a]+" "+qualifArr[a]+" "+statusArr[a]+" "+califArr[a]);
		}
		
		//Ciclo para hacer el promedio y calificacion final del usuario 
		for(a=0;a<califArr.length;a++){
			//total =total+loanArr[a];
			finalCalif = finalCalif+califArr[a];
		}
		
		//Aqui se encuentra el resultado final
		finalCalif=finalCalif/califArr.length;
		
		//System.out.println(finalCalif+"\n\n");
		return finalCalif;
	}	 
}
