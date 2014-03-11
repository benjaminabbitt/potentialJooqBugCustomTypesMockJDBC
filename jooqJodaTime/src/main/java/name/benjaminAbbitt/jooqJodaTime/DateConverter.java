package name.benjaminAbbitt.jooqJodaTime;

import org.joda.time.LocalDate;
import org.jooq.Converter;

import java.sql.Date;

public class DateConverter implements Converter<Date, LocalDate> {


    @Override
    public LocalDate from(Date databaseObject) {
        return new LocalDate(databaseObject.getTime());
    }

    @Override
    public Date to(LocalDate userObject) {
        return new Date(userObject.toDateTimeAtStartOfDay().getMillis());
    }

    @Override
    public Class<Date> fromType() {
        return Date.class;
    }

    @Override
    public Class<LocalDate> toType() {
        return LocalDate.class;
    }
}
