package com.atguigu.gulimall.member.feign;

import com.atguigu.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ author 星星草去哪了
 * @ data 2024/8/7 16:03
 */
@FeignClient(name = "gulimall-coupon" ,url="http://localhost:7001/")
public interface CouponFeignService {

    @RequestMapping("coupon/coupon/member/list")
    public R membercoupons();

}

