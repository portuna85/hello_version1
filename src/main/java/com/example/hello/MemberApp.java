package com.example.hello;

import com.example.hello.member.Grade;
import com.example.hello.member.Member;
import com.example.hello.member.MemberService;
import com.example.hello.member.MemberServiceImpl;

public class MemberApp {
    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        Member member = new Member(1L, "JSBAE", Grade.VIP);
        memberService.join(member);

        Member findMember = memberService.findMember(member.getId());
        System.out.println(findMember.getName());
        System.out.println(member.getName());
    }
}
