package com.example.demo1.model.pageinfo;

import lombok.Data;

@Data
public class ParkingPage {
    private String parkingUId;
    private String parkingUName;
    private String parkingAId;
    private String parkingCId;
    private Integer page=1;
}
