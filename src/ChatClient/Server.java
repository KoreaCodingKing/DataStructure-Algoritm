package ChatClient;

import java.io.*;
import java.net.*;
import java.util.*;

class ChatThread extends Thread{
	private Socket sock;
	private String id;
	private BufferedReader br;
	private HashMap hm;
	
	public ChatThread(Socket sock, HashMap hm) {
		this.sock=sock;
		this.hm = hm;
		try {
			PrintWriter pw = new PrintWriter(new OutputStreamWriter(sock.getOutputStream()));
			br = new BufferedReader(new InputStreamReader(sock.getInputStream()));
			id = br.readLine();
			System.out.println(id + "님이 접속하였습니다.");
			synchronized (hm) {
				hm.put(this.id, pw);
			}
		} catch (IOException e) {
			System.out.println("클라이언트의 접속이 중단되었습니다. IOException오류");
			e.printStackTrace();
		} //try,catch
	}//생성자
	
	public void run() {
		String line = null;
		try {
			while((line=br.readLine())!=null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			synchronized (hm) {
				hm.remove(id);
			}
			System.out.println(id + "님이 접속 종료 하였습니다.");
				try {
					if(sock!=null) sock.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
	}//run()
}

public class Server {
	public static void main(String[] args) {
		try {
			ServerSocket servesock = new ServerSocket();
			HashMap hm = new HashMap();
			while(true){
				Socket sock = servesock.accept();	//클라이언트 올때까지 대기
				ChatThread chat = new ChatThread(sock, hm);
				chat.start();
			}
		} catch (IOException e) {
			System.out.println("클라이언트 연결이 예기치 않게 종료되었습니다.");
			e.printStackTrace();
		}
	}
}
