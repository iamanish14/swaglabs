package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\com\\swaglabs\\swaglab.feature",
glue={"com.stepdefenition","com.hooks"},
dryRun=false,
plugin = {"html:report/swaglabs.html","json:report/swaglabs.json","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
publish = true,
monochrome = true



)

public class Runner {

}
