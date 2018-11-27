import java.awt.Dimension;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Font;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.Timer;
import java.util.List;

public class ViewGame1 extends View{
<<<<<<< HEAD
	private String[] target = {"Fish", "Bird","Horseshoe Crab", "Squirel"};
	private int tarInd = 0;
=======
	private String target = "";
>>>>>>> 1d541af7a2757ff6d7a809295198cf0ae739a019
	Font font = new Font("Helvetica",Font.PLAIN,24);

	Camera camera;
	List<Animal> animals;
	private int score;

	private Color myGreen;

	public ViewGame1(int frameWidth, int frameHeight) {
		super(frameWidth,frameHeight);
		JPanel drawPanel = new JPanel();

		frame.add(drawPanel);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		drawPanel.setSize(frameWidth, frameHeight);
		drawPanel.setBackground(Color.white);
		setVisible(true);
		pack();

		myGreen = new Color(0,140,0);

	}

<<<<<<< HEAD
	public void update(Camera camera, List<Animal> animals, int score, int tarInd){
		this.camera = camera;
		this.animals = animals;
		this.score = score;
		this.tarInd = tarInd;
=======
	public void update(Camera camera, List<Animal> animals, int score, String target){
		this.camera = camera;
		this.animals = animals;
		this.score = score;
		this.target = target;
>>>>>>> 1d541af7a2757ff6d7a809295198cf0ae739a019

		this.repaint();
		try {
		Thread.sleep(50);
		} catch (InterruptedException e) {
		e.printStackTrace();
		}
	}

	public void paint(Graphics g){
		super.paint(g);
		g.setColor(Color.cyan);
		g.fillRect(0,0,800,500);
		g.setColor(Color.blue);
		g.fillRect(400,300,400,200);
		g.setColor(myGreen);
		g.fillRect(0,300,400,200);
		g.setFont(font);
		g.setColor(Color.black);
		g.drawString("Score: " + score,20,60);
		g.drawString("Target: " + target[tarInd],600,60);
		g.drawRect(camera.getX(),camera.getY(),camera.getWidth(),camera.getHeight());
		g.setColor(Color.red);
		for(Animal a: animals){
			g.drawImage(a.getImage(a.getDir()),a.getX(), a.getY(), a.getWidth(), a.getHeight(), this);
		}
	}
}
