package com.entity.model;

import com.entity.QiuzhixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 求职信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-09 20:22:27
 */
public class QiuzhixinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 学生姓名
	 */
	
	private String xueshengxingming;
		
	/**
	 * 账号
	 */
	
	private String zhanghao;
		
	/**
	 * 企业名称
	 */
	
	private String qiyemingcheng;
		
	/**
	 * 招聘岗位
	 */
	
	private String zhaopingangwei;
		
	/**
	 * 薪资
	 */
	
	private String xinzi;
		
	/**
	 * 学历
	 */
	
	private String xueli;
		
	/**
	 * 项目经历
	 */
	
	private String xiangmujingli;
		
	/**
	 * 工作经历
	 */
	
	private String gongzuojingli;
		
	/**
	 * 求职状态
	 */
	
	private String qiuzhizhuangtai;
		
	/**
	 * 期望行业
	 */
	
	private String qiwangxingye;
		
	/**
	 * 备注
	 */
	
	private String beizhu;
		
	/**
	 * 头像
	 */
	
	private String touxiang;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 用户id
	 */
	
	private Long userid;
				
	
	/**
	 * 设置：学生姓名
	 */
	 
	public void setXueshengxingming(String xueshengxingming) {
		this.xueshengxingming = xueshengxingming;
	}
	
	/**
	 * 获取：学生姓名
	 */
	public String getXueshengxingming() {
		return xueshengxingming;
	}
				
	
	/**
	 * 设置：账号
	 */
	 
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
	}
				
	
	/**
	 * 设置：企业名称
	 */
	 
	public void setQiyemingcheng(String qiyemingcheng) {
		this.qiyemingcheng = qiyemingcheng;
	}
	
	/**
	 * 获取：企业名称
	 */
	public String getQiyemingcheng() {
		return qiyemingcheng;
	}
				
	
	/**
	 * 设置：招聘岗位
	 */
	 
	public void setZhaopingangwei(String zhaopingangwei) {
		this.zhaopingangwei = zhaopingangwei;
	}
	
	/**
	 * 获取：招聘岗位
	 */
	public String getZhaopingangwei() {
		return zhaopingangwei;
	}
				
	
	/**
	 * 设置：薪资
	 */
	 
	public void setXinzi(String xinzi) {
		this.xinzi = xinzi;
	}
	
	/**
	 * 获取：薪资
	 */
	public String getXinzi() {
		return xinzi;
	}
				
	
	/**
	 * 设置：学历
	 */
	 
	public void setXueli(String xueli) {
		this.xueli = xueli;
	}
	
	/**
	 * 获取：学历
	 */
	public String getXueli() {
		return xueli;
	}
				
	
	/**
	 * 设置：项目经历
	 */
	 
	public void setXiangmujingli(String xiangmujingli) {
		this.xiangmujingli = xiangmujingli;
	}
	
	/**
	 * 获取：项目经历
	 */
	public String getXiangmujingli() {
		return xiangmujingli;
	}
				
	
	/**
	 * 设置：工作经历
	 */
	 
	public void setGongzuojingli(String gongzuojingli) {
		this.gongzuojingli = gongzuojingli;
	}
	
	/**
	 * 获取：工作经历
	 */
	public String getGongzuojingli() {
		return gongzuojingli;
	}
				
	
	/**
	 * 设置：求职状态
	 */
	 
	public void setQiuzhizhuangtai(String qiuzhizhuangtai) {
		this.qiuzhizhuangtai = qiuzhizhuangtai;
	}
	
	/**
	 * 获取：求职状态
	 */
	public String getQiuzhizhuangtai() {
		return qiuzhizhuangtai;
	}
				
	
	/**
	 * 设置：期望行业
	 */
	 
	public void setQiwangxingye(String qiwangxingye) {
		this.qiwangxingye = qiwangxingye;
	}
	
	/**
	 * 获取：期望行业
	 */
	public String getQiwangxingye() {
		return qiwangxingye;
	}
				
	
	/**
	 * 设置：备注
	 */
	 
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
	}
				
	
	/**
	 * 设置：头像
	 */
	 
	public void setTouxiang(String touxiang) {
		this.touxiang = touxiang;
	}
	
	/**
	 * 获取：头像
	 */
	public String getTouxiang() {
		return touxiang;
	}
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
				
	
	/**
	 * 设置：用户id
	 */
	 
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	
	/**
	 * 获取：用户id
	 */
	public Long getUserid() {
		return userid;
	}
			
}
