package com.topichief.topichief.cucumber;

import com.topichief.topichief.TopiChiefApp;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.web.WebAppConfiguration;

@CucumberContextConfiguration
@SpringBootTest(classes = TopiChiefApp.class)
@WebAppConfiguration
public class CucumberTestContextConfiguration {}
