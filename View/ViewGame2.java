package View;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import GameObjects.GameObjects;

public class ViewGame2 extends View {
	Font font = new Font("Helvetica",Font.PLAIN,45);

	Animation2 a;
	ArrayList<GameObjects> objects;
	boolean next = false;

	public ViewGame2(int imageWidth, int imageHeight, Dimension size, ArrayList<GameObjects> objects, MouseListener mouseinput2) throws IOException {
		super(imageWidth, imageHeight,size);
		this.objects = objects;
		this.tutorial = true;
				//Image background = Toolkit.getDefaultToolkit().createImage("Background.png");
		//frame = new JFrame();
		Container pane = frame.getContentPane();
		pane.setPreferredSize(size);
    	pane.setLayout(new BorderLayout());
    	JButton b = new JButton("Go to next day");
    	b.addActionListener(new ActionListener(){
    		public void actionPerformed(ActionEvent e) {
    			next = true;
    		}
    	});
    	b.setPreferredSize(new Dimension((int)(frameWidth/2), 30));
    	this.add(b);
    	pane.add(this, BorderLayout.PAGE_START);
    	a = new Animation2(imageWidth, imageHeight, objects);
    	a.addMouseListener(mouseinput2);
    	pane.add(a, BorderLayout.CENTER);
    	frame.setVisible(true);
	}

	public void update(ArrayList<GameObjects> objects, boolean tutorial, int score, int dayNum) {
		this.objects = objects;
		this.tutorial = tutorial;
		a.update(frameWidth, frameHeight, objects, tutorial, score, dayNum);
		this.repaint();
		try {
			Thread.sleep(50);
			} catch (InterruptedException e) {
			e.printStackTrace();
			}
	}

	@Override
	public boolean getNext() {
		return next;
	}
	@Override
	public void setNext(boolean b) {
		this.next = b;
	}

}