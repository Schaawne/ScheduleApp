/**
 * This class is generated by jOOQ
 */
package com.schaawne.scheduleapp.generated.tables.pojos;


import java.io.Serializable;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


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
@Table(name = "SCHEDULE", schema = "PUBLIC")
public class Schedule implements Serializable {

    private static final long serialVersionUID = 503502786;

    private Integer id;
    private Integer studentsFk;
    private Integer span;

    public Schedule() {}

    public Schedule(Schedule value) {
        this.id = value.id;
        this.studentsFk = value.studentsFk;
        this.span = value.span;
    }

    public Schedule(
        Integer id,
        Integer studentsFk,
        Integer span
    ) {
        this.id = id;
        this.studentsFk = studentsFk;
        this.span = span;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", unique = true, nullable = false, precision = 10)
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "STUDENTS_FK", precision = 10)
    public Integer getStudentsFk() {
        return this.studentsFk;
    }

    public void setStudentsFk(Integer studentsFk) {
        this.studentsFk = studentsFk;
    }

    @Column(name = "SPAN", nullable = false, precision = 10)
    public Integer getSpan() {
        return this.span;
    }

    public void setSpan(Integer span) {
        this.span = span;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Schedule (");

        sb.append(id);
        sb.append(", ").append(studentsFk);
        sb.append(", ").append(span);

        sb.append(")");
        return sb.toString();
    }
}