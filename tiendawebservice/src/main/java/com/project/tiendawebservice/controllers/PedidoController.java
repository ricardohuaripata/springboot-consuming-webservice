package com.project.tiendawebservice.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.tiendawebservice.models.Pedido;
import com.project.tiendawebservice.services.PedidoService;

@RestController
@RequestMapping("/api/pedidos")
public class PedidoController {

    @Autowired
    PedidoService pedidoService;

    @GetMapping()
    public ArrayList<Pedido> obtenerPedidos() {
        return pedidoService.getAllPedidos();
    }

    @GetMapping("/usuario/{idUsuario}")
    public List<Pedido> obtenerPedidosUsuario(@PathVariable int idUsuario) {
        return pedidoService.getAllPedidosByUser(idUsuario);
    }
       
    
}
