package ac.za.cput.adp3.xyzcongolmerate.factory.org;

import ac.za.cput.adp3.xyzcongolmerate.domain.org.Organisation;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class OrganisationFactoryTest {



    @Test
    public void buildOrganisation() {
        Organisation org = OrganisationFactory.buildOrganisation("OpenBox");
        Assert.assertNotNull(org);
        Assert.assertNotNull(org.getOrgCode());
        Assert.assertNotNull(org.hashCode());
        System.out.println("The organisation code is: "+org.getOrgCode());
    }
}