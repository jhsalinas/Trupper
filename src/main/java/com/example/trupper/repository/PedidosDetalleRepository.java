package com.example.trupper.repository;

import com.example.trupper.domain.PedidosDetalle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidosDetalleRepository extends JpaRepository<PedidosDetalle, Long> {
}
