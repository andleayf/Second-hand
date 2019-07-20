package com.xcy.pojo;

import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

public class Order {
    //表order
    private int orderId;
    private  int userId;
    private  int goodsId;
    private Date createTime;
    private  String addressId;
    //表address
    private int id;

    private String address;
    //goods

    private String varchar;
    private int goodsNowPrice;
    private int goodsMarkerPrice;
    private  String goodsDiscount;
    private  String goodsNew;
    private  int brandId;
    private String goodsSize;
    private String goodsSex;
    private  int watchId;
    private  int packageId;
    private  int jewelryId;
    private String goodsImg;

    private int storeId;
    //表user

    private String userPhone;
    private String password;
    private String userCode;
    private String userName;
    private String userSex;
    private String userHeadImg;
    private String userTwoCode;

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getAddressId() {
        return addressId;
    }

    public void setAddressId(String addressId) {
        this.addressId = addressId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    public int getWatchId() {
        return watchId;
    }

    public void setWatchId(int watchId) {
        this.watchId = watchId;
    }

    public int getPackageId() {
        return packageId;
    }

    public void setPackageId(int packageId) {
        this.packageId = packageId;
    }

    public int getJewelryId() {
        return jewelryId;
    }

    public void setJewelryId(int jewelryId) {
        this.jewelryId = jewelryId;
    }

    public String getGoodsImg() {
        return goodsImg;
    }

    public void setGoodsImg(String goodsImg) {
        this.goodsImg = goodsImg;
    }

    public int getStoreId() {
        return storeId;
    }

    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public String getUserHeadImg() {
        return userHeadImg;
    }

    public void setUserHeadImg(String userHeadImg) {
        this.userHeadImg = userHeadImg;
    }

    public String getUserTwoCode() {
        return userTwoCode;
    }

    public void setUserTwoCode(String userTwoCode) {
        this.userTwoCode = userTwoCode;
    }
}
