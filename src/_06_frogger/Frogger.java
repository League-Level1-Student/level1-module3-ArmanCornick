package _06_frogger;

import processing.core.PApplet;

public class Frogger extends PApplet {
	static final int WIDTH = 800;
	static final int HEIGHT = 600;
	int x = 400;
	int y = 550;
	Car car1;
	Car car2;
	Car car3;
	Car car4;
	Car car5;
	public void keyPressed()
	{
		if(key == CODED){
			if(keyCode == UP)
			{
				if(y > 29) {
					y -= 30;
				}
			}
			else if(keyCode == DOWN)
			{
				if(y < 555) {
					y += 30; 
				}
			}
			else if(keyCode == RIGHT)
			{
				if(x < 771) {
					x += 30;
				}
			}
			else if(keyCode == LEFT)
			{
				if(x > 29) {
					x -= 30;
				}
			}
		}
	}

	@Override
	public void settings() {
		size(WIDTH, HEIGHT);
	}

	@Override
	public void setup() {
		car1 = new Car(0,450,8,75);
		car2 = new Car(400,450,8,75);
		car3 = new Car(750,450,8,75);
		car4 = new Car(200,450,8,75);
		car5 = new Car(600,450,8,75);
	}

	@Override
	public void draw() {
		background(100,100,100);
		fill(0,255,0);
		ellipse(x, y, 30, 30);
		car1.display();
		car2.display();
		car3.display();
		car4.display();
		car5.display();
		car1.carX += car1.carSpeed;
		car2.carX += car2.carSpeed;
		car3.carX += car3.carSpeed;
		car4.carX += car4.carSpeed;
		car5.carX += car5.carSpeed;
		if(car1.carX > 800) {
			car1.carX = -100;	
		}
		if(car2.carX > 800) {
			car2.carX = -100;	
		}
		if(car3.carX > 800) {
			car3.carX = -100;	
		}
		if(car4.carX > 800) {
			car4.carX = -100;	
		}
		if(car5.carX > 800) {
			car5.carX = -100;
		}
		if(intersects(car1)) {
			x = 400;
			y = 550;
		}
		if(intersects(car2)) {
			x = 400;
			y = 550;
		}
		if(intersects(car3)) {
			x = 400;
			y = 550;
		}
		if(intersects(car4)) {
			x = 400;
			y = 550;
		}
		if(intersects(car5)) {
			x = 400;
			y = 550;
		}
	}

	boolean intersects(Car car) {
		if ((y > car.getY() && y < car.getY()+50) &&
				(x > car.getX() && x < car.getX()+car.getSize())) {
			return true;
		}
		else  {
			return false;
		}

	}
	static public void main(String[] args) {
		PApplet.main(Frogger.class.getName());
	}

	public class Car {
		int carX = 0;
		int carY = 0;
		int carSpeed = 0;
		int carSize = 0;	
		Car(int carX, int carY, int carSpeed, int carSize) {
			this.carX = carX;
			this.carY = carY;
			this.carSize = carSize;
			this.carSpeed = carSpeed;
		}
		int getX() {
			return carX;
		}
		int getY() {
			return carY;
		}
		int getSize() {
			return carSize;
		}


		void display()
		{
			fill(0,0,255);
			rect(carX , carY,  carSize, 50);
		}
	}
}


