/**
 * This class is generated by jOOQ
 */
package com.schaawne.scheduleapp.generated.tables.records;


import com.schaawne.scheduleapp.generated.tables.Students;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;


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
@Entity
@Table(name = "STUDENTS", schema = "PUBLIC")
public class StudentsRecord extends UpdatableRecordImpl<StudentsRecord> implements Record5<Integer, String, String, String, String> {

    private static final long serialVersionUID = 454249328;

    /**
     * Setter for <code>PUBLIC.STUDENTS.ID</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>PUBLIC.STUDENTS.ID</code>.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", unique = true, nullable = false, precision = 10)
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>PUBLIC.STUDENTS.FIRSTNAME</code>.
     */
    public void setFirstname(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>PUBLIC.STUDENTS.FIRSTNAME</code>.
     */
    @Column(name = "FIRSTNAME", nullable = false, length = 255)
    public String getFirstname() {
        return (String) get(1);
    }

    /**
     * Setter for <code>PUBLIC.STUDENTS.LASTNAME</code>.
     */
    public void setLastname(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>PUBLIC.STUDENTS.LASTNAME</code>.
     */
    @Column(name = "LASTNAME", nullable = false, length = 255)
    public String getLastname() {
        return (String) get(2);
    }

    /**
     * Setter for <code>PUBLIC.STUDENTS.PHONENUMBER</code>.
     */
    public void setPhonenumber(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>PUBLIC.STUDENTS.PHONENUMBER</code>.
     */
    @Column(name = "PHONENUMBER", length = 10)
    public String getPhonenumber() {
        return (String) get(3);
    }

    /**
     * Setter for <code>PUBLIC.STUDENTS.EMAIL</code>.
     */
    public void setEmail(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>PUBLIC.STUDENTS.EMAIL</code>.
     */
    @Column(name = "EMAIL", length = 255)
    public String getEmail() {
        return (String) get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, String, String, String, String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, String, String, String, String> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Students.STUDENTS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Students.STUDENTS.FIRSTNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Students.STUDENTS.LASTNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Students.STUDENTS.PHONENUMBER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Students.STUDENTS.EMAIL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getFirstname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getLastname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getPhonenumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getEmail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StudentsRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StudentsRecord value2(String value) {
        setFirstname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StudentsRecord value3(String value) {
        setLastname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StudentsRecord value4(String value) {
        setPhonenumber(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StudentsRecord value5(String value) {
        setEmail(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StudentsRecord values(Integer value1, String value2, String value3, String value4, String value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached StudentsRecord
     */
    public StudentsRecord() {
        super(Students.STUDENTS);
    }

    /**
     * Create a detached, initialised StudentsRecord
     */
    public StudentsRecord(Integer id, String firstname, String lastname, String phonenumber, String email) {
        super(Students.STUDENTS);

        set(0, id);
        set(1, firstname);
        set(2, lastname);
        set(3, phonenumber);
        set(4, email);
    }
}