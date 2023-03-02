package com.itheima.domain;

import lombok.Data;
import org.springframework.stereotype.Repository;

@Repository
@Data
public class Book {
    private Integer id;
    private String type;
    private String name;
    private String description;
}
