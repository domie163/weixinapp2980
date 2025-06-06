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


import com.dao.JianliDao;
import com.entity.JianliEntity;
import com.service.JianliService;
import com.entity.vo.JianliVO;
import com.entity.view.JianliView;

@Service("jianliService")
public class JianliServiceImpl extends ServiceImpl<JianliDao, JianliEntity> implements JianliService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JianliEntity> page = this.selectPage(
                new Query<JianliEntity>(params).getPage(),
                new EntityWrapper<JianliEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JianliEntity> wrapper) {
		  Page<JianliView> page =new Query<JianliView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JianliVO> selectListVO(Wrapper<JianliEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JianliVO selectVO(Wrapper<JianliEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JianliView> selectListView(Wrapper<JianliEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JianliView selectView(Wrapper<JianliEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
