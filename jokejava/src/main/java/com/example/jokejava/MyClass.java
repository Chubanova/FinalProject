package com.example.jokejava;

import java.util.Random;

public class MyClass {

    private String[] jokes = {
            "Even though it doesn't work, how does it feel?",
            "I thought he knew the context of what I was talking about",
            "I broke that deliberately to do some testing",
            "Our redundant systems must have failed as well",
            "That feature would be outside of the scope",
            "Oh, that was only supposed to be a placeholder",
            "Your browser must be caching the old content"
    };

    public String getJoke() {
        Random random = new Random();
        return jokes[random.nextInt(jokes.length)];
    }

}
