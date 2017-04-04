package application.professeur.connexion;


public class ControleurConnexionProf {
	
	private VueConnexionProf vueCoProf;
	private ModeleConnexionProf modeleCoProf;
	
	public ControleurConnexionProf(VueConnexionProf vueCoProf, ModeleConnexionProf modeleCoProf){
		this.vueCoProf = vueCoProf;
		this.modeleCoProf = modeleCoProf;
	}
	
	public void submitFormulaire(){
		//this.modeleCoProf.setLogin(this.vueCoProf.getChampLogin());
		//this.modeleCoProf.setMdp(this.vueCoProf.getChampMdp());
		
	}
	
	
}
