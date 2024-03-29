package ch.autoscout24.codes;

import ch.autoscout24.codes.support.BaseEnum;

/**
 * @author Sasa Lukic
 */
public class LeadCodes {

    public enum MessageLeadSource implements BaseEnum {
        AUTOSCOUT24("autoscout24"),
        COMPARIS("comparis"),
        HCI("hci");

        private final String value;

        MessageLeadSource(String value) {
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

    public enum VerificationStatus implements BaseEnum {
        SUBMITTED("submitted"),
        VERIFIED("verified"),
        REJECTED("rejected");

        private final String value;

        VerificationStatus(String value) {
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
