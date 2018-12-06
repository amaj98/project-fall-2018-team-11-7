import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Animation3 extends JPanel {
	Font font1 = new Font("Helvetica",Font.PLAIN,24);
	Font font2 = new Font("Helvetica",Font.PLAIN,30);
	int frameWidth;
	int frameHeight;
	String[] questions = {"What do Horseshoe crabs like to eat?","Grass","Birds","Mollusks","Where do birds live?","Trees","Water","Burrows","What do frogs like to eat?", "Leaves","Insects","Acorns"};
	int questionNum = 0;
	int score = 0;
	private Color myGreen;
	private ArrayList<GameObjects> objects;
	boolean tutorial;
	
	public Animation3(ArrayList<GameObjects> objects) throws IOException {
		this.objects = objects;
		myGreen = new Color(0,140,0);
		/*File file1 = new File("Question1.png");
		File file2 = new File("Question2.png");
		File file3 = new File("Question3.png");
		File file4 = new File("end.png");
		if(file1.exists() && file2.exists() && file3.exists() && file4.exists()) {
			BufferedImage image1 = ImageIO.read(file1);
			questions[0] = image1;
			BufferedImage image2 = ImageIO.read(file2);
			questions[1] = image2;
			BufferedImage image3 = ImageIO.read(file3);
			questions[2] = image3;
			BufferedImage image4 = ImageIO.read(file4);
			questions[3] = image4;*/
			
		}
		
	/*	BufferedImage background1 = Toolkit.getDefaultToolkit().createImage("Question1.png");
		questions[0] = background1;
		Image background2 = Toolkit.getDefaultToolkit().createImage("Question2.png");
		questions[1] = background2;
		Image background3 = Toolkit.getDefaultToolkit().createImage("Question3.png");
		questions[2] = background3;*/

	public void paint(Graphics g) {
		super.paint(g);
		g.setColor(Color.cyan);
		g.fillRect(0,0,frameWidth,frameHeight/2);
		g.setColor(Color.blue);
		g.fillRect(frameWidth/2,frameHeight/2,frameWidth/2,frameHeight/2);
		g.setColor(myGreen);
		g.fillRect(0,frameHeight/2,frameWidth/2,frameHeight/2);
		for(GameObjects o:objects) {
			g.drawImage(o.getImage(), o.getX(), o.getY(), o.getWidth(), o.getHeight(), this);
		}
		g.setFont(font1);
		g.setColor(Color.black);
		if(tutorial) {
			g.drawString("Learn the correct answers so you can teach others!", (int)(frameWidth/3), 100);
		}
		if(questionNum<3) {
			g.drawString(questions[4*questionNum], 675,400);
			g.drawString("A - "+questions[4*questionNum + 1]+"\t B - "+questions[4*questionNum + 2]+"\t C - "+questions[4*questionNum + 3], 675, 500);
			g.drawString("Score: " + score,50,60);
		}
		else {
			g.setFont(font2);
			g.setColor(Color.black);
			g.drawString("Good Job!", 675,400);
			g.drawString("Your Score: "+ score+" out of 3", 675, 500);
		}
	}
	
	public void update(int w, int h, int questionNum, int score, boolean tutorial) {
		this.frameHeight = h;
		this.frameWidth = w;
		this.questionNum = questionNum;
		this.score = score;
		this.tutorial = tutorial;
		this.repaint();
	}
}
