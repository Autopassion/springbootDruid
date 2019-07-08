package com.bigfang.springbootdruid.PO;

import lombok.Data;

@Data
public class Admin {
    private Long id;
    private String username;
    private Integer locked;
    private String password;
}
