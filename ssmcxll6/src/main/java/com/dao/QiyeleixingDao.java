package com.dao;

import com.entity.QiyeleixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.QiyeleixingVO;
import com.entity.view.QiyeleixingView;


/**
 * 企业类型
 * 
 * @author 
 * @email 
 * @date 2021-04-09 20:22:27
 */
public interface QiyeleixingDao extends BaseMapper<QiyeleixingEntity> {
	
	List<QiyeleixingVO> selectListVO(@Param("ew") Wrapper<QiyeleixingEntity> wrapper);
	
	QiyeleixingVO selectVO(@Param("ew") Wrapper<QiyeleixingEntity> wrapper);
	
	List<QiyeleixingView> selectListView(@Param("ew") Wrapper<QiyeleixingEntity> wrapper);

	List<QiyeleixingView> selectListView(Pagination page,@Param("ew") Wrapper<QiyeleixingEntity> wrapper);
	
	QiyeleixingView selectView(@Param("ew") Wrapper<QiyeleixingEntity> wrapper);
	
}
