package com.example.transaksi.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tbl_fee")
public class TblFee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "employee_id")
    private Long employeeId;

    @Column(name = "amount_fee")
    private Double amountFee;

    @Column(name = "tgl_fee")
    private Date tglFee;

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
     * @return Double return the amountFee
     */
    public Double getAmountFee() {
        return amountFee;
    }

    /**
     * @param amountFee the amountFee to set
     */
    public void setAmountFee(Double amountFee) {
        this.amountFee = amountFee;
    }

    /**
     * @return Date return the tglFee
     */
    public Date getTglFee() {
        return tglFee;
    }

    /**
     * @param tglFee the tglFee to set
     */
    public void setTglFee(Date tglFee) {
        this.tglFee = tglFee;
    }

}
