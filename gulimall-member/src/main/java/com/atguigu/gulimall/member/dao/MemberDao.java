package com.atguigu.gulimall.member.dao;

import com.atguigu.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author ljw
 * @email ljw@gmail.com
 * @date 2024-08-04 16:43:38
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
