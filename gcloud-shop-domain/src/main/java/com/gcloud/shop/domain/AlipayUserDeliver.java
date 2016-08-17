package com.gcloud.shop.domain;

import java.util.Date;

public class AlipayUserDeliver {
    /**
     * 主键 <p/>
     * This field corresponds to the database column tb_alipay_user_deliver.id
     *
     * @mbggenerated Tue Aug 16 23:58:39 CST 2016
     */
    private Long id;

    /**
     * 授权商户的user_id  <p/>
     * This field corresponds to the database column tb_alipay_user_deliver.user_id
     *
     * @mbggenerated Tue Aug 16 23:58:39 CST 2016
     */
    private String userId;

    /**
     * 收货人全名  <p/>
     * This field corresponds to the database column tb_alipay_user_deliver.deliver_fullname
     *
     * @mbggenerated Tue Aug 16 23:58:39 CST 2016
     */
    private String deliverFullname;

    /**
     * 是否默认收货地址 <p/>
     * This field corresponds to the database column tb_alipay_user_deliver.default_deliver_address
     *
     * @mbggenerated Tue Aug 16 23:58:39 CST 2016
     */
    private String defaultDeliverAddress;

    /**
     * 收货地址的联系人固定电话0517-28888888 <p/>
     * This field corresponds to the database column tb_alipay_user_deliver.deliver_phone
     *
     * @mbggenerated Tue Aug 16 23:58:39 CST 2016
     */
    private String deliverPhone;

    /**
     * 收货地址的联系人移动电话131XXXXXXXX <p/>
     * This field corresponds to the database column tb_alipay_user_deliver.deliver_mobile
     *
     * @mbggenerated Tue Aug 16 23:58:39 CST 2016
     */
    private String deliverMobile;

    /**
     * 地址 <p/>
     * This field corresponds to the database column tb_alipay_user_deliver.address
     *
     * @mbggenerated Tue Aug 16 23:58:39 CST 2016
     */
    private String address;

    /**
     * 邮政编码 <p/>
     * This field corresponds to the database column tb_alipay_user_deliver.zip
     *
     * @mbggenerated Tue Aug 16 23:58:39 CST 2016
     */
    private String zip;

    /**
     * 收货人所在省份 <p/>
     * This field corresponds to the database column tb_alipay_user_deliver.deliver_province
     *
     * @mbggenerated Tue Aug 16 23:58:39 CST 2016
     */
    private String deliverProvince;

    /**
     * 收货人所在城市 <p/>
     * This field corresponds to the database column tb_alipay_user_deliver.deliver_city
     *
     * @mbggenerated Tue Aug 16 23:58:39 CST 2016
     */
    private String deliverCity;

    /**
     * 收货人所在区县 <p/>
     * This field corresponds to the database column tb_alipay_user_deliver.deliver_area
     *
     * @mbggenerated Tue Aug 16 23:58:39 CST 2016
     */
    private String deliverArea;

    /**
     * 区域编码 <p/>
     * This field corresponds to the database column tb_alipay_user_deliver.address_code
     *
     * @mbggenerated Tue Aug 16 23:58:39 CST 2016
     */
    private String addressCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_alipay_user_deliver.created
     *
     * @mbggenerated Tue Aug 16 23:58:39 CST 2016
     */
    private Date created;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_alipay_user_deliver.modified
     *
     * @mbggenerated Tue Aug 16 23:58:39 CST 2016
     */
    private Date modified;

    /**
     * 0否 1是 <p/>
     * This field corresponds to the database column tb_alipay_user_deliver.enable_status
     *
     * @mbggenerated Tue Aug 16 23:58:39 CST 2016
     */
    private Boolean enableStatus;

    /**
     * 主键 <p/>
     * This method returns the value of the database column tb_alipay_user_deliver.id
     *
     * @return the value of tb_alipay_user_deliver.id
     *
     * @mbggenerated Tue Aug 16 23:58:39 CST 2016
     */
    public Long getId() {
        return id;
    }

    /**
     * 主键 <p/>
     * This method sets the value of the database column tb_alipay_user_deliver.id
     *
     * @param id the value for tb_alipay_user_deliver.id
     *
     * @mbggenerated Tue Aug 16 23:58:39 CST 2016
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 授权商户的user_id  <p/>
     * This method returns the value of the database column tb_alipay_user_deliver.user_id
     *
     * @return the value of tb_alipay_user_deliver.user_id
     *
     * @mbggenerated Tue Aug 16 23:58:39 CST 2016
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 授权商户的user_id  <p/>
     * This method sets the value of the database column tb_alipay_user_deliver.user_id
     *
     * @param userId the value for tb_alipay_user_deliver.user_id
     *
     * @mbggenerated Tue Aug 16 23:58:39 CST 2016
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * 收货人全名  <p/>
     * This method returns the value of the database column tb_alipay_user_deliver.deliver_fullname
     *
     * @return the value of tb_alipay_user_deliver.deliver_fullname
     *
     * @mbggenerated Tue Aug 16 23:58:39 CST 2016
     */
    public String getDeliverFullname() {
        return deliverFullname;
    }

