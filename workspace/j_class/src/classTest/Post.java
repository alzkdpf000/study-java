package classTest;

public class Post {
	int no;
	String title;
	String content;
	Reply[] arReply;
	int replyCnt;

	Post(int no, String title, String content, Reply[] arReply) {
		this.no = no;
		this.title = title;
		this.content = content;
		this.arReply = arReply;
		this.replyCnt = arReply.length;
	}
}
