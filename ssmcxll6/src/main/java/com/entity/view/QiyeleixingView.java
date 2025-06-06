package com.entity.view;

import com.entity.QiyeleixingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 企业类型
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-09 20:22:27
 */
@TableName("qiyeleixing")
public class QiyeleixingView  extends QiyeleixingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public QiyeleixingView(){
	}
 
 	public QiyeleixingView(QiyeleixingEntity qiyeleixingEntity){
 	try {
			BeanUtils.copyProperties(this, qiyeleixingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
