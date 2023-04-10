package practice;

	import java.awt.event.KeyAdapter;
	import java.awt.event.KeyEvent;
	import java.awt.event.MouseAdapter;
	import java.awt.event.MouseEvent;
	import javax.swing.JButton;
	import javax.swing.JFrame;

	public class prac1 extends JFrame{
		
		public prac1() {
			// TODO 자동 생성된 생성자 스텁
			setTitle("이벤트");// 타이틀 
			setSize(1280,720); //창의 크기
			setVisible(true); //창이 화면에 보이게 해줌
			setResizable(false); //창의 크기를 변경하지 못하게 해줌
			setLocationRelativeTo(null); // 창을 실행할때 가운데 나타나게 해줌
			final JButton b1=new JButton("움직이는 버튼"); //버튼을 하나 만듬
			setLayout(null);
			/*버튼이 움직이게 해줌*/
			addKeyListener(new KeyAdapter() { //키 이벤트
				@Override
				public void keyPressed(KeyEvent e) { //키 눌렀을때
					// TODO Auto-generated method stub
					switch (e.getKeyCode()) {//키 코드로 스위치
					case KeyEvent.VK_DOWN: //방향키(아래) 눌렀을때
						b1.setLocation(b1.getX(), b1.getY()+10);
						break;
					case KeyEvent.VK_UP: //방향키(위)눌렀을때
						b1.setLocation(b1.getX(), b1.getY()-10);
						break;
					case KeyEvent.VK_LEFT:// 방향키(왼)눌렀을때
						b1.setLocation(b1.getX()-10, b1.getY());
						break;
					case KeyEvent.VK_RIGHT:// 방향키(오른)눌렀을때
						b1.setLocation(b1.getX()+10, b1.getY());
						break;
					default:
						break;
					}
				}
			});
			b1.addMouseListener(new MouseAdapter() { // 마우스 이벤트
				@Override
				public void mouseEntered(MouseEvent e) { // 마우스 들어왔을때
				}

				@Override
				public void mouseExited(MouseEvent e) { // 마우스 나왔을때
				}

				@Override
				public void mousePressed(MouseEvent e) { // 클릭했을때
					System.exit(0);
				}
			});
			b1.setBounds(0, 0, 150, 30); //버튼의 크기 위치 지정
			add(b1); //버튼을 프레임에 추가
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//창이 정상적으로 종료되게 해줌
		}
		public static void main(String[] args) {
			new Event(); //실행
		}
	}

