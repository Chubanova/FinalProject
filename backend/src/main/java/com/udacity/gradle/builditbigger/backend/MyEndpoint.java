package com.udacity.gradle.builditbigger.backend;

import com.example.jokejava.MyClass;
import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;

/** An endpoint class we are exposing */
@Api(
        name = "myApi",
        version = "v1",
        namespace = @ApiNamespace(
                ownerDomain = "backend.builditbigger.gradle.udacity.com",
                ownerName = "backend.builditbigger.gradle.udacity.com",
                packagePath = ""
        )
)
public class MyEndpoint {

    /** A simple endpoint method that says Joke  */
    @ApiMethod(name = "fetchJoke")
    public JokeBean fetchJoke(){

        MyClass myClass = new MyClass();
        JokeBean response = new JokeBean();
        response.setData(myClass.getJoke());
        return response;
    }

}
