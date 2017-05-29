package com.e3.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.e3.dao.mapper.TbItemMapper;
import com.e3.dao.pojo.TbItem;
import com.e3.service.ItemsService;
@Service
public class ItemsServiceImpl implements ItemsService {
	//注入dao接口
	@Autowired
	private TbItemMapper itemMapper;

	@Override
	public TbItem getItemByid(Long itemid) {
		TbItem item=itemMapper.selectByPrimaryKey(itemid);
		return item;
	}
	
	
}
