/**
 * This class is generated by jOOQ
 */
package com.schaawne.scheduleapp.generated;


import javax.annotation.Generated;

import org.jooq.Sequence;
import org.jooq.impl.SequenceImpl;


/**
 * Convenience access to all sequences in PUBLIC
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Sequences {

    /**
     * The sequence <code>PUBLIC.SYSTEM_SEQUENCE_18623079_5906_42F4_8987_6B9E32178868</code>
     */
    public static final Sequence<Long> SYSTEM_SEQUENCE_18623079_5906_42F4_8987_6B9E32178868 = new SequenceImpl<Long>("SYSTEM_SEQUENCE_18623079_5906_42F4_8987_6B9E32178868", Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT);

    /**
     * The sequence <code>PUBLIC.SYSTEM_SEQUENCE_EE3DABEF_603C_4C2E_8175_52BB236F0673</code>
     */
    public static final Sequence<Long> SYSTEM_SEQUENCE_EE3DABEF_603C_4C2E_8175_52BB236F0673 = new SequenceImpl<Long>("SYSTEM_SEQUENCE_EE3DABEF_603C_4C2E_8175_52BB236F0673", Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT);
}
