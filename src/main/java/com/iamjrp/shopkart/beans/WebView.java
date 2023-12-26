package com.iamjrp.shopkart.beans;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("web")
public class WebView implements View {
    @Override
    public String getType() {
        return "web";
    }
}
