package com.app.domain.status;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.app.domain.member.MemberGender;

public enum PostStatus {
//	enum 상수 정의 시, 생성자 호출 
	ENABLE("enable"), DISABLE("disable");
	
//	enum 객체 필드 
	private final String value;

	
	private static final Map<String, PostStatus> POST_STATUS_MAP = 
			Stream.of(PostStatus.values()).collect(Collectors.toMap(PostStatus::getValue,(MG) -> MG ));
	
//	enum 객체의 필드 초기화
	private PostStatus(String value) {
		this.value = value;
	}
	public static PostStatus getEnum(String value) {
		return POST_STATUS_MAP.get(value);
	}
	

	public String getValue() {
		return value;
	}
	
	public String toString() {
		return value;
	}
	
}
