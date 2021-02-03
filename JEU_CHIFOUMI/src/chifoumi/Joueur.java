package chifoumi;

public class Joueur {
	private String nom;
	private int score;
	
	private IHMSaisie saisie;
	
	
	public String getNom(){
		return nom;
	}
	public Joueur(String nom){
		this.nom=nom;
		saisie=new IHMSaisie(nom);
	}
	
	public void crediter(){
		score++;
	}
	public Choix choisir(){
		return saisie.proposerChoix();
		
		    
	}
	public int getscore(){
		return score;
	}
	public void ecrireScore(){
		System.out.println("Le score de "+nom+" est "+score);
	}
	
	

}
