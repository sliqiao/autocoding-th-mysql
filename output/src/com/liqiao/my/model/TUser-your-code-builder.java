/******************************************************************************
* Copyright (C) 2016 Personal LiQiao All Rights Reserved. 
* 未经本人正式书面同意，其他任何个人、团体不得使用、复制、修改或发布本软件.
 *****************************************************************************/
package com.liqiao.my.model;

import java.util.Date;

/**
 * @title 本代码由Autocoding生成
 * @author  QiaoLi
 * @date    2019-01-04 14:06:17
 * @description:  
 * @log:    2019-01-04 14:06:17  QiaoLi  新建
 */
public class TUser  {
      
        /**    */
       private Integer m_id;
         /**  手机号  */
         private String m_mobile;
         /**  im(环信)注册id  */
         private String m_imId;
         /**  im(环信)注册密码  */
         private String m_imPsw;
         /**    */
         private String m_openId;
         /**  开黑上分openid  */
         private String m_pointOpenId;
         /**  微信公众号openid  */
         private String m_publicOpenId;
         /**  微信生态唯一标识  */
         private String m_unionId;
         /**  1:普通用户,2:打手,3:渠道商  */
         private Integer m_type;
         /**  用户注册来源（1：小程序；2：APP）  */
         private Integer m_registerType;
         /**  信息认证(0未完善,1已完善,2审核通过)  */
         private Integer m_userInfoAuth;
         /**  星级综合评分  */
         private Double m_scoreAvg;
         /**  陪玩师评价平均分  */
         private Double m_serverScoreAvg;
         /**  昵称  */
         private String m_nickname;
         /**  性别(默认0不公开,1男,2女)  */
         private Integer m_gender;
         /**  头像URL  */
         private String m_headPortraitsUrl;
         /**  密码  */
         private String m_password;
         /**  密码盐  */
         private String m_salt;
         /**  真实姓名  */
         private String m_realname;
         /**  身份证  */
         private String m_idcard;
         /**  零钱  */
         private Double m_balance;
         /**  不可提现余额  */
         private Double m_chargeBalance;
         /**  虚拟零钱（对应钻石数量）  */
         private Integer m_virtualBalance;
         /**  魅力值  */
         private Integer m_charm;
         /**  累计总提现魅力值  */
         private Integer m_charmDrawSum;
         /**  状态(0封禁1解封)  */
         private Integer m_status;
         /**  市  */
         private String m_city;
         /**  省  */
         private String m_province;
         /**  国家  */
         private String m_country;
         /**    */
         private String m_constellation;
         /**  出生日  */
         private String m_birth;
         /**    */
         private Integer m_age;
         /**  用户总积分  */
         private Integer m_userScore;
         /**  会员经验值  */
         private Integer m_memberExp;
         /**  虚拟会员经验值  */
         private Integer m_virtualMemberExp;
         /**  创建时间  */
         private Date m_createTime;
         /**  修改时间  */
         private Date m_updateTime;
         /**    */
         private Integer m_delFlag;
         /**  注册平台  */
         private Integer m_regPlatform;
         /**  注册来源id  */
         private Integer m_sourceId;
         /**  注册ip  */
         private String m_registIp;
         /**  最后登录ip  */
         private String m_loginIp;
         /**  最后登录时间  */
         private Date m_loginTime;
         /**  抽奖次数  */
         private Integer m_leftEnterTimes;
         /**  剩余抽奖次数  */
         private Integer m_leftEnterTimes1;
	 
    public TUser() {
    }
   	 
    /**获取属性：*/	 
    public Integer getId() {
        return this.m_id;
    }

   	 
    /**设置属性：*/	 
    public void setId(Integer id) {
        this.m_id = id;
    }
          	 
    /**获取属性：手机号*/	 
    public String getMobile() {
        return this.m_mobile;
    }

          	 
    /**设置属性：手机号*/	 
    public void setMobile(String mobile) {
        this.m_mobile = mobile;
    }
          	 
