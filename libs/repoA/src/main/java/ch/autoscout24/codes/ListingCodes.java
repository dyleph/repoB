package ch.autoscout24.codes;

import ch.autoscout24.codes.support.BaseEnum;

/**
 * @author Sasa Lukic
 */
public class ListingCodes {

    public enum ListingDataSource implements BaseEnum {
        APP_ANDROID("app-android"),
        APP_IPAD("app-ipad"),
        APP_IPHONE("app-iphone"),
        API_3RD_PARTIES_SWIFTCOURT_DIGITAL_CONTRACTS("api-3rd-parties-swiftcourt-digital-contracts"),
        API_CARAUKTION("api-carauktion"),
        API_DMS_AMAG("api-dms-amag"),
        API_DMS_ASS("api-dms-ass"),
        API_DMS_AUTO_WELT_VON_ROTZ_AG("api-dms-auto-welt-von-rotz-ag"),
        API_DMS_AUTOSCOUT24_TEST_ACCOUNT("api-dms-autoscout24-test-account"),
        API_DMS_BANTAM("api-dms-bantam"),
        API_DMS_BINELLI_GROUP("api-dms-binelli-group"),
        API_DMS_BME_AG("api-dms-bme-ag"),
        API_DMS_BMW_MOTO("api-dms-bmw-moto"),
        API_DMS_CLICKON("api-dms-clickon"),
        API_DMS_EFAG("api-dms-efag"),
        API_DMS_GARTENMANN("api-dms-gartenmann"),
        API_DMS_GENERIC("api-dms-generic"),
        API_DMS_PHYRON("api-dms-phyron"),
        API_DMS_PIXELCONCEPT("api-dms-pixelconcept"),
        API_DMS_TCAR_RRG("api-dms-tcar-rrg"),
        API_WEBAPP_RESPONSIVE_WEB_API("api-webapp-responsive-web-api"),
        FILE_IMPORT_AUTO_I_DAT("file-import-auto-i-dat"),
        FILE_IMPORT_AUTOWERT_EUROTAX("file-import-autowert-eurotax"),
        FILE_IMPORT_BMW_COUNTDOWN_AKTION("file-import-bmw-countdown-aktion"),
        FILE_IMPORT_BMW_MOTO_NEW("file-import-bmw-moto-new"),
        FILE_IMPORT_BMW_VKL("file-import-bmw-vkl"),
        FILE_IMPORT_BSI_SOFTWARE("file-import-bsi-software"),
        FILE_IMPORT_BYMYCAR_CH("file-import-bymycar-ch"),
        FILE_IMPORT_CLICKON("file-import-clickon"),
        FILE_IMPORT_DATABIKE_NEW("file-import-databike-new"),
        FILE_IMPORT_DATABIKE_XML("file-import-databike-xml"),
        FILE_IMPORT_DEALER_CAR_MANAGER("file-import-dealer-car-manager"),
        FILE_IMPORT_DUCATI("file-import-ducati"),
        FILE_IMPORT_ERNST_RUCKSTUHL_AG("file-import-ernst-ruckstuhl-ag"),
        FILE_IMPORT_GARAGE_HELBLING_AG("file-import-garage-helbling-ag"),
        FILE_IMPORT_LOCO_SOFT("file-import-loco-soft"),
        FILE_IMPORT_MOTO_I("file-import-moto-i"),
        FILE_IMPORT_MOTOWERT_EUROTAX("file-import-motowert-eurotax"),
        FILE_IMPORT_NEW_SOMMER_SOFTWARE_BALERI_AND_STRICKLER("file-import-new-sommer-software-baleri-and-strickler"),
        FILE_IMPORT_OPEL("file-import-opel"),
        FILE_IMPORT_PIXELCONCEPT("file-import-pixelconcept"),
        FILE_IMPORT_PORSCHE("file-import-porsche"),
        FILE_IMPORT_PSA("file-import-psa"),
        FILE_IMPORT_MSGM_CH("file-import-msgm-ch"),
        FILE_IMPORT_STIEGER_MOTO("file-import-stieger-moto"),
        FILE_IMPORT_TCAR_RRG("file-import-tcar-rrg"),
        FILE_IMPORT_VISUAL_SALES_STIEGER_SOFTWARE("file-import-visual-sales-stieger-software"),
        FILE_IMPORT_VOGELS_OFFROADS("file-import-vogels-offroads"),
        FILE_IMPORT_WEBMOBIL_AUTO_KUNZ_AG("file-import-webmobil-auto-kunz-ag"),
        UNKNOWN("unknown"),
        WEB_DESKTOP("web-desktop"),
        WEB_MOBILE("web-mobile"),
        WEB_PRICEFINDING("web-pricefinding");

        private final String value;

