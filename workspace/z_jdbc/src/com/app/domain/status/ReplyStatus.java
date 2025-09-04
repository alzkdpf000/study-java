package com.app.domain.status;

import com.app.domain.member.MemberGender;

public enum ReplyStatus {
//	enum 상수 정의 시, 생성자 호출 
	ENABLE("enable"), DISABLE("disable");
	
//	enum 객체 필드 
	private final String value;
	
//	enum 객체의 필드 초기화
	private ReplyStatus(String value) {
		this.value = value;
	}

	
	public String getValue() {
		return value;
	}
	
	public String toString() {
		return value;
	}
	
}
