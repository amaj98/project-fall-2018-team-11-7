package Model;
import java.io.IOException;
import java.util.ArrayList;

import GameObjects.GameObjects;
import GameObjects.Tree;

public class ModelGame3 extends Model{
	private int Score=0;
	int questionNum = 0;
	int[] answerKey = {2,3,2,3,1};
	static int resetQChoice = 0;
	ArrayList<GameObjects> objects = new ArrayList<GameObjects>();

	public ModelGame3(int width, int height) throws IOException {
		super(width, height);
		tutorial = true;
		objects.add(new Tree((int)(0),(int)(0),(int)(frameWidth/3),(int)(frameWidth/2.5)));
	}

	public int getScore() {
		return Score;
	}
	public int getNum() {
		return questionNum;
	}

	public void update(int qchoice) {
		if(qchoice != 0) {
			if(answerKey[questionNum]==qchoice) {
				Score += 10;
			}
			questionNum += 1;
			tutorial = false;
		}
	}

	public ArrayList<GameObjects> getObjects() {
		return objects;
	}
}