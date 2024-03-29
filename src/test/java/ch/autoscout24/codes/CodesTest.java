package ch.autoscout24.codes;

import ch.autoscout24.codes.support.BaseEnum;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author Sinisa Komarica
 */
class CodesTest {

    @Test
    void codeDefinitionClassesAreImplementingBaseEnum() {
        Stream.of(SellerCodes.class,
                LeadCodes.class,
                FraudDetectionCodes.class,
                CommonCodes.class,
                ListingCodes.class,
                PaymentCodes.class,
                ProductCodes.class,
                CatalogueCodes.class,
                UserCodes.class).map(Class::getDeclaredClasses).flatMap(Arrays::stream).forEach(c -> {
            assertThat(c.isEnum()).isTrue();
            assertThat(c.getInterfaces()).contains(BaseEnum.class);
        });
    }
}
