package com.atguigu.gulimall.product;

import com.atguigu.gulimall.product.entity.BrandEntity;
import com.atguigu.gulimall.product.service.BrandService;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class GulimallProductApplicationTests {
    private final String TEST_NAME[] = {"增加", "删除", "修改", "查询"};

    private boolean res = true;

    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {
        List<BrandEntity> list = brandService.list(new QueryWrapper<BrandEntity>().eq("name", "小米"));
        list.forEach(
                (item) -> System.out.println(item)
        );
    }

    @Test
    void savetest() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setName("小米");
        try {
            brandService.save(brandEntity);
        } catch (Exception e) {
            res = false;
            System.out.println(e.getMessage());
        } finally {
            printLog(0);
            res = true;
        }
    }

    @Test
    void deletetest() {
        try {
            brandService.removeById(1L);
        } catch (Exception e) {
            res = false;
            System.out.println(e.getMessage());
        } finally {
            printLog(1);
        }
    }

    @Test
    void updatetest() {
        try {
            BrandEntity brandEntity = new BrandEntity();
            brandEntity.setBrandId(1L);
            brandEntity.setName("小米");
            brandService.updateById(brandEntity);
        } catch (Exception e) {
            res = false;
            System.out.println(e.getMessage());
        } finally {
            printLog(2);
            res = true;
        }

    }

    @Test
    void querytest() {
        try {
            BrandEntity brandEntity = brandService.getById(1L);
            System.out.println(brandEntity);
        } catch (Exception e) {
            res = false;
            System.out.println(e.getMessage());
        } finally {
            printLog(3);
            res = true;
        }
    }


    void printLog(int i) {
        System.out.println("================================");
        System.out.println("测试" + TEST_NAME[i] + "功能!");
        System.out.println(res ? "success !" : "fail !");
        System.out.println("================================");
    }

}
