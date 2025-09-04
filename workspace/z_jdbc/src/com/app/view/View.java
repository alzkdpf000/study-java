package com.app.view;

import java.sql.Connection;

import com.app.config.DBConnecter;
import com.app.domain.MemberVO;
import com.app.domain.PostVO;
import com.app.domain.member.MemberGender;
import com.app.domain.status.MemberStatus;
import com.app.exception.MemberNotFoundException;
import com.app.repogitory.MemberDAO;
import com.app.repogitory.PostDAO;

public class View {
	public static void main(String[] args) {
		MemberDAO memberDAO = new MemberDAO();
		MemberVO memberVO = new MemberVO();
		PostDAO postDAO = new PostDAO();
		PostVO postVO = new PostVO();
//		postDAO.deleteHard(1L);
		postVO.setPostReadCnt(1);
		postVO.setPostTitle("update1");
		postVO.setPostContent("update1");
		postVO.setId(2L);
		postDAO.update(postVO);
//		memberVO.setMemberEmail("test@gmail.com");
//		memberVO.setMemberPassword("1234");
//		memberVO.setMemberGender("남");
//		memberVO.setMemberName("test");
//		memberVO.setMemberAge(10);
//		memberDAO.insert(memberVO);
		
//		postVO.setPostContent("content1");
//		postVO.setPostTitle("title1");
//		postVO.setMemberId(2L);
//		postDAO.insert(postVO);
//		
//		postVO.setPostContent("content2");
//		postVO.setPostTitle("title2");
//		postVO.setMemberId(2L);
//		postDAO.insert(postVO);
		
//		memberDAO.deleteHard(1L);
//		DBConnecter.getConnection();
		
//		memberDAO.selectOne(1L).orElseThrow(MemberNotFoundException::new);
//		System.out.println(MemberGender.values());
//		for(MemberGender memberGender )
	}
}
