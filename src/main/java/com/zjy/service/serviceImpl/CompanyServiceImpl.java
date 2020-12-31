package com.zjy.service.serviceImpl;

import com.zjy.entity.TCompany;
import com.zjy.entity.TProduct;
import com.zjy.mapper.TCompanyMapper;
import com.zjy.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CompanyServiceImpl implements CompanyService {

    @Autowired
    private TCompanyMapper tCompanyMapper;

    @Override
    public List<TCompany> getAll() {
        List<TCompany> list = tCompanyMapper.selectByExample(null);
        if (list==null){
            System.out.println("shibai");
        }
        return list;
    }

    @Override
    public Boolean deleteByPrimaryKey(Long id) {
        Integer result = tCompanyMapper.deleteByPrimaryKey(id);
        return 1 == result ? true : false;
    }

    @Override
    public int insert(TCompany record, TProduct product) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(TCompany record, TProduct product) {
        return 0;
    }
}