    /**设置属性：手机号*/	 
    public TUser buildMobile(String mobile) {
        this.m_mobile = mobile;
       return this ;
    }
          	 
    /**获取属性：im(环信)注册id*/	 
    public String getImId() {
        return this.m_imId;
    }

          	 
    /**设置属性：im(环信)注册id*/	 
    public void setImId(String imId) {
        this.m_imId = imId;
    }
          	 
    /**设置属性：im(环信)注册id*/	 
    public TUser buildImId(String imId) {
        this.m_imId = imId;
       return this ;
    }
          	 
    /**获取属性：im(环信)注册密码*/	 
    public String getImPsw() {
        return this.m_imPsw;
    }

          	 
    /**设置属性：im(环信)注册密码*/	 
    public void setImPsw(String imPsw) {
        this.m_imPsw = imPsw;
    }
          	 
    /**设置属性：im(环信)注册密码*/	 
    public TUser buildImPsw(String imPsw) {
        this.m_imPsw = imPsw;
       return this ;
    }
          	 
    /**获取属性：*/	 
    public String getOpenId() {
        return this.m_openId;
    }

          	 
    /**设置属性：*/	 
    public void setOpenId(String openId) {
        this.m_openId = openId;
    }
          	 
    /**设置属性：*/	 
    public TUser buildOpenId(String openId) {
        this.m_openId = openId;
       return this ;
    }
          	 
    /**获取属性：开黑上分openid*/	 
    public String getPointOpenId() {
        return this.m_pointOpenId;
    }

          	 
    /**设置属性：开黑上分openid*/	 
    public void setPointOpenId(String pointOpenId) {
        this.m_pointOpenId = pointOpenId;
    }
          	 
    /**设置属性：开黑上分openid*/	 
    public TUser buildPointOpenId(String pointOpenId) {
        this.m_pointOpenId = pointOpenId;
       return this ;
    }
          	 
    /**获取属性：微信公众号openid*/	 
    public String getPublicOpenId() {
        return this.m_publicOpenId;
    }

          	 
    /**设置属性：微信公众号openid*/	 
    public void setPublicOpenId(String publicOpenId) {
        this.m_publicOpenId = publicOpenId;
    }
          	 
    /**设置属性：微信公众号openid*/	 
    public TUser buildPublicOpenId(String publicOpenId) {
        this.m_publicOpenId = publicOpenId;
       return this ;
    }
          	 
    /**获取属性：微信生态唯一标识*/	 
    public String getUnionId() {
        return this.m_unionId;
    }

          	 
    /**设置属性：微信生态唯一标识*/	 
    public void setUnionId(String unionId) {
        this.m_unionId = unionId;
    }
          	 
    /**设置属性：微信生态唯一标识*/	 
    public TUser buildUnionId(String unionId) {
        this.m_unionId = unionId;
       return this ;
    }
          	 
    /**获取属性：1:普通用户,2:打手,3:渠道商*/	 
    public Integer getType() {
        return this.m_type;
    }

          	 
    /**设置属性：1:普通用户,2:打手,3:渠道商*/	 
    public void setType(Integer type) {
        this.m_type = type;
    }
          	 
    /**设置属性：1:普通用户,2:打手,3:渠道商*/	 
    public TUser buildType(Integer type) {
        this.m_type = type;
       return this ;
    }
          	 
    /**获取属性：用户注册来源（1：小程序；2：APP）*/	 
    public Integer getRegisterType() {
        return this.m_registerType;
    }

          	 
    /**设置属性：用户注册来源（1：小程序；2：APP）*/	 
    public void setRegisterType(Integer registerType) {
        this.m_registerType = registerType;
    }
          	 
    /**设置属性：用户注册来源（1：小程序；2：APP）*/	 
    public TUser buildRegisterType(Integer registerType) {
        this.m_registerType = registerType;
       return this ;
    }
          	 
    /**获取属性：信息认证(0未完善,1已完善,2审核通过)*/	 
    public Integer getUserInfoAuth() {
        return this.m_userInfoAuth;
    }

          	 
    /**设置属性：信息认证(0未完善,1已完善,2审核通过)*/	 
    public void setUserInfoAuth(Integer userInfoAuth) {
        this.m_userInfoAuth = userInfoAuth;
    }
          	 
