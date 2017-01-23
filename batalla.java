import java.util.Random;
import java.util.Scanner;

public class batalla {
	
	public boolean guerra(personatge p, enemic e, Scanner s){
		System.out.println("BATALLA");
		System.out.println("ENFRENTARA A:"+p.getNom()+" contra "+e.getNom());
		System.out.println("Qui guanyarà?");
		System.out.println();
		System.out.println();
		
		Random r = new Random(System.nanoTime());
		
		for(int j = 0 ; p.getVida()>0 && e.getVida()>0 ;j++){
			int atacador = r.nextInt(2);
			System.out.println(atacador+" si es 1 ataca el enemic");
			if(atacador == 0){
				this.atacar(s,p,r,e);
			}else{
				System.out.println("Ataca: "+e.getNom());
				p.setVida(p.getVida()-(e.getForça()/2));
			}
			System.out.println(p.toString());
			System.out.println(e.toString());
		}
		if(p.getVida() > e.getVida()){return true;}
		else{return false;}
	}
	public void atacar(Scanner s , personatge p, Random r,enemic e){
		int i = 0;
		int n = 0;
		boolean ixir = false;
		while(i < 2 && !ixir){
			System.out.println("Te toca atacar: ");
			System.out.println("\n 1-Basico(lleves la mitat de la teua força)"
					+ " \n 2-Bola de Poder(pots llevar la teua força o res) "
					+ "\n 3-Obtindre Sort(tens sort per poder tirar bola de poder)");
			n = s.nextInt();
			if(n >= 1 && n <= 3){
				ixir = true;
			}else i++;
		}
		if(n==1){e.setVida(e.getVida()-(p.getForça()/2));}
		else if(n == 2){
			int a = r.nextInt(2);
			System.out.println(a+" si es 1 tira la bola de poder");
			if(a == 1 && p.isSort()){
				e.setVida(e.getVida()-p.getForça());
			}
		}
		else{p.setSort(true);
		System.out.println("El teu jugador te sort a: "+p.isSort());}
		
	}

}
