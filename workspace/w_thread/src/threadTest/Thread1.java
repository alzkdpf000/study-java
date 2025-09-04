package threadTest;
// 1번 방식을 사용 

public class Thread1 extends Thread {
	private String data;
	
	
	
	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}


	public Thread1(String data) {
		this.data = data;
	}

	public Thread1() {;}


	@Override
	public void run() {
//		쓰레드가 접근하는 자원
		for(int i = 0; i<10;i++) {
			System.out.println(data);
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