    /**设置属性：信息认证(0未完善,1已完善,2审核通过)*/	 
    public TUser buildUserInfoAuth(Integer userInfoAuth) {
        this.m_userInfoAuth = userInfoAuth;
       return this ;
    }
          	 
    /**获取属性：星级综合评分*/	 
    public Double getScoreAvg() {
        return this.m_scoreAvg;
    }

          	 
    /**设置属性：星级综合评分*/	 
    public void setScoreAvg(Double scoreAvg) {
        this.m_scoreAvg = scoreAvg;
    }
          	 
    /**设置属性：星级综合评分*/	 
    public TUser buildScoreAvg(Double scoreAvg) {
        this.m_scoreAvg = scoreAvg;
       return this ;
    }
          	 
    /**获取属性：陪玩师评价平均分*/	 
    public Double getServerScoreAvg() {
        return this.m_serverScoreAvg;
    }

          	 
    /**设置属性：陪玩师评价平均分*/	 
    public void setServerScoreAvg(Double serverScoreAvg) {
        this.m_serverScoreAvg = serverScoreAvg;
    }
          	 
    /**设置属性：陪玩师评价平均分*/	 
    public TUser buildServerScoreAvg(Double serverScoreAvg) {
        this.m_serverScoreAvg = serverScoreAvg;
       return this ;
    }
          	 
    /**获取属性：昵称*/	 
    public String getNickname() {
        return this.m_nickname;
    }

          	 
    /**设置属性：昵称*/	 
    public void setNickname(String nickname) {
        this.m_nickname = nickname;
    }
          	 
    /**设置属性：昵称*/	 
    public TUser buildNickname(String nickname) {
        this.m_nickname = nickname;
       return this ;
    }
          	 
    /**获取属性：性别(默认0不公开,1男,2女)*/	 
    public Integer getGender() {
        return this.m_gender;
    }

          	 
    /**设置属性：性别(默认0不公开,1男,2女)*/	 
    public void setGender(Integer gender) {
        this.m_gender = gender;
    }
          	 
    /**设置属性：性别(默认0不公开,1男,2女)*/	 
    public TUser buildGender(Integer gender) {
        this.m_gender = gender;
       return this ;
    }
          	 
    /**获取属性：头像URL*/	 
    public String getHeadPortraitsUrl() {
        return this.m_headPortraitsUrl;
    }

          	 
    /**设置属性：头像URL*/	 
    public void setHeadPortraitsUrl(String headPortraitsUrl) {
        this.m_headPortraitsUrl = headPortraitsUrl;
    }
          	 
    /**设置属性：头像URL*/	 
    public TUser buildHeadPortraitsUrl(String headPortraitsUrl) {
        this.m_headPortraitsUrl = headPortraitsUrl;
       return this ;
    }
          	 
    /**获取属性：密码*/	 
    public String getPassword() {
        return this.m_password;
    }

          	 
    /**设置属性：密码*/	 
    public void setPassword(String password) {
        this.m_password = password;
    }
          	 
    /**设置属性：密码*/	 
    public TUser buildPassword(String password) {
        this.m_password = password;
       return this ;
    }
          	 
    /**获取属性：密码盐*/	 
    public String getSalt() {
        return this.m_salt;
    }

          	 
    /**设置属性：密码盐*/	 
    public void setSalt(String salt) {
        this.m_salt = salt;
    }
          	 
    /**设置属性：密码盐*/	 
    public TUser buildSalt(String salt) {
        this.m_salt = salt;
       return this ;
    }
          	 
    /**获取属性：真实姓名*/	 
    public String getRealname() {
        return this.m_realname;
    }

          	 
    /**设置属性：真实姓名*/	 
    public void setRealname(String realname) {
        this.m_realname = realname;
    }
          	 
