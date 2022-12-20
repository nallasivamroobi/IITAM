package org.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src\\test\\resources\\adactin.feature"},glue= {"org.stepdef"},monochrome=true,
                            dryRun=false,plugin= {"html:Report\\WebReport"})  


public class AdactinRunner {

}
