package com.example.trupper.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@Builder
@Table( name = "PEDIDOS_W")
public class Pedidos {

    public Pedidos(){
    }

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "TOTAL")
    private Double total;

    @Column(name = "DATE_SALE")
    private Date dateSale;

    @Column(name = "USERNAME")
    private String userName;

}
