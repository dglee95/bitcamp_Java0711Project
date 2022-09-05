package test.day0726;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicOptionPaneUI.ButtonActionListener;

public class Ex4Frame extends JFrame {

	public Ex4Frame() {
		super("Hello");
		this.setLocation(500, 100);//시작좌표
		this.setSize(300, 300);//프레임의 너비,높이
		//메서드 호출할땐 visible 되기전에 줘야함
		this.initDesign();//없는거는 컨트롤1번으로 생성해야함
		
		this.setVisible(true);//true면 보이는거 false는 안보이는거
		//X눌렀을때 종료되는게 아닌 false로 되고 콘솔은 여전히 실행중인것
		
		
		//종료 이벤트
		this.addWindowListener(new WindowAdapter() {//Adapter는 원하는것만 Override하면 되고 Listener는 모두 Override해야함
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(Ex4Frame.this, "종료합니다");
				System.exit(0);
				super.windowClosing(e);
			}
		});
	}
	
	private void initDesign() {
		// TODO Auto-generated method stub
		//기본 레이아웃 설정 없애기
		this.setLayout(null);
		JButton btn1=new JButton("빨강색");
		btn1.setBounds(20, 20, 80, 30);//x좌표 y좌표 width height
		//프레임에 추가
		this.add(btn1);
		//버튼이벤트
		//클래스를 따로 만들어서 implements를 받아서 구현할 수 도 있음
		//버튼이벤트-익명내부클래스 형태로 이벤트 설정
		btn1.addActionListener(new ActionListener() {//익명 내부 클래스
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Ex4Frame.this.getContentPane().setBackground(Color.red);
			}
		
			
			
		});
		JButton btn2=new JButton("노란색");
		btn2.setBounds(105, 20, 80, 30);//x좌표 y좌표 width height
		//프레임에 추가
		this.add(btn2);
		//버튼이벤트
		//클래스를 따로 만들어서 implements를 받아서 구현할 수 도 있음
		//버튼이벤트-익명내부클래스 형태로 이벤트 설정
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Ex4Frame.this.getContentPane().setBackground(Color.yellow);
			}
		});
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex4Frame ex=new Ex4Frame();
	}

}
