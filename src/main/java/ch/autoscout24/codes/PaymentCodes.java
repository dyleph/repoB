package ch.autoscout24.codes;

import ch.autoscout24.codes.support.BaseEnum;

import java.util.Arrays;

/**
 * @author Jelena Sijan
 */
public class PaymentCodes {

    public enum PaymentMethodType implements BaseEnum {
        MASTER_CARD("master-card", "ECA"),
        VISA("visa", "VIS"),
        POST_FINANCE_CARD("post-finance-card", "PFC"),
        POST_FINANCE_E_FINANCE("post-finance-e-finance", "PEF"),
        TWINT("twint", "TWI");

        private final String value;

        private final String providerCode;

        PaymentMethodType(String value, String providerCode) {
            this.value = value;
            this.providerCode = providerCode;
        }

        @Override
        public String getValue() {
            return value;
        }

        public String getProviderCode() {
            return providerCode;
        }

        public static PaymentMethodType ofProviderCode(String providerCode) {
            if (providerCode == null) {
                return null;
            }
            return Arrays.stream(values())
                    .filter(value -> value.providerCode.equalsIgnoreCase(providerCode))
                    .findFirst()
                    .orElseThrow(() -> new IllegalArgumentException("Not supported providerCode " + providerCode));
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public enum PaymentStatus implements BaseEnum {
        INITIALIZED("initialized"),
        SUCCESS("success"),
        CANCELED("canceled"),
        FAILED("failed");

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

    public enum PaymentErrorCode implements BaseEnum {
        INVALID_CARD("invalid-card"),
        DECLINED("declined"),
        SERVER_ERROR("server-error"),
        UNKNOWN("unknown");

        private final String value;

        PaymentErrorCode(String value) {
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
