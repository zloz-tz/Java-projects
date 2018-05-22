
public class Batman extends Hero implements IAmHero {

	public Batman(String name) {
		super(name);
		this.strengthSet();
		this.speedSet();
		this.healthSet();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void strengthSet() {
		// TODO Auto-generated method stub
			this.strength+=100;
	}

	@Override
	public void speedSet() {
		// TODO Auto-generated method stub
			this.speed+=100;
	}

	@Override
	public void healthSet() {
		// TODO Auto-generated method stub
			this.health+=1000;

	}

}
