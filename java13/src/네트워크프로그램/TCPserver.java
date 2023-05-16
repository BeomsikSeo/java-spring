package 네트워크프로그램;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPserver {

	public static void main(String[] args) throws Exception {
		// 1. 승인용 소켓을 만들어주자.
		// 2. 서버는 계속 살아있게 하기 위해 무한루프
		// 3. 요청이 있으면 승인을 해주고, 
		//    통신할 수 있는 소켓을 만들어주자.!
		ServerSocket server = new ServerSocket(9100); // port
		System.out.println("승인용 서버 소켓이 시작됨.");
		System.out.println("클라이언트 연결을 기다리는 중.");
		int count = 0;
		while (true) {
			Socket socket = server.accept(); // Socket
			count++; // 클라이언트가 요청한 만큼!!
			System.out.println(count + ">> 승인완료! Socket 생성됨.!");
		}

	}

}
