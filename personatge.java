
public class personatge {
	
	/*
	 * Variables que tindra cada personatge
	 */
	private String nom;
	private int força;
	private int vida;
	private boolean sort;

	/*
	 * Constructor per defecte
	 */
	public personatge(){
		this.nom = "Goku";
		this.força = 50;
		this.vida = 100;
		this.sort = false;
	}
	/*
	 * Constructor per si el user no vol al jugador per defecte
	 * n nom, f força, v vida, s sort
	 */
	public personatge(String n,int f,int v,boolean s){
		this.nom = n;
		this.força = f;
		this.vida = v;
		this.sort = s;		
	}
	/*
	 * Metode per vore tot sobre el teu personatge
	 */
	public String toString(){
		return "El teu personatge es: "+this.getNom()+" te una força de: "+this.getForça()+
				" i te "+this.getVida()+" de vida.";
	}
	/*
	 * Getters i Setters
	 */
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getForça() {
		return força;
	}
	public void setForça(int força) {
		this.força = força;
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
