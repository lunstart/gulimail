package com.atguigu.gulimall.coupon.dao;

import com.atguigu.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author ljw
 * @email ljw@gmail.com
 * @date 2024-08-04 16:15:56
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
