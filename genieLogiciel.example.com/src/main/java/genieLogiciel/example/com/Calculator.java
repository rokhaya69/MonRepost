package genieLogiciel.example.com;

import java.util.Arrays;

public class Calculator {
	int sum,mul,minus;

	/*public int sum(int a,int b) throws Exception {
		sum=a+b;
		if((a>0 && b>0) && sum<0 ) throw new Exception ("Le resultat de la somme des deux entiers depasse le nombre de bit reservé au type int");
		if((a<0 && b<0) && sum>0)  throw new Exception ("Le resultat de la somme des deux entiers depasse le nombre de bit reservé au type int");
		return sum;
	}*/
	
	public int minus(int a,int b) throws Exception {
		minus =a-b;
		if((a<0 && b>0) && minus>0) throw new Exception ("Le resultat de la soustraction depasse le nombre de bit reservé au type int");
		if((a>0 && b<0) && minus<0) throw new Exception ("Le resultat de la soustraction depasse le nombre de bit reservé au type int");
		return minus;
	}
	
	public int divide(int a,int b) throws Exception {
		
		if(b==0) throw new Exception ("division par zero erreur");
		return a/b;
	}
	
	public int multiply(int a,int b) throws Exception {
		mul=a*b;
		if((a>0 && b>0) && mul<0) throw new Exception ("Le resultat de la multiplication des deux entiers depasse le nombre de bit resrvé au type int");
		if((a<0 && b<0) && mul<0) throw new Exception ("Le resultat de la multiplication des deux entiers depasse le nombre de bit resrvé au type int");
		
		return mul;
	}
	
	public int min(int a,int b) {
		if(a<b) return a;
		return b;
	}
	
	public int max(int a,int b) {
		if(a<b) return b;
		return a;
	}
	
	public int minElement(int[]list) throws Exception {
		if(list.length==0) throw new Exception ("la liste est vide");
		Arrays.sort(list);
		return list[0];
	}
	
	public int maxElement(int[]list) throws Exception {
		if(list.length==0) throw new Exception ("la liste est vide");
		Arrays.sort(list);
		return list[list.length -1];
	}

}
