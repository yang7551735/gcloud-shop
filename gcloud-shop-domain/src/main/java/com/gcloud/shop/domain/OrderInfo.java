package com.gcloud.shop.domain;

import java.util.Date;

public class OrderInfo {
    /**
     * 主键 <p/>
     * This field corresponds to the database column tb_shop_order.id
     *
     * @mbggenerated Tue Aug 16 23:58:39 CST 2016
     */
    private Long id;

    /**
     * 门店ID <p/>
     * This field corresponds to the database column tb_shop_order.store_id
     *
     * @mbggenerated Tue Aug 16 23:58:39 CST 2016
     */
    private String storeId;

    /**
     * 用户标识符，用于指定集分宝发放的用户，和user_symbol_type一起使用，确定一个唯一的支付宝用户 <p/>
     * This field corresponds to the database column tb_shop_order.user_symbol
     *
     * @mbggenerated Tue Aug 16 23:58:39 CST 2016
     */
    private String userSymbol;

    /**
     * 用户标识符类型， 现在支持ALIPAY_USER_ID:表示支付宝用户ID, ALIPAY_LOGON_ID:表示支付宝登陆号, TAOBAO_NICK:淘宝昵称 <p/>
     * This field corresponds to the database column tb_shop_order.user_symbol_type
     *
     * @mbggenerated Tue Aug 16 23:58:39 CST 2016
     */
    private Byte userSymbolType;

    /**
     * 发放集分宝的数量 <p/>
     * This field corresponds to the database column tb_shop_order.point_count
     *
     * @mbggenerated Tue Aug 16 23:58:39 CST 2016
     */
    private String pointCount;

    /**
     * isv提供的发放订单号，由数字和字母组成，最大长度为32位，需要保证每笔订单发放的唯一性，支付宝对该参数做唯一性校验。如果订单号已存在，支付宝将返回订单号已经存在的错误 <p/>
     * This field corresponds to the database column tb_shop_order.merchant_order_no
     *
     * @mbggenerated Tue Aug 16 23:58:39 CST 2016
     */
    private String merchantOrderNo;

    /**
     * 向用户展示集分宝发放备注 <p/>
     * This field corresponds to the database column tb_shop_order.memo
     *
     * @mbggenerated Tue Aug 16 23:58:39 CST 2016
     */
    private String memo;

    /**
     * 发放集分宝时间 <p/>
     * This field corresponds to the database column tb_shop_order.order_time
     *
     * @mbggenerated Tue Aug 16 23:58:39 CST 2016
     */
    private Date orderTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_shop_order.created
     *
     * @mbggenerated Tue Aug 16 23:58:39 CST 2016
     */
    private Date created;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_shop_order.modified
     *
     * @mbggenerated Tue Aug 16 23:58:39 CST 2016
     */
    private Date modified;

    /**
     * 0否 1是 <p/>
     * This field corresponds to the database column tb_shop_order.enable_status
     *
     * @mbggenerated Tue Aug 16 23:58:39 CST 2016
     */
    private Boolean enableStatus;

    /**
     * 主键 <p/>
     * This method returns the value of the database column tb_shop_order.id
     *
     * @return the value of tb_shop_order.id
     *
     * @mbggenerated Tue Aug 16 23:58:39 CST 2016
     */
    public Long getId() {
        return id;
    }

    /**
     * 主键 <p/>
     * This method sets the value of the database column tb_shop_order.id
     *
     * @param id the value for tb_shop_order.id
     *
     * @mbggenerated Tue Aug 16 23:58:39 CST 2016
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 门店ID <p/>
     * This method returns the value of the database column tb_shop_order.store_id
     *
     * @return the value of tb_shop_order.store_id
     *
     * @mbggenerated Tue Aug 16 23:58:39 CST 2016
     */
    public String getStoreId() {
        return storeId;
    }

    /**
     * 门店ID <p/>
     * This method sets the value of the database column tb_shop_order.store_id
     *
     * @param storeId the value for tb_shop_order.store_id
     *
     * @mbggenerated Tue Aug 16 23:58:39 CST 2016
     */
    public void setStoreId(String storeId) {
        this.storeId = storeId == null ? null : storeId.trim();
    }

    /**
     * 用户标识符，用于指定集分宝发放的用户，和user_symbol_type一起使用，确定一个唯一的支付宝用户 <p/>
     * This method returns the value of the database column tb_shop_order.user_symbol
     *
     * @return the value of tb_shop_order.user_symbol
     *
     * @mbggenerated Tue Aug 16 23:58:39 CST 2016
     */
    public String getUserSymbol() {
        return userSymbol;
    }

    /**
     * 用户标识符，用于指定集分宝发放的用户，和user_symbol_type一起使用，确定一个唯一的支付宝用户 <p/>
     * This method sets the value of the database column tb_shop_order.user_symbol
     *
     * @param userSymbol the value for tb_shop_order.user_symbol
     *
     * @mbggenerated Tue Aug 16 23:58:39 CST 2016
     */
    public void setUserSymbol(String userSymbol) {
        this.userSymbol = userSymbol == null ? null : userSymbol.trim();
    }

    /**
     * 用户标识符类型， 现在支持ALIPAY_USER_ID:表示支付宝用户ID, ALIPAY_LOGON_ID:表示支付宝登陆号, TAOBAO_NICK:淘宝昵称 <p/>
     * This method returns the value of the database column tb_shop_order.user_symbol_type
     *
     * @return the value of tb_shop_order.user_symbol_type
     *
     * @mbggenerated Tue Aug 16 23:58:39 CST 2016
     */
    public Byte getUserSymbolType() {
        return userSymbolType;
    }

