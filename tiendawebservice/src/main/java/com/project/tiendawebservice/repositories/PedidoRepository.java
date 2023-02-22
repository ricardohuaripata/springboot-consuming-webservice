package com.project.tiendawebservice.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.tiendawebservice.models.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long>  {

    List<Pedido> findByidUsuario(int idUsuario);

}
