package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author ljw
 * @email ljw@gmail.com
 * @date 2024-08-04 16:59:03
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
