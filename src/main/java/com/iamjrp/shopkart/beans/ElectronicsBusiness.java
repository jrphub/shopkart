package com.iamjrp.shopkart.beans;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * Demo of @Profile
 */
@Component("electronics")
public class ElectronicsBusiness implements Business {

    @Override
    public String getBusinessType() {
        return "electronics";
    }
}
