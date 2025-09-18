import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
public class Bresenhams76 extends JPanel
{
 private int x1,y1, x2,y2;
public Bresenhams76(int x1,int y1,int x2,int y2)
	{
	this.x1=x1;
	this.y1=y1;
	this.x2=x2;
	this.y2=y2;
	}
	@Override
		protected void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		int dx=Math.abs(x2-y1);
		int dy=Math.abs(y2-y1);
		int sx=(x1<x2)?1:-1;
		int sy=(y1<y2)?1:-1;
		int err=dx-dy;
		int x=x1;
		int y=y1;
		while(x!=x2||y!=y2)
		{
			g.drawLine(x,y,x,y);
			int err2=2*err;
			if(err2>-dy)
			{
				err-=dy;
				x+=sx;
			}
			if(err2<dx)
			{
				err+=dx;
				y+=sy;
			}}}
			public static void main(String[] args)
	{
				int x1=100;
			    int y1=100;
				int x2=300;
				int y2=300;
				SwingUtilities.invokeLater(()->{
					JFrame frame=new JFrame("Bresenhams76");
					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					frame.add(new Bresenhams76(x1,y1,x2,y2));
					frame.setSize(800,800);
					frame.setVisible(true);
				});
}
}