package application;

import main.Main;

public class ControleurApplication {
	
	
	public ControleurApplication(){
		
		
	}
	

	public void quitter(){
		Main.getNavigation().dispose();
		System.exit(0);

	}
	
	public void goApplicationEleve(){
		
	}
	
	public void goApplicationProf(){
		Main.getNavigation().goAppProf();
	}
	

	

}
