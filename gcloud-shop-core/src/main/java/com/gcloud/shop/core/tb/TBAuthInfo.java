package com.gcloud.shop.core.tb;

import java.io.Serializable;
import java.util.Date;
import java.util.Map;

/**
 * @author ChenJin
 * @version V1.0
 * @Title: TBAuthInfo
 * @Package com.gcloud.shop.core.tb
 * @Description: 访问淘宝授权信息
 * @date 2016/6/8 16:23
 */
public class TBAuthInfo implements Serializable {

    /**
     * 授权时间
     */
    private Date authDate;

    private Long reExpiresIn;

    private Long expiresIn;

    private Long r1ExpiresIn;

    private Long r2ExpiresIn;

    private Long w1ExpiresIn;

    private Long w2ExpiresIn;

    private String refreshToken;

    public Date getAuthDate() {
        return authDate;
    }

    public void setAuthDate(Date authDate) {
        this.authDate = authDate;
    }

    public Long getReExpiresIn() {
        return reExpiresIn;
    }

    public void setReExpiresIn(Long reExpiresIn) {
        this.reExpiresIn = reExpiresIn;
    }

    public Long getExpiresIn() {
        return expiresIn;
    }

    public void setExpiresIn(Long expiresIn) {
        this.expiresIn = expiresIn;
    }

    public Long getR1ExpiresIn() {
        return r1ExpiresIn;
    }

    public void setR1ExpiresIn(Long r1ExpiresIn) {
        this.r1ExpiresIn = r1ExpiresIn;
    }

    public Long getR2ExpiresIn() {
        return r2ExpiresIn;
    }

    public void setR2ExpiresIn(Long r2ExpiresIn) {
        this.r2ExpiresIn = r2ExpiresIn;
    }

    public Long getW1ExpiresIn() {
        return w1ExpiresIn;
    }

    public void setW1ExpiresIn(Long w1ExpiresIn) {
        this.w1ExpiresIn = w1ExpiresIn;
    }

    public Long getW2ExpiresIn() {
        return w2ExpiresIn;
    }

    public void setW2ExpiresIn(Long w2ExpiresIn) {
        this.w2ExpiresIn = w2ExpiresIn;
    }

    public String getRefreshToken() {
        return refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    /**
     * 从授权的响应结果构建
     * @param resp
     * @return
     */
    public static TBAuthInfo valueOf(Map<String, String> resp, Date auth){
        TBAuthInfo tbAuthInfo = new TBAuthInfo();
        if(resp.containsKey("re_expires_in")){
            tbAuthInfo.setReExpiresIn(Long.parseLong(resp.get("re_expires_in")));
        }
        if(resp.containsKey("expires_in")){
            tbAuthInfo.setExpiresIn(Long.parseLong(resp.get("expires_in")));
        }
        if(resp.containsKey("r1_expires_in")){
            tbAuthInfo.setR1ExpiresIn(Long.parseLong(resp.get("r1_expires_in")));
        }
        if(resp.containsKey("r2_expires_in")){
            tbAuthInfo.setR2ExpiresIn(Long.parseLong(resp.get("r2_expires_in")));
        }
        if(resp.containsKey("w1_expires_in")){
            tbAuthInfo.setW1ExpiresIn(Long.parseLong(resp.get("w1_expires_in")));
        }
        if(resp.containsKey("w2_expires_in")){
            tbAuthInfo.setW2ExpiresIn(Long.parseLong(resp.get("w2_expires_in")));
        }
        if(resp.containsKey("refresh_token")){
            tbAuthInfo.setRefreshToken(resp.get("refresh_token"));
        }
        tbAuthInfo.setAuthDate(auth);
        return tbAuthInfo;
    }
}