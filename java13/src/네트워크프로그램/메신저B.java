package 네트워크프로그램;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class 메신저B extends JFrame {
	// 선언의 위치가 생존의 범위
	DatagramSocket socket;
	JTextArea list;
	JTextField input;
	
	public 메신저B() {
		try {
			socket = new DatagramSocket(5555);
		} catch (SocketException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		list = new JTextArea();
		input = new JTextField();
		add(list, BorderLayout.CENTER);
		add(input, BorderLayout.SOUTH);
		setTitle("메신저B");
		setSize(300, 300);
		list.setBackground(Color.pink);
		input.setBackground(Color.cyan);
		
		Font font = new Font("궁서", Font.BOLD, 30);
		list.setFont(font);
		input.setFont(font);
		
		input.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 1. 입력한 것 가지고오세요.
				String s = input.getText();
				
				try {
					// UDP용 소켓이 있어야 함.
					DatagramSocket socket = new DatagramSocket(); // 전화기 역할
					
					// UDP용 패킷이 있어야 함. (데이터, 데이터의 크기, ip, port)
					byte[] data = s.getBytes();
					// localhost == 127.0.0.1 ==> 자기 pc의 ip
					InetAddress ip = InetAddress.getByName("127.0.0.1");
					DatagramPacket packet = new DatagramPacket(data, data.length, ip, 7777);
					
					// 소켓을 이용해서 패킷을 보낸다.!!
					list.append("나>> " + s + "\n");
					input.setText("");
					socket.send(packet);
					socket.close(); // 전화기를 끊는다.!
				} catch (Exception e2) {
					// TODO: handle exception
				}
				
			}
		});
		
		setVisible(true);
	}
	
	// 받는 부분을 무한루프 먼저 실행해야 한다.
	public void process() {
		while (true) {
			try {
				// 1. 받는 소켓 있어야 한다. (port)

				System.out.println("받을 준비중....");
				
				// 2. 패킷으로 보냈기 때문에 빈 패킷을 만들어두면,
				//    빈 패킷안에는 빈 byte[]이 있어야 한다.
				byte[] data = new byte[256];
				DatagramPacket packet = new DatagramPacket(data, data.length);
				
				// 3. 소켓이 받아서 빈 패킷에 넣는다.
				socket.receive(packet);
				
				// 4. byte[]에 있는 String으로 바꾸어준다.
				list.append("너>> " + new String(data) + "\n");
			} catch (SocketException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
	public static void main(String[] args) {
		메신저B name = new 메신저B();
		name.process();
	}

}
