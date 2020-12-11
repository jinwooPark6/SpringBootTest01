package com.example.demo.services;

import com.example.demo.domains.MemberDto;

import org.springframework.stereotype.Component;

@Component
public interface MemberService {
    public int join(MemberDto member);

	public MemberDto login(MemberDto member);
	

	
}
