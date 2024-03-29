package ch.autoscout24.codes;

import ch.autoscout24.codes.support.BaseEnum;

/**
 * @author Ivana Samardzija
 */
public class UserCodes {

    public enum UserStatus implements BaseEnum {
        ACTIVE("active"),
        BLOCKED("blocked");

        private final String value;

        UserStatus(String value) {
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
