package com.example.trupper.service;

import com.example.trupper.domain.Pedidos;
import com.example.trupper.model.PedidosBody;

import java.util.List;

public interface PedidosService {

    public void savePedido(PedidosBody pedido);

    public List<Pedidos> getPedidos();
}
