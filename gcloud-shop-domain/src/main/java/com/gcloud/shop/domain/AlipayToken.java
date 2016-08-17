package com.gcloud.shop.domain;

import java.util.Date;

public class AlipayToken {
    /**
     * 主键 <p/>
     * This field corresponds to the database column tb_alipay_token.id
     *
     * @mbggenerated Tue Aug 16 23:58:39 CST 2016
     */
    private Long id;

    /**
     * 授权商户的user_id  <p/>
     * This field corresponds to the database column tb_alipay_token.user_id
     *
     * @mbggenerated Tue Aug 16 23:58:39 CST 2016
     */
    private String userId;

    /**
     * 授权商户的appid  <p/>
     * This field corresponds to the database column tb_alipay_token.auth_app_id
     *
     * @mbggenerated Tue Aug 16 23:58:39 CST 2016
     */
    private String authAppId;

    /**
     * 应用授权令牌 <p/>
     * This field corresponds to the database column tb_alipay_token.app_auth_token
     *
     * @mbggenerated Tue Aug 16 23:58:39 CST 2016
     */
    private String appAuthToken;

    /**
     * 刷新令牌 <p/>
     * This field corresponds to the database column tb_alipay_token.app_refresh_token
     *
     * @mbggenerated Tue Aug 16 23:58:39 CST 2016
     */
    private String appRefreshToken;

    /**
     * 应用授权令牌的有效时间（从接口调用时间作为起始时间），单位到秒 <p/>
     * This field corresponds to the database column tb_alipay_token.expires_in
     *
     * @mbggenerated Tue Aug 16 23:58:39 CST 2016
     */
    private String expiresIn;

    /**
     * 刷新令牌的有效时间（从接口调用时间作为起始时间），单位到秒 <p/>
     * This field corresponds to the database column tb_alipay_token.re_expires_in
     *
     * @mbggenerated Tue Aug 16 23:58:39 CST 2016
     */
    private String reExpiresIn;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_alipay_token.created
     *
     * @mbggenerated Tue Aug 16 23:58:39 CST 2016
     */
    private Date created;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_alipay_token.modified
     *
     * @mbggenerated Tue Aug 16 23:58:39 CST 2016
     */
    private Date modified;

    /**
     * 0否 1是 <p/>
     * This field corresponds to the database column tb_alipay_token.enable_status
     *
     * @mbggenerated Tue Aug 16 23:58:39 CST 2016
     */
    private Boolean enableStatus;

    /**
     * 主键 <p/>
     * This method returns the value of the database column tb_alipay_token.id
     *
     * @return the value of tb_alipay_token.id
     *
     * @mbggenerated Tue Aug 16 23:58:39 CST 2016
     */
    public Long getId() {
        return id;
    }

    /**
     * 主键 <p/>
     * This method sets the value of the database column tb_alipay_token.id
     *
     * @param id the value for tb_alipay_token.id
     *
     * @mbggenerated Tue Aug 16 23:58:39 CST 2016
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 授权商户的user_id  <p/>
     * This method returns the value of the database column tb_alipay_token.user_id
     *
     * @return the value of tb_alipay_token.user_id
     *
     * @mbggenerated Tue Aug 16 23:58:39 CST 2016
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 授权商户的user_id  <p/>
     * This method sets the value of the database column tb_alipay_token.user_id
     *
     * @param userId the value for tb_alipay_token.user_id
     *
     * @mbggenerated Tue Aug 16 23:58:39 CST 2016
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * 授权商户的appid  <p/>
     * This method returns the value of the database column tb_alipay_token.auth_app_id
     *
     * @return the value of tb_alipay_token.auth_app_id
     *
     * @mbggenerated Tue Aug 16 23:58:39 CST 2016
     */
    public String getAuthAppId() {
        return authAppId;
    }

    /**
     * 授权商户的appid  <p/>
     * This method sets the value of the database column tb_alipay_token.auth_app_id
     *
     * @param authAppId the value for tb_alipay_token.auth_app_id
     *
     * @mbggenerated Tue Aug 16 23:58:39 CST 2016
     */
    public void setAuthAppId(String authAppId) {
        this.authAppId = authAppId == null ? null : authAppId.trim();
    }

    /**
     * 应用授权令牌 <p/>
     * This method returns the value of the database column tb_alipay_token.app_auth_token
     *
     * @return the value of tb_alipay_token.app_auth_token
     *
     * @mbggenerated Tue Aug 16 23:58:39 CST 2016
     */
    public String getAppAuthToken() {
        return appAuthToken;
    }

