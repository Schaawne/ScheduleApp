/**
 * This class is generated by jOOQ
 */
package com.schaawne.scheduleapp.generated.tables;


import com.schaawne.scheduleapp.generated.Keys;
import com.schaawne.scheduleapp.generated.Public;
import com.schaawne.scheduleapp.generated.tables.records.ScheduleRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Schedule extends TableImpl<ScheduleRecord> {

    private static final long serialVersionUID = 1106639264;

    /**
     * The reference instance of <code>PUBLIC.SCHEDULE</code>
     */
    public static final Schedule SCHEDULE = new Schedule();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ScheduleRecord> getRecordType() {
        return ScheduleRecord.class;
    }

    /**
     * The column <code>PUBLIC.SCHEDULE.ID</code>.
     */
    public final TableField<ScheduleRecord, Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("(NEXT VALUE FOR PUBLIC.SYSTEM_SEQUENCE_EE3DABEF_603C_4C2E_8175_52BB236F0673)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>PUBLIC.SCHEDULE.STUDENTS_FK</code>.
     */
    public final TableField<ScheduleRecord, Integer> STUDENTS_FK = createField("STUDENTS_FK", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>PUBLIC.SCHEDULE.SPAN</code>.
     */
    public final TableField<ScheduleRecord, Integer> SPAN = createField("SPAN", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>PUBLIC.SCHEDULE</code> table reference
     */
    public Schedule() {
        this("SCHEDULE", null);
    }

    /**
     * Create an aliased <code>PUBLIC.SCHEDULE</code> table reference
     */
    public Schedule(String alias) {
        this(alias, SCHEDULE);
    }

    private Schedule(String alias, Table<ScheduleRecord> aliased) {
        this(alias, aliased, null);
    }

    private Schedule(String alias, Table<ScheduleRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<ScheduleRecord, Integer> getIdentity() {
        return Keys.IDENTITY_SCHEDULE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ScheduleRecord> getPrimaryKey() {
        return Keys.CONSTRAINT_5;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ScheduleRecord>> getKeys() {
        return Arrays.<UniqueKey<ScheduleRecord>>asList(Keys.CONSTRAINT_5);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<ScheduleRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<ScheduleRecord, ?>>asList(Keys.FK_STUDENTS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schedule as(String alias) {
        return new Schedule(alias, this);
    }

    /**
     * Rename this table
     */
    public Schedule rename(String name) {
        return new Schedule(name, null);
    }
}
