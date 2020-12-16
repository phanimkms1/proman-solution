/*
package com.upgrad.technical.api.controller;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

import java.net.URL;

import UserDetailsResponse;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class UserAdminControllerIntegrationTest {

    @LocalServerPort
    private int port;
    private URL base;

    @Autowired
    private TestRestTemplate template;

    @Before
    public void setUp() throws Exception {
        this.base = new URL("http://localhost:" + port + "/api/users");
    }

    @Test
    public void getUser() throws Exception {
        final ResponseEntity<UserDetailsResponse> response = template.getForEntity(base.toString() + "/cdd59fd9-042f-4ddd-b7eb-6af03d810613",UserDetailsResponse.class);
        assertEquals(HttpStatus.OK,response.getStatusCode());
        final UserDetailsResponse responseBody = response.getBody();
        assertEquals(responseBody.getId(), expected().getId());
    }

    private UserDetailsResponse expected() {
        UserDetailsResponse response = new UserDetailsResponse();
        response.setId("cdd59fd9-042f-4ddd-b7eb-6af03d810613");
        return response;
    }

}
*/
