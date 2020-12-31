package com.zjy.service;

import com.zjy.entity.TCompany;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ContextConfiguration()
@SpringBootTest
class CompanyServiceTest {

    @Autowired
    private CompanyService companyService;

    @Test
    public void testGetAll(){

        List<TCompany> list = companyService.getAll();
        System.out.println(list.toString());
    }

    @ParameterizedTest
    @ValueSource(ints = {5, 4 ,6})
    public void testDeleteByPrimaryKey(Integer id){
        Boolean b = companyService.deleteByPrimaryKey(id);
        System.out.println(b.toString());
    }

}