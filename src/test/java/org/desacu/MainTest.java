package org.desacu;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MainTest {

    @Test
    void should_say_hello() {
        assertThat(Main.hello()).isEqualTo("Hello world!");
    }
}
