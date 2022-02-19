package com.example.demo1.model.pageinfo;

import lombok.Data;

@Data
public class UserPage {

    private String uName;
    private String uPwd;
    private Integer page=1;

}
