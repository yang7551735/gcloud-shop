package com.gcloud.shop.domain;

import java.util.Date;

public class ShopCategory {
    /**
     * 主键 <p/>
     * This field corresponds to the database column tb_shop_category.id
     *
     * @mbggenerated Tue Aug 16 23:58:39 CST 2016
     */
    private Long id;

    /**
     * 类目编号 <p/>
     * This field corresponds to the database column tb_shop_category.category_id
     *
     * @mbggenerated Tue Aug 16 23:58:39 CST 2016
     */
    private Long categoryId;

    /**
     * 类目名称 <p/>
     * This field corresponds to the database column tb_shop_category.category_name
     *
     * @mbggenerated Tue Aug 16 23:58:39 CST 2016
     */
    private String categoryName;

    /**
     * 类目层级,目前最多支持1、2、3三级 <p/>
     * This field corresponds to the database column tb_shop_category.category_level
     *
     * @mbggenerated Tue Aug 16 23:58:39 CST 2016
     */
    private Long categoryLevel;

    /**
     * 该类目是否为父类目(即：该类目是否还有子类目) <p/>
     * This field corresponds to the database column tb_shop_category.category_parent
     *
     * @mbggenerated Tue Aug 16 23:58:39 CST 2016
     */
    private Byte categoryParent;

    /**
     * 当前状态(0 未确认 1 商家确认 2 小二确认  -1 屏蔽  -2 删除) <p/>
     * This field corresponds to the database column tb_shop_category.status
     *
     * @mbggenerated Tue Aug 16 23:58:39 CST 2016
     */
    private Byte status;

    /**
     * 平台信息(kb口碑 tb淘宝 bd百度外卖) <p/>
     * This field corresponds to the database column tb_shop_category.platform
     *
     * @mbggenerated Tue Aug 16 23:58:39 CST 2016
     */
    private String platform;

    /**
     * 备注 <p/>
     * This field corresponds to the database column tb_shop_category.remark
     *
     * @mbggenerated Tue Aug 16 23:58:39 CST 2016
     */
    private String remark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_shop_category.created
     *
     * @mbggenerated Tue Aug 16 23:58:39 CST 2016
     */
    private Date created;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_shop_category.modified
     *
     * @mbggenerated Tue Aug 16 23:58:39 CST 2016
     */
    private Date modified;

    /**
     * 0否 1是 <p/>
     * This field corresponds to the database column tb_shop_category.enable_status
     *
     * @mbggenerated Tue Aug 16 23:58:39 CST 2016
     */
    private Boolean enableStatus;

    /**
     * 主键 <p/>
     * This method returns the value of the database column tb_shop_category.id
     *
     * @return the value of tb_shop_category.id
     *
     * @mbggenerated Tue Aug 16 23:58:39 CST 2016
     */
    public Long getId() {
        return id;
    }

    /**
     * 主键 <p/>
     * This method sets the value of the database column tb_shop_category.id
     *
     * @param id the value for tb_shop_category.id
     *
     * @mbggenerated Tue Aug 16 23:58:39 CST 2016
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 类目编号 <p/>
     * This method returns the value of the database column tb_shop_category.category_id
     *
     * @return the value of tb_shop_category.category_id
     *
     * @mbggenerated Tue Aug 16 23:58:39 CST 2016
     */
    public Long getCategoryId() {
        return categoryId;
    }

    /**
     * 类目编号 <p/>
     * This method sets the value of the database column tb_shop_category.category_id
     *
     * @param categoryId the value for tb_shop_category.category_id
     *
     * @mbggenerated Tue Aug 16 23:58:39 CST 2016
     */
    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * 类目名称 <p/>
     * This method returns the value of the database column tb_shop_category.category_name
     *
     * @return the value of tb_shop_category.category_name
     *
     * @mbggenerated Tue Aug 16 23:58:39 CST 2016
     */
    public String getCategoryName() {
        return categoryName;
    }

