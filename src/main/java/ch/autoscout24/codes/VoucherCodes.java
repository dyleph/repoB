package ch.autoscout24.codes;

import ch.autoscout24.codes.support.BaseEnum;

/**
 * @author Raymond Bui
 */
public class VoucherCodes {

    public enum VoucherStatus implements BaseEnum {
        ACTIVE("active"),
        INACTIVE("inactive");

        private final String value;

        VoucherStatus(String value) {
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

    public enum VoucherType implements BaseEnum {
        SINGLE("single"),
        MULTIPLE("multiple"),
        MULTIPLE_ONCE_PER_USER("multiple-once-per-user");

        private final String value;

        VoucherType(String value) {
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

    public enum DiscountType implements BaseEnum {
        FIX("fix"),
        PERCENT("percent");

        private final String value;

        DiscountType(String value) {
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
}
