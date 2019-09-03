package ac.za.cput.adp3.xyzcongolmerate.factory.user;

import ac.za.cput.adp3.xyzcongolmerate.domain.user.UserRole;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserRoleFactoryTest {


    @Test
    public void buildUserRole() {
        UserRole user = UserRoleFactory.buildUserRole("user1@gmail.com", "Saaligha", "Logday");
        Assert.assertNotNull(user);
        Assert.assertNotNull(user.getRoleId());
        Assert.assertNotNull(user.getUserEmail());
        Assert.assertNotNull(user.getOrgCode());
        Assert.assertNotNull(user.hashCode());

    }
}