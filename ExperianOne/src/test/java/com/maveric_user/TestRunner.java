package com.maveric_user;

import org.junit.runner.RunWith;

import com.intuit.karate.KarateOptions;
import com.intuit.karate.junit4.Karate;



@RunWith(Karate.class)
@KarateOptions(tags= {"~@Smoke","~@SBL"})  // ~ will skip the particular scenarios or feature file
public class TestRunner {

}
