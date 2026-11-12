package com.example.demo.used;

import org.springframework.stereotype.Component;

/**
 * 아침 인사하기
 */
public class MorningGreet implements Greet {
    @Override
    public String greeting() {
        return "좋은 아침입니다.";
    }
}
