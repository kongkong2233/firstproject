package com.example.firstproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController { //MV'C'

    @GetMapping("/hi")
    public String niceToMeetYou(Model model) {
        model.addAttribute("username", "yubin"); // 'M'VC
        return "greetings"; //templets/greetings.mustache -> 브라우저로 전송 // M'V'C
    }

    @GetMapping("/bye")
    public String seeYouNext(Model model) {
        model.addAttribute("nickname", "유빈");
        return "goodbye";
    }
}
