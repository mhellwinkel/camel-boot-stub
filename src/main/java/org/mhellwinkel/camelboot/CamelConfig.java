package org.mhellwinkel.camelboot;

import org.apache.camel.*;
import org.apache.camel.spring.boot.CamelContextConfiguration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix="camel")
public class CamelConfig {
    private static final Logger log = LoggerFactory.getLogger(CamelConfig.class);

    @Bean
    CamelContextConfiguration contextConfiguration() {
        return new CamelContextConfiguration() {
            @Override
            public void beforeApplicationStart(CamelContext camelContext) {
            }

            @Override
            public void afterApplicationStart(CamelContext camelContext) {
            }
        };
    }
}

