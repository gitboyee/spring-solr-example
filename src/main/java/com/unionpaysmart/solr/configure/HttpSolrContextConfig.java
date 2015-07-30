package com.unionpaysmart.solr.configure;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.Environment;
import org.springframework.data.solr.core.SolrTemplate;
import org.springframework.data.solr.repository.config.EnableSolrRepositories;
import org.springframework.data.solr.server.support.HttpSolrServerFactoryBean;

/**
 * @author yida
 * @date 2015年6月17日 下午5:57:11 
 */
@Configuration
@EnableSolrRepositories(basePackages = "com.unionpaysmart.solr.orm.repository.solr")
@Profile("dev")
public class HttpSolrContextConfig {
    
    public HttpSolrContextConfig() {
        System.out.println("testtest");
    }
    @Autowired
    private Environment environment;
    
    @Bean
    public HttpSolrServerFactoryBean httpSolrServerFactoryBean() {
        HttpSolrServerFactoryBean factoryBean = new HttpSolrServerFactoryBean();
        factoryBean.setUrl(environment.getProperty("solr.server.url"));
        return factoryBean;
    }
    @Bean
    public SolrTemplate solrTemplate() throws Exception{
        return new SolrTemplate(httpSolrServerFactoryBean().getObject());
    }
}
