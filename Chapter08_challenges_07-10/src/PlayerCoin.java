
public class PlayerCoin {
private String name;
private int points=0;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getPoints() {
	return points;
}
public void setPoints(int points) {
	if (points <5) {
		if(Coin.getSideUp()=="heads(face-up)") {
			this.points=points +1;
		}else if(Coin.getSideUp()=="tails(face-down)") {
			this.points=points -1;
		}
	}
	else if (points == 5){
		this.points = points;
	}else {
		this.points=0;
	}
		
}

public PlayerCoin(String name, int points) {
	super();
	this.name = name;
	this.points = points;
}


}
