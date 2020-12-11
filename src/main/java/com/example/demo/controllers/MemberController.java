package com.example.demo.controllers;

import java.util.HashMap;
import java.util.Map;

import com.example.demo.domains.MemberDto;
import com.example.demo.services.MemberService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {
    @Autowired MemberService memberService;
    @PostMapping("/members")
    public Map<?,?> join(@RequestBody MemberDto member){
        var map = new HashMap<>();
        int result = memberService.join(member);
        if(result == 1){
            map.put("message", "SUCCESS");
        }else{
            map.put("message", "FAILURE");
        }
        return map;
    }
    @PostMapping("/members/login")
    public Map<?, ?> login(@RequestBody MemberDto member){
        var map = new HashMap<>();
        MemberDto result = MemberService.login(member);
        if(result != null){
            map.put("message", "SUCCESS");
            map.put("loginMember",result);
            
        }else{
            map.put("message","FAILURE");
            map.put("loginMember", null);
        }

        return map;
    }
}
