package com.example.firstproject.controller;

//컨트롤러 선언과 동시에 자동으로 임포트

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


//컨트롤러 선언
@Controller
public class FirstController {
    //요청
    @GetMapping("/hi")
    //메서드 작성
    public String niceToMeetYou(){
        return "greetings";
    }
}
//greetings.mustache파일 반환