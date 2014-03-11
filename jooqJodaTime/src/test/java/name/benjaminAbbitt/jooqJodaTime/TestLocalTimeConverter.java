package name.benjaminAbbitt.jooqJodaTime;


import org.joda.time.DateTime;
import org.joda.time.LocalDateTime;
import org.junit.Test;

import java.sql.Timestamp;

import static org.junit.Assert.assertEquals;

public class TestLocalTimeConverter {

    @Test
    public void testRoundTrip(){
        LocalDateTime expected = new LocalDateTime(2013, 11, 10, 13, 00, 00, 00);
        LocalDateTimeConverter converter = new LocalDateTimeConverter();
        Timestamp ts =  converter.to(expected);
        LocalDateTime actual = converter.from(ts);
        assertEquals(expected, actual);
    }

}
