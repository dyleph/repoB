package ch.autoscout24.codes;

import org.junit.jupiter.api.Test;

import static ch.autoscout24.codes.PaymentCodes.PaymentMethodType;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author Jelena Sijan
 */
class PaymentMethodTypeTest {

    @Test
    void ofProviderCode() {
        assertThat(PaymentMethodType.ofProviderCode("ECA")).isEqualTo(PaymentMethodType.MASTER_CARD);
        assertThat(PaymentMethodType.ofProviderCode("VIS")).isEqualTo(PaymentMethodType.VISA);
        assertThat(PaymentMethodType.ofProviderCode("PFC")).isEqualTo(PaymentMethodType.POST_FINANCE_CARD);
        assertThat(PaymentMethodType.ofProviderCode("PEF")).isEqualTo(PaymentMethodType.POST_FINANCE_E_FINANCE);
        assertThat(PaymentMethodType.ofProviderCode("TWI")).isEqualTo(PaymentMethodType.TWINT);
    }

    @Test
    void getProviderCode() {
        assertThat(PaymentMethodType.MASTER_CARD.getProviderCode()).isEqualTo("ECA");
        assertThat(PaymentMethodType.VISA.getProviderCode()).isEqualTo("VIS");
        assertThat(PaymentMethodType.POST_FINANCE_CARD.getProviderCode()).isEqualTo("PFC");
        assertThat(PaymentMethodType.POST_FINANCE_E_FINANCE.getProviderCode()).isEqualTo("PEF");
        assertThat(PaymentMethodType.TWINT.getProviderCode()).isEqualTo("TWI");
    }
}
