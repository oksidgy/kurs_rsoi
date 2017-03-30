package ru.belyaeva.rsoi.model;

import lombok.Data;
import java.util.List;
import java.util.Date;

/**
 * Created by user on 18.12.2016.
 */
@Data
public class Delivery {
    private Long Id;
    private Long UserId;
    private boolean Paid;
    private BillingResponse Billing;
    private List<Long> Tracks;
    private String Name;
    private Double Weight;
    private Double Width;
    private Double Height;
    private Double Deep;
    private Date TimeDelivery;
    private String AddressStart;
    private String AddressFinish;
    private String Description;
}