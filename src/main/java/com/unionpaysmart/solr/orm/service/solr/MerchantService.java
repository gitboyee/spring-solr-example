package com.unionpaysmart.solr.orm.service.solr;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unionpaysmart.solr.orm.domain.solr.MerchantDocument;
import com.unionpaysmart.solr.orm.repository.solr.MerchantRepository;

/**
 * @author yida
 * @date 2015年6月17日 下午8:05:40 
 */
@Service
public class MerchantService {
    
    @Autowired
    private MerchantRepository merchantRepository;
    
    
    public List<MerchantDocument> findByName(String mname){
        return merchantRepository.findByMnameLike(mname);
    }

}
