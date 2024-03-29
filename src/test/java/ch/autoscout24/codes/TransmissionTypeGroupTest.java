package ch.autoscout24.codes;

import org.junit.jupiter.api.Test;

import static ch.autoscout24.codes.ListingCodes.TransmissionType;
import static ch.autoscout24.codes.ListingCodes.TransmissionTypeGroup;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

/**
 * @author Slavko Komarica
 */
class TransmissionTypeGroupTest {

    @Test
    void ofType() {
        assertThat(TransmissionTypeGroup.ofType(null)).isNull();
        assertThat(TransmissionTypeGroup.ofType(TransmissionType.AUTOMATIC)).isEqualTo(TransmissionTypeGroup.AUTOMATIC);
        assertThat(TransmissionTypeGroup.ofType(TransmissionType.AUTOMATIC_STEPLESS)).isEqualTo(TransmissionTypeGroup.AUTOMATIC);
        assertThat(TransmissionTypeGroup.ofType(TransmissionType.SEMI_AUTOMATIC)).isEqualTo(TransmissionTypeGroup.AUTOMATIC);
        assertThat(TransmissionTypeGroup.ofType(TransmissionType.MANUAL)).isEqualTo(TransmissionTypeGroup.MANUAL);
    }
}
