package ChatClient;

import java.io.*;
import java.net.*;
import java.util.*;

class InputThread extends Thread{
	private Socket sock = null;
	private BufferedReader br = null;
	

	public InputThread(Socket sock, BufferedReader br) {
		this.sock=sock;
		this.br=br;
	}
	
	public void run() {
		String line=null;
		try {
			while((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
				try {
					if(br!=null)
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
				try {
					if(sock!=null)
					sock.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}//finally
	}//run()
}//Thread

public class Client {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("사용할 아이디를 입력하세요");
		String id = sc.next();
		args = new String[] {id, "127.0.0.1"};
		
		Socket sock = null;
		BufferedReader br = null;
		PrintWriter pw = null;
		boolean close = false;
		
		try {
			sock = new Socket(args[1],8080);
			OutputStream out = sock.getOutputStream();
			InputStream in = sock.getInputStream();
			pw = new PrintWriter(new OutputStreamWriter(out));
			br = new BufferedReader(new InputStreamReader(in));	
			BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
			pw.print(args[0]);
			pw.flush();
			
			InputThread ithread = new InputThread(sock, br);
			ithread.start();
			String line=null;
			while((line=keyboard.readLine()) !=null) {
				pw.println(line);
				pw.flush();
				if(line.equals("/quit")) {
					close=true;
					break;
				}
			}
		} catch (IOException e) {
			if(!close)
				System.out.println(e);
		}finally {
				try {
					if(pw!=null) 
						pw.close();
					if(br!=null)
						br.close();
					if(sock!=null) 
						sock.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}//finally
	}//main
}//client
