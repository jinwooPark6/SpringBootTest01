package com.example.demo.domains;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Component @Setter @Getter
public class MemberDto {
    private String memberId, password, name;
    
}
