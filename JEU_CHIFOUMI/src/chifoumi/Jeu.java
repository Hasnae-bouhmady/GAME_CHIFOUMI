package chifoumi;

public class Jeu {
	private Joueur joueur1,joueur2;
	public Jeu(String nom1,String nom2,int scoremax){
		 
		 joueur1=new Joueur(nom1);
		 joueur2=new Joueur(nom2);
		 jouer(scoremax);
		
	}
	public void jouer(int scoremax){
		boolean fini=false;
		while(!fini){
			tour();
			joueur1.ecrireScore();
			joueur2.ecrireScore();
			if(scoremax==joueur1.getscore()){
				proclamer(joueur1);
				fini=true;
				}
			else if(scoremax==joueur2.getscore()){
				proclamer(joueur2);
				fini=true;
			    }
		    }
		
	}	
	
	public  void tour(){
		Choix choix1=joueur1.choisir();
		Choix choix2=joueur2.choisir();
		if(choix1==Choix.CISEAUX){
			if(choix2==Choix.PAPIER) joueur1.crediter();
			else if (choix2==Choix.CAILLOU) joueur2.crediter();
		}
		else if (choix1== Choix.PAPIER){
			if(choix2==Choix.CAILLOU)  joueur1.crediter();
			else if (choix2==Choix.CISEAUX) joueur2.crediter();
		}
		else if (choix1== Choix.CAILLOU){
			if(choix2==Choix.CISEAUX) joueur1.crediter();
			else if(choix2==Choix.PAPIER) joueur2.crediter();
		}
	}

	
	public void proclamer(){
		if (joueur1.getscore()==joueur2.getscore())
			System.out.println(joueur1.getNom()+" et "+joueur2.getNom()+" ont fait une parie nulle.");
		else if(joueur1.getscore()<joueur2.getscore()) 
			System.out.println(joueur2.getNom()+" est le grand gagnant.");
		else System.out.println(joueur1.getNom()+" est le grand gagnant");
		
	}
	public void proclamer(Joueur joueur) {
		System.out.println(joueur.getNom() + " est le grand gagnant");
	}
	
	

}

