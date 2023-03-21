package com.algaworks.algalogapi.commom;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * ModelMapperConfig
 */
@Configuration
public class ModelMapperConfig {

    @Bean
    public ModelMapper name() {
        return new ModelMapper();
    }

}
