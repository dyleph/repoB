package ch.autoscout24.codes;

import ch.autoscout24.codes.support.BaseEnum;

/**
 * @author Filip Krstev
 */
public class ProductCodes {

    public enum BookingStatus implements BaseEnum {
        DRAFT("draft"),
        ACTIVE("active"),
        CLOSED("closed");

        private final String value;

        BookingStatus(String value) {
            this.value = value;
        }

        @Override
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public enum UsageStatus implements BaseEnum {
        ACTIVE("active"),
        EXPIRED("expired");

        private final String value;

        UsageStatus(String value) {
            this.value = value;
        }

        @Override
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public enum Feature implements BaseEnum {
        ANIBIS_EXPORT_BASIC("anibis-export-basic", null),
        ANIBIS_EXPORT_PREMIUM("anibis-export-premium", null),
        ANIBIS_EXPORT_STANDARD("anibis-export-standard", null),
        BRANCH_FINDER("branch-finder", null),
        BUSINESS_IMAGE("business-image", null),
        BUSINESS_VIDEO("business-video", null),
        LIST("list", null),
        LISTING_VISIBILITY_BASIC("listing-visibility-basic", null),
        LISTING_VISIBILITY_PREMIUM("listing-visibility-premium", null),
        LISTING_VISIBILITY_STANDARD("listing-visibility-standard", null),
        LIST_IMAGE("list-image", null),
        SELLER_ALTERNATIVE_LISTINGS("seller-alternative-listings", null),
        SELLER_WEBSITE("seller-website", null),
        TEST_DRIVE("test-drive", null),
        TOP_LIST("top-list", UsageScope.LISTING),
        TOP_SELLER("top-seller", null),
        TOP_VEHICLE_EXCLUSIVE("top-vehicle-exclusive", null),
        TOP_VEHICLE_SHARED("top-vehicle-shared", UsageScope.LISTING),
        TUTTI_EXPORT_BASIC("tutti-export-basic", null),
        TUTTI_EXPORT_PREMIUM("tutti-export-premium", null),
        TUTTI_EXPORT_STANDARD("tutti-export-standard", null),
        AUTO_RADAR("auto-radar", null),
        AUTO_RADAR_FAST("auto-radar-fast", null),
        OPTIMIZER("optimizer", null),
        OPTIMIZER_PRO("optimizer-pro", null),
        UNDEFINED("undefined", null);

        private final String value;

        private final UsageScope usageScope;

        Feature(String value, UsageScope usageScope) {
            this.value = value;
            this.usageScope = usageScope;
        }

        @Override
        public String getValue() {
            return value;
        }

        public UsageScope getUsageScope() {
            return usageScope;
        }

        public boolean isUsageBased() {
            return usageScope != null;
        }

        @Override
        public String toString() {
            return value;
        }

        public enum UsageScope {
            LISTING("listing");

            private final String value;

            UsageScope(String value) {
                this.value = value;
            }

            public String getValue() {
                return value;
            }

            @Override
            public String toString() {
                return value;
            }
        }
    }

    public enum FeaturePlacement implements BaseEnum {
        ADVANCED_SEARCH("advanced-search"),
        SEARCH_RESULTS_PAGE("search-results-page"),
        HOME_PAGE("home-page");

        private final String value;

        FeaturePlacement(String value) {
            this.value = value;
        }

        @Override
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public enum CarouselSlot implements BaseEnum {
        SLOT_1("slot-1"),
        SLOT_2("slot-2"),
        SLOT_3("slot-3"),
        SLOT_4("slot-4"),
        SLOT_5("slot-5"),
        SLOT_6("slot-6");

        private final String value;

        CarouselSlot(String value) {
            this.value = value;
        }

        @Override
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public enum PaymentType implements BaseEnum {
        INVOICE("invoice"),
        ONLINE("online");

        private final String value;

        PaymentType(String value) {
            this.value = value;
        }

        @Override
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public enum PaymentStatus implements BaseEnum {
        PENDING("pending"),
        PAID("paid"),
        FAILED("failed"),
        CANCELLED("cancelled");

        private final String value;

        PaymentStatus(String value) {
            this.value = value;
        }

        @Override
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public enum OrderStatus implements BaseEnum {
        OPEN("open"),
        PAYMENT_PROCESSING("payment-processing"),
        COMPLETED("completed"),
        FULFILLED("fulfilled"),
        CANCELLED("cancelled"),
        PAYMENT_FAILED("payment-failed");

        private final String value;

        OrderStatus(String value) {
            this.value = value;
        }

        @Override
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public enum ProductStatus implements BaseEnum {
        ACTIVE("active"),
        INACTIVE("inactive");

        private final String value;

        ProductStatus(String value) {
            this.value = value;
        }

        @Override
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public enum PackageType implements BaseEnum {
        LISTING("listing", ProductScope.LISTING, Feature.LIST);

        private final String value;

        private final ProductScope scope;

        private final Feature mainFeature;

        PackageType(String value, ProductScope scope, Feature mainFeature) {
            this.value = value;
            this.scope = scope;
            this.mainFeature = mainFeature;
        }

        @Override
        public String getValue() {
            return this.value;
        }

        public ProductScope getScope() {
            return scope;
        }

        public Feature getMainFeature() {
            return this.mainFeature;
        }

        @Override
        public String toString() {
            return this.value;
        }
    }

    public enum ProductScope implements BaseEnum {
        LISTING("listing");

        private final String value;

        ProductScope(String value) {
            this.value = value;
        }

        @Override
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return this.value;
        }
    }

    public enum DunningLevel implements BaseEnum {
        NOT_DUE("not-due", 0),
        FIRST_REMINDER("first-reminder", 1),
        SECOND_REMINDER("second-reminder", 2),
        THIRD_REMINDER("third-reminder", 3),
        IN_COLLECTION("in-collection", 4);

        private final String value;

        private final int level;

        DunningLevel(String value, int level) {
            this.value = value;
            this.level = level;
        }

        @Override
        public String getValue() {
            return value;
        }

        public int getLevel() {
            return level;
        }

        @Override
        public String toString() {
            return value;
        }
    }
}
