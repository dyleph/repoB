package ch.autoscout24.codes;

import ch.autoscout24.codes.support.BaseEnum;

/**
 * @author Filip Krstev
 */
public class FraudDetectionCodes {

    public enum MessageEntityType implements BaseEnum {
        MESSAGE_LEAD("message-lead");

        private final String value;

        MessageEntityType(String value) {
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

    public enum MessageSource implements BaseEnum {
        AUTOSCOUT24("autoscout24"),
        COMPARIS("comparis"),
        HCI("hci");

        private final String value;

        MessageSource(String value) {
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

    public enum EvaluationOutcome implements BaseEnum {
        REJECTED_BY_INTERNAL_RULE("rejected-by-internal-rule"),
        REJECTED_BY_RULE("rejected-by-rule"),
        REJECTED_BY_MANUAL_REVIEW("rejected-by-manual-review"),
        PENDING_MANUAL_REVIEW("pending-manual-review"),
        MANUAL_REVIEW_EXPIRED("manual-review-expired"),
        ACCEPTED_BY_RULE("accepted-by-rule"),
        ACCEPTED_BY_MANUAL_REVIEW("accepted-by-manual-review");

        private final String value;

        EvaluationOutcome(String value) {
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
