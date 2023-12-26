package com.iamjrp.shopkart.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.Arrays;

//Demo of @Primary
@Configuration
public class ItemConfig {

    @Bean
    @Primary
    public Item mobileItem() {
        return Item.builder()
                .id(1L)
                .name("samsung galaxy A71")
                .description("Samsung mobile under 35K INR")
                .price(35000L)
                .ccyType("INR")
                .category("mobile")
                .stockCount(10L)
                .pincodes(Arrays.asList("753009", "400608"))
                .build();
    }

    @Bean
    public Item groceryItem() {
        return Item.builder()
                .id(1L)
                .name("Maggie")
                .description("Two minutes noodles")
                .price(30L)
                .ccyType("INR")
                .category("fastfood")
                .stockCount(100L)
                .pincodes(Arrays.asList("400602", "400608"))
                .build();
    }
}
