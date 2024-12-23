package com.example.transaksi.service;

import com.example.transaksi.model.TblTransaksi;
import com.example.transaksi.repository.LogTransaksiRepository;
import com.example.transaksi.repository.TblFeeRepository;
import com.example.transaksi.repository.TblTransaksiRepository;
import com.example.transaksi.model.TblFee;
import com.example.transaksi.model.LogTransaksi;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class TransactionService {

    @Autowired
    private TblTransaksiRepository transaksiRepository;

    @Autowired
    private TblFeeRepository feeRepository;

    @Autowired
    private LogTransaksiRepository logTransaksiRepository;

    @Transactional
    public LogTransaksi processCsvFile(String filename) throws IOException {
        List<TblTransaksi> transactions = new ArrayList<>();
        long totalRecords = 0, failedRecords = 0, successRecords = 0;
        StringBuilder failedIds = new StringBuilder();

        // Read CSV file
        FileReader fileReader = new FileReader(filename);
        Iterable<CSVRecord> records = CSVFormat.DEFAULT
                .withDelimiter(';')
                .withHeader()
                .parse(fileReader);

        for (CSVRecord record : records) {
            totalRecords++;
            Long employeeId = Long.parseLong(record.get("employee_id"));
            Double amount = Double.parseDouble(record.get("Amount"));
            String transactionDate = record.get("tgl_transaksi");

            // Simulate finding employee and processing transaction
            // Assume some logic here to calculate fee based on hierarchy
            if (isEmployeeValid(employeeId)) {
                TblTransaksi transaksi = new TblTransaksi();
                transaksi.setEmployeeId(employeeId);
                transaksi.setAmount(amount);
                transaksi.setTglTransaksi(java.sql.Date.valueOf(transactionDate));

                transaksiRepository.save(transaksi);
                successRecords++;
            } else {
                failedRecords++;
                failedIds.append(employeeId).append(",");
            }
        }

        // Save log entry for this process
        LogTransaksi log = new LogTransaksi();
        log.setCsvFilename(filename);
        log.setTotalRecord(totalRecords);
        log.setTotalRecordFailed(failedRecords);
        log.setTotalRecordSuccess(successRecords);
        log.setFailedIdNotes(failedIds.toString());
        log.setUploadDate(new java.util.Date());

        logTransaksiRepository.save(log);

        return log;
    }

    private boolean isEmployeeValid(Long employeeId) {
        // Check if the employee exists in the database (dummy implementation)
        return employeeId != null;  // Add proper logic here
    }
}
