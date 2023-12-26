package com.iamjrp.shopkart.controller;

import com.iamjrp.shopkart.beans.Business;
import com.iamjrp.shopkart.beans.CompanyMetadata;
import com.iamjrp.shopkart.beans.Item;
import com.iamjrp.shopkart.beans.View;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class HomeController {

    @Value("${app.page}") //property injection
    private String page;
    @Value("${app.env:default}") //active profile
    private String env;

    //Bean injection
    @Autowired
    private CompanyMetadata companyMetadata;

    /**
     * Now we have two beans for business i.e. ElectronicsBusiness and GroceryBusiness.
     * Spring will be confused which one to inject.
     * It will throw NoUniqueBeanDefinitionException
     * How to solve?
     */

    //Solution 1 : use of @Qualifier & @Component combination
    @Autowired
    @Qualifier("grocery")
    private Business business;

    //Solution 2 : use of @Profile with passing spring.profiles.active parameter
    @Autowired
    private View view;

    //Solution 3: use of @Primary i.e. default profile
    @Autowired
    private Item item;

    //Solution 4: Using the name of the field to inject
    @Autowired
    private Business electronics;


    @GetMapping("/") //START
    public String getHomePage() {
        return page.toUpperCase() + " : Welcome to Shopkart !!! - " + env;
    }

    /**
     * Usage of @ConfigurationProperties
     *
     * @return
     */
    @GetMapping("/about") //for property injection using @ConfigurationProperties
    private String getCompanyDetails() {
        return companyMetadata.toString();
    }

    @GetMapping("/business") //resolving bean
    private String getBusiness() {
        return business.getBusinessType();
    }

    @GetMapping("/view") //resolving bean
    private String getView() {
        return view.getType();
    }

    @GetMapping("/item") //resolving bean
    private String getItem() {
        return item.toString();
    }

    @GetMapping("/electronics") //resolving bean
    private String getElectronicsBusiness() {
        log.info("fetch business type");
        return electronics.getBusinessType();
    }


}
