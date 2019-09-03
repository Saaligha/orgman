package ac.za.cput.adp3.xyzcongolmerate.factory.user;

import ac.za.cput.adp3.xyzcongolmerate.domain.user.UserDemography;
import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

public class UserDemographyFactoryTest {
    java.util.Date date = new java.util.Date();

    @Test
    public void buildUserDemography() {
Date date = new Date();
        /**
         * Your implementation goes here
         *
         * INSTRUCTION
         * 1. Remove line [//TODO: implement method body ONLY!]
         * 2. Remove line [throw new UnsupportedOperationException("Not yet supported.");]
         * 3. Test the UserDemographyFactory class
         * 4. Assert that the an object is created.
         */
        UserDemography userDem = UserDemographyFactory.buildUserDemography("2154641@cput.ac.za", "Student", "F", "254",(date));

        Assert.assertNotNull(userDem);
        Assert.assertNotNull(userDem.getUserEmail());
        System.out.println("The User Demography Email is: " + userDem.getUserEmail());
    }
}