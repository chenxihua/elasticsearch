package com.gosuncn.esdemo;

import com.gosuncn.esdemo.domin.Logs;
import com.gosuncn.esdemo.repository.LogsRepository;
import org.elasticsearch.index.query.QueryStringQueryBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Iterator;

/**
 * @ClassName: LogsTest
 * @Create By: chenxihua
 * @Author: Administrator
 * @Date: 2019/12/2 9:07
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class LogsTest {

    private static final Logger logger = LoggerFactory.getLogger(LogsTest.class);

    @Autowired
    LogsRepository logsRepository;


    @Test
    public void testInsert(){
        logsRepository.save(new Logs(1L,"马立志", "添加", "127.0.0.1", "立志提奶家，了新日志操作", System.currentTimeMillis()));
        logsRepository.save(new Logs(2L,"正想的", "添加", "127.123.123.119", "@#更大", System.currentTimeMillis()));
        logsRepository.save(new Logs(3L,"种植青", "添加", "127.0.02.199", "没给过，第几啊", System.currentTimeMillis()));
        logsRepository.save(new Logs(4L,"房老价定", "删除", "128.104.0.11", "刚更加", System.currentTimeMillis()));
        logsRepository.save(new Logs(5L,"抵，# ii", "删除", "127.11.12.154", "感染%埃及", System.currentTimeMillis()));
        logsRepository.save(new Logs(6L, "订干爹", "删除", "127.11.12.154", "家的手工单*&更改恩", System.currentTimeMillis()));
        logsRepository.save(new Logs(7L,"哥哥", "更新", "127.11.12.154", "达到。", System.currentTimeMillis()));
        logsRepository.save(new Logs(8L,"会如何让", "更新", "127.11.12.154", "大哥大哥", System.currentTimeMillis()));
        logsRepository.save(new Logs(9L,"格奥尔", "更新", "127.11.12.154", "基本！@", System.currentTimeMillis()));
        logsRepository.save(new Logs(10L,"个儿矮", "删除", "127.11.12.154", "dfai,", System.currentTimeMillis()));
        logsRepository.save(new Logs(11L,"广大额额", "添加", "127.11.12.154", "da", System.currentTimeMillis()));
        logsRepository.save(new Logs(12L,"哥爱的", "添加", "127.11.12.154", "规范垃圾", System.currentTimeMillis()));
        logsRepository.save(new Logs(13L,"哥啊", "修改", "127.11.12.154", "该如何", System.currentTimeMillis()));
        logsRepository.save(new Logs(14L,"多个人工", "修改", "127.11.12.154", "然后", System.currentTimeMillis()));
        logsRepository.save(new Logs(15L,"高大而", "更新", "127.11.9.154", "黄日华", System.currentTimeMillis()));
        logsRepository.save(new Logs(16L,"第三方干", "查询", "127.11.12.154", "会如何让", System.currentTimeMillis()));
        logsRepository.save(new Logs(17L,"大哥", "查询", "127.11.99.154", "攻击力@，。", System.currentTimeMillis()));
    }


    @Test
    public void testShow(){
        String msg = "@查询，";
        QueryStringQueryBuilder builder = new QueryStringQueryBuilder(msg);
        builder.field("username").field("operation").field("ip").field("contents").analyzer("myanalyzer");
        Iterable<Logs> logsIterable = logsRepository.search(builder);
        Iterator<Logs> iterator = logsIterable.iterator();
        while (iterator.hasNext()){
            logger.warn("-->"+iterator.next());
        }
    }

}
