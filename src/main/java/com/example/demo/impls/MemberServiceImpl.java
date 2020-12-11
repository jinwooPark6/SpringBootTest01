package com.example.demo.impls;

import com.example.demo.domains.MemberDto;
import com.example.demo.repositories.MemberRepository;
import com.example.demo.services.MemberService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements MemberService {
@Autowired MemberRepository memberRepository;
@Autowired MemberDto member;
    @Override
    public int join(MemberDto member) {
        
        return memberRepository.insert(member);
    }

    @Override
    public MemberDto login(MemberDto member) {
         return memberRepository.login(member);
    }

    
    
}
