
public class enemic {
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
	public enemic(){
		this.nom = "Vegeta";
		this.força = 70;
		this.vida = 50;
		this.sort = true;
	}
	/*
	 * Constructor per si el user no vol al jugador per defecte
	 * n nom, f força, v vida, s sort
	 */
	public enemic(String n,int f,int v,boolean s){
		this.nom = n;
		this.força = f;
		this.vida = v;
		this.sort = s;		
	}
	/*
	 * Metode per vore tot sobre el enemic
	 */
	public String toString(){
		return "El teu enemic es: "+this.getNom()+" te una força de: "+this.getForça()+
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