    /**设置属性：真实姓名*/	 
    public TUser buildRealname(String realname) {
        this.m_realname = realname;
       return this ;
    }
          	 
    /**获取属性：身份证*/	 
    public String getIdcard() {
        return this.m_idcard;
    }

          	 
    /**设置属性：身份证*/	 
    public void setIdcard(String idcard) {
        this.m_idcard = idcard;
    }
          	 
    /**设置属性：身份证*/	 
    public TUser buildIdcard(String idcard) {
        this.m_idcard = idcard;
       return this ;
    }
          	 
    /**获取属性：零钱*/	 
    public Double getBalance() {
        return this.m_balance;
    }

          	 
    /**设置属性：零钱*/	 
    public void setBalance(Double balance) {
        this.m_balance = balance;
    }
          	 
    /**设置属性：零钱*/	 
    public TUser buildBalance(Double balance) {
        this.m_balance = balance;
       return this ;
    }
          	 
    /**获取属性：不可提现余额*/	 
    public Double getChargeBalance() {
        return this.m_chargeBalance;
    }

          	 
    /**设置属性：不可提现余额*/	 
    public void setChargeBalance(Double chargeBalance) {
        this.m_chargeBalance = chargeBalance;
    }
          	 
    /**设置属性：不可提现余额*/	 
    public TUser buildChargeBalance(Double chargeBalance) {
        this.m_chargeBalance = chargeBalance;
       return this ;
    }
          	 
    /**获取属性：虚拟零钱（对应钻石数量）*/	 
    public Integer getVirtualBalance() {
        return this.m_virtualBalance;
    }

          	 
    /**设置属性：虚拟零钱（对应钻石数量）*/	 
    public void setVirtualBalance(Integer virtualBalance) {
        this.m_virtualBalance = virtualBalance;
    }
          	 
    /**设置属性：虚拟零钱（对应钻石数量）*/	 
    public TUser buildVirtualBalance(Integer virtualBalance) {
        this.m_virtualBalance = virtualBalance;
       return this ;
    }
          	 
    /**获取属性：魅力值*/	 
    public Integer getCharm() {
        return this.m_charm;
    }

          	 
    /**设置属性：魅力值*/	 
    public void setCharm(Integer charm) {
        this.m_charm = charm;
    }
          	 
    /**设置属性：魅力值*/	 
    public TUser buildCharm(Integer charm) {
        this.m_charm = charm;
       return this ;
    }
          	 
    /**获取属性：累计总提现魅力值*/	 
    public Integer getCharmDrawSum() {
        return this.m_charmDrawSum;
    }

          	 
    /**设置属性：累计总提现魅力值*/	 
    public void setCharmDrawSum(Integer charmDrawSum) {
        this.m_charmDrawSum = charmDrawSum;
    }
          	 
    /**设置属性：累计总提现魅力值*/	 
    public TUser buildCharmDrawSum(Integer charmDrawSum) {
        this.m_charmDrawSum = charmDrawSum;
       return this ;
    }
          	 
    /**获取属性：状态(0封禁1解封)*/	 
    public Integer getStatus() {
        return this.m_status;
    }

          	 
    /**设置属性：状态(0封禁1解封)*/	 
    public void setStatus(Integer status) {
        this.m_status = status;
    }
          	 
    /**设置属性：状态(0封禁1解封)*/	 
    public TUser buildStatus(Integer status) {
        this.m_status = status;
       return this ;
    }
          	 
    /**获取属性：市*/	 
    public String getCity() {
        return this.m_city;
    }

          	 
    /**设置属性：市*/	 
    public void setCity(String city) {
        this.m_city = city;
    }
          	 
    /**设置属性：市*/	 
    public TUser buildCity(String city) {
        this.m_city = city;
       return this ;
    }
          	 
    /**获取属性：省*/	 
    public String getProvince() {
        return this.m_province;
    }

          	 
    /**设置属性：省*/	 
    public void setProvince(String province) {
        this.m_province = province;
    }
          	 
    /**设置属性：省*/	 
    public TUser buildProvince(String province) {
        this.m_province = province;
       return this ;
    }
          	 
