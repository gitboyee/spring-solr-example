package com.unionpaysmart.solr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.unionpaysmart.solr.orm.domain.solr.MerchantDocument;
import com.unionpaysmart.solr.service.TestMerchantService;

/**
 * @author yida
 * @date 2015年6月18日 上午11:34:01 
 */
@RestController
@RequestMapping(value = "/test")
public class TestController {
    
    @Autowired
    private TestMerchantService testMerchantService;
    
    @RequestMapping(value = "/queryByName", method = RequestMethod.GET)
    @ResponseBody
    public List<MerchantDocument> get(@RequestParam(value = "name",required=true) String name){
        return testMerchantService.testQueryByName(name);
    }

}
