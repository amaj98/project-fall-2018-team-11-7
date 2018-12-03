import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class MiddleFish extends Animal {
	BufferedImage image;
	private boolean drag = false;
	private boolean origin = true;
	
	public MiddleFish(int frameWidth, int frameHeight) throws IOException {
		super(frameWidth, frameHeight);
		xloc = (int)(frameWidth/18);
		yloc = (int)(frameHeight/2 - frameHeight/28);
		imageWidth = (int)(frameWidth/32);
		imageHeight = (int)(frameWidth/32);
		File file = new File("Fish_east_1.png");
		if(file.exists()) {
			image = ImageIO.read(file);
		}
	}

	public String toString() {
		return "middle fish";
	}

	@Override
	public BufferedImage getImage() {
		// TODO Auto-generated method stub
		return image;
	}

	@Override
	public void updatePosition() {
		// TODO Auto-generated method stub
		
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

}
