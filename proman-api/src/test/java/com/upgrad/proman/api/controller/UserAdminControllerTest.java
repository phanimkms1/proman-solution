/*
package com.upgrad.technical.api.controller;

import UserDetailsResponse;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc

public class UserAdminControllerTest {

    @Autowired
    private MockMvc mvc;

    @Test
    public void getUser() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/user/cdd59fd9-042f-4ddd-b7eb-6af03d810613"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("id")
                        .value("cdd59fd9-042f-4ddd-b7eb-6af03d810613"));
    }

    private UserDetailsResponse mock(){
        return new UserDetailsResponse().id("cdd59fd9-042f-4ddd-b7eb-6af03d810613");
    }
}
*/
