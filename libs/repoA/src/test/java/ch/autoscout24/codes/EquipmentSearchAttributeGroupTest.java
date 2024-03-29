package ch.autoscout24.codes;

import org.junit.jupiter.api.Test;

import static ch.autoscout24.codes.CatalogueCodes.EquipmentSearchAttribute;
import static ch.autoscout24.codes.CatalogueCodes.EquipmentSearchAttributeGroup;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

/**
 * @author Slavko Komarica
 */
class EquipmentSearchAttributeGroupTest {

    @Test
    void ofType() {
        assertThat(EquipmentSearchAttributeGroup.ofAttribute(null)).isNull();
        assertThat(EquipmentSearchAttributeGroup.ofAttribute(EquipmentSearchAttribute.AIR_CONDITION)).isEqualTo(EquipmentSearchAttributeGroup.AIR_CONDITION);
        assertThat(EquipmentSearchAttributeGroup.ofAttribute(EquipmentSearchAttribute.LED)).isEqualTo(EquipmentSearchAttributeGroup.HEADLIGHTS);
        assertThat(EquipmentSearchAttributeGroup.ofAttribute(EquipmentSearchAttribute.NAVIGATION)).isEqualTo(EquipmentSearchAttributeGroup.NAVIGATION_SYSTEM);
        assertThat(EquipmentSearchAttributeGroup.ofAttribute(EquipmentSearchAttribute.ALCANTARA)).isEqualTo(EquipmentSearchAttributeGroup.SEAT_COVERS);
        assertThat(EquipmentSearchAttributeGroup.ofAttribute(EquipmentSearchAttribute.DETACHABLE_TOWBAR)).isEqualTo(EquipmentSearchAttributeGroup.TOWBAR);
        assertThat(EquipmentSearchAttributeGroup.ofAttribute(EquipmentSearchAttribute.ABS)).isNull();
    }
}
