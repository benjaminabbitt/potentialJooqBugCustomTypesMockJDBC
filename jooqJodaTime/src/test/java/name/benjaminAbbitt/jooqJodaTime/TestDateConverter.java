package name.benjaminAbbitt.jooqJodaTime;


import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.junit.Test;

import java.sql.Date;

import static org.junit.Assert.assertEquals;

public class TestDateConverter {
    @Test
    public void roundTripDate(){
        DateTime dt = new DateTime(2013, 11, 10, 14, 00, 00, 00);
        LocalDate expected = dt.toLocalDate();
        DateConverter converter = new DateConverter();
        Date sqlDate = converter.to(expected);
        LocalDate actual = converter.from(sqlDate);
        assertEquals(expected, actual);
    }

}
