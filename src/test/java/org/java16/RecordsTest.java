package org.java16;

import org.java16.records.LocationRecord;
import org.java16.records.StadiumRecord;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RecordsTest {

    @Test
    public void testLocationRecord(){
        LocationRecord locationRecord = new LocationRecord("India","Dharmshala",32.180570,76.309240);

        assertEquals(locationRecord.country(),"India");
        assertEquals(locationRecord.city(),"Dharmshala");
        assertEquals(locationRecord.latitude(),32.180570);
        assertEquals(locationRecord.longitude(),76.309240);
        System.out.println(locationRecord.toString());

        String outputTextBlock = """
                LocationRecord[country=India, city=Dharmshala, latitude=32.18057, longitude=76.30924]""";
        assertEquals(locationRecord.toString(),outputTextBlock);
    }

    @Test
    public void testStadiumRecord(){
        LocationRecord locationRecord = new LocationRecord("India","Dharmshala",32.180570,76.309240);
        StadiumRecord stadiumRecord = new StadiumRecord("Himachal Pradesh Cricket Association Stadium", "Himachal Pradesh", 21200, locationRecord);

        assertEquals(stadiumRecord.name(),"Himachal Pradesh Cricket Association Stadium");
        assertEquals(stadiumRecord.team(), "Himachal Pradesh");
        assertEquals(stadiumRecord.capacity(),21200);
        assertEquals(locationRecord.country(),"India");
        assertEquals(locationRecord.city(),"Dharmshala");
        assertEquals(locationRecord.latitude(),32.180570);
        assertEquals(locationRecord.longitude(),76.309240);
        System.out.println(stadiumRecord.toString());

        String outputTextBlock = """
                StadiumRecord[name=Himachal Pradesh Cricket Association Stadium, team=Himachal Pradesh, capacity=21200, locationRecord=LocationRecord[country=India, city=Dharmshala, latitude=32.18057, longitude=76.30924]]""";
        assertEquals(stadiumRecord.toString(),outputTextBlock);
    }
}