    /**获取属性：国家*/	 
    public String getCountry() {
        return this.m_country;
    }

          	 
    /**设置属性：国家*/	 
    public void setCountry(String country) {
        this.m_country = country;
    }
          	 
    /**设置属性：国家*/	 
    public TUser buildCountry(String country) {
        this.m_country = country;
       return this ;
    }
          	 
    /**获取属性：*/	 
    public String getConstellation() {
        return this.m_constellation;
    }

          	 
    /**设置属性：*/	 
    public void setConstellation(String constellation) {
        this.m_constellation = constellation;
    }
          	 
    /**设置属性：*/	 
    public TUser buildConstellation(String constellation) {
        this.m_constellation = constellation;
       return this ;
    }
          	 
    /**获取属性：出生日*/	 
    public String getBirth() {
        return this.m_birth;
    }

          	 
    /**设置属性：出生日*/	 
    public void setBirth(String birth) {
        this.m_birth = birth;
    }
          	 
    /**设置属性：出生日*/	 
    public TUser buildBirth(String birth) {
        this.m_birth = birth;
       return this ;
    }
          	 
    /**获取属性：*/	 
    public Integer getAge() {
        return this.m_age;
    }

          	 
    /**设置属性：*/	 
    public void setAge(Integer age) {
        this.m_age = age;
    }
          	 
    /**设置属性：*/	 
    public TUser buildAge(Integer age) {
        this.m_age = age;
       return this ;
    }
          	 
    /**获取属性：用户总积分*/	 
    public Integer getUserScore() {
        return this.m_userScore;
    }

          	 
    /**设置属性：用户总积分*/	 
    public void setUserScore(Integer userScore) {
        this.m_userScore = userScore;
    }
          	 
    /**设置属性：用户总积分*/	 
    public TUser buildUserScore(Integer userScore) {
        this.m_userScore = userScore;
       return this ;
    }
          	 
    /**获取属性：会员经验值*/	 
    public Integer getMemberExp() {
        return this.m_memberExp;
    }

          	 
    /**设置属性：会员经验值*/	 
    public void setMemberExp(Integer memberExp) {
        this.m_memberExp = memberExp;
    }
          	 
    /**设置属性：会员经验值*/	 
    public TUser buildMemberExp(Integer memberExp) {
        this.m_memberExp = memberExp;
       return this ;
    }
          	 
    /**获取属性：虚拟会员经验值*/	 
    public Integer getVirtualMemberExp() {
        return this.m_virtualMemberExp;
    }

          	 
    /**设置属性：虚拟会员经验值*/	 
    public void setVirtualMemberExp(Integer virtualMemberExp) {
        this.m_virtualMemberExp = virtualMemberExp;
    }
          	 
    /**设置属性：虚拟会员经验值*/	 
    public TUser buildVirtualMemberExp(Integer virtualMemberExp) {
        this.m_virtualMemberExp = virtualMemberExp;
       return this ;
    }
          	 
    /**获取属性：创建时间*/	 
    public Date getCreateTime() {
        return this.m_createTime;
    }

          	 
    /**设置属性：创建时间*/	 
    public void setCreateTime(Date createTime) {
        this.m_createTime = createTime;
    }
          	 
    /**设置属性：创建时间*/	 
    public TUser buildCreateTime(Date createTime) {
        this.m_createTime = createTime;
       return this ;
    }
          	 
    /**获取属性：修改时间*/	 
    public Date getUpdateTime() {
        return this.m_updateTime;
    }

          	 
    /**设置属性：修改时间*/	 
    public void setUpdateTime(Date updateTime) {
        this.m_updateTime = updateTime;
    }
          	 
    /**设置属性：修改时间*/	 
    public TUser buildUpdateTime(Date updateTime) {
        this.m_updateTime = updateTime;
       return this ;
    }
          	 
    /**获取属性：*/	 
    public Integer getDelFlag() {
        return this.m_delFlag;
    }

          	 
    /**设置属性：*/	 
    public void setDelFlag(Integer delFlag) {
        this.m_delFlag = delFlag;
    }
          	 
