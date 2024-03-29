package ch.autoscout24.codes.support;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * @author Sinisa Komarica
 */
public interface BaseEnum {

    @JsonValue
    String getValue();
}
