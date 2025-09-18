import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
public class ParallelLineAlgorithm76
	{
		public static void main(String[]args)
		{
			SwingUtilities.invokeLater(()->
			{
				JFrame frame=new JFrame("Parallel Line Algorithm");
				frame.setDefaultCloseOperation(
					JFrame.EXIT_ON_CLOSE);
				frame.add(new ParallelLinePanel());
				frame.setSize(400,400);
				frame.setVisible(true);
			});
		}

		static class ParallelLinePanel extends JPanel
			{
			private List<Line>lines=new ArrayList<>();
			public ParallelLinePanel()
			{
				lines.add(new Line(50,50,200,150));
				lines.add(new Line(50,70,200,170));
				lines.add(new Line(50,90,200,190));
				lines.add(new Line(50,110,200,210));
			}
			
			@Override
				protected void paintComponent(Graphics g)
			{
				super.paintComponent(g);
				drawParallelLines(g);
			}
			public void drawParallelLines(Graphics g)
			{
				for(Line line:lines)
				{
					int x1=line.x1;
					int y1=line.y1;
					int x2=line.x2;
					int y2=line.y2;
					int dx=Math.abs(x2-x1);
					int dy=Math.abs(y2-y1);
					int sx=x1<x2?1:-1;
					int sy=y1<y2?1:-1;
					int err=dx-dy;
					int x=x1;
					int y=y1;
					while(x!=x2||y!=y2)
					{
						g.fillRect(x,y,1,1);
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
						}
					}
				}
			}
			class Line{
				int x1,y1,x2,y2;
				public Line(int x1,int y1,int x2,int y2)
				{
					this.x1=x1;
					this.y1=y1;
					this.x2=x2;
					this.y2=y2;
				}
			}
		}
	}
	