    /**
     * 类目名称 <p/>
     * This method sets the value of the database column tb_shop_category.category_name
     *
     * @param categoryName the value for tb_shop_category.category_name
     *
     * @mbggenerated Tue Aug 16 23:58:39 CST 2016
     */
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName == null ? null : categoryName.trim();
    }

    /**
     * 类目层级,目前最多支持1、2、3三级 <p/>
     * This method returns the value of the database column tb_shop_category.category_level
     *
     * @return the value of tb_shop_category.category_level
     *
     * @mbggenerated Tue Aug 16 23:58:39 CST 2016
     */
    public Long getCategoryLevel() {
        return categoryLevel;
    }

    /**
     * 类目层级,目前最多支持1、2、3三级 <p/>
     * This method sets the value of the database column tb_shop_category.category_level
     *
     * @param categoryLevel the value for tb_shop_category.category_level
     *
     * @mbggenerated Tue Aug 16 23:58:39 CST 2016
     */
    public void setCategoryLevel(Long categoryLevel) {
        this.categoryLevel = categoryLevel;
    }

    /**
     * 该类目是否为父类目(即：该类目是否还有子类目) <p/>
     * This method returns the value of the database column tb_shop_category.category_parent
     *
     * @return the value of tb_shop_category.category_parent
     *
     * @mbggenerated Tue Aug 16 23:58:39 CST 2016
     */
    public Byte getCategoryParent() {
        return categoryParent;
    }

    /**
     * 该类目是否为父类目(即：该类目是否还有子类目) <p/>
     * This method sets the value of the database column tb_shop_category.category_parent
     *
     * @param categoryParent the value for tb_shop_category.category_parent
     *
     * @mbggenerated Tue Aug 16 23:58:39 CST 2016
     */
    public void setCategoryParent(Byte categoryParent) {
        this.categoryParent = categoryParent;
    }

    /**
     * 当前状态(0 未确认 1 商家确认 2 小二确认  -1 屏蔽  -2 删除) <p/>
     * This method returns the value of the database column tb_shop_category.status
     *
     * @return the value of tb_shop_category.status
     *
     * @mbggenerated Tue Aug 16 23:58:39 CST 2016
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * 当前状态(0 未确认 1 商家确认 2 小二确认  -1 屏蔽  -2 删除) <p/>
     * This method sets the value of the database column tb_shop_category.status
     *
     * @param status the value for tb_shop_category.status
     *
     * @mbggenerated Tue Aug 16 23:58:39 CST 2016
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * 平台信息(kb口碑 tb淘宝 bd百度外卖) <p/>
     * This method returns the value of the database column tb_shop_category.platform
     *
     * @return the value of tb_shop_category.platform
     *
     * @mbggenerated Tue Aug 16 23:58:39 CST 2016
     */
    public String getPlatform() {
        return platform;
    }

    /**
     * 平台信息(kb口碑 tb淘宝 bd百度外卖) <p/>
     * This method sets the value of the database column tb_shop_category.platform
     *
     * @param platform the value for tb_shop_category.platform
     *
     * @mbggenerated Tue Aug 16 23:58:39 CST 2016
     */
    public void setPlatform(String platform) {
        this.platform = platform == null ? null : platform.trim();
    }

    /**
     * 备注 <p/>
     * This method returns the value of the database column tb_shop_category.remark
     *
     * @return the value of tb_shop_category.remark
     *
     * @mbggenerated Tue Aug 16 23:58:39 CST 2016
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 备注 <p/>
     * This method sets the value of the database column tb_shop_category.remark
     *
     * @param remark the value for tb_shop_category.remark
     *
     * @mbggenerated Tue Aug 16 23:58:39 CST 2016
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_shop_category.created
     *
     * @return the value of tb_shop_category.created
     *
     * @mbggenerated Tue Aug 16 23:58:39 CST 2016
     */
    public Date getCreated() {
        return created;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_shop_category.created
     *
     * @param created the value for tb_shop_category.created
     *
     * @mbggenerated Tue Aug 16 23:58:39 CST 2016
     */
    public void setCreated(Date created) {
        this.created = created;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_shop_category.modified
     *
     * @return the value of tb_shop_category.modified
     *
     * @mbggenerated Tue Aug 16 23:58:39 CST 2016
     */
    public Date getModified() {
        return modified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_shop_category.modified
     *
     * @param modified the value for tb_shop_category.modified
     *
     * @mbggenerated Tue Aug 16 23:58:39 CST 2016
     */
    public void setModified(Date modified) {
        this.modified = modified;
    }

    /**
     * 0否 1是 <p/>
     * This method returns the value of the database column tb_shop_category.enable_status
     *
     * @return the value of tb_shop_category.enable_status
     *
     * @mbggenerated Tue Aug 16 23:58:39 CST 2016
     */
    public Boolean getEnableStatus() {
        return enableStatus;
    }

    /**
     * 0否 1是 <p/>
     * This method sets the value of the database column tb_shop_category.enable_status
     *
     * @param enableStatus the value for tb_shop_category.enable_status
     *
     * @mbggenerated Tue Aug 16 23:58:39 CST 2016
     */
    public void setEnableStatus(Boolean enableStatus) {
        this.enableStatus = enableStatus;
    }
}