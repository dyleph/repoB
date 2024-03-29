package ch.autoscout24.codes;

import org.junit.jupiter.api.Test;

import static ch.autoscout24.codes.ListingCodes.FuelType;
import static ch.autoscout24.codes.ListingCodes.FuelTypeGroup;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

/**
 * @author Sasa Lukic
 */
class FuelTypeGroupTest {

    @Test
    void ofType() {
        assertThat(FuelTypeGroup.ofType(null)).isNull();
        assertThat(FuelTypeGroup.ofType(FuelType.MHEV_DIESEL)).isEqualTo(FuelTypeGroup.DIESEL);
        assertThat(FuelTypeGroup.ofType(FuelType.CNG_PETROL)).isEqualTo(FuelTypeGroup.GAS);
        assertThat(FuelTypeGroup.ofType(FuelType.PHEV_DIESEL)).isEqualTo(FuelTypeGroup.HYBRID);
        assertThat(FuelTypeGroup.ofType(FuelType.MHEV_PETROL)).isEqualTo(FuelTypeGroup.PETROL);
        assertThat(FuelTypeGroup.ofType(FuelType.HYDROGEN)).isEqualTo(FuelTypeGroup.OTHER);
        assertThat(FuelTypeGroup.ofType(FuelType.ELECTRIC)).isNull();
        assertThat(FuelTypeGroup.ofType(FuelType.TWO_STROKE_MIXTURE)).isNull();
    }
}
