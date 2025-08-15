package org.example;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.example.Methods.makeValidator;

public class MethodsTest {

    @Test
    public void testValidator() {
        var validator = makeValidator();

        assertThat(validator.isValid(null)).isTrue();
        assertThat(validator.isValid(0)).isTrue();
        assertThat(validator.isValid(1)).isTrue();

        assertThat(validator.isValid("number")).isFalse();
        assertThat(validator.isValid(0.5f)).isFalse();

        validator.required();
        assertThat(validator.isValid(0)).isTrue();
        assertThat(validator.isValid(1)).isTrue();

        assertThat(validator.isValid("number")).isFalse();
        assertThat(validator.isValid(null)).isFalse();
        assertThat(validator.isValid(0.5f)).isFalse();



        validator.positive();
        assertThat(validator.isValid(1)).isTrue();

        assertThat(validator.isValid("number")).isFalse();
        assertThat(validator.isValid(null)).isFalse();
        assertThat(validator.isValid(0.5f)).isFalse();
        assertThat(validator.isValid(0)).isFalse();

    }
}