        ListingDataSource(String value) {
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

    public enum ListingSource implements BaseEnum {
        MANUAL("manual"),
        IMPORT("import");

        private final String value;

        ListingSource(String value) {
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

    public enum ListingStatus implements BaseEnum {
        ACTIVATED("activated"),
        DEACTIVATED("deactivated"),
        REMOVED("removed"),
        DRAFT("draft");

        private final String value;

        ListingStatus(String value) {
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
        NOT_SUBMITTED("not-submitted"),
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

    public enum VehicleCategory implements BaseEnum {
        CAR("car", Brand.AUTOSCOUT24),
        UTILITY("utility", Brand.AUTOSCOUT24),
        MOTORCYCLE("motorcycle", Brand.MOTOSCOUT24),
        TRUCK("truck", Brand.AUTOSCOUT24),
        CAMPER("camper", Brand.AUTOSCOUT24),
        TRAILER("trailer", Brand.AUTOSCOUT24);

        private final String value;

        private final Brand brand;

        VehicleCategory(String value, Brand brand) {
            this.value = value;
            this.brand = brand;
        }

        @Override
        public String getValue() {
            return value;
        }

        public Brand getBrand() {
            return brand;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public enum Brand implements BaseEnum {
        AUTOSCOUT24("autoscout24"),
        MOTOSCOUT24("motoscout24");

        private final String value;

        Brand(String value) {
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

    public enum BodyType implements BaseEnum {
        ALCOVE("alcove"),
        ATV_QUAD("atv-quad"),
        BOAT_TRAILER("boat-trailer"),
        BOX("box"),
        BOX_DOUBLE_CAB("box-double-cab"),
        BOX_GLAZED("box-glazed"),
        BRIDGE("bridge"),
        BRIDGE_DOUBLE_CAB("bridge-double-cab"),
        BUS("bus"),
        CAB_OVER("cab-over"),
        CABIN("cabin"),
        CABRIOLET("cabriolet"),
        CAR("car"),
        CARAVAN("caravan"),
        CAR_TRAILER("car-trailer"),
        CAR_TRANSPORTER("car-transporter"),
        CHASSIS_CAB("chassis-cab"),
        CHOPPER("chopper"),
        CONSTRUCTION_TRAILER("construction-trailer"),
        COUPE("coupe"),
        CUSTOM_BIKE("custom-bike"),
        E_BIKE("e-bike"),
        ESTATE("estate"),
        HORSE_TRAILER("horse-trailer"),
        INTEGRATED("integrated"),
        LIVESTOCK_TRAILER("livestock-trailer"),
        LOW_BED_TRAILER("low-bed-trailer"),
        MINIVAN("minivan"),
        MOPED("moped"),
        MOTOCROSS_BIKE("motocross-bike"),
        MOTORCYCLE_TRAILER("motorcycle-trailer"),
        MOTORHOME("motorhome"),
        NAKED_BIKE("naked-bike"),
        OFF_ROAD_BIKE("off-road-bike"),
        OTHER("other"),
        PICKUP("pickup"),
        PLATFORM("platform"),
        REEFER("reefer"),
        SALES_TRAILER("sales-trailer"),
        SALOON("saloon"),
        SANITARY_TRAILER("sanitary-trailer"),
        SCOOTER("scooter"),
        SEMI_INTEGRATED("semi-integrated"),
        SEMI_TRAILER("semi-trailer"),
        SIDECAR("sidecar"),
        SMALL_CAR("small-car"),
        SNOWMOBILE("snowmobile"),
        SPECIAL_VEHICLES_TRAILER("special-vehicles-trailer"),
        STREET_BIKE("street-bike"),
        SUITCASE("suitcase"),
        SUPERMOTO("supermoto"),
        SUV("suv"),
        TANK_BODY("tank-body"),
        TIPPER("tipper"),
        TOURING("touring"),
        TRAILER("trailer"),
        TRIKE("trike"),
        UPLOADER("uploader"),
        WOOD_TRANSPORTER("wood-transporter");

        private final String value;

        BodyType(String value) {
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

    public enum Color implements BaseEnum {
        ANTHRACITE("anthracite"),
        BEIGE("beige"),
        BLACK("black"),
        BLUE("blue"),
        BORDEAUX("bordeaux"),
        BROWN("brown"),
        GRAY("gray"),
        GOLD("gold"),
        GREEN("green"),
        MULTICOLORED("multicolored"),
        ORANGE("orange"),
        PINK("pink"),
        RED("red"),
        SILVER("silver"),
        TURQUOISE("turquoise"),
        VIOLET("violet"),
        WHITE("white"),
        YELLOW("yellow"),
        OTHER("other");

        private final String value;

        Color(String value) {
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

    public enum ConditionType implements BaseEnum {
        NEW("new"),
        USED("used"),
        DEMONSTRATION("demonstration"),
        OLDTIMER("oldtimer"),
        PRE_REGISTERED("pre-registered");

        private final String value;

        ConditionType(String value) {
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

    public enum ConditionTypeGroup implements BaseEnum {
        NEW("new"),
        USED("used");

        private final String value;

        ConditionTypeGroup(String value) {
            this.value = value;
        }

        @Override
        public String getValue() {
            return value;
        }

        public static ConditionTypeGroup ofType(ConditionType type) {
            if (type == null) {
                return null;
            }

            return switch (type) {
                case DEMONSTRATION, NEW, PRE_REGISTERED -> NEW;
                case OLDTIMER, USED -> USED;
            };
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public enum CylinderArrangement implements BaseEnum {
        INLINE("inline"),
        FLAT("flat"),
        V("v"),
        VR("vr"),
        ROTARY("rotary"),
        MONOBLOC("monobloc"),
        W("w");

        private final String value;

        CylinderArrangement(String value) {
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

    public enum DriveType implements BaseEnum {
        REAR("rear"),
        FRONT("front"),
        ALL("all");

        private final String value;

        DriveType(String value) {
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

    public enum FuelType implements BaseEnum {
        CNG_PETROL("cng-petrol"),
        DIESEL("diesel"),
        ELECTRIC("electric"),
        ETHANOL_PETROL("ethanol-petrol"),
        HEV_DIESEL("hev-diesel"),
        HEV_PETROL("hev-petrol"),
        HYDROGEN("hydrogen"),
        LPG_PETROL("lpg-petrol"),
        MHEV_DIESEL("mhev-diesel"),
        MHEV_PETROL("mhev-petrol"),
        PETROL("petrol"),
        PHEV_DIESEL("phev-diesel"),
        PHEV_PETROL("phev-petrol"),
        TWO_STROKE_MIXTURE("two-stroke-mixture");

        private final String value;

        FuelType(String value) {
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

    public enum FuelTypeGroup implements BaseEnum {
        DIESEL("diesel"),
        GAS("gas"),
        HYBRID("hybrid"),
        PETROL("petrol"),
        OTHER("other");

        private final String value;

        FuelTypeGroup(String value) {
            this.value = value;
        }

        @Override
        public String getValue() {
            return value;
        }

        public static FuelTypeGroup ofType(FuelType type) {
            if (type == null) {
                return null;
            }

            return switch (type) {
                case DIESEL, MHEV_DIESEL -> DIESEL;
                case CNG_PETROL, LPG_PETROL -> GAS;
                case HEV_DIESEL, HEV_PETROL, PHEV_DIESEL, PHEV_PETROL -> HYBRID;
                case MHEV_PETROL, PETROL -> PETROL;
                case ETHANOL_PETROL, HYDROGEN -> OTHER;
                case ELECTRIC, TWO_STROKE_MIXTURE -> null;
            };
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public enum TransmissionType implements BaseEnum {
        AUTOMATIC("automatic"),
        AUTOMATIC_STEPLESS("automatic-stepless"),
        SEMI_AUTOMATIC("semi-automatic"),
        MANUAL("manual");

        private final String value;

        TransmissionType(String value) {
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

    public enum TransmissionTypeGroup implements BaseEnum {
        AUTOMATIC("automatic"),
        MANUAL("manual");

        private final String value;

        TransmissionTypeGroup(String value) {
            this.value = value;
        }

        @Override
        public String getValue() {
            return value;
        }

        public static TransmissionTypeGroup ofType(TransmissionType type) {
            if (type == null) {
                return null;
            }

            return switch (type) {
                case AUTOMATIC, AUTOMATIC_STEPLESS, SEMI_AUTOMATIC -> TransmissionTypeGroup.AUTOMATIC;
                case MANUAL -> TransmissionTypeGroup.MANUAL;
            };
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public enum DriveSystem implements BaseEnum {
        BELT("belt"),
        CHAIN("chain"),
        SHAFT("shaft"),
        DIRECT("direct");

        private final String value;

        DriveSystem(String value) {
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

    public enum LicenseCategory implements BaseEnum {
        A("a"),
        A1("a1"),
        A_MINUS("a-"),
        B("b"),
        B1("b1"),
        C("c"),
        C1("c1"),
        F("f"),
        M("m");

        private final String value;

        LicenseCategory(String value) {
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

    public enum EmissionStandard implements BaseEnum {
        EURO_1("euro-1"),
        EURO_2("euro-2"),
        EURO_3("euro-3"),
        EURO_4("euro-4"),
        EURO_5("euro-5"),
        EURO_6("euro-6"),
        EURO_6A("euro-6a"),
        EURO_6B("euro-6b"),
        EURO_6C("euro-6c"),
        EURO_6D("euro-6d"),
        EURO_6D_TEMP("euro-6d-temp");

        private final String value;

        EmissionStandard(String value) {
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

    public enum EnergyLabel implements BaseEnum {
        A("a"),
        B("b"),
        C("c"),
        D("d"),
        E("e"),
        F("f"),
        G("g");

        private final String value;

        EnergyLabel(String value) {
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

    public enum WarrantyType implements BaseEnum {
        FROM_DATE("from-date"),
        FROM_DELIVERY("from-delivery"),
        FROM_FIRST_REGISTRATION("from-first-registration"),
        NONE("none");

        private final String value;

        WarrantyType(String value) {
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

    public enum VersionIdentificationMethod implements BaseEnum {
        VEHICLE_IDENTIFICATION_NUMBER("vehicle-identification-number"),
        CERTIFICATION_NUMBER("certification-number"),
        MAKE_MODEL("make-model"),
        NONE("none");

        private final String value;

        VersionIdentificationMethod(String value) {
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
