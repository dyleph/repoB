package ch.autoscout24.codes;

import org.junit.jupiter.api.Test;

import static ch.autoscout24.codes.ProductCodes.Feature;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author Slavko Komarica
 */
class FeatureTest {

    @Test
    void isUsageBased() {
        assertThat(Feature.ANIBIS_EXPORT_BASIC.isUsageBased()).isFalse();
        assertThat(Feature.ANIBIS_EXPORT_PREMIUM.isUsageBased()).isFalse();
        assertThat(Feature.ANIBIS_EXPORT_STANDARD.isUsageBased()).isFalse();
        assertThat(Feature.BRANCH_FINDER.isUsageBased()).isFalse();
        assertThat(Feature.BUSINESS_IMAGE.isUsageBased()).isFalse();
        assertThat(Feature.BUSINESS_VIDEO.isUsageBased()).isFalse();
        assertThat(Feature.LIST.isUsageBased()).isFalse();
        assertThat(Feature.LISTING_VISIBILITY_BASIC.isUsageBased()).isFalse();
        assertThat(Feature.LISTING_VISIBILITY_STANDARD.isUsageBased()).isFalse();
        assertThat(Feature.LISTING_VISIBILITY_PREMIUM.isUsageBased()).isFalse();
        assertThat(Feature.LIST_IMAGE.isUsageBased()).isFalse();
        assertThat(Feature.SELLER_ALTERNATIVE_LISTINGS.isUsageBased()).isFalse();
        assertThat(Feature.SELLER_WEBSITE.isUsageBased()).isFalse();
        assertThat(Feature.TEST_DRIVE.isUsageBased()).isFalse();
        assertThat(Feature.TOP_LIST.isUsageBased()).isTrue();
        assertThat(Feature.TOP_SELLER.isUsageBased()).isFalse();
        assertThat(Feature.TOP_VEHICLE_EXCLUSIVE.isUsageBased()).isFalse();
        assertThat(Feature.TOP_VEHICLE_SHARED.isUsageBased()).isTrue();
        assertThat(Feature.TUTTI_EXPORT_BASIC.isUsageBased()).isFalse();
        assertThat(Feature.TUTTI_EXPORT_PREMIUM.isUsageBased()).isFalse();
        assertThat(Feature.TUTTI_EXPORT_STANDARD.isUsageBased()).isFalse();
        assertThat(Feature.AUTO_RADAR.isUsageBased()).isFalse();
        assertThat(Feature.AUTO_RADAR_FAST.isUsageBased()).isFalse();
        assertThat(Feature.OPTIMIZER.isUsageBased()).isFalse();
        assertThat(Feature.OPTIMIZER_PRO.isUsageBased()).isFalse();
        assertThat(Feature.UNDEFINED.isUsageBased()).isFalse();

        assertThat(Feature.values()).hasSize(26);
    }
}