    /**
     * 收货人全名  <p/>
     * This method sets the value of the database column tb_alipay_user_deliver.deliver_fullname
     *
     * @param deliverFullname the value for tb_alipay_user_deliver.deliver_fullname
     *
     * @mbggenerated Tue Aug 16 23:58:39 CST 2016
     */
    public void setDeliverFullname(String deliverFullname) {
        this.deliverFullname = deliverFullname == null ? null : deliverFullname.trim();
    }

    /**
     * 是否默认收货地址 <p/>
     * This method returns the value of the database column tb_alipay_user_deliver.default_deliver_address
     *
     * @return the value of tb_alipay_user_deliver.default_deliver_address
     *
     * @mbggenerated Tue Aug 16 23:58:39 CST 2016
     */
    public String getDefaultDeliverAddress() {
        return defaultDeliverAddress;
    }

    /**
     * 是否默认收货地址 <p/>
     * This method sets the value of the database column tb_alipay_user_deliver.default_deliver_address
     *
     * @param defaultDeliverAddress the value for tb_alipay_user_deliver.default_deliver_address
     *
     * @mbggenerated Tue Aug 16 23:58:39 CST 2016
     */
    public void setDefaultDeliverAddress(String defaultDeliverAddress) {
        this.defaultDeliverAddress = defaultDeliverAddress == null ? null : defaultDeliverAddress.trim();
    }

    /**
     * 收货地址的联系人固定电话0517-28888888 <p/>
     * This method returns the value of the database column tb_alipay_user_deliver.deliver_phone
     *
     * @return the value of tb_alipay_user_deliver.deliver_phone
     *
     * @mbggenerated Tue Aug 16 23:58:39 CST 2016
     */
    public String getDeliverPhone() {
        return deliverPhone;
    }

    /**
     * 收货地址的联系人固定电话0517-28888888 <p/>
     * This method sets the value of the database column tb_alipay_user_deliver.deliver_phone
     *
     * @param deliverPhone the value for tb_alipay_user_deliver.deliver_phone
     *
     * @mbggenerated Tue Aug 16 23:58:39 CST 2016
     */
    public void setDeliverPhone(String deliverPhone) {
        this.deliverPhone = deliverPhone == null ? null : deliverPhone.trim();
    }

    /**
     * 收货地址的联系人移动电话131XXXXXXXX <p/>
     * This method returns the value of the database column tb_alipay_user_deliver.deliver_mobile
     *
     * @return the value of tb_alipay_user_deliver.deliver_mobile
     *
     * @mbggenerated Tue Aug 16 23:58:39 CST 2016
     */
    public String getDeliverMobile() {
        return deliverMobile;
    }

    /**
     * 收货地址的联系人移动电话131XXXXXXXX <p/>
     * This method sets the value of the database column tb_alipay_user_deliver.deliver_mobile
     *
     * @param deliverMobile the value for tb_alipay_user_deliver.deliver_mobile
     *
     * @mbggenerated Tue Aug 16 23:58:39 CST 2016
     */
    public void setDeliverMobile(String deliverMobile) {
        this.deliverMobile = deliverMobile == null ? null : deliverMobile.trim();
    }

    /**
     * 地址 <p/>
     * This method returns the value of the database column tb_alipay_user_deliver.address
     *
     * @return the value of tb_alipay_user_deliver.address
     *
     * @mbggenerated Tue Aug 16 23:58:39 CST 2016
     */
    public String getAddress() {
        return address;
    }

    /**
     * 地址 <p/>
     * This method sets the value of the database column tb_alipay_user_deliver.address
     *
     * @param address the value for tb_alipay_user_deliver.address
     *
     * @mbggenerated Tue Aug 16 23:58:39 CST 2016
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * 邮政编码 <p/>
     * This method returns the value of the database column tb_alipay_user_deliver.zip
     *
     * @return the value of tb_alipay_user_deliver.zip
     *
     * @mbggenerated Tue Aug 16 23:58:39 CST 2016
     */
    public String getZip() {
        return zip;
    }

    /**
     * 邮政编码 <p/>
     * This method sets the value of the database column tb_alipay_user_deliver.zip
     *
     * @param zip the value for tb_alipay_user_deliver.zip
     *
     * @mbggenerated Tue Aug 16 23:58:39 CST 2016
     */
    public void setZip(String zip) {
        this.zip = zip == null ? null : zip.trim();
    }

