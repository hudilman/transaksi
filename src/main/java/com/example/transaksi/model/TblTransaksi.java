package com.example.transaksi.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tbl_transaksi")
public class TblTransaksi {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "employee_id")
    private Long employeeId;

    private Double amount;

    @Column(name = "tgl_transaksi")
    private Date tglTransaksi;

    // Getter and Setter

    /**
     * @return Long return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return Long return the employeeId
     */
    public Long getEmployeeId() {
        return employeeId;
    }

    /**
     * @param employeeId the employeeId to set
     */
    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    /**
     * @return Double return the amount
     */
    public Double getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    /**
     * @return Date return the tglTransaksi
     */
    public Date getTglTransaksi() {
        return tglTransaksi;
    }

    /**
     * @param tglTransaksi the tglTransaksi to set
     */
    public void setTglTransaksi(Date tglTransaksi) {
        this.tglTransaksi = tglTransaksi;
    }

}
