package com.example.firstproject.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.web.bind.annotation.GetMapping;
@AllArgsConstructor
@NoArgsConstructor // 기본 생성자 추가 어노테이션
@ToString
@Entity //엔티티 선언
public class Article {
    @Id // 엔티티의 대푯값 지정
    @GeneratedValue
    private Long id;
    @Column // title 필드 선언
    private String title;
    @Column // content 필드 선언
    private String content;




}
