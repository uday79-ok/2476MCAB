import java.awt.*;
import java.awt.image.BufferedImage;
import javax.swing.*;
public class DDAAlgorithm extends JFrame
{
 private BufferedImage image;
 public DDAAlgorithm()
	{
	
		setTitle("DDAAlogithm");
		setSize(400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		
		image=new BufferedImage(getWidth(),getHeight(),BufferedImage.TYPE_INT_RGB);
	
		drawLine(50,50,350,350);
		
		ImageIcon icon=new ImageIcon(image);
		JLabel label=new JLabel(icon);
		add(label);
		
		setVisible(true);
	}
	private void drawLine(int x1,int y1, int x2, int y2)
	{
		int dx=x2-x1;
		int dy=y2-y1;
		int steps=Math.max(Math.abs(dx),Math.abs(dy));
		float xIncrement=(float)dx/steps;
		float yIncrement=(float)dy/steps;
		float x=x1;
	    float y=y1;
		for(int i=0;i<=steps;i++)
		{
			int pixelX=Math.round(x);
			int pixelY=Math.round(y);
            image.setRGB(pixelX,pixelY,Color.WHITE.getRGB());
			x+=xIncrement;
			y+=yIncrement;
	 }
	}
	public static void main(String[]args)
	{
		SwingUtilities.invokeLater(()->new DDAAlgorithm());
	}
}