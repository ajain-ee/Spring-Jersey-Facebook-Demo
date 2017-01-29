package com.example;

import org.springframework.social.facebook.api.User;
import org.springframework.social.facebook.api.UserOperations;
import org.springframework.social.facebook.api.impl.FacebookTemplate;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Component
@Path("/")
public class FaceBookController {

    @GET
    @Path("/profile")
    public User getProfile() {
        final String accessToken = "// Added your accesstoken here";
        final UserOperations userOperations = new FacebookTemplate(accessToken).userOperations();
        final User userProfile = userOperations.getUserProfile();
        return userProfile;
    }

}
