package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.QiyeleixingDao;
import com.entity.QiyeleixingEntity;
import com.service.QiyeleixingService;
import com.entity.vo.QiyeleixingVO;
import com.entity.view.QiyeleixingView;

@Service("qiyeleixingService")
public class QiyeleixingServiceImpl extends ServiceImpl<QiyeleixingDao, QiyeleixingEntity> implements QiyeleixingService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<QiyeleixingEntity> page = this.selectPage(
                new Query<QiyeleixingEntity>(params).getPage(),
                new EntityWrapper<QiyeleixingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<QiyeleixingEntity> wrapper) {
		  Page<QiyeleixingView> page =new Query<QiyeleixingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<QiyeleixingVO> selectListVO(Wrapper<QiyeleixingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public QiyeleixingVO selectVO(Wrapper<QiyeleixingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<QiyeleixingView> selectListView(Wrapper<QiyeleixingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public QiyeleixingView selectView(Wrapper<QiyeleixingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
