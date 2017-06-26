package com.afrAsia.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.function.Consumer;

import com.afrAsia.dao.jpa.DTDPSJpaDAO;
import com.afrAsia.entities.DigitalTxnDaily;
import com.afrAsia.entities.response.DailyTxnDataResponse;
import com.afrAsia.service.DTDPSService;

/**
 * 
 * @author nyalfernandes
 *
 */
public class DTDPSServiceImpl implements DTDPSService
{
    private DTDPSJpaDAO dtdpsDAO;

    public DTDPSJpaDAO getDtdpsDAO()
    {
        return dtdpsDAO;
    }

    public void setDtdpsDAO(DTDPSJpaDAO dtdpsDAO)
    {
        this.dtdpsDAO = dtdpsDAO;
    }

    public List<DailyTxnDataResponse> fetchTransactions(Date date, Integer onUsInd)
    {
        final List<DailyTxnDataResponse> txnList = new ArrayList<DailyTxnDataResponse>();

        if (date == null)
        {
            return txnList;
        }

        List<DigitalTxnDaily> dbTxnDataList = dtdpsDAO.getAllTransactionsOfDate(date, onUsInd);
//        System.out.println(dbTxnDataList);

        if (dbTxnDataList != null)
        {
            dbTxnDataList.parallelStream().forEach(new Consumer<DigitalTxnDaily>()
            {
                public void accept(DigitalTxnDaily t)
                {
                	if (t != null)
                	{
                		txnList.add(DailyTxnDataResponse.parse(t));
                	}
                }
            });
        }

        return txnList;
    }

}