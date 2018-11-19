package Presentacion;
import java.awt.Image;
//import java.awt.image.BufferedImage;
import java.awt.image.*;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class ResourceLoader {
	
	private Image image;
	
	public Image loadImage(String path)
	{
		try {
			image = ImageIO.read(getClass().getResource(path));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return image;
	}
	
	

}
