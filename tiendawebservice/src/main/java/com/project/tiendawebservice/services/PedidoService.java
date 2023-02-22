package com.project.tiendawebservice.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.tiendawebservice.models.Pedido;
import com.project.tiendawebservice.repositories.PedidoRepository;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    public ArrayList<Pedido> getAllPedidos() {
        return (ArrayList<Pedido>) pedidoRepository.findAll();
    }

    public List<Pedido> getAllPedidosByUser(int idUsuario) {
        return (List<Pedido>) pedidoRepository.findByidUsuario(idUsuario);
    }
}
