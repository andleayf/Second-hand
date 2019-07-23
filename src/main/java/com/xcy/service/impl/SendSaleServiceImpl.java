package com.xcy.service.impl;

import com.xcy.mapper.SendSaleMapper;
import com.xcy.pojo.SendSale;
import com.xcy.service.SendSaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SendSaleServiceImpl implements SendSaleService {

    @Autowired
    SendSaleMapper sendSaleMapper;
    @Override
    public void insertIntoGoodsImg(String s, String s1, String s2, String s3, int userId) {
        SendSale sendSale = new SendSale();
        sendSale.setUserId(userId);
        sendSale.setBeforeImg(s);
        sendSale.setCodeImg(s1);
        sendSale.setBrandImg(s2);
        sendSale.setFaPiaoImg(s3);
        sendSaleMapper.insertIntoGoodsImg(sendSale);
    }
}
