/**
 * 
 */

/**
 * @author zlozt
 *
 */
public abstract class Hero{
	
	// VARIABLES +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	
	public String name;
	public String specialAbility;
	protected int health;
	protected int speed;
	protected int strength;
	protected int keyAbility;
	private boolean isDead = false;
	private boolean hasUsedAbility = false;
	
	// Getters +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	
	
	public String getName() {
		return name;
	}
	public int getSpeed() {
		return speed;
	}
	public int getStrength() {
		return strength;
	}
	
	public int getHealth() {
		return health;
	}
	

	// Constructor +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

	public Hero( String name) {
		
		this.name = name;
		generateAbs();
	}

	// PRIVATE METHODS +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	
	// Generate abilities for any hero.
	private void generateAbs() {
		this.strength = 50;
		this.speed = 50;
		this.health = 100;
		
	}
	
	// Calculate the chance of getting hit according to the speed of the hero
	private boolean hitAttempt(Hero hr, int attMove) {
		int num = (int)(Math.random() * 100 +1); // generate a random number
		System.out.println("Your Rival's Speed is: "+hr.getSpeed());
		switch (attMove) {
		case 1: //Punch
		
			if(hr.getSpeed() < num*2 ){
			System.out.println("Random num is: " + num*2); // Just for double checking
			return true;
		}
		
			System.out.println("Random num is: " + num*2); // Just for double checking
			
			break;
		
		case 2:
				if(hr.getSpeed() < num ){
				System.out.println("Random num is: " + num); // Just for double checking
				return true;
			}
			
				System.out.println("Random num is: " + num); // Just for double checking
				
				break;
		case 3:
			return true;
				
		}
		return false;
	}
	
	// Takes hero and damage from the fights method
	private void takeDamage (Hero hr, int damage) {
	
		if (hr.health - damage <= 0) {
			hr.health = 0;
			hr.isDead = true;
		//	System.out.println(hr.getName() + " is dead."); 
		}
		else hr.health -= damage;
	}
	
	private void Punch(Hero hr) {
		System.out.println(this.name + " is Punching!");
		if (hitAttempt(hr,1)) {
			int damage = this.strength/2; // damage is according to the attacker's strength
			System.out.println(this.getName() + " hit by power of: " + damage +".");
			takeDamage(hr, damage);
			System.out.println(hr.getName() + " has " + hr.getHealth() + " health left after attack." );
		}
		else System.out.println(this.getName() + " missed his attack.");
	}
	
	private void Kick(Hero hr) {
		System.out.println(this.name + " is Kicking!");
		if (hitAttempt(hr, 2)) {
			int damage = this.strength; // damage is according to the attacker's strength
			System.out.println(this.getName() + " hit by power of: " + damage +".");
			takeDamage(hr, damage);
			System.out.println(hr.getName() + " has " + hr.getHealth() + " health left after attack." );
		}
		else System.out.println(this.getName() + " missed his attack.");
	}
	
	private void SpecialAbility(Hero hr, String specialAbility, int keyAbility) {
		System.out.println(this.name + " is using " + specialAbility);
		if (hitAttempt(hr, 3)&& hasUsedAbility == false) {
			int damage = keyAbility; // damage is according to the attacker's strongest stat.
			System.out.println(this.getName() + " hit by power of: " + damage +".");
			takeDamage(hr, damage);
			System.out.println(hr.getName() + " has " + hr.getHealth() + " health left after attack." );
			hasUsedAbility = true;
		}
		else
		System.out.println(this.getName() + " already used " + specialAbility + "!");
	}
	// Public methods ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	
	// Display the abilities of the hero
	public void showAbs() {
		System.out.println("++++++++++++++++++++++++++++++++++++++++++");
		System.out.println(getName() + " abilities: ");
		System.out.println("Strength is: " + this.strength);
		System.out.println("Speed is: " + this.speed);
		System.out.println("Health is: " + this.health);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++");

	}
	
	
	// Hero fights another hero. takes the entity of the hero who is attacked.
	public void fights(Hero hr, int move) {
		int i;
	
		switch(move) {
		case 1:
			Punch(hr);
			break;
		case 2:
			Kick(hr);
			break;
		case 3:
			SpecialAbility(hr, specialAbility, keyAbility);
			break;
		default:
			i=(int) (Math.random()*3+1);
			if (i==1){
				Punch(hr);
			}
			else if (i==2){
				Kick(hr);
			}
			else if (i==3){
				SpecialAbility(hr, specialAbility, keyAbility);
			}
			else {
			break;
			}
		}
		
		/*
		System.out.println(this.name + " is fighting!");
		if (hitAttempt(hr)) {
			int damage = this.strength; // damage is according to the attacker's strength
			System.out.println(this.getName() + " hit by power of: " + damage +".");
			takeDamage(hr, damage);
			System.out.println(hr.getName() + " has " + hr.getHealth() + " health left after attack." );
		}
		else System.out.println(this.getName() + " missed his attack.");*/
	}
	
	// Determine if the hero is dead.
	public boolean isDead() {
		return isDead;
	}
}
