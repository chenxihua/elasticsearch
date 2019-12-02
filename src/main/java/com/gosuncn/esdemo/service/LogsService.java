package com.gosuncn.esdemo.service;

import com.gosuncn.esdemo.domin.Logs;
import com.gosuncn.esdemo.repository.LogsRepository;
import org.elasticsearch.index.query.QueryStringQueryBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @ClassName: LogsService
 * @Create By: chenxihua
 * @Author: Administrator
 * @Date: 2019/12/2 9:22
 **/
@Service
public class LogsService {

    private static final Logger logger = LoggerFactory.getLogger(LogsService.class);

    @Autowired
    LogsRepository logsRepository;

    public List<Logs> getLogsByConditions(String msg){
        logger.warn("已经进来。。。");
        List<Logs> logsList = new ArrayList<>();
        QueryStringQueryBuilder builder = new QueryStringQueryBuilder(msg);
        builder.field("username").field("operation").field("ip").field("contents").analyzer("myanalyzer");
        Iterable<Logs> logsIterable = logsRepository.search(builder);
        Iterator<Logs> iterator = logsIterable.iterator();
        while (iterator.hasNext()){
            logsList.add(iterator.next());
        }
        return logsList;
    }

}
