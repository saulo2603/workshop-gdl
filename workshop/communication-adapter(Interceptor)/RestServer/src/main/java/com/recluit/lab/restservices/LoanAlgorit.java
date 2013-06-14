package com.recluit.lab.restservices;

public class LoanAlgorit {
	
	
	//public int returnQualification(String status,String qualif,int loan){
	public String returnQualification(double[] loanArr,String[] qualifArr, String[] statusArr){
		int[] califArr = new int[loanArr.length];

		int a=0;
		double finalCalif=0;
		String finalDesition=null;
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
			//System.out.println(loanArr[a]+" "+qualifArr[a]+" "+statusArr[a]+" "+califArr[a]);
		}
		
		//Ciclo para hacer el promedio y calificacion final del usuario 
		for(a=0;a<califArr.length;a++){
			finalCalif = finalCalif+califArr[a];
		}
		
		//Aqui se encuentra el resultado final		
		finalCalif=finalCalif/califArr.length;
		System.out.println("Calification: "+finalCalif);
		if(finalCalif<4)
			finalDesition="HIGH RISK FOR CREDIT";
		else if(finalCalif>=4 && finalCalif<5)
			finalDesition="LOW RISK FOR CREDIT";
		else  if(finalCalif>=5)
			finalDesition="VIABLE FOR CREDIT";
		
		
		//System.out.println(finalCalif+"\n\n");
		return finalDesition;
	}	 
}
