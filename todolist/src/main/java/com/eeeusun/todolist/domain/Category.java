package com.eeeusun.todolist.domain;

import lombok.Getter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
public class Category {

    @Id @GeneratedValue
    @Column(name = "category_id")
    private int cateNo;
    private String cateContent;

    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL)
    private List<Todo> todos = new ArrayList<>();
}
