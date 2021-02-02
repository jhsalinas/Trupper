package com.example.trupper.controller;

import com.example.trupper.constants.Constants;
import com.example.trupper.domain.Pedidos;
import com.example.trupper.model.PedidosBody;
import com.example.trupper.service.PedidosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.awt.*;
import java.util.List;

@RestController
@Validated
@RequestMapping(value = Constants.BASE_PATH)
public class PedidosController {

    @Autowired
    private PedidosService pedidosService;

    @PostMapping(value = Constants.SAVE_PATH, consumes = MediaType.APPLICATION_JSON_VALUE,
        produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<HttpStatus> createPedido(@Valid @RequestBody PedidosBody pedido){
        pedidosService.savePedido(pedido);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping(value = Constants.GET_PATH, consumes = MediaType.APPLICATION_JSON_VALUE,
        produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Pedidos>> getPedidos(){
        return new ResponseEntity<>(pedidosService.getPedidos(), HttpStatus.OK);
    }


}
