package com.TimeDateFormat.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "bus_operator")
public class BusOperator {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private long id;

    private Date date;

    private LocalTime time;
}
