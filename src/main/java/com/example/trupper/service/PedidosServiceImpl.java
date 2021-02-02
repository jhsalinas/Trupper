package com.example.trupper.service;

import com.example.trupper.domain.Pedidos;
import com.example.trupper.exceptions.SaveException;
import com.example.trupper.model.PedidosBody;
import com.example.trupper.repository.PedidosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PedidosServiceImpl implements PedidosService {

    @Autowired
    private PedidosRepository pedidosRepository;

    @Override
    public void savePedido(PedidosBody pedido) {

        Pedidos pedidoRepo = Pedidos.builder()
                .total(pedido.getTotal())
                .dateSale(pedido.getDateSale())
                .userName(pedido.getUserName())
                .build();

        Optional.ofNullable(pedidosRepository.save(pedidoRepo))
                .orElseThrow(SaveException::new);

    }

    @Override
    public List<Pedidos> getPedidos() {

        List<Pedidos> pedidos = new ArrayList<>();

        pedidos = pedidosRepository.findAll();

        return pedidos;
    }
}
