import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;




public class AbsolutePostion extends JFrame{
	public class Reward extends JFrame {
		public Reward() {
			JFrame jf=new JFrame();
			jf.setTitle("ようこそ、LIAOの宝くじ！！！");
			jf.setLayout(null);
			jf.setBounds(0,0,600,600);
			Container d=jf.getContentPane();
			JButton b3=new JButton("選択1");
			JButton b4=new JButton("選択2");
			JButton b5=new JButton("選択3");
			
			int u=new java.util.Random().nextInt(9);
			JTextField l=new JTextField("",50);
			JTextField X=new JTextField("", 50);
			l.setBounds(50, 250, 200, 50);
			d.add(l);
			l.setVisible(true);
			b3.setBounds(10, 150, 70, 50);
			b4.setBounds(100, 150, 70, 50);
			b5.setBounds(200, 150, 70, 50);
			X.setBounds(10, 300, 200, 50);
			jf.setVisible(true);
			setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
			d.add(b3);
			d.add(b4);
			d.add(b5);
			d.add(X);
			
			
			b3.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent x) {
					// TODO 自動生成されたメソッド・スタブ
				String m=l.getText();
				int p=Integer.parseInt(m);
				l.setText(" ");
				X.setText("");
				X.setText("本日の受賞ナンバーは"+u);
				if(p!=u) {
				l.setText("残念、受賞していない！！");
				}
				if(p==u) {
				l.setText("おめでとうございます！");
				}
				}
			});
			
			b4.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent y) {
					// TODO 自動生成されたメソッド・スタブ
					String m=l.getText();
					int p=Integer.parseInt(m);
					X.setText("");
					X.setText("本日の受賞ナンバーは"+u);
					l.setText(" ");
					if(p!=u) {
					l.setText("残念、受賞していない！！");
					}
					if(p==u) {
					l.setText("おめでとうございます！");
					}
				}
			});
			
			b5.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO 自動生成されたメソッド・スタブ
					String m=l.getText();
					int p=Integer.parseInt(m);
					l.setText(" ");
					X.setText("");
					X.setText("本日の受賞ナンバーは"+u);
					if(p!=u) {
					l.setText("残念、受賞していない！！");
					}
					if(p==u) {
					l.setText("おめでとうございます！");
					}
				}
			});
		}
	}
	
	
	public AbsolutePostion() {
		setTitle("絶対");
		setLayout(null);
		setBounds(0,0,800,800);
		Container c=getContentPane();
		JButton b1=new JButton("確定");
		JButton b2=new JButton("削除");
		JLabel jl=new JLabel("名前");
		JLabel j2=new JLabel("年齢");
		JTextField jt=new JTextField("",40);
		JTextField jt2=new JTextField(" ",40);
		b1.setBounds(30,240,100,20);
		b2.setBounds(330,240,100, 20);
		jl.setBounds(10, 10, 40, 40);
		jt.setBounds(80,10, 100, 40);
		j2.setBounds(10, 60, 40, 40);
		jt2.setBounds(80,60, 100, 40);
		c.add(b1);
		c.add(b2);
		c.add(jl);
		c.add(jt);
		c.add(j2);
		c.add(jt2);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		b1.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 自動生成されたメソッド・スタブ
				String Q=jt.getText();
				String Y=jt2.getText();
				jt.requestFocus();
				JTextField J3=new JTextField(Y+"歳の"+Q+"さんようこそ、宝くじをやりませんか");
				J3.setVisible(true);
				J3.setBounds(10, 200, 300, 40);
				c.add(J3);
				JButton y=new JButton("はい");
				JButton n=new JButton("いいえ");
				y.setBounds(100, 300, 80, 40);
				n.setBounds(300, 300, 80, 40);
				c.add(y);
				c.add(n);
				y.setVisible(true);
				n.setVisible(true);
				y.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent t) {
						// TODO 自動生成されたメソッド・スタブ
						new Reward();
					}
				});
				
				
				n.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent p) {
						// TODO 自動生成されたメソッド・スタブ
						c.remove(y);
						c.remove(n);
						c.remove(J3);
					}
				});
				
				
			}
		});
		
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent i) {
				// TODO 自動生成されたメソッド・スタブ
				jt.setText("");
				jt2.setText("");
				jt.requestFocus();
			}
		});
		
	}
	
	
	public static void main(String[] args) {
		new AbsolutePostion();
	}
}


