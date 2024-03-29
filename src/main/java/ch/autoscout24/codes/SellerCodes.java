package ch.autoscout24.codes;

import ch.autoscout24.codes.support.BaseEnum;

/**
 * @author Sasa Lukic
 */
public class SellerCodes {

    public enum SellerType implements BaseEnum {
        PRIVATE("private"),
        PROFESSIONAL("professional");

        private final String value;

        SellerType(String value) {
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

    public enum PhoneType implements BaseEnum {
        BUSINESS("business"),
        CAR("car"),
        FAX("fax"),
        MOBILE("mobile"),
        NEW_CAR("new-car"),
        PRIVATE("private"),
        SALES("sales"),
        SHOWROOM("showroom"),
        TWENTY_FOUR_HOURS_HOTLINE("twenty-four-hours-hotline"),
        USED_CAR("used-car"),
        UTILITY_VEHICLES("utility-vehicles"),
        WHATS_APP("whats-app");

        private final String value;

        PhoneType(String value) {
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

    public enum BusinessImageLinkTarget implements BaseEnum {
        ABOUT("about"),
        BRANCHES("branches"),
        CONTACT("contact"),
        LISTINGS("listings");

        private final String value;

        BusinessImageLinkTarget(String value) {
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
