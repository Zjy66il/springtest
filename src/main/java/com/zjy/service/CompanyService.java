package com.zjy.service;

import com.zjy.entity.TCompany;
import com.zjy.entity.TProduct;

import java.util.List;

public interface CompanyService {

    List<TCompany> getAll();

    Boolean deleteByPrimaryKey(Integer id);

    int insert(TCompany record, TProduct product);

    int updateByPrimaryKey(TCompany record, TProduct product);
}
