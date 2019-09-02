package ac.za.cput.adp3.xyzcongolmerate.factory.user;

import ac.za.cput.adp3.xyzcongolmerate.domain.user.User;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserFactoryTest {

    //TODO: implement method body ONLY!
    @Test
    public void buildUser() {
        User user = UserFactory.buildUser("user1@gmail.com", "Saaligha", "Logday");
        Assert.assertNotNull(user);
        Assert.assertNotNull(user.hashCode());
        Assert.assertNotNull(user.getFirstName());
        Assert.assertNotNull(user.getLastName());
        Assert.assertNotNull(user.getUserEmail());
    }
}