    /**设置属性：*/	 
    public TUser buildDelFlag(Integer delFlag) {
        this.m_delFlag = delFlag;
       return this ;
    }
          	 
    /**获取属性：注册平台*/	 
    public Integer getRegPlatform() {
        return this.m_regPlatform;
    }

          	 
    /**设置属性：注册平台*/	 
    public void setRegPlatform(Integer regPlatform) {
        this.m_regPlatform = regPlatform;
    }
          	 
    /**设置属性：注册平台*/	 
    public TUser buildRegPlatform(Integer regPlatform) {
        this.m_regPlatform = regPlatform;
       return this ;
    }
          	 
    /**获取属性：注册来源id*/	 
    public Integer getSourceId() {
        return this.m_sourceId;
    }

          	 
    /**设置属性：注册来源id*/	 
    public void setSourceId(Integer sourceId) {
        this.m_sourceId = sourceId;
    }
          	 
    /**设置属性：注册来源id*/	 
    public TUser buildSourceId(Integer sourceId) {
        this.m_sourceId = sourceId;
       return this ;
    }
          	 
    /**获取属性：注册ip*/	 
    public String getRegistIp() {
        return this.m_registIp;
    }

          	 
    /**设置属性：注册ip*/	 
    public void setRegistIp(String registIp) {
        this.m_registIp = registIp;
    }
          	 
    /**设置属性：注册ip*/	 
    public TUser buildRegistIp(String registIp) {
        this.m_registIp = registIp;
       return this ;
    }
          	 
    /**获取属性：最后登录ip*/	 
    public String getLoginIp() {
        return this.m_loginIp;
    }

          	 
    /**设置属性：最后登录ip*/	 
    public void setLoginIp(String loginIp) {
        this.m_loginIp = loginIp;
    }
          	 
    /**设置属性：最后登录ip*/	 
    public TUser buildLoginIp(String loginIp) {
        this.m_loginIp = loginIp;
       return this ;
    }
          	 
    /**获取属性：最后登录时间*/	 
    public Date getLoginTime() {
        return this.m_loginTime;
    }

          	 
    /**设置属性：最后登录时间*/	 
    public void setLoginTime(Date loginTime) {
        this.m_loginTime = loginTime;
    }
          	 
    /**设置属性：最后登录时间*/	 
    public TUser buildLoginTime(Date loginTime) {
        this.m_loginTime = loginTime;
       return this ;
    }
          	 
    /**获取属性：抽奖次数*/	 
    public Integer getLeftEnterTimes() {
        return this.m_leftEnterTimes;
    }

          	 
    /**设置属性：抽奖次数*/	 
    public void setLeftEnterTimes(Integer leftEnterTimes) {
        this.m_leftEnterTimes = leftEnterTimes;
    }
          	 
    /**设置属性：抽奖次数*/	 
    public TUser buildLeftEnterTimes(Integer leftEnterTimes) {
        this.m_leftEnterTimes = leftEnterTimes;
       return this ;
    }
          	 
    /**获取属性：剩余抽奖次数*/	 
    public Integer getLeftEnterTimes1() {
        return this.m_leftEnterTimes1;
    }

          	 
    /**设置属性：剩余抽奖次数*/	 
    public void setLeftEnterTimes1(Integer leftEnterTimes1) {
        this.m_leftEnterTimes1 = leftEnterTimes1;
    }
          	 
