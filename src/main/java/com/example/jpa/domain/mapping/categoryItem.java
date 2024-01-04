package com.example.jpa.domain.mapping;

import com.example.jpa.domain.Category;
import com.example.jpa.domain.common.BaseEntity.Item;
import jakarta.persistence.Entity;

@Entity
public class categoryItem {
    private Category category;

    private Item item;
}
