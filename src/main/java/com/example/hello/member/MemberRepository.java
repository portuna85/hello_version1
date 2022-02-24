package com.example.hello.member;

import com.example.hello.member.Member;

public interface MemberRepository {
    public void save(Member member);

    Member findById(Long memberId);
}
