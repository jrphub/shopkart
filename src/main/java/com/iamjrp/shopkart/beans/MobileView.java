package com.iamjrp.shopkart.beans;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("mobile")
public class MobileView implements View {
    @Override
    public String getType() {
        return "mobile";
    }
}
