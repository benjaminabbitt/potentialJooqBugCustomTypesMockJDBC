/**
 * This class is generated by jOOQ
 */
package name.benjaminAbbitt.potentialJooqBugCustomTypesMockJDBC.generated.jooq.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.3.1" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class BugRecord extends org.jooq.impl.TableRecordImpl<name.benjaminAbbitt.potentialJooqBugCustomTypesMockJDBC.generated.jooq.tables.records.BugRecord> implements org.jooq.Record2<org.joda.time.DateTime, java.lang.Integer> {

	private static final long serialVersionUID = 2001491768;

	/**
	 * Setter for <code>public.bug.testdate</code>.
	 */
	public void setTestdate(org.joda.time.DateTime value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>public.bug.testdate</code>.
	 */
	public org.joda.time.DateTime getTestdate() {
		return (org.joda.time.DateTime) getValue(0);
	}

	/**
	 * Setter for <code>public.bug.id</code>.
	 */
	public void setId(java.lang.Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>public.bug.id</code>.
	 */
	public java.lang.Integer getId() {
		return (java.lang.Integer) getValue(1);
	}

	// -------------------------------------------------------------------------
	// Record2 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<org.joda.time.DateTime, java.lang.Integer> fieldsRow() {
		return (org.jooq.Row2) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<org.joda.time.DateTime, java.lang.Integer> valuesRow() {
		return (org.jooq.Row2) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.joda.time.DateTime> field1() {
		return name.benjaminAbbitt.potentialJooqBugCustomTypesMockJDBC.generated.jooq.tables.Bug.BUG.TESTDATE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field2() {
		return name.benjaminAbbitt.potentialJooqBugCustomTypesMockJDBC.generated.jooq.tables.Bug.BUG.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.joda.time.DateTime value1() {
		return getTestdate();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value2() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BugRecord value1(org.joda.time.DateTime value) {
		setTestdate(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BugRecord value2(java.lang.Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public BugRecord values(org.joda.time.DateTime value1, java.lang.Integer value2) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached BugRecord
	 */
	public BugRecord() {
		super(name.benjaminAbbitt.potentialJooqBugCustomTypesMockJDBC.generated.jooq.tables.Bug.BUG);
	}

	/**
	 * Create a detached, initialised BugRecord
	 */
	public BugRecord(org.joda.time.DateTime testdate, java.lang.Integer id) {
		super(name.benjaminAbbitt.potentialJooqBugCustomTypesMockJDBC.generated.jooq.tables.Bug.BUG);

		setValue(0, testdate);
		setValue(1, id);
	}
}
