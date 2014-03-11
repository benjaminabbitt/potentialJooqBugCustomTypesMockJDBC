package name.benjaminAbbitt.potentialJooqBugCustomTypesMockJDBC

import org.joda.time.DateTime
import org.jooq.DSLContext
import org.jooq.SQLDialect
import org.jooq.impl.DSL
import org.jooq.tools.jdbc.MockConnection
import org.jooq.tools.jdbc.MockDataProvider
import org.jooq.tools.jdbc.MockExecuteContext
import org.jooq.tools.jdbc.MockResult
import org.junit.Test

import java.sql.SQLException

import static name.benjaminAbbitt.potentialJooqBugCustomTypesMockJDBC.generated.jooq.tables.Bug.BUG;

public class BugTest {
    @Test
    public void getTest() {

        DSLContext testContext = setupDSL(new MockDataProvider() {
            @Override
            public MockResult[] execute(MockExecuteContext ctx) throws SQLException {
                DSLContext create = DSL.using(SQLDialect.POSTGRES)
                def result = create.newResult(BUG)

                result.add(create.newRecord(BUG, [id: 0, testdate: new DateTime()]))

                [new MockResult(result.size(), result)]
            }
        })

        testContext.select().from(BUG).fetch()  //this line fails
    }

    private DSLContext setupDSL(MockDataProvider provider) {
        MockConnection connection = new MockConnection(provider)
        return DSL.using(connection, SQLDialect.POSTGRES)
    }

}