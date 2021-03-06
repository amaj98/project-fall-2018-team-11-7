package GameObjects;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class BigFish extends Animal  {

	BufferedImage image;
	private boolean drag = false;
	private boolean origin = true;

	public BigFish(int frameWidth, int frameHeight) throws IOException {
		super(frameWidth, frameHeight);
		xloc = (int)(frameWidth/23);
		yloc = (int)(frameHeight/5 + frameHeight/30);
		imageWidth = (int)(frameWidth/20);
		imageHeight = (int)(frameWidth/20);
		File file = new File("images/Fish_east_1.png");
		if(file.exists()) {
			image = ImageIO.read(file);
		}
	}

	public BigFish(int frameWidth, int frameHeight, int xloc, int yloc) throws IOException {
		super(frameWidth, frameHeight);
		this.xloc = xloc;
		this.yloc = yloc;
		imageWidth = (int)(frameWidth/20);
		imageHeight = (int)(frameWidth/20);
		File file = new File("images/Fish_east_1.png");
		if(file.exists()) {
			image = ImageIO.read(file);
		}
	}

	public String toString() {
		return "big fish";
	}

	@Override
	public BufferedImage getImage() {
		// TODO Auto-generated method stub
		return image;
	}

	@Override
	public void updatePosition(int x, int y) {
		this.xloc = x - (int)(imageWidth/2 + imageWidth/8);
		this.yloc = y - (int)(imageHeight + imageHeight/5);
	}

	@Override
	public boolean getDrag() {
		return drag;
	}

	@Override
	public void setDrag(boolean d) {
		drag = d;
	}

	@Override
	public boolean getOrigin() {
		return origin;
	}

	@Override
	public void setOrigin(boolean o) {
		origin = o;
	}

	@Override
	public void updatePosition() {
		// TODO Auto-generated method stub

	}

}
