package com.github.lt0m.skeletons.project.features;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;

import com.github.lt0m.skeletons.project.SpringBootTestApplication;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@ContextConfiguration(classes=SpringBootTestApplication.class)
@ActiveProfiles(profiles = { "test" })
class SpringBootTestApplicationBase {

    @Autowired
    protected TestRestTemplate restTemplate;
}
