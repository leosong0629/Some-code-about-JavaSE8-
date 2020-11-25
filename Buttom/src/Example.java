import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Example extends JFrame {
	public void CreateFrame(String title) {
		JFrame jf=new JFrame(title);
		Container container=jf.getContentPane();
		JLabel jl=new JLabel("LIAOはイケメン");
		jl.setHorizontalAlignment(SwingConstants.CENTER);
		
		container.add(jl);
		container.setBackground(Color.white);
		jf.setVisible(true);
		jf.setSize(200,150);
		jf.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		new Example().CreateFrame("ウインド");
	}
}
