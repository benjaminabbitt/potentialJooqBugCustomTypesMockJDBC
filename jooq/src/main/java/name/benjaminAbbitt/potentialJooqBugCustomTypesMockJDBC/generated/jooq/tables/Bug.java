/**
 * This class is generated by jOOQ
 */
package name.benjaminAbbitt.potentialJooqBugCustomTypesMockJDBC.generated.jooq.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.3.1" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Bug extends org.jooq.impl.TableImpl<name.benjaminAbbitt.potentialJooqBugCustomTypesMockJDBC.generated.jooq.tables.records.BugRecord> {

	private static final long serialVersionUID = -630644038;

	/**
	 * The singleton instance of <code>public.bug</code>
	 */
	public static final name.benjaminAbbitt.potentialJooqBugCustomTypesMockJDBC.generated.jooq.tables.Bug BUG = new name.benjaminAbbitt.potentialJooqBugCustomTypesMockJDBC.generated.jooq.tables.Bug();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<name.benjaminAbbitt.potentialJooqBugCustomTypesMockJDBC.generated.jooq.tables.records.BugRecord> getRecordType() {
		return name.benjaminAbbitt.potentialJooqBugCustomTypesMockJDBC.generated.jooq.tables.records.BugRecord.class;
	}

	/**
	 * The column <code>public.bug.testdate</code>.
	 */
	public final org.jooq.TableField<name.benjaminAbbitt.potentialJooqBugCustomTypesMockJDBC.generated.jooq.tables.records.BugRecord, org.joda.time.DateTime> TESTDATE = createField("testdate", org.jooq.impl.SQLDataType.TIMESTAMP.defaulted(true).asConvertedDataType(new name.benjaminAbbitt.jooqJodaTime.DateTimeConverter()), this, "");

	/**
	 * The column <code>public.bug.id</code>.
	 */
	public final org.jooq.TableField<name.benjaminAbbitt.potentialJooqBugCustomTypesMockJDBC.generated.jooq.tables.records.BugRecord, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "");

	/**
	 * Create a <code>public.bug</code> table reference
	 */
	public Bug() {
		this("bug", null);
	}

	/**
	 * Create an aliased <code>public.bug</code> table reference
	 */
	public Bug(java.lang.String alias) {
		this(alias, name.benjaminAbbitt.potentialJooqBugCustomTypesMockJDBC.generated.jooq.tables.Bug.BUG);
	}

	private Bug(java.lang.String alias, org.jooq.Table<name.benjaminAbbitt.potentialJooqBugCustomTypesMockJDBC.generated.jooq.tables.records.BugRecord> aliased) {
		this(alias, aliased, null);
	}

	private Bug(java.lang.String alias, org.jooq.Table<name.benjaminAbbitt.potentialJooqBugCustomTypesMockJDBC.generated.jooq.tables.records.BugRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, name.benjaminAbbitt.potentialJooqBugCustomTypesMockJDBC.generated.jooq.Public.PUBLIC, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<name.benjaminAbbitt.potentialJooqBugCustomTypesMockJDBC.generated.jooq.tables.records.BugRecord, java.lang.Integer> getIdentity() {
		return name.benjaminAbbitt.potentialJooqBugCustomTypesMockJDBC.generated.jooq.Keys.IDENTITY_BUG;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<name.benjaminAbbitt.potentialJooqBugCustomTypesMockJDBC.generated.jooq.tables.records.BugRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<name.benjaminAbbitt.potentialJooqBugCustomTypesMockJDBC.generated.jooq.tables.records.BugRecord>>asList(name.benjaminAbbitt.potentialJooqBugCustomTypesMockJDBC.generated.jooq.Keys.BUG_ID_KEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public name.benjaminAbbitt.potentialJooqBugCustomTypesMockJDBC.generated.jooq.tables.Bug as(java.lang.String alias) {
		return new name.benjaminAbbitt.potentialJooqBugCustomTypesMockJDBC.generated.jooq.tables.Bug(alias, this);
	}

	/**
	 * Rename this table
	 */
	public name.benjaminAbbitt.potentialJooqBugCustomTypesMockJDBC.generated.jooq.tables.Bug rename(java.lang.String name) {
		return new name.benjaminAbbitt.potentialJooqBugCustomTypesMockJDBC.generated.jooq.tables.Bug(name, null);
	}
}