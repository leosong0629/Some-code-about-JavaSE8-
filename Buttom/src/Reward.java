import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Reward extends JFrame {
		public Reward() {
			setTitle("ようこそ、LIAOの宝くじ！！！");
			setLayout(null);
			setBounds(0,0,300,300);
			Container d=getContentPane();
			JButton b3=new JButton("選択1");
			JButton b4=new JButton("選択2");
			JButton b5=new JButton("選択3");
			b3.setBounds(10, 150, 50, 50);
			b4.setBounds(100, 150, 50, 50);
			b5.setBounds(200, 150, 50, 50);
			d.add(b3);
			d.add(b4);
			d.add(b5);
			
			b3.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent x) {
					// TODO 自動生成されたメソッド・スタブ
					JLabel l=new JLabel("残念、受賞していない！");
					l.setBounds(50, 250, 100, 50);
					d.add(l);
				}
			});
			
			b4.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent y) {
					// TODO 自動生成されたメソッド・スタブ
					JLabel j=new JLabel("残念、受賞していない！");
					j.setBounds(50, 250, 100, 50);
					d.add(j);
				}
			});
			
			b5.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO 自動生成されたメソッド・スタブ
					JLabel h=new JLabel("残念、受賞していない！");
					h.setBounds(50, 250, 100, 50);
					d.add(h);
				}
			});
		}
		public static void main(String[] args) {
			new Reward();
		}
	}
