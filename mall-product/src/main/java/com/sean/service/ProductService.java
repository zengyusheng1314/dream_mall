package com.sean.service;

import com.sean.domain.PmsProductParam;

/**
 * 商品服务接口
 * 
 * @author zhanghh Email:zhanghonghui007@163.com
 * @since 2023/03/24 21:56
 */
public interface ProductService {

    /**
     * 获取商品详情信息
     * 
     * @param id 商品id
     * @return
     */
    PmsProductParam getProductInfo(Long id);
}
