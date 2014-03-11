package name.benjaminAbbitt.jooqJodaTime;

import org.joda.time.DateTime;
import java.sql.Timestamp;

import org.joda.time.DateTimeZone;
import org.jooq.Converter;

public class DateTimeConverter implements Converter<Timestamp, DateTime> {
    @Override
    public DateTime from(Timestamp databaseObject) {
        return new DateTime(databaseObject.getTime()).withZone(DateTimeZone.UTC);
    }

    @Override
    public Timestamp to(DateTime userObject) {
        return new Timestamp(userObject.getMillis());
    }

    @Override
    public Class<Timestamp> fromType() {
        return Timestamp.class;
    }

    @Override
    public Class<DateTime> toType() {
        return DateTime.class;
    }
}
