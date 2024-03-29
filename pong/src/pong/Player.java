package pong;

import java.awt.Color;

public class Player extends Entity{
	public boolean right, left;
	
	public Player(double x, double y){
		this.x = x;
		this.y = y;
		width = 40;
		height = 5;
		this.color = Color.BLUE;
	}
	
	@Override
	public void tick() {
		
		if(right) {
			x += 1;
		}else if(left) {
			x -= 1;
		}
		if(x+width > Game.WIDTH) {
			x = Game.WIDTH - width;
		}
		else if(x < 0) {
			x = 0;
		}
	}
	
}
