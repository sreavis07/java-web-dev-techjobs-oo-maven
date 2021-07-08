package com.company.incomplete;

import com.company.*;
import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class JobTests {
    // you can rename the tests, or delete them and rewrite them from scratch, but I went ahead and provided you the names of tests I created -- I followed the writeup pretty honestly
    Job test_job1;
    Job test_job2;
    Job test_job3;

    @BeforeEach
    public void createJobObject() {
        test_job1 = new Job( "Junior Data Analyst", new Employer( "Lockerdome" ), new Location( "Saint Louis" ), new PositionType( "Data Scientist/ Business Intelligence" ), new CoreCompetency( "Statistical Analysis" ) );
        test_job2 = new Job( "Project Coordinator Support", new Employer( "Maritz" ), new Location( "Saint Louis" ), new PositionType( "Technical Assistant / User Support" ), new CoreCompetency( "Non-coding" ) );
        test_job3 = new Job( "Junior Web Developer", new Employer( "Cozy" ), new Location( "" ), new PositionType( "Web - Front End" ), new CoreCompetency( "" ));
    }


    @Test
    public void testSettingJobId() {
        assertEquals( 1, test_job1.getId(), .001 );
        assertEquals( 2, test_job2.getId(), .001 );
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        assertEquals( "Junior Data Analyst", test_job1.getName() );
        assertEquals( "Lockerdome", test_job1.getEmployer().getValue() );
        assertEquals( "Saint Louis", test_job1.getLocation().getValue() );
        assertEquals( "Data Scientist/ Business Intelligence", test_job1.getPositionType().getValue() );
        assertEquals( "Statistical Analysis", test_job1.getCoreCompetency().getValue() );

    }

    @Test
    public void testJobsForEquality() {
        assertFalse( test_job1 == test_job2 );

    }

    // I found the instructions around the three toString() tests a little confusing, so I created three tests following the three bullet points:
    // you can follow TDD if you want, or you can write the implementation first and then get the tests to pass, either is a fine approach
    @Test
    public void testToStringIsFormattedProperly() {
        String expectedToStringOutput =
                "\n" +
                        "ID: 1\n" +
                        "Name: Junior Data Analyst\n" +
                        "Employer: Lockerdome\n" +
                        "Location: Saint Louis\n" +
                        "Position Type: Data Scientist/ Business Intelligence\n" +
                        "Core Competency: Statistical Analysis\n";
        assertEquals( expectedToStringOutput, test_job1.toString() );


    }

    @Test
    public void testToStringDataNotAvailable() {
        String expectedToStringOutput =
                "\n" +
                "ID: 3\n" +
                        "Name: Junior Web Developer\n" +
                        "Employer: Cozy\n" +
                        "Location: Data Not Available\n" +
                        "Position Type: Web - Front End\n" +
                        "Core Competency: Data Not Available\n";
        assertEquals(expectedToStringOutput, test_job3.toString());

    }
}
