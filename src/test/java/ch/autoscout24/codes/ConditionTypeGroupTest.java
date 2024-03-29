package ch.autoscout24.codes;

import org.junit.jupiter.api.Test;

import static ch.autoscout24.codes.ListingCodes.ConditionType;
import static ch.autoscout24.codes.ListingCodes.ConditionTypeGroup;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author Aleksandar Bojkovic
 */
class ConditionTypeGroupTest {

    @Test
    void ofType() {
        assertThat(ConditionTypeGroup.ofType(null)).isNull();
        assertThat(ConditionTypeGroup.ofType(ConditionType.DEMONSTRATION)).isEqualTo(ConditionTypeGroup.NEW);
        assertThat(ConditionTypeGroup.ofType(ConditionType.NEW)).isEqualTo(ConditionTypeGroup.NEW);
        assertThat(ConditionTypeGroup.ofType(ConditionType.PRE_REGISTERED)).isEqualTo(ConditionTypeGroup.NEW);
        assertThat(ConditionTypeGroup.ofType(ConditionType.OLDTIMER)).isEqualTo(ConditionTypeGroup.USED);
        assertThat(ConditionTypeGroup.ofType(ConditionType.USED)).isEqualTo(ConditionTypeGroup.USED);
    }
}
