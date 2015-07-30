package com.unionpaysmart.solr.application;

import org.apache.solr.client.solrj.SolrServer;
import org.apache.solr.client.solrj.impl.HttpSolrServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.solr.core.SolrTemplate;
import org.springframework.data.solr.repository.config.EnableSolrRepositories;

/**
 * @author yida
 * @date 2015年6月18日 上午11:38:28 
 */
@ComponentScan(basePackages="com.unionpaysmart.solr")
@PropertySource("classpath:properties/application.properties")
@EnableJpaRepositories("com.unionpaysmart.orm.repository.db")
@EnableSolrRepositories(basePackages = "com.unionpaysmart.solr.orm.repository.solr")
@EnableAutoConfiguration
public class App {
    
    @Autowired
    private Environment environment;
    
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
    
    @Bean
    public SolrServer solrServer() {
      return new HttpSolrServer(environment.getProperty("solr.server.url"));
    }

    @Bean
    public SolrTemplate solrTemplate() throws Exception{
        return new SolrTemplate(solrServer());
    }

}
