package com.tracebucket.moo.test.controller;

import com.tracebucket.moo.test.config.ApplicationTestConfig;
import com.tracebucket.moo.test.config.WebTestConfig;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.server.MockMvc;
import org.springframework.test.web.server.MvcResult;
import org.springframework.test.web.server.request.MockMvcRequestBuilders;
import org.springframework.test.web.server.setup.MockMvcBuilders;
import org.springframework.transaction.annotation.Transactional;

import static org.springframework.test.web.server.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.server.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.server.setup.MockMvcBuilders.annotationConfigSetup;

/**
 * @author FFL
 */
public class ContactControllerTest {

    private MockMvc mockMvc;

    @Before
    public void setup() {

        mockMvc = MockMvcBuilders
                .annotationConfigSetup(WebTestConfig.class, ApplicationTestConfig.class)
                .build();

    }

    @Test
    public void testFindOne() throws Exception {
        MvcResult result = mockMvc.perform(get("/contact/" + "24895735388168133615130329449")).andReturn();
        System.out.println("JSON = " + result.getResponse().getContentAsString());
    }
}
