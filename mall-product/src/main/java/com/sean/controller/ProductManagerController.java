package com.sean.controller;

import com.sean.service.ProductService;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 商品管理
 *
 * @author zhanghh Email:zhanghonghui007@163.com
 * @since 2023/03/24 21:56
 */
@Api(value = "ProductManagerController",tags = "商品管理")
@RestController
@RequestMapping("/product")
public class ProductManagerController {

    @Resource
    private ProductService productService;

}
