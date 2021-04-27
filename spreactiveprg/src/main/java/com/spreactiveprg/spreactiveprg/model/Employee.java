package com.spreactiveprg.spreactiveprg.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter
@Setter
public class Employee {

    @Id
    private String id;
    private String name;
    private String city;
}
