package com.eeeusun.todolist.domain;

import lombok.Getter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
public class Member {

    @Id @GeneratedValue
    @Column(name = "member_id")
    private int memNo;
    private  String memId;
    private String memPwd;
    private String nickname;
    private String email;

    @Enumerated(EnumType.STRING)
    private MemberStatus memberStatus;

    @OneToMany(mappedBy = "member")
    private List<Todo> todos = new ArrayList<>();
}
