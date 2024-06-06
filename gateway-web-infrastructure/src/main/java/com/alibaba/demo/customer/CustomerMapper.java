package com.alibaba.demo.customer;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CustomerMapper{

  CustomerDO getById(String customerId);
}