    /**设置属性：剩余抽奖次数*/	 
    public TUser buildLeftEnterTimes1(Integer leftEnterTimes1) {
        this.m_leftEnterTimes1 = leftEnterTimes1;
       return this ;
    }
        @Override
    public String toString() {
       StringBuilder builder = new StringBuilder();
		builder.append("TUser[");
		builder.append(  " [id] = ");
		builder.append(this.m_id );
		builder.append(  " 手机号[mobile] = ");
		builder.append(this.m_mobile );
		builder.append(  " im(环信)注册id[imId] = ");
		builder.append(this.m_imId );
		builder.append(  " im(环信)注册密码[imPsw] = ");
		builder.append(this.m_imPsw );
		builder.append(  " [openId] = ");
		builder.append(this.m_openId );
		builder.append(  " 开黑上分openid[pointOpenId] = ");
		builder.append(this.m_pointOpenId );
		builder.append(  " 微信公众号openid[publicOpenId] = ");
		builder.append(this.m_publicOpenId );
		builder.append(  " 微信生态唯一标识[unionId] = ");
		builder.append(this.m_unionId );
		builder.append(  " 1:普通用户,2:打手,3:渠道商[type] = ");
		builder.append(this.m_type );
		builder.append(  " 用户注册来源（1：小程序；2：APP）[registerType] = ");
		builder.append(this.m_registerType );
		builder.append(  " 信息认证(0未完善,1已完善,2审核通过)[userInfoAuth] = ");
		builder.append(this.m_userInfoAuth );
		builder.append(  " 星级综合评分[scoreAvg] = ");
		builder.append(this.m_scoreAvg );
		builder.append(  " 陪玩师评价平均分[serverScoreAvg] = ");
		builder.append(this.m_serverScoreAvg );
		builder.append(  " 昵称[nickname] = ");
		builder.append(this.m_nickname );
		builder.append(  " 性别(默认0不公开,1男,2女)[gender] = ");
		builder.append(this.m_gender );
		builder.append(  " 头像URL[headPortraitsUrl] = ");
		builder.append(this.m_headPortraitsUrl );
		builder.append(  " 密码[password] = ");
		builder.append(this.m_password );
		builder.append(  " 密码盐[salt] = ");
		builder.append(this.m_salt );
		builder.append(  " 真实姓名[realname] = ");
		builder.append(this.m_realname );
		builder.append(  " 身份证[idcard] = ");
		builder.append(this.m_idcard );
		builder.append(  " 零钱[balance] = ");
		builder.append(this.m_balance );
		builder.append(  " 不可提现余额[chargeBalance] = ");
		builder.append(this.m_chargeBalance );
		builder.append(  " 虚拟零钱（对应钻石数量）[virtualBalance] = ");
		builder.append(this.m_virtualBalance );
		builder.append(  " 魅力值[charm] = ");
		builder.append(this.m_charm );
		builder.append(  " 累计总提现魅力值[charmDrawSum] = ");
		builder.append(this.m_charmDrawSum );
		builder.append(  " 状态(0封禁1解封)[status] = ");
		builder.append(this.m_status );
		builder.append(  " 市[city] = ");
		builder.append(this.m_city );
		builder.append(  " 省[province] = ");
		builder.append(this.m_province );
		builder.append(  " 国家[country] = ");
		builder.append(this.m_country );
		builder.append(  " [constellation] = ");
		builder.append(this.m_constellation );
		builder.append(  " 出生日[birth] = ");
		builder.append(this.m_birth );
		builder.append(  " [age] = ");
		builder.append(this.m_age );
		builder.append(  " 用户总积分[userScore] = ");
		builder.append(this.m_userScore );
		builder.append(  " 会员经验值[memberExp] = ");
		builder.append(this.m_memberExp );
		builder.append(  " 虚拟会员经验值[virtualMemberExp] = ");
		builder.append(this.m_virtualMemberExp );
		builder.append(  " 创建时间[createTime] = ");
		builder.append(this.m_createTime );
		builder.append(  " 修改时间[updateTime] = ");
		builder.append(this.m_updateTime );
		builder.append(  " [delFlag] = ");
		builder.append(this.m_delFlag );
		builder.append(  " 注册平台[regPlatform] = ");
		builder.append(this.m_regPlatform );
		builder.append(  " 注册来源id[sourceId] = ");
		builder.append(this.m_sourceId );
		builder.append(  " 注册ip[registIp] = ");
		builder.append(this.m_registIp );
		builder.append(  " 最后登录ip[loginIp] = ");
		builder.append(this.m_loginIp );
		builder.append(  " 最后登录时间[loginTime] = ");
		builder.append(this.m_loginTime );
		builder.append(  " 抽奖次数[leftEnterTimes] = ");
		builder.append(this.m_leftEnterTimes );
		builder.append(  " 剩余抽奖次数[leftEnterTimes1] = ");
		builder.append(this.m_leftEnterTimes1 );
		builder.append("]");
		return builder.toString();
	}

	 
    public interface FieldConstant {
         /**  手机号  */
        public static final  String mobile =  "mobile";
         /**  im(环信)注册id  */
        public static final  String imId =  "imId";
         /**  im(环信)注册密码  */
        public static final  String imPsw =  "imPsw";
         /**    */
        public static final  String openId =  "openId";
         /**  开黑上分openid  */
        public static final  String pointOpenId =  "pointOpenId";
         /**  微信公众号openid  */
        public static final  String publicOpenId =  "publicOpenId";
         /**  微信生态唯一标识  */
        public static final  String unionId =  "unionId";
         /**  1:普通用户,2:打手,3:渠道商  */
        public static final  String type =  "type";
         /**  用户注册来源（1：小程序；2：APP）  */
        public static final  String registerType =  "registerType";
         /**  信息认证(0未完善,1已完善,2审核通过)  */
        public static final  String userInfoAuth =  "userInfoAuth";
         /**  星级综合评分  */
        public static final  String scoreAvg =  "scoreAvg";
         /**  陪玩师评价平均分  */
        public static final  String serverScoreAvg =  "serverScoreAvg";
         /**  昵称  */
        public static final  String nickname =  "nickname";
         /**  性别(默认0不公开,1男,2女)  */
        public static final  String gender =  "gender";
         /**  头像URL  */
        public static final  String headPortraitsUrl =  "headPortraitsUrl";
         /**  密码  */
        public static final  String password =  "password";
         /**  密码盐  */
        public static final  String salt =  "salt";
         /**  真实姓名  */
        public static final  String realname =  "realname";
         /**  身份证  */
        public static final  String idcard =  "idcard";
         /**  零钱  */
        public static final  String balance =  "balance";
         /**  不可提现余额  */
        public static final  String chargeBalance =  "chargeBalance";
         /**  虚拟零钱（对应钻石数量）  */
        public static final  String virtualBalance =  "virtualBalance";
         /**  魅力值  */
        public static final  String charm =  "charm";
         /**  累计总提现魅力值  */
        public static final  String charmDrawSum =  "charmDrawSum";
         /**  状态(0封禁1解封)  */
        public static final  String status =  "status";
         /**  市  */
        public static final  String city =  "city";
         /**  省  */
        public static final  String province =  "province";
         /**  国家  */
        public static final  String country =  "country";
         /**    */
        public static final  String constellation =  "constellation";
         /**  出生日  */
        public static final  String birth =  "birth";
         /**    */
        public static final  String age =  "age";
         /**  用户总积分  */
        public static final  String userScore =  "userScore";
         /**  会员经验值  */
        public static final  String memberExp =  "memberExp";
         /**  虚拟会员经验值  */
        public static final  String virtualMemberExp =  "virtualMemberExp";
         /**  创建时间  */
        public static final  String createTime =  "createTime";
         /**  修改时间  */
        public static final  String updateTime =  "updateTime";
         /**    */
        public static final  String delFlag =  "delFlag";
         /**  注册平台  */
        public static final  String regPlatform =  "regPlatform";
         /**  注册来源id  */
        public static final  String sourceId =  "sourceId";
         /**  注册ip  */
        public static final  String registIp =  "registIp";
         /**  最后登录ip  */
        public static final  String loginIp =  "loginIp";
         /**  最后登录时间  */
        public static final  String loginTime =  "loginTime";
         /**  抽奖次数  */
        public static final  String leftEnterTimes =  "leftEnterTimes";
         /**  剩余抽奖次数  */
        public static final  String leftEnterTimes1 =  "leftEnterTimes1";
 
 }
}