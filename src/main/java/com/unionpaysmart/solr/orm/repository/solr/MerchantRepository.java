package com.unionpaysmart.solr.orm.repository.solr;

import java.util.List;

import org.springframework.data.solr.repository.SolrCrudRepository;

import com.unionpaysmart.solr.orm.domain.solr.MerchantDocument;

/**
 * @author yida
 * @date 2015年6月17日 下午8:03:30 
 */
public interface MerchantRepository extends SolrCrudRepository<MerchantDocument, Integer> {
    List<MerchantDocument> findByMnameLike(String mname);

}
