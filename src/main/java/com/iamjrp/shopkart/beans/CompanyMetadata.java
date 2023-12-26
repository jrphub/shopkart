package com.iamjrp.shopkart.beans;

import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import java.util.List;
import java.util.Map;

/**
 * Usage of @ConfigurationProperties
 */
@Data
@Component
@ConfigurationProperties("company") //same as @ConfigurationProperties(prefix = "company") //doesn't support SpEL evaluation
@Validated //To trigger the validation
public class CompanyMetadata {

    @NotNull //spring-boot-starter-validation dependency added
    private String name;

    private List<String> locationList;
    private Map<String, String> teamMap;
}
