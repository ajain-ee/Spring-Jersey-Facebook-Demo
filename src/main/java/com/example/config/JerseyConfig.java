package com.example.config;

import com.example.FaceBookController;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@Configuration
public class JerseyConfig extends ResourceConfig{

    public JerseyConfig() {
        register(FaceBookController.class);
    }
}
