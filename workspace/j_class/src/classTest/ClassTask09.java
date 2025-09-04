package classTest;

//	게시글과 댓글 정보를 받아서 추가한다.
//	게시글에서는 댓글의 전체 개수를 계산할 수 있다.

//	게시글(POST)
//	번호
//	제목
//	내용

//	댓글(Reply)
//	번호
//	내용
public class ClassTask09 {
	public static void main(String[] args) {
		Reply[] arReply = { 
				new Reply(0, "hihi"), 
				new Reply(1, "byebye"), 
				new Reply(2, "gogo") 
				};
		Post post = new Post(0, "heell", "content", arReply);

		System.out.println(post.replyCnt);
		
	}
}
