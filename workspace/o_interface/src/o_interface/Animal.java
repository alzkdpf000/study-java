package o_interface;

public interface Animal {
	// final static이 생략되어 있다.
	int eyes = 2;
	final static int nose = 1;
	
	void showHands(); 
	abstract void sitDown();
	void poop();
	void waitNow();
}
