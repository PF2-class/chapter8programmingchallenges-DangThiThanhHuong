
public class Player {
	private String name;
	private int points = 50;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int point) {
		if(points>1) {
		this.points = points - Die.getValue();
		}
		else {
			this.points = 50;
		}
	}
	public Player(String name, int points) {
		super();
		this.name = name;
		this.points = points;
	}


}
