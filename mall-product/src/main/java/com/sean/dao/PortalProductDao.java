package com.sean.dao;

import com.sean.domain.PmsProductParam;
import org.apache.ibatis.annotations.Param;

/**
 * 前台系统自定义商品Dao
 * @author zhanghh Email:zhanghonghui007@163.com
 * @since 2023/03/24 21:56
 */
public interface PortalProductDao {

    /**
     * 根据id获取商品信息
     * @param id
     * @return
     */
    PmsProductParam getProductInfo(@Param("id") Long id);
}
