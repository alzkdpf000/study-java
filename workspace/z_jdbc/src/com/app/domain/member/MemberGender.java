package com.app.domain.member;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum MemberGender {
	MAN("남"),WOMAN("여"), NONE("선택안함");
	
	private final String value;
	
//	기존에 있던 상수들을 MAP으로 변경한다
//	기존에 있던 enum객체들의 getValue가 key로
//	enum객체를 value로 설정한다.
	private static final Map<String, MemberGender> MEMBER_GENDER_MAP = 
			Stream.of(MemberGender.values())
			.collect(Collectors.toMap(MemberGender::getValue,(MG) -> MG ));
	
	private MemberGender(String value) {
		this.value = value;
	}
	public String getValue() {
		return value;
	}
	public static MemberGender getEnum(String value) {
		return MEMBER_GENDER_MAP.get(value);
	}
	
//  public static MemberGender getEnum(String value) {
//  for(MemberGender memberGender : MemberGender.values()) {
//     if(memberGender.value.equals(value)) {
//        return memberGender;
//     }
//  }
//  return null;
//}
	@Override
	public String toString() {
		return value;
	}
}
