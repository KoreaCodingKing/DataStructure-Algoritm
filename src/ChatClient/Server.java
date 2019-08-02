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
			System.out.println(id + "���� �����Ͽ����ϴ�.");
			synchronized (hm) {
				hm.put(this.id, pw);
			}
		} catch (IOException e) {
			System.out.println("Ŭ���̾�Ʈ�� ������ �ߴܵǾ����ϴ�. IOException����");
			e.printStackTrace();
		} //try,catch
	}//������
	
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
			System.out.println(id + "���� ���� ���� �Ͽ����ϴ�.");
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
				Socket sock = servesock.accept();	//Ŭ���̾�Ʈ �ö����� ���
				ChatThread chat = new ChatThread(sock, hm);
				chat.start();
			}
		} catch (IOException e) {
			System.out.println("Ŭ���̾�Ʈ ������ ����ġ �ʰ� ����Ǿ����ϴ�.");
			e.printStackTrace();
		}
	}
}
