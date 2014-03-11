package name.benjaminAbbitt.jooqJodaTime;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.junit.Before;
import org.junit.Test;

import java.sql.Timestamp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class TestDateTimeConverter {
    private DateTimeConverter dateTimeConverter;

    @Before
    public void setup() {
        this.dateTimeConverter = new DateTimeConverter();
    }


    @Test
    public void testSqlTimeStampShouldResolveToDateTime() {
        Timestamp ts = new Timestamp(1393980473000L);
        DateTime expected = new DateTime(2014, 03, 05, 0, 47, 53, DateTimeZone.UTC);
        DateTime actual = dateTimeConverter.from(ts);
        assertTrue(expected.isEqual(actual));
    }

    @Test
    public void testDateTimeShouldResolveToSqlTimeStamp() {
        Timestamp expected = new Timestamp(1393980473000L);
        DateTime dt = new DateTime(2014, 03, 05, 0, 47, 53, DateTimeZone.UTC);
        Timestamp actual = dateTimeConverter.to(dt);
        assertEquals(expected, actual);
    }

    @Test
    public void testFromTypeShouldBeTimestamp() {
        assertEquals(dateTimeConverter.fromType(), Timestamp.class);
    }

    @Test
    public void testToTypeShouldBeDateTime() {
        assertEquals(dateTimeConverter.toType(), DateTime.class);
    }
}
