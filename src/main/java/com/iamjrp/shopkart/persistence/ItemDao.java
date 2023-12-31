package com.iamjrp.shopkart.persistence;

import com.iamjrp.shopkart.beans.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemDao extends JpaRepository<Item, Long> {
}
