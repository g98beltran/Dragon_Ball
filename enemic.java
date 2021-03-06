
public class enemic {
	/*
	 * Variables que tindra cada personatge
	 */
	private String nom;
	private int for�a;
	private int vida;
	private boolean sort;

	/*
	 * Constructor per defecte
	 */
	public enemic(){
		this.nom = "Vegeta";
		this.for�a = 70;
		this.vida = 50;
		this.sort = true;
	}
	/*
	 * Constructor per si el user no vol al jugador per defecte
	 * n nom, f for�a, v vida, s sort
	 */
	public enemic(String n,int f,int v,boolean s){
		this.nom = n;
		this.for�a = f;
		this.vida = v;
		this.sort = s;		
	}
	/*
	 * Metode per vore tot sobre el enemic
	 */
	public String toString(){
		return "El teu enemic es: "+this.getNom()+" te una for�a de: "+this.getFor�a()+
				" i te "+this.getVida()+" de vida.";
	}
	/*
	 * Getters i Seters
	 */
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getFor�a() {
		return for�a;
	}
	public void setFor�a(int for�a) {
		this.for�a = for�a;
	}
	public int getVida() {
		return vida;
	}
	public void setVida(int vida) {
		this.vida = vida;
	}
	public boolean isSort() {
		return sort;
	}
	public void setSort(boolean sort) {
		this.sort = sort;
	}

}
