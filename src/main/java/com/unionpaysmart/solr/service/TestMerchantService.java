package com.unionpaysmart.solr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unionpaysmart.solr.orm.domain.solr.MerchantDocument;
import com.unionpaysmart.solr.orm.service.solr.MerchantService;

/**
 * @author yida
 * @date 2015年6月18日 上午11:31:49 
 */
@Service
public class TestMerchantService {
    
    @Autowired
    private MerchantService merchantService;
    
    public List<MerchantDocument> testQueryByName(String name){
        return merchantService.findByName(name);
    }

}
