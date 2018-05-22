
public class Flash extends Hero {

	public Flash(String name) {
		super(name);
		speedCheck();
		this.keyAbility = this.speed;
		this.specialAbility = "Infinite Mass Punch";
	}
	
	// PRIVATE METHODS ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		private void speedCheck() {
			this.speed += 20;
			//if ( this.speed > 100) {
			//	this.speed = 90;
			//}
		}
		

}
