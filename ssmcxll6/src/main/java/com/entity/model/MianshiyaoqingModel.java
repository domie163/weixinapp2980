package com.entity.model;

import com.entity.MianshiyaoqingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 面试邀请
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-09 20:22:27
 */
public class MianshiyaoqingModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 学生姓名
	 */
	
	private String xueshengxingming;
		
	/**
	 * 毕业学校
	 */
	
	private String biyexuexiao;
		
	/**
	 * 学历
	 */
	
	private String xueli;
		
	/**
	 * 专业
	 */
	
	private String zhuanye;
		
	/**
	 * 账号
	 */
	
	private String zhanghao;
		
	/**
	 * 企业名称
	 */
	
	private String qiyemingcheng;
		
	/**
	 * 期望薪资
	 */
	
	private String qiwangxinzi;
		
	/**
	 * 期望行业
	 */
	
	private String qiwangxingye;
		
	/**
	 * 期望岗位
	 */
	
	private String qiwanggangwei;
		
	/**
	 * 岗位要求
	 */
	
	private String gangweiyaoqiu;
		
	/**
	 * 地址
	 */
	
	private String dizhi;
		
	/**
	 * 图片
	 */
	
	private String tupian;
				
	
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
	 * 设置：毕业学校
	 */
	 
	public void setBiyexuexiao(String biyexuexiao) {
		this.biyexuexiao = biyexuexiao;
	}
	
	/**
	 * 获取：毕业学校
	 */
	public String getBiyexuexiao() {
		return biyexuexiao;
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
	 * 设置：专业
	 */
	 
	public void setZhuanye(String zhuanye) {
		this.zhuanye = zhuanye;
	}
	
	/**
	 * 获取：专业
	 */
	public String getZhuanye() {
		return zhuanye;
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
	 * 设置：期望薪资
	 */
	 
	public void setQiwangxinzi(String qiwangxinzi) {
		this.qiwangxinzi = qiwangxinzi;
	}
	
	/**
	 * 获取：期望薪资
	 */
	public String getQiwangxinzi() {
		return qiwangxinzi;
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
	 * 设置：期望岗位
	 */
	 
	public void setQiwanggangwei(String qiwanggangwei) {
		this.qiwanggangwei = qiwanggangwei;
	}
	
	/**
	 * 获取：期望岗位
	 */
	public String getQiwanggangwei() {
		return qiwanggangwei;
	}
				
	
	/**
	 * 设置：岗位要求
	 */
	 
	public void setGangweiyaoqiu(String gangweiyaoqiu) {
		this.gangweiyaoqiu = gangweiyaoqiu;
	}
	
	/**
	 * 获取：岗位要求
	 */
	public String getGangweiyaoqiu() {
		return gangweiyaoqiu;
	}
				
	
	/**
	 * 设置：地址
	 */
	 
	public void setDizhi(String dizhi) {
		this.dizhi = dizhi;
	}
	
	/**
	 * 获取：地址
	 */
	public String getDizhi() {
		return dizhi;
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
			
}
