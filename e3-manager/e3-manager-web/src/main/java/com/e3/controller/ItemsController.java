package com.e3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.e3.dao.pojo.TbItem;
import com.e3.service.ItemsService;



@Controller
@RequestMapping("item")
public class ItemsController {
	//注入service
	@Autowired
	private ItemsService itemService;
	
	/**
	 * 根据id查询商品信息的方法
	 */
	@RequestMapping("/getItemByid/{id}")
	@ResponseBody
	public TbItem getItemById(@PathVariable("id") Long itemid){
		TbItem item=itemService.getItemByid(itemid);
		return item;
	}
	
	
	
}
