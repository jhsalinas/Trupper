package com.example.trupper.model;

import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.util.Date;

@Data
@Builder
public class PedidosBody {

    @NotNull
    private Double total;

    @NotNull
    private Date dateSale;

    @NotNull
    private String userName;

}
