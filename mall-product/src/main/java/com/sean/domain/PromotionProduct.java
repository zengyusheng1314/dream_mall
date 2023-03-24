package com.sean.domain;

import java.util.List;

import com.sean.model.PmsProduct;

import com.sean.model.PmsProductFullReduction;
import com.sean.model.PmsProductLadder;
import com.sean.model.PmsSkuStock;
import lombok.Data;

/**
 * 商品的促销信息，包括sku、打折优惠、满减优惠
 *
 * @author zhanghh Email:zhanghonghui007@163.com
 * @since 2023/03/24 21:56
 */
@Data
public class PromotionProduct extends PmsProduct {
    /** 商品库存信息 */
    private List<PmsSkuStock> skuStockList;
    /** 商品打折信息 */
    private List<PmsProductLadder> productLadderList;
    /** 商品满减信息 */
    private List<PmsProductFullReduction> productFullReductionList;

}
