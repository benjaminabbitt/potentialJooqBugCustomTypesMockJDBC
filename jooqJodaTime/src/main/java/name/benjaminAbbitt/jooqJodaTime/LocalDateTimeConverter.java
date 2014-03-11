package name.benjaminAbbitt.jooqJodaTime;

import org.joda.time.LocalDateTime;
import org.jooq.Converter;

import java.sql.Timestamp;

public class LocalDateTimeConverter implements Converter<Timestamp, LocalDateTime> {

    @Override
    public LocalDateTime from(Timestamp databaseObject) {
        return new LocalDateTime(databaseObject.getTime());
    }

    @Override
    public Timestamp to(LocalDateTime dt) {
        return new Timestamp(dt.toDateTime().getMillis());
    }

    @Override
    public Class<Timestamp> fromType() {
        return Timestamp.class;
    }

    @Override
    public Class<LocalDateTime> toType() {
        return LocalDateTime.class;
    }
}