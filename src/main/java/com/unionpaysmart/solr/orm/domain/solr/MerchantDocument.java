package com.unionpaysmart.solr.orm.domain.solr;

import org.apache.solr.client.solrj.beans.Field;
import org.springframework.data.annotation.Id;

/**
 * @author yida
 * @date 2015年6月17日 下午7:58:45 
 */
public class MerchantDocument {

    @Id
    private Integer id;
    @Field
    private String mid;
    @Field
    private String mname;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

}
