package com.example.transaksi.repository;

import com.example.transaksi.model.TblTransaksi;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TblTransaksiRepository extends JpaRepository<TblTransaksi, Long> {
}
