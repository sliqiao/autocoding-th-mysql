package com.liqiao.my.model;
import java.util.Date;
import com.extjs.gxt.ui.client.data.BeanModel;

/**
 * @title  本代码由Autocoding生成
 * @author  QiaoLi
 * @date    2019-01-09 14:09:40
 * @description:  
 * @log:    2019-01-09 14:09:40  QiaoLi  新建
 */
public class TUserModel extends BeanModel implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    public TUserModel() {
    
         }
         /**  生成getter手机号  */
         public String getMobile() {
            return this.get(TUserModel.FieldConstant.mobile);
                }
          /** 生成setter手机号  */
          public void setMobile(String mobile) {
                  this.set(TUserModel.FieldConstant.mobile,mobile);
            
                }
         /**  生成getterim(环信)注册id  */
         public String getImId() {
            return this.get(TUserModel.FieldConstant.imId);
                }
          /** 生成setterim(环信)注册id  */
          public void setImId(String imId) {
                  this.set(TUserModel.FieldConstant.imId,imId);
            
                }
         /**  生成getterim(环信)注册密码  */
         public String getImPsw() {
            return this.get(TUserModel.FieldConstant.imPsw);
                }
          /** 生成setterim(环信)注册密码  */
          public void setImPsw(String imPsw) {
                  this.set(TUserModel.FieldConstant.imPsw,imPsw);
            
                }
         /**  生成getter  */
         public String getOpenId() {
            return this.get(TUserModel.FieldConstant.openId);
                }
          /** 生成setter  */
          public void setOpenId(String openId) {
                  this.set(TUserModel.FieldConstant.openId,openId);
            
                }
         /**  生成getter开黑上分openid  */
         public String getPointOpenId() {
            return this.get(TUserModel.FieldConstant.pointOpenId);
                }
          /** 生成setter开黑上分openid  */
          public void setPointOpenId(String pointOpenId) {
                  this.set(TUserModel.FieldConstant.pointOpenId,pointOpenId);
            
                }
         /**  生成getter微信公众号openid  */
         public String getPublicOpenId() {
            return this.get(TUserModel.FieldConstant.publicOpenId);
                }
          /** 生成setter微信公众号openid  */
          public void setPublicOpenId(String publicOpenId) {
                  this.set(TUserModel.FieldConstant.publicOpenId,publicOpenId);
            
                }
         /**  生成getter微信生态唯一标识  */
         public String getUnionId() {
            return this.get(TUserModel.FieldConstant.unionId);
                }
          /** 生成setter微信生态唯一标识  */
          public void setUnionId(String unionId) {
                  this.set(TUserModel.FieldConstant.unionId,unionId);
            
                }
         /**  生成getter1:普通用户,2:打手,3:渠道商  */
         public Integer getType() {
            return this.get(TUserModel.FieldConstant.type);
                }
          /** 生成setter1:普通用户,2:打手,3:渠道商  */
          public void setType(Integer type) {
                  this.set(TUserModel.FieldConstant.type,type);
            
                }
         /**  生成getter用户注册来源（1：小程序；2：APP）  */
         public Integer getRegisterType() {
            return this.get(TUserModel.FieldConstant.registerType);
                }
          /** 生成setter用户注册来源（1：小程序；2：APP）  */
          public void setRegisterType(Integer registerType) {
                  this.set(TUserModel.FieldConstant.registerType,registerType);
            
                }
         /**  生成getter信息认证(0未完善,1已完善,2审核通过)  */
         public Integer getUserInfoAuth() {
            return this.get(TUserModel.FieldConstant.userInfoAuth);
                }
          /** 生成setter信息认证(0未完善,1已完善,2审核通过)  */
          public void setUserInfoAuth(Integer userInfoAuth) {
                  this.set(TUserModel.FieldConstant.userInfoAuth,userInfoAuth);
            
                }
         /**  生成getter星级综合评分  */
         public Double getScoreAvg() {
            return this.get(TUserModel.FieldConstant.scoreAvg);
                }
          /** 生成setter星级综合评分  */
          public void setScoreAvg(Double scoreAvg) {
                  this.set(TUserModel.FieldConstant.scoreAvg,scoreAvg);
            
                }
         /**  生成getter陪玩师评价平均分  */
         public Double getServerScoreAvg() {
            return this.get(TUserModel.FieldConstant.serverScoreAvg);
                }
          /** 生成setter陪玩师评价平均分  */
          public void setServerScoreAvg(Double serverScoreAvg) {
                  this.set(TUserModel.FieldConstant.serverScoreAvg,serverScoreAvg);
            
                }
         /**  生成getter昵称  */
         public String getNickname() {
            return this.get(TUserModel.FieldConstant.nickname);
                }
          /** 生成setter昵称  */
          public void setNickname(String nickname) {
                  this.set(TUserModel.FieldConstant.nickname,nickname);
            
                }
         /**  生成getter性别(默认0不公开,1男,2女)  */
         public Integer getGender() {
            return this.get(TUserModel.FieldConstant.gender);
                }
          /** 生成setter性别(默认0不公开,1男,2女)  */
          public void setGender(Integer gender) {
                  this.set(TUserModel.FieldConstant.gender,gender);
            
                }
         /**  生成getter头像URL  */
         public String getHeadPortraitsUrl() {
            return this.get(TUserModel.FieldConstant.headPortraitsUrl);
                }
          /** 生成setter头像URL  */
          public void setHeadPortraitsUrl(String headPortraitsUrl) {
                  this.set(TUserModel.FieldConstant.headPortraitsUrl,headPortraitsUrl);
            
                }
         /**  生成getter密码  */
         public String getPassword() {
            return this.get(TUserModel.FieldConstant.password);
                }
          /** 生成setter密码  */
          public void setPassword(String password) {
                  this.set(TUserModel.FieldConstant.password,password);
            
                }
         /**  生成getter密码盐  */
         public String getSalt() {
            return this.get(TUserModel.FieldConstant.salt);
                }
          /** 生成setter密码盐  */
          public void setSalt(String salt) {
                  this.set(TUserModel.FieldConstant.salt,salt);
            
                }
         /**  生成getter真实姓名  */
         public String getRealname() {
            return this.get(TUserModel.FieldConstant.realname);
                }
          /** 生成setter真实姓名  */
          public void setRealname(String realname) {
                  this.set(TUserModel.FieldConstant.realname,realname);
            
                }
         /**  生成getter身份证  */
         public String getIdcard() {
            return this.get(TUserModel.FieldConstant.idcard);
                }
          /** 生成setter身份证  */
          public void setIdcard(String idcard) {
                  this.set(TUserModel.FieldConstant.idcard,idcard);
            
                }
         /**  生成getter零钱  */
         public Double getBalance() {
            return this.get(TUserModel.FieldConstant.balance);
                }
          /** 生成setter零钱  */
          public void setBalance(Double balance) {
                  this.set(TUserModel.FieldConstant.balance,balance);
            
                }
         /**  生成getter不可提现余额  */
         public Double getChargeBalance() {
            return this.get(TUserModel.FieldConstant.chargeBalance);
                }
          /** 生成setter不可提现余额  */
          public void setChargeBalance(Double chargeBalance) {
                  this.set(TUserModel.FieldConstant.chargeBalance,chargeBalance);
            
                }
         /**  生成getter虚拟零钱（对应钻石数量）  */
         public Integer getVirtualBalance() {
            return this.get(TUserModel.FieldConstant.virtualBalance);
                }
          /** 生成setter虚拟零钱（对应钻石数量）  */
          public void setVirtualBalance(Integer virtualBalance) {
                  this.set(TUserModel.FieldConstant.virtualBalance,virtualBalance);
            
                }
         /**  生成getter魅力值  */
         public Integer getCharm() {
            return this.get(TUserModel.FieldConstant.charm);
                }
          /** 生成setter魅力值  */
          public void setCharm(Integer charm) {
                  this.set(TUserModel.FieldConstant.charm,charm);
            
                }
         /**  生成getter累计总提现魅力值  */
         public Integer getCharmDrawSum() {
            return this.get(TUserModel.FieldConstant.charmDrawSum);
                }
          /** 生成setter累计总提现魅力值  */
          public void setCharmDrawSum(Integer charmDrawSum) {
                  this.set(TUserModel.FieldConstant.charmDrawSum,charmDrawSum);
            
                }
         /**  生成getter状态(0封禁1解封)  */
         public Integer getStatus() {
            return this.get(TUserModel.FieldConstant.status);
                }
          /** 生成setter状态(0封禁1解封)  */
          public void setStatus(Integer status) {
                  this.set(TUserModel.FieldConstant.status,status);
            
                }
         /**  生成getter市  */
         public String getCity() {
            return this.get(TUserModel.FieldConstant.city);
                }
          /** 生成setter市  */
          public void setCity(String city) {
                  this.set(TUserModel.FieldConstant.city,city);
            
                }
         /**  生成getter省  */
         public String getProvince() {
            return this.get(TUserModel.FieldConstant.province);
                }
          /** 生成setter省  */
          public void setProvince(String province) {
                  this.set(TUserModel.FieldConstant.province,province);
            
                }
         /**  生成getter国家  */
         public String getCountry() {
            return this.get(TUserModel.FieldConstant.country);
                }
          /** 生成setter国家  */
          public void setCountry(String country) {
                  this.set(TUserModel.FieldConstant.country,country);
            
                }
         /**  生成getter  */
         public String getConstellation() {
            return this.get(TUserModel.FieldConstant.constellation);
                }
          /** 生成setter  */
          public void setConstellation(String constellation) {
                  this.set(TUserModel.FieldConstant.constellation,constellation);
            
                }
         /**  生成getter出生日  */
         public String getBirth() {
            return this.get(TUserModel.FieldConstant.birth);
                }
          /** 生成setter出生日  */
          public void setBirth(String birth) {
                  this.set(TUserModel.FieldConstant.birth,birth);
            
                }
         /**  生成getter  */
         public Integer getAge() {
            return this.get(TUserModel.FieldConstant.age);
                }
          /** 生成setter  */
          public void setAge(Integer age) {
                  this.set(TUserModel.FieldConstant.age,age);
            
                }
         /**  生成getter用户总积分  */
         public Integer getUserScore() {
            return this.get(TUserModel.FieldConstant.userScore);
                }
          /** 生成setter用户总积分  */
          public void setUserScore(Integer userScore) {
                  this.set(TUserModel.FieldConstant.userScore,userScore);
            
                }
         /**  生成getter会员经验值  */
         public Integer getMemberExp() {
            return this.get(TUserModel.FieldConstant.memberExp);
                }
          /** 生成setter会员经验值  */
          public void setMemberExp(Integer memberExp) {
                  this.set(TUserModel.FieldConstant.memberExp,memberExp);
            
                }
         /**  生成getter虚拟会员经验值  */
         public Integer getVirtualMemberExp() {
            return this.get(TUserModel.FieldConstant.virtualMemberExp);
                }
          /** 生成setter虚拟会员经验值  */
          public void setVirtualMemberExp(Integer virtualMemberExp) {
                  this.set(TUserModel.FieldConstant.virtualMemberExp,virtualMemberExp);
            
                }
         /**  生成getter创建时间  */
         public Date getCreateTime() {
            return this.get(TUserModel.FieldConstant.createTime);
                }
          /** 生成setter创建时间  */
          public void setCreateTime(Date createTime) {
                  this.set(TUserModel.FieldConstant.createTime,createTime);
            
                }
         /**  生成getter修改时间  */
         public Date getUpdateTime() {
            return this.get(TUserModel.FieldConstant.updateTime);
                }
          /** 生成setter修改时间  */
          public void setUpdateTime(Date updateTime) {
                  this.set(TUserModel.FieldConstant.updateTime,updateTime);
            
                }
         /**  生成getter  */
         public Integer getDelFlag() {
            return this.get(TUserModel.FieldConstant.delFlag);
                }
          /** 生成setter  */
          public void setDelFlag(Integer delFlag) {
                  this.set(TUserModel.FieldConstant.delFlag,delFlag);
            
                }
         /**  生成getter注册平台  */
         public Integer getRegPlatform() {
            return this.get(TUserModel.FieldConstant.regPlatform);
                }
          /** 生成setter注册平台  */
          public void setRegPlatform(Integer regPlatform) {
                  this.set(TUserModel.FieldConstant.regPlatform,regPlatform);
            
                }
         /**  生成getter注册来源id  */
         public Integer getSourceId() {
            return this.get(TUserModel.FieldConstant.sourceId);
                }
          /** 生成setter注册来源id  */
          public void setSourceId(Integer sourceId) {
                  this.set(TUserModel.FieldConstant.sourceId,sourceId);
            
                }
         /**  生成getter注册ip  */
         public String getRegistIp() {
            return this.get(TUserModel.FieldConstant.registIp);
                }
          /** 生成setter注册ip  */
          public void setRegistIp(String registIp) {
                  this.set(TUserModel.FieldConstant.registIp,registIp);
            
                }
         /**  生成getter最后登录ip  */
         public String getLoginIp() {
            return this.get(TUserModel.FieldConstant.loginIp);
                }
          /** 生成setter最后登录ip  */
          public void setLoginIp(String loginIp) {
                  this.set(TUserModel.FieldConstant.loginIp,loginIp);
            
                }
         /**  生成getter最后登录时间  */
         public Date getLoginTime() {
            return this.get(TUserModel.FieldConstant.loginTime);
                }
          /** 生成setter最后登录时间  */
          public void setLoginTime(Date loginTime) {
                  this.set(TUserModel.FieldConstant.loginTime,loginTime);
            
                }
         /**  生成getter抽奖次数  */
         public Integer getLeftEnterTimes() {
            return this.get(TUserModel.FieldConstant.leftEnterTimes);
                }
          /** 生成setter抽奖次数  */
          public void setLeftEnterTimes(Integer leftEnterTimes) {
                  this.set(TUserModel.FieldConstant.leftEnterTimes,leftEnterTimes);
            
                }
         /**  生成getter剩余抽奖次数  */
         public Integer getLeftEnterTimes1() {
            return this.get(TUserModel.FieldConstant.leftEnterTimes1);
                }
          /** 生成setter剩余抽奖次数  */
          public void setLeftEnterTimes1(Integer leftEnterTimes1) {
                  this.set(TUserModel.FieldConstant.leftEnterTimes1,leftEnterTimes1);
            
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