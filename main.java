import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		menu m = new menu();
		batalla b = new batalla();
		personatge player = m.comensar(s);
		System.out.println();
		enemic enemy = m.triaenemic(s);
		System.out.println();
		
		System.out.println(player.toString());
		System.out.println(enemy.toString());
		
		boolean resultat =  b.guerra(player,enemy,s);
		if(resultat){System.out.println("Enhorabona eres inmortal!");}
		else System.out.println("Pobret has mort i tenvas al INFERN....");
		
		
	}
}
