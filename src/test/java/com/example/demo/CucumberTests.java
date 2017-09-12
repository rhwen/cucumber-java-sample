package com.example.demo;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.test.context.web.WebAppConfiguration;

import cucumber.api.CucumberOptions;
import cucumber.api.PendingException;
import cucumber.api.java.zh_cn.*;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
	format = {"json:target/json-report/dw.json"},
	features = {"classpath:features/FixedAmountWithdraw.feature"},
	glue = {"com.example.demo.steps"}
)
@WebAppConfiguration
@SpringBootTest
public class CucumberTests {

}
