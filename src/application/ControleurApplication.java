package application;



public class ControleurApplication {

	private Navigation nav;
	public ControleurApplication(Navigation nav){
		
		this.nav = nav;
	}
	

	public void quitter(){
		this.nav.dispose();
		System.exit(0);

	}
	
	public void goApplicationEleve(){
		
	}
	
	public void goApplicationProf(){
		this.nav.goAppProf();
	}
	

	

}
