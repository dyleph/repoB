package ch.autoscout24.codes;

import ch.autoscout24.codes.support.BaseEnum;

/**
 * @author Andy Le
 */
public class CatalogueCodes {

    public enum VersionSource implements BaseEnum {
        AUTO_I("auto-i"),
        EUROTAX("eurotax");

        private final String value;

        VersionSource(String value) {
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

    public enum OptionSource implements BaseEnum {
        EUROTAX("eurotax"),
        AUTO_I("auto-i");

        private final String value;

        OptionSource(String value) {
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

    public enum EquipmentSearchAttribute implements BaseEnum {
        ABS("abs"),
        ACTIVE_BRAKE_ASSISTANT("active-brake-assistant"),
        ADAPTIVE_CRUISE_CONTROL("adaptive-cruise-control"),
        ADAPTIVE_HEADLIGHTS("adaptive-headlights"),
        ADDITIONAL_INSTRUMENTATION("additional-instrumentation"),
        AIR_CONDITION("air-condition"),
        AIR_SUSPENSION("air-suspension"),
        ALARM_SYSTEM("alarm-system"),
        ALCANTARA("alcantara"),
        ALLOY_WHEELS("alloy-wheels"),
        ANDROID_AUTO("android-auto"),
        ANTI_THEFT_DEVICE("anti-theft-device"),
        APPLE_CARPLAY("apple-carplay"),
        ASSISTED_PARKING("assisted-parking"),
        AUDIO_SYSTEM("audio-system"),
        AUTOMATIC_AIR_CONDITION("automatic-air-condition"),
        AUXILIARY_HEATING("auxiliary-heating"),
        BACKREST("backrest"),
        BLIND_SPOT_SYSTEM("blind-spot-system"),
        BLUETOOTH_INTERFACE("bluetooth-interface"),
        CAMERA_360("360-camera"),
        CATALYTIC_CONVERTER("catalytic-converter"),
        CHROME_PARTS("chrome-parts"),
        CLOTH_SEATS("cloth-seats"),
        COVER("cover"),
        CRASH_BAR("crash-bar"),
        CRUISE_CONTROL("cruise-control"),
        CUSTOM_EXHAUST("custom-exhaust"),
        CUSTOM_HANDLEBAR("custom-handlebar"),
        DAB_RADIO("dab-radio"),
        DETACHABLE_TOWBAR("detachable-towbar"),
        DIFFERENTIAL_LOCKING("differential-locking"),
        DOUBLE_DISC_BRAKE("double-disc-brake"),
        DOUBLE_SEAT("double-seat"),
        ELECTRIC_SEAT("electric-seat"),
        ELECTRIC_TAILGATE("electric-tailgate"),
        ESP("esp"),
        FAST_CHARGING("fast-charging"),
        FLOORBOARD("floorboard"),
        FULL_PARTIAL_CASING("full-partial-casing"),
        HANDS_FREE_SET("hands-free-set"),
        HARDTOP("hardtop"),
        HEAD_UP_DISPLAY("head-up-display"),
        HEATED_GRIPS("heated-grips"),
        HEATED_SEATS("heated-seats"),
        HYDRAULIC_SYSTEM("hydraulic-system"),
        ISOFIX("isofix"),
        KEYLESS("keyless"),
        KITCHEN("kitchen"),
        LANE_ASSISTANT("lane-assistant"),
        LASER_HEADLIGHTS("laser-headlights"),
        LEATHER_SEATS("leather-seats"),
        LED("led"),
        LIFTGATE("liftgate"),
        LUGAGGE_RACK("luggage-rack"),
        NAVIGATION("navigation"),
        PANORAMA_ROOF("panorama-roof"),
        PARKING_SENSOR_FRONT("parking-sensor-front"),
        PARKING_SENSOR_REAR("parking-sensor-rear"),
        PARTIAL_LEATHER_SEATS("partial-leather-seats"),
        PORTABLE_NAVIGATION_SYSTEM("portable-navigation-system"),
        REAR_CAMERA("rear-camera"),
        REINFORCED_SUSPENSION("reinforced-suspension"),
        RETARDER_INTARDER("retarder-intarder"),
        RETRACTABLE_TOWBAR("retractable-towbar"),
        SADDLEBAG("saddlebag"),
        SHOWER("shower"),
        SLIDING_DOOR("sliding-door"),
        SOLO_SEAT("solo-seat"),
        SPEAKER("speaker"),
        SPECIAL_PAINT("special-paint"),
        SPOKED_WHEELS("spoked-wheels"),
        SPORT_SEATS("sport-seats"),
        START_STOP_SYSTEM("start-stop-system"),
        SUITCASE("suitcase"),
        SUNROOF("sunroof"),
        TANK_BAG("tank-bag"),
        TOILET("toilet"),
        TOP_CASE("top-case"),
        TOWBAR("towbar"),
        TRACTION_CONTROL("traction-control"),
        TV("tv"),
        TWIN_HEADLIGHTS("twin-headlights"),
        VENTILATED_SEATS("ventilated-seats"),
        WINDSHIELD("windshield"),
        WING_DOORS("wing-doors"),
        XENON_HEADLIGHTS("xenon-headlights"),
        ELECTRIC_WINDOWS("electric-windows");

        private final String value;

        EquipmentSearchAttribute(String value) {
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

    public enum EquipmentSearchAttributeGroup implements BaseEnum {
        AIR_CONDITION("air-condition"),
        HEADLIGHTS("headlights"),
        NAVIGATION_SYSTEM("navigation-system"),
        SEAT_COVERS("seat-covers"),
        TOWBAR("towbar");

        private final String value;

        EquipmentSearchAttributeGroup(String value) {
            this.value = value;
        }

        @Override
        public String getValue() {
            return value;
        }

        public static EquipmentSearchAttributeGroup ofAttribute(EquipmentSearchAttribute attribute) {
            if (attribute == null) {
                return null;
            }

            return switch (attribute) {
                case AIR_CONDITION, AUTOMATIC_AIR_CONDITION -> AIR_CONDITION;
                case LASER_HEADLIGHTS, LED, TWIN_HEADLIGHTS, XENON_HEADLIGHTS -> HEADLIGHTS;
                case NAVIGATION, PORTABLE_NAVIGATION_SYSTEM -> NAVIGATION_SYSTEM;
                case ALCANTARA, CLOTH_SEATS, LEATHER_SEATS, PARTIAL_LEATHER_SEATS -> SEAT_COVERS;
                case DETACHABLE_TOWBAR, RETRACTABLE_TOWBAR, TOWBAR -> TOWBAR;
                default -> null;
            };
        }

        @Override
        public String toString() {
            return value;
        }
    }
}
