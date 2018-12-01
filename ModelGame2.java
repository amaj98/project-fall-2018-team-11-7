import java.util.ArrayList;

public class ModelGame2 extends Model {
	ArrayList<GameObjects> objects;
	int littleFish=0;
	int middleFish=0;
	int bigFish=0;
	
	public ModelGame2(int width, int height) {
		super(width, height);
	}
	
	void addAnimal(Animal a) {
		switch(a.toString()) {
		case "little fish":
			littleFish += 1;
		case "middle fish":
			middleFish +=1;
		case "big fish":
			bigFish +=1;
		}
		
	}
	void removeAnimal(Animal a) {
		switch(a.toString()) {
		case "little fish":
			littleFish -= 1;
		case "middle fish":
			middleFish -=1;
		case "big fish":
			bigFish -=1;
		}
	}
	 
	void run() {
		int b = bigFish;
		int m = middleFish;
		int l = littleFish;
		// for big fish
		bigFish = b + ((int)(b/2));
		middleFish = m - (((int)(b/2))+1) + ((int)(((m - (((int)(b/2))+1))/2))) - ((int)((((int)(bigFish/2))/2)));
		littleFish = l - (((int)(m/2))+1) + ((int)(((l - (((int)(m/2))+1))/2))) - ((int)((((int)(middleFish/2))/2)));
	}
}
