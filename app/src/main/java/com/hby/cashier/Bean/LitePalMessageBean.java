package com.hby.cashier.Bean;


import org.litepal.crud.LitePalSupport;

/**
 * 功能介绍:聊天保存数据库
 * 调用方式:
 * 作   者: Hyy - 825129541@qq.com
 * 创建电脑: admin
 * 创建时间: 2020/12/22 17:38
 * 最后编辑: 2020/12/22 - Hyy
 *
 * @author HouYinYu
 */
public class LitePalMessageBean extends LitePalSupport {
    private String sellerID;
    private String buyerID;
    private String shopID;
    private String messageJson;

    public String getSellerID() {
        return sellerID;
    }

    public void setSellerID(String sellerID) {
        this.sellerID = sellerID;
    }

    public String getBuyerID() {
        return buyerID;
    }

    public void setBuyerID(String buyerID) {
        this.buyerID = buyerID;
    }

    public String getShopID() {
        return shopID;
    }

    public void setShopID(String shopID) {
        this.shopID = shopID;
    }

    public String getMessageJson() {
        return messageJson;
    }

    public void setMessageJson(String messageJson) {
        this.messageJson = messageJson;
    }
}
