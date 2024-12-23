package com.example.transaksi.repository;

import com.example.transaksi.model.LogTransaksi;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LogTransaksiRepository extends JpaRepository<LogTransaksi, Long> {
}
