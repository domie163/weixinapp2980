package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.QiyeleixingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.QiyeleixingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.QiyeleixingView;


/**
 * 企业类型
 *
 * @author 
 * @email 
 * @date 2021-04-09 20:22:27
 */
public interface QiyeleixingService extends IService<QiyeleixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<QiyeleixingVO> selectListVO(Wrapper<QiyeleixingEntity> wrapper);
   	
   	QiyeleixingVO selectVO(@Param("ew") Wrapper<QiyeleixingEntity> wrapper);
   	
   	List<QiyeleixingView> selectListView(Wrapper<QiyeleixingEntity> wrapper);
   	
   	QiyeleixingView selectView(@Param("ew") Wrapper<QiyeleixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<QiyeleixingEntity> wrapper);
   	
}

