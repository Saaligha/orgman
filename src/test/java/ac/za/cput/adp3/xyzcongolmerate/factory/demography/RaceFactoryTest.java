package ac.za.cput.adp3.xyzcongolmerate.factory.demography;

import ac.za.cput.adp3.xyzcongolmerate.domain.demography.Race;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RaceFactoryTest {

    @Test
    public void buildRace() {
        Race race = RaceFactory.buildRace("Indian");
        Assert.assertNotNull(race);
        Assert.assertNotNull(race.getRaceId());
        System.out.println("The race id is: " + race.getRaceId());

    }
}