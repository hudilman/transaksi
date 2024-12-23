package com.example.transaksi.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "log_transaksi")
public class LogTransaksi {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "csv_filename")
    private String csvFilename;

    @Column(name = "total_record")
    private Long totalRecord;

    @Column(name = "total_record_failed")
    private Long totalRecordFailed;

    @Column(name = "total_record_success")
    private Long totalRecordSuccess;

    @Column(name = "failed_id_notes")
    private String failedIdNotes;

    @Column(name = "upload_date")
    private Date uploadDate;

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
     * @return String return the csvFilename
     */
    public String getCsvFilename() {
        return csvFilename;
    }

    /**
     * @param csvFilename the csvFilename to set
     */
    public void setCsvFilename(String csvFilename) {
        this.csvFilename = csvFilename;
    }

    /**
     * @return Long return the totalRecord
     */
    public Long getTotalRecord() {
        return totalRecord;
    }

    /**
     * @param totalRecord the totalRecord to set
     */
    public void setTotalRecord(Long totalRecord) {
        this.totalRecord = totalRecord;
    }

    /**
     * @return Long return the totalRecordFailed
     */
    public Long getTotalRecordFailed() {
        return totalRecordFailed;
    }

    /**
     * @param totalRecordFailed the totalRecordFailed to set
     */
    public void setTotalRecordFailed(Long totalRecordFailed) {
        this.totalRecordFailed = totalRecordFailed;
    }

    /**
     * @return Long return the totalRecordSuccess
     */
    public Long getTotalRecordSuccess() {
        return totalRecordSuccess;
    }

    /**
     * @param totalRecordSuccess the totalRecordSuccess to set
     */
    public void setTotalRecordSuccess(Long totalRecordSuccess) {
        this.totalRecordSuccess = totalRecordSuccess;
    }

    /**
     * @return String return the failedIdNotes
     */
    public String getFailedIdNotes() {
        return failedIdNotes;
    }

    /**
     * @param failedIdNotes the failedIdNotes to set
     */
    public void setFailedIdNotes(String failedIdNotes) {
        this.failedIdNotes = failedIdNotes;
    }

    /**
     * @return Date return the uploadDate
     */
    public Date getUploadDate() {
        return uploadDate;
    }

    /**
     * @param uploadDate the uploadDate to set
     */
    public void setUploadDate(Date uploadDate) {
        this.uploadDate = uploadDate;
    }

}
