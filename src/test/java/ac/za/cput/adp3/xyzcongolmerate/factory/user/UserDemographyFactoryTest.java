package ac.za.cput.adp3.xyzcongolmerate.factory.user;

import ac.za.cput.adp3.xyzcongolmerate.domain.user.UserDemography;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserDemographyFactoryTest {
    java.util.Date date = new java.util.Date();

    @Test
    public void buildUserDemography() {

        /**
         * Your implementation goes here
         *
         * INSTRUCTION
         * 1. Remove line [//TODO: implement method body ONLY!]
         * 2. Remove line [throw new UnsupportedOperationException("Not yet supported.");]
         * 3. Test the UserDemographyFactory class
         * 4. Assert that the an object is created.
         */
        UserDemography userDem = UserDemographyFactory.buildUserDemography("2154641@cput.ac.za", "Student", "F", "254",(1994-05-13));

    }
}