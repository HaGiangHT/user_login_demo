package com.example.user_login_demo.registration;

import java.util.function.Predicate;

import org.springframework.stereotype.Component;

@Component
public class EmailValidator implements Predicate<String> {
    @Override
    public boolean test(String s) {
        // TODO: Regex to validate email
        return true;
    }
}
