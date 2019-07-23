package com.xcy.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Cart {
    private int cartId;
    private int userId;
    private int goodsId;
    private int status;
    @JsonFormat(pattern="yyyy-MM-dd",timezone="GMT+8")
    private Date createTime;

    //goods


    private String varchar;
    private int goodsNowPrice;
    private int goodsMarkerPrice;
    private  String goodsDiscount;
    private  String goodsNew;
    private  int brandId;
    private String goodsSize;
    private String goodsSex;
    private  int typeId;
    private String goodsImg;





    public int getCartId() {
        return cartId;
    }

    public void setCartId(int cartId) {
        this.cartId = cartId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(int goodsId) {
        this.goodsId = goodsId;
    }

    public String getVarchar() {
        return varchar;
    }

    public void setVarchar(String varchar) {
        this.varchar = varchar;
    }

    public int getGoodsNowPrice() {
        return goodsNowPrice;
    }

    public void setGoodsNowPrice(int goodsNowPrice) {
        this.goodsNowPrice = goodsNowPrice;
    }

    public int getGoodsMarkerPrice() {
        return goodsMarkerPrice;
    }

    public void setGoodsMarkerPrice(int goodsMarkerPrice) {
        this.goodsMarkerPrice = goodsMarkerPrice;
    }

    public String getGoodsDiscount() {
        return goodsDiscount;
    }

    public void setGoodsDiscount(String goodsDiscount) {
        this.goodsDiscount = goodsDiscount;
    }

    public String getGoodsNew() {
        return goodsNew;
    }

    public void setGoodsNew(String goodsNew) {
        this.goodsNew = goodsNew;
    }

    public int getBrandId() {
        return brandId;
    }

    public void setBrandId(int brandId) {
        this.brandId = brandId;
    }

    public String getGoodsSize() {
        return goodsSize;
    }

    public void setGoodsSize(String goodsSize) {
        this.goodsSize = goodsSize;
    }

    public String getGoodsSex() {
        return goodsSex;
    }

    public void setGoodsSex(String goodsSex) {
        this.goodsSex = goodsSex;
    }



    public String getGoodsImg() {
        return goodsImg;
    }

    public void setGoodsImg(String goodsImg) {
        this.goodsImg = goodsImg;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Date getCreatTime() {
        return createTime;
    }

    public void setCreatTime(Date creatTime) {
        this.createTime = creatTime;
    }


}
