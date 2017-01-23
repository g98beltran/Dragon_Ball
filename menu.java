import java.util.Scanner;

public class menu {
	
	public personatge comensar(Scanner s){
		System.out.println("DRAGON BALL");
		System.out.println("by GERARD");
		
		System.out.println();
		int n = 1;
		int i = 0;
		boolean triar = false;
		while(i < 5 && !triar){
			System.out.println("Tria un peronatge: ");
			System.out.println("\n 1-Goku \n 2-Vegeta \n 3-Pikolo \n 4-Crilin");
			n = s.nextInt();
			if(n >= 1 && n <= 4){
				triar = true;
			}else i++;
		}
		if(n == 1){return new personatge();}
		else if(n == 2){return new personatge("Vegeta",50,50,true);}
		else if(n == 3){return new personatge("Pikolo",50,70,true);}
		else{return new personatge("Crilin",60,40,true);}
		
	}
	public enemic triaenemic(Scanner s){
		System.out.println();
		int i = 0;
		int n= 0;
		boolean triar = false;
		while(i < 5 && !triar){
			System.out.println("Tria un enemic: ");
			System.out.println("\n 1-Vegeta \n 2-Goku\n 3-Pikolo \n 4-Crilin");
			n = s.nextInt();
			if(n >= 1 && n <= 4){
				triar = true;
			}else i++;
		}
		if(n == 1){return new enemic();}
		else if(n == 2){return  new enemic("Goku",50,100,false);}
		else if(n == 3){return new enemic("Pikolo",50,70,true);}
		else{return  new enemic("Crilin",60,40,true);}
		
	}
}