    /**
     * 用户标识符类型， 现在支持ALIPAY_USER_ID:表示支付宝用户ID, ALIPAY_LOGON_ID:表示支付宝登陆号, TAOBAO_NICK:淘宝昵称 <p/>
     * This method sets the value of the database column tb_shop_order.user_symbol_type
     *
     * @param userSymbolType the value for tb_shop_order.user_symbol_type
     *
     * @mbggenerated Tue Aug 16 23:58:39 CST 2016
     */
    public void setUserSymbolType(Byte userSymbolType) {
        this.userSymbolType = userSymbolType;
    }

    /**
     * 发放集分宝的数量 <p/>
     * This method returns the value of the database column tb_shop_order.point_count
     *
     * @return the value of tb_shop_order.point_count
     *
     * @mbggenerated Tue Aug 16 23:58:39 CST 2016
     */
    public String getPointCount() {
        return pointCount;
    }

    /**
     * 发放集分宝的数量 <p/>
     * This method sets the value of the database column tb_shop_order.point_count
     *
     * @param pointCount the value for tb_shop_order.point_count
     *
     * @mbggenerated Tue Aug 16 23:58:39 CST 2016
     */
    public void setPointCount(String pointCount) {
        this.pointCount = pointCount == null ? null : pointCount.trim();
    }

    /**
     * isv提供的发放订单号，由数字和字母组成，最大长度为32位，需要保证每笔订单发放的唯一性，支付宝对该参数做唯一性校验。如果订单号已存在，支付宝将返回订单号已经存在的错误 <p/>
     * This method returns the value of the database column tb_shop_order.merchant_order_no
     *
     * @return the value of tb_shop_order.merchant_order_no
     *
     * @mbggenerated Tue Aug 16 23:58:39 CST 2016
     */
    public String getMerchantOrderNo() {
        return merchantOrderNo;
    }

    /**
     * isv提供的发放订单号，由数字和字母组成，最大长度为32位，需要保证每笔订单发放的唯一性，支付宝对该参数做唯一性校验。如果订单号已存在，支付宝将返回订单号已经存在的错误 <p/>
     * This method sets the value of the database column tb_shop_order.merchant_order_no
     *
     * @param merchantOrderNo the value for tb_shop_order.merchant_order_no
     *
     * @mbggenerated Tue Aug 16 23:58:39 CST 2016
     */
    public void setMerchantOrderNo(String merchantOrderNo) {
        this.merchantOrderNo = merchantOrderNo == null ? null : merchantOrderNo.trim();
    }

    /**
     * 向用户展示集分宝发放备注 <p/>
     * This method returns the value of the database column tb_shop_order.memo
     *
     * @return the value of tb_shop_order.memo
     *
     * @mbggenerated Tue Aug 16 23:58:39 CST 2016
     */
    public String getMemo() {
        return memo;
    }

    /**
     * 向用户展示集分宝发放备注 <p/>
     * This method sets the value of the database column tb_shop_order.memo
     *
     * @param memo the value for tb_shop_order.memo
     *
     * @mbggenerated Tue Aug 16 23:58:39 CST 2016
     */
    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    /**
     * 发放集分宝时间 <p/>
     * This method returns the value of the database column tb_shop_order.order_time
     *
     * @return the value of tb_shop_order.order_time
     *
     * @mbggenerated Tue Aug 16 23:58:39 CST 2016
     */
    public Date getOrderTime() {
        return orderTime;
    }

    /**
     * 发放集分宝时间 <p/>
     * This method sets the value of the database column tb_shop_order.order_time
     *
     * @param orderTime the value for tb_shop_order.order_time
     *
     * @mbggenerated Tue Aug 16 23:58:39 CST 2016
     */
    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_shop_order.created
     *
     * @return the value of tb_shop_order.created
     *
     * @mbggenerated Tue Aug 16 23:58:39 CST 2016
     */
    public Date getCreated() {
        return created;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_shop_order.created
     *
     * @param created the value for tb_shop_order.created
     *
     * @mbggenerated Tue Aug 16 23:58:39 CST 2016
     */
    public void setCreated(Date created) {
        this.created = created;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_shop_order.modified
     *
     * @return the value of tb_shop_order.modified
     *
     * @mbggenerated Tue Aug 16 23:58:39 CST 2016
     */
    public Date getModified() {
        return modified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_shop_order.modified
     *
     * @param modified the value for tb_shop_order.modified
     *
     * @mbggenerated Tue Aug 16 23:58:39 CST 2016
     */
    public void setModified(Date modified) {
        this.modified = modified;
    }

    /**
     * 0否 1是 <p/>
     * This method returns the value of the database column tb_shop_order.enable_status
     *
     * @return the value of tb_shop_order.enable_status
     *
     * @mbggenerated Tue Aug 16 23:58:39 CST 2016
     */
    public Boolean getEnableStatus() {
        return enableStatus;
    }

    /**
     * 0否 1是 <p/>
     * This method sets the value of the database column tb_shop_order.enable_status
     *
     * @param enableStatus the value for tb_shop_order.enable_status
     *
     * @mbggenerated Tue Aug 16 23:58:39 CST 2016
     */
    public void setEnableStatus(Boolean enableStatus) {
        this.enableStatus = enableStatus;
    }
}