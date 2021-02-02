package com.example.trupper.domain;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "PEDIDOS_DETALLE_W")
public class PedidosDetalle {

    public PedidosDetalle(){}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "ID_PEDIDO")
    private Long idPedido;

    @Column(name = "SKU")
    private String sku;

    @Column(name = "AMOUT")
    private Double amout;

    @Column(name = "PRICE")
    private Double price;

}
