package View;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;

import GameObjects.Camera;
import GameObjects.GameObjects;
import GameObjects.Animal;

public class View extends JPanel {
	protected int frameWidth;
	protected int frameHeight;
	JFrame frame;
	Dimension size;
	boolean tutorial;

	public View(int frameWidth, int frameHeight, Dimension size) {
		this.frameWidth = frameWidth;
		this.frameHeight = frameHeight;
		this.size = size;
		frame = new JFrame("Game");
		frame.add(this);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setPreferredSize(size);
		frame.setVisible(true);

		frame.pack();
	}

	public int getWidth() {//
		return frameWidth;
	}
	public int getHeight() {//
		return frameHeight;
	}

	//void paintBackground() {}
	void update() {}
	void pauseView() {}

	public int getQChoice() {//
		// TODO Auto-generated method stub
		return 0;
	}

	public void update(Camera camera, ArrayList<GameObjects> objects, int score, Animal target, boolean tutorial, String fact, int time) {//
		// TODO Auto-generated method stub

	}

	public boolean getNext() {//
		// TODO Auto-generated method stub
		return false;
	}

	public void setNext(boolean b) {//
		// TODO Auto-generated method stub

	}

	public void update(int num, int score, int resetQChoice, boolean tutorial2) {//
		// TODO Auto-generated method stub

	}

	public void update(ArrayList<GameObjects> objects, boolean tutorial2, int score, int num) {//
		// TODO Auto-generated method stub

	}
}
