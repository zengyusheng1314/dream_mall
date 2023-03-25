package com.sean.service.impl;

import com.sean.dao.PortalProductDao;
import com.sean.domain.PmsProductParam;
import com.sean.service.ProductService;
import org.springframework.stereotype.Service;

/**
 * 商品服务实现类
 *
 * @author zhanghh Email:zhanghonghui007@163.com
 * @since 2023/03/24 22:30
 */
@Service
public class ProductServiceImpl implements ProductService {

    private PortalProductDao portalProductDao;

    @Override
    public PmsProductParam getProductInfo(Long id) {
        PmsProductParam productInfo = portalProductDao.getProductInfo(id);
        if (null == productInfo) {
            return null;
        }
        // 判断是否为秒杀产品
        checkFlash(id, productInfo);
        return null;
    }

    private PmsProductParam checkFlash(Long id, PmsProductParam productInfo) {
        return null;
    }
}
