import java.util.Scanner;

public class playHero {
static boolean gameLive = true;
	public static void main(String[] args) {
		
		
		Scanner sc= new Scanner(System.in);	
		int attmove;
		int selector;
		// INSTANTIATE HEROS FIRST +++++++++++++++++++++++++++++++++++++++++++++++++++++
		
		
		
		Hero HeroOne, HeroTwo;
		
		//HERO SELECT****************************************************************
		System.out.println("Select your Hero");
		System.out.println("1: Flash\n2:Superman");
		while (!sc.hasNextInt()) sc.next();
		selector=sc.nextInt();
		
		switch(selector){
		case 0:
			System.out.println("The Dark Knight, Batman, has been Selected");
			Hero HeroBatman = new Batman("Batman");
			HeroOne=HeroBatman;
			break;
		case 1:
			System.out.println("The Flash has been Selected");
			Hero HeroFlash = new Flash("Flash");
			HeroOne=HeroFlash;
			break;
		case 2:
			System.out.println("Superman has been Selected");
			Hero HeroSuperman = new Superman("Superman");
			HeroOne=HeroSuperman;
			break;
		default:
			System.out.println("A random hero will be selected");

			selector=(int) (Math.random()*2+1);
			if(selector == 1){
				Hero HeroFlash1 = new Flash("Flash");
				HeroOne=HeroFlash1;
			}
			else{
				Hero HeroSuperman1 = new Superman("Superman");
				HeroOne=HeroSuperman1;
			}
			break;
		}
		
		//FOE SELECT
		System.out.println("Select your Rival");
		System.out.println("1: Flash\n2: Superman");
		while (!sc.hasNextInt()) sc.next();
		selector=sc.nextInt();
		
		switch(selector){
		case 0:
			System.out.println("The Dark Knight, Batman, has been Selected");
			Hero HeroBatman2 = new Batman("Batman");
			HeroTwo=HeroBatman2;
			break;
		case 1:
			System.out.println("The Flash has been Selected");
			Hero HeroFlash2 = new Flash("Flash");
			HeroTwo=HeroFlash2;
			break;
		case 2:
			System.out.println("Superman has been Selected");
			Hero HeroSuperman2 = new Superman("Superman");
			HeroTwo=HeroSuperman2;
			break;
		default:
			System.out.println("A random hero will be selected");
			selector=(int) (Math.random()*2+1);
			if(selector == 1){
				Hero HeroFlash22 = new Flash("Flash");
				HeroTwo=HeroFlash22;
			}
			else{
				Hero HeroSuperman22 = new Superman("Superman");
				HeroTwo=HeroSuperman22;
			}
			break;
		}
		
		
		
		// INSTANIATE HERO1 ACTIONS +++++++++++++++++++++++++++++++++++++++++++++++++++++
		//String Input;
		boolean flag=false;
		System.out.printf(HeroOne.name + " is going first\n");
		while (gameLive) 
		{
			
			if(!HeroOne.isDead()&&!HeroTwo.isDead()) {
			
			/*while (flag==false) {
				try {
			attmove=sc.nextInt();
				} catch (NumberFormatException e) {
			           System.out.println("This is not a number");
			           System.out.println(e.getMessage());
			        }*/
			//Input = sc.next();
				System.out.println("Enter 1 for Punch or 2 for Kick or 3 for Special Move");

				while (!sc.hasNextInt()) sc.next();
				attmove=sc.nextInt();
			if(attmove==1||attmove==2||attmove==3) {
				switch(attmove) {
				case 1:
					HeroOne.fights(HeroTwo, attmove);
					break;
				case 2:
					//System.out.println("Enter 1 for Punch or 2 for Kick or 3 for Special Move");
					HeroOne.fights(HeroTwo, attmove);
					break;
				case 3:					
					//System.out.println("Enter 1 for Punch or 2 for Kick or 3 for Special Move");
					HeroOne.fights(HeroTwo, attmove);
					break;
				}flag=true;
			}
			else
			{
				//System.out.println("Enter 1 for Punch or 2 for Kick or 3 for Special Move");
			}
			}
			else{
				
				}
			
			System.out.println("**********************");
			/*for(int i=0;i<100;i++) {
				attmove=(int)(Math.random()*2+1);
				System.out.println(attmove);
			}*/
			flag=false;//reset flag to false
				attmove=(int)(Math.random()*3+1);
				
					switch(attmove) {
					case 1:
						HeroTwo.fights(HeroOne, attmove);
						break;
					case 2:
						HeroTwo.fights(HeroOne, attmove);
						break;
					case 3:
						HeroTwo.fights(HeroOne, attmove);
						break;
					}
					
					System.out.println("**********************");

				
				
				
					
			/*flash.fights(superman);
			if ( !(superman.isDead())) 
			{
				superman.fights(flash);
				if ( (flash.isDead())) 
				{
					System.out.println("Flash is dead, GAME OVER!");
					gameLive = false;
				}
			}
			else
			{
			System.out.println("Superman is dead, GAME OVER!");
			gameLive = false;
			}*/
				
			//IS DEAD CHECK
				if(HeroOne.isDead()) {
					System.out.println(HeroOne.name + " is defeated, GAME OVER!");
					gameLive = false;}
				else if(HeroTwo.isDead()){
					System.out.println(HeroTwo.name + " is defeated, GAME OVER!");
					gameLive = false;}
				
				
		}
				
				
	}
		
			
	
	public boolean checkdeadstatus(Hero hr) {
		if(hr.isDead()) {
			System.out.println(hr.name + " is defeated, GAME OVER!");
			gameLive = false;
			return gameLive;
		}
		return gameLive;
		
		
	}

}
