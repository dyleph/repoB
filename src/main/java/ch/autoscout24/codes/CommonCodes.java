package ch.autoscout24.codes;

import ch.autoscout24.codes.support.BaseEnum;

/**
 * @author Sasa Lukic
 */
public class CommonCodes {

    public enum Language implements BaseEnum {
        GERMAN("de"),
        FRENCH("fr"),
        ITALIAN("it"),
        ENGLISH("en");

        private final String value;

        Language(String value) {
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
