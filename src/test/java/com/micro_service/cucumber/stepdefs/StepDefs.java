package com.micro_service.cucumber.stepdefs;

import com.micro_service.SpringMicroServiceApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = SpringMicroServiceApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
