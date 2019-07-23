package com.xcy.pojo;

import java.util.Date;

public class Identify {
    private int id;
    private String goodsId;
    private int price;
    private String goodsNew;
    private int result;
    private int status;
    private String imgurl;
    private String userName;
    private Date createTime;

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Identify() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getGoodsNew() {
        return goodsNew;
    }

    public void setGoodsNew(String goodsNew) {
        this.goodsNew = goodsNew;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
    }

    @Override
    public String toString() {
        return "Identify{" +
                "id=" + id +
                ", goodsId='" + goodsId + '\'' +
                ", price=" + price +
                ", goodsNew='" + goodsNew + '\'' +
                ", result=" + result +
                ", status=" + status +
                ", imgurl='" + imgurl + '\'' +
                '}';
    }
}
