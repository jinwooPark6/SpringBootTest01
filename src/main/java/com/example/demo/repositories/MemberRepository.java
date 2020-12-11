package com.example.demo.repositories;

import com.example.demo.domains.MemberDto;

import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository {

	int insert(MemberDto member);

	MemberDto join(MemberDto member);

	MemberDto login(MemberDto member);
    
}
