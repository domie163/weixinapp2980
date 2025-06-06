package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JianliEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JianliVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JianliView;


/**
 * 简历
 *
 * @author 
 * @email 
 * @date 2021-04-09 20:22:27
 */
public interface JianliService extends IService<JianliEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JianliVO> selectListVO(Wrapper<JianliEntity> wrapper);
   	
   	JianliVO selectVO(@Param("ew") Wrapper<JianliEntity> wrapper);
   	
   	List<JianliView> selectListView(Wrapper<JianliEntity> wrapper);
   	
   	JianliView selectView(@Param("ew") Wrapper<JianliEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JianliEntity> wrapper);
   	
}