    /**
     * 应用授权令牌 <p/>
     * This method sets the value of the database column tb_alipay_token.app_auth_token
     *
     * @param appAuthToken the value for tb_alipay_token.app_auth_token
     *
     * @mbggenerated Tue Aug 16 23:58:39 CST 2016
     */
    public void setAppAuthToken(String appAuthToken) {
        this.appAuthToken = appAuthToken == null ? null : appAuthToken.trim();
    }

    /**
     * 刷新令牌 <p/>
     * This method returns the value of the database column tb_alipay_token.app_refresh_token
     *
     * @return the value of tb_alipay_token.app_refresh_token
     *
     * @mbggenerated Tue Aug 16 23:58:39 CST 2016
     */
    public String getAppRefreshToken() {
        return appRefreshToken;
    }

    /**
     * 刷新令牌 <p/>
     * This method sets the value of the database column tb_alipay_token.app_refresh_token
     *
     * @param appRefreshToken the value for tb_alipay_token.app_refresh_token
     *
     * @mbggenerated Tue Aug 16 23:58:39 CST 2016
     */
    public void setAppRefreshToken(String appRefreshToken) {
        this.appRefreshToken = appRefreshToken == null ? null : appRefreshToken.trim();
    }

    /**
     * 应用授权令牌的有效时间（从接口调用时间作为起始时间），单位到秒 <p/>
     * This method returns the value of the database column tb_alipay_token.expires_in
     *
     * @return the value of tb_alipay_token.expires_in
     *
     * @mbggenerated Tue Aug 16 23:58:39 CST 2016
     */
    public String getExpiresIn() {
        return expiresIn;
    }

    /**
     * 应用授权令牌的有效时间（从接口调用时间作为起始时间），单位到秒 <p/>
     * This method sets the value of the database column tb_alipay_token.expires_in
     *
     * @param expiresIn the value for tb_alipay_token.expires_in
     *
     * @mbggenerated Tue Aug 16 23:58:39 CST 2016
     */
    public void setExpiresIn(String expiresIn) {
        this.expiresIn = expiresIn == null ? null : expiresIn.trim();
    }

    /**
     * 刷新令牌的有效时间（从接口调用时间作为起始时间），单位到秒 <p/>
     * This method returns the value of the database column tb_alipay_token.re_expires_in
     *
     * @return the value of tb_alipay_token.re_expires_in
     *
     * @mbggenerated Tue Aug 16 23:58:39 CST 2016
     */
    public String getReExpiresIn() {
        return reExpiresIn;
    }

    /**
     * 刷新令牌的有效时间（从接口调用时间作为起始时间），单位到秒 <p/>
     * This method sets the value of the database column tb_alipay_token.re_expires_in
     *
     * @param reExpiresIn the value for tb_alipay_token.re_expires_in
     *
     * @mbggenerated Tue Aug 16 23:58:39 CST 2016
     */
    public void setReExpiresIn(String reExpiresIn) {
        this.reExpiresIn = reExpiresIn == null ? null : reExpiresIn.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_alipay_token.created
     *
     * @return the value of tb_alipay_token.created
     *
     * @mbggenerated Tue Aug 16 23:58:39 CST 2016
     */
    public Date getCreated() {
        return created;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_alipay_token.created
     *
     * @param created the value for tb_alipay_token.created
     *
     * @mbggenerated Tue Aug 16 23:58:39 CST 2016
     */
    public void setCreated(Date created) {
        this.created = created;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_alipay_token.modified
     *
     * @return the value of tb_alipay_token.modified
     *
     * @mbggenerated Tue Aug 16 23:58:39 CST 2016
     */
    public Date getModified() {
        return modified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_alipay_token.modified
     *
     * @param modified the value for tb_alipay_token.modified
     *
     * @mbggenerated Tue Aug 16 23:58:39 CST 2016
     */
    public void setModified(Date modified) {
        this.modified = modified;
    }

    /**
     * 0否 1是 <p/>
     * This method returns the value of the database column tb_alipay_token.enable_status
     *
     * @return the value of tb_alipay_token.enable_status
     *
     * @mbggenerated Tue Aug 16 23:58:39 CST 2016
     */
    public Boolean getEnableStatus() {
        return enableStatus;
    }

    /**
     * 0否 1是 <p/>
     * This method sets the value of the database column tb_alipay_token.enable_status
     *
     * @param enableStatus the value for tb_alipay_token.enable_status
     *
     * @mbggenerated Tue Aug 16 23:58:39 CST 2016
     */
    public void setEnableStatus(Boolean enableStatus) {
        this.enableStatus = enableStatus;
    }
}