    /**
     * 收货人所在省份 <p/>
     * This method returns the value of the database column tb_alipay_user_deliver.deliver_province
     *
     * @return the value of tb_alipay_user_deliver.deliver_province
     *
     * @mbggenerated Tue Aug 16 23:58:39 CST 2016
     */
    public String getDeliverProvince() {
        return deliverProvince;
    }

    /**
     * 收货人所在省份 <p/>
     * This method sets the value of the database column tb_alipay_user_deliver.deliver_province
     *
     * @param deliverProvince the value for tb_alipay_user_deliver.deliver_province
     *
     * @mbggenerated Tue Aug 16 23:58:39 CST 2016
     */
    public void setDeliverProvince(String deliverProvince) {
        this.deliverProvince = deliverProvince == null ? null : deliverProvince.trim();
    }

    /**
     * 收货人所在城市 <p/>
     * This method returns the value of the database column tb_alipay_user_deliver.deliver_city
     *
     * @return the value of tb_alipay_user_deliver.deliver_city
     *
     * @mbggenerated Tue Aug 16 23:58:39 CST 2016
     */
    public String getDeliverCity() {
        return deliverCity;
    }

    /**
     * 收货人所在城市 <p/>
     * This method sets the value of the database column tb_alipay_user_deliver.deliver_city
     *
     * @param deliverCity the value for tb_alipay_user_deliver.deliver_city
     *
     * @mbggenerated Tue Aug 16 23:58:39 CST 2016
     */
    public void setDeliverCity(String deliverCity) {
        this.deliverCity = deliverCity == null ? null : deliverCity.trim();
    }

    /**
     * 收货人所在区县 <p/>
     * This method returns the value of the database column tb_alipay_user_deliver.deliver_area
     *
     * @return the value of tb_alipay_user_deliver.deliver_area
     *
     * @mbggenerated Tue Aug 16 23:58:39 CST 2016
     */
    public String getDeliverArea() {
        return deliverArea;
    }

    /**
     * 收货人所在区县 <p/>
     * This method sets the value of the database column tb_alipay_user_deliver.deliver_area
     *
     * @param deliverArea the value for tb_alipay_user_deliver.deliver_area
     *
     * @mbggenerated Tue Aug 16 23:58:39 CST 2016
     */
    public void setDeliverArea(String deliverArea) {
        this.deliverArea = deliverArea == null ? null : deliverArea.trim();
    }

    /**
     * 区域编码 <p/>
     * This method returns the value of the database column tb_alipay_user_deliver.address_code
     *
     * @return the value of tb_alipay_user_deliver.address_code
     *
     * @mbggenerated Tue Aug 16 23:58:39 CST 2016
     */
    public String getAddressCode() {
        return addressCode;
    }

    /**
     * 区域编码 <p/>
     * This method sets the value of the database column tb_alipay_user_deliver.address_code
     *
     * @param addressCode the value for tb_alipay_user_deliver.address_code
     *
     * @mbggenerated Tue Aug 16 23:58:39 CST 2016
     */
    public void setAddressCode(String addressCode) {
        this.addressCode = addressCode == null ? null : addressCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_alipay_user_deliver.created
     *
     * @return the value of tb_alipay_user_deliver.created
     *
     * @mbggenerated Tue Aug 16 23:58:39 CST 2016
     */
    public Date getCreated() {
        return created;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_alipay_user_deliver.created
     *
     * @param created the value for tb_alipay_user_deliver.created
     *
     * @mbggenerated Tue Aug 16 23:58:39 CST 2016
     */
    public void setCreated(Date created) {
        this.created = created;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_alipay_user_deliver.modified
     *
     * @return the value of tb_alipay_user_deliver.modified
     *
     * @mbggenerated Tue Aug 16 23:58:39 CST 2016
     */
    public Date getModified() {
        return modified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_alipay_user_deliver.modified
     *
     * @param modified the value for tb_alipay_user_deliver.modified
     *
     * @mbggenerated Tue Aug 16 23:58:39 CST 2016
     */
    public void setModified(Date modified) {
        this.modified = modified;
    }

    /**
     * 0否 1是 <p/>
     * This method returns the value of the database column tb_alipay_user_deliver.enable_status
     *
     * @return the value of tb_alipay_user_deliver.enable_status
     *
     * @mbggenerated Tue Aug 16 23:58:39 CST 2016
     */
    public Boolean getEnableStatus() {
        return enableStatus;
    }

    /**
     * 0否 1是 <p/>
     * This method sets the value of the database column tb_alipay_user_deliver.enable_status
     *
     * @param enableStatus the value for tb_alipay_user_deliver.enable_status
     *
     * @mbggenerated Tue Aug 16 23:58:39 CST 2016
     */
    public void setEnableStatus(Boolean enableStatus) {
        this.enableStatus = enableStatus;
    }
}