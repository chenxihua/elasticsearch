package com.gosuncn.esdemo.init;

import com.gosuncn.esdemo.constant.EsData;
import com.gosuncn.esdemo.domin.Logs;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.stereotype.Component;


/**
 * @ClassName: InitIndex
 * @Create By: chenxihua
 * @Author: Administrator
 * @Date: 2019/11/29 10:15
 **/
@Component
@Order(value = 0)
public class InitIndex implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(InitIndex.class);

    @Autowired
    ElasticsearchTemplate elasticsearchTemplate;

    /**
     * 项目启动的时候，如果elasticsearch已经存有索引，则不做任何操作
     *      如果没有索引，则新建索引
     * @param args
     * @throws Exception
     */
    @Override
    public void run(String... args) throws Exception {
        boolean indexExists = elasticsearchTemplate.indexExists(Logs.class);
        if (indexExists){
            logger.warn("存在索引");
        }else {
            logger.warn("索引不存在。。。");
            try {
                boolean index = elasticsearchTemplate.createIndex(Logs.class, EsData.DEFAULT_SETTING);
                // 这一行代码，这么重要？ 厉害 如果不加的话，分词好像有点问题
                boolean putMapping = elasticsearchTemplate.putMapping(Logs.class);
                if (index && putMapping){
                    logger.info("索引创建成功。。。");
                }else {
                    logger.warn("索引创建失败。。。");
                }
            }catch (Exception e){
                logger.error("error: {}", e.getLocalizedMessage());
            }
        }
    }
}
