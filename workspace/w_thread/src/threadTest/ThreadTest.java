package threadTest;

public class ThreadTest {
	public static void main(String[] args) {
////    각 쓰레드는 각자의 자원에 접근한다.
////    즉, 자원을 공유하지 않는다.
//		Thread1 thread1 = new Thread1("heart");
//		Thread1 thread2 = new Thread1("star");

//		이렇게 하면 멀티쓰레드가 아니라 단일쓰레드로 나오게 된다 
//		thread1.run(); 
//		thread2.run();

//		이렇게 스케쥴링을 해줘서 멀티쓰레드에 넣어줘야 한다.
//		thread1.start();
//		thread2.start();

//		다중 상속이 안되므로 Runnable로 사용한다. 
//		Runnable resource1 = new Thread2();
//		Runnable resource2 = new Thread2();
//		
//		Thread thread = new Thread(resource1,"?");
//		Thread threads= new Thread(resource2, "!");
//		thread.start();
//		threads.start();

//		자원 공유
//		Thread2 resource = new Thread2();
//		Thread2 resource = new Thread2();
//		Thread res = new Thread(()->{System.out.println(123);});
//
//		Thread thread1 = new Thread(resource, "??");
//		Thread thread2 = new Thread(resource, "!");
//		Thread thread3 = new Thread(resource, "/");
//
//		Runnable r = () -> {System.out.println(Thread.currentThread().getName());};
//		Thread thread4 = new Thread(r,"123");
//		thread4.start();

//		thread1.join() 설정하면 thread1이 실행되고 나서야 나머지가 실행 즉 먼저 하라고 알려줌 아직 시작 되지 않은 애들을 멈춤
		
//		쓰레드 종료
//		쓰레드를 정상 종료하기 위해서는 해당 쓰레드가 멈춰 있어야 한다.
//		쓰레드를 멈추는 sleep()과 같은 메소드는 항상 try ~ catch를 감싸주고
//		InterruptedException을 발생시켜 catch에 있는 종료 코드를 실행 
		Thread3 thread = new Thread3();
		Thread t1 = new Thread(thread,"?");
		Thread t2 = new Thread(thread,"!");
		Thread t3 = new Thread(thread,"~");
		
		t1.start();
		t2.start();
		t3.start();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}
		t1.interrupt();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}
		t2.interrupt();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}
		t3.interrupt();
		
	}
}

//package threadTest;
//
//public class ThreadTest {
//   public static void main(String[] args) {
////      각 쓰레드는 각자의 자원에 접근한다.
////      즉, 자원을 공유하지 않는다.
//      
////      Thread1 thread1 = new Thread1("♥");
////      Thread1 thread2 = new Thread1("★");
//      
////      thread1.run();
////      thread2.run();
//      
////      thread1.start();
////      thread2.start();
//      
////      Runnable resource1 = new Thread2();
////      Runnable resource2 = new Thread2();
////      
////      Thread thread1 = new Thread(resource1, "?");
////      Thread thread2 = new Thread(resource2, "!");
////      
////      thread1.start();
////      thread2.start();
//      
////      자원 공유
//      Thread2 resource = new Thread2();
//      
//      Thread thread1 = new Thread(resource, "&");
//      Thread thread2 = new Thread(resource, "|");
//      Thread thread3 = new Thread(resource, "~");
//      
//      thread1.start();
//      
//      try {thread1.join();} catch (InterruptedException e) {;}
//      
//      thread2.start();
//      thread3.start();
//      
//      System.out.println("main 쓰레드");
//   }
//}
//
//
//
//
//
//
//
//
//
//
//
//
//
//

