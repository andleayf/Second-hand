package com.xcy.service.impl;

import com.xcy.mapper.PackageMapper;
import com.xcy.pojo.Package;
import com.xcy.service.PackageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PackageServiceImpl implements PackageService {

    @Autowired
    PackageMapper packageMapper;
    @Override
    public List<Package> getAllPackage() {
        return packageMapper.getAllPackage();
    }
}
