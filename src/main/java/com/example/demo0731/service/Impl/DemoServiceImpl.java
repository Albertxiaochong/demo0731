package com.example.demo0731.service.Impl;


import com.example.demo0731.dao.entity.City;
import com.example.demo0731.dao.mapper.CityMapper;
import com.example.demo0731.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DemoServiceImpl implements DemoService {

    @Autowired
    CityMapper cityMapper;

    @Override
    public String demoServiceMethod() {
        long wq = cityMapper.selectCount(new City());
        System.out.println("Count(city) = " + wq);
        return "service return";
    }
}
