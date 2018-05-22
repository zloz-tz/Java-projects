
public class Superman extends Hero {

	
	// CONSTRUCTOR +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	public Superman(String name) {
		super(name);
		this.strengthCheck();
		this.keyAbility = this.strength;
		this.specialAbility = "Laser Eyes";
	}
	
	// PRIVATE METHODS ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	private void strengthCheck() {
		this.strength += 10;
		
	}
	
	// PUBLIC METHODS +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	
	
}
