package com.xcy.service.impl;

import com.xcy.mapper.BrandMapper;
import com.xcy.pojo.Brand;
import com.xcy.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrandServiceImpl implements BrandService {

    @Autowired
    BrandMapper brandMapper;
    @Override
    public List<Brand> selectAllBrand() {
        return brandMapper.selectAllBrand();
    }
}
