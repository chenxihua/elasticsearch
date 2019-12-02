package com.gosuncn.esdemo.repository;

import com.gosuncn.esdemo.domin.Logs;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

/**
 * @ClassName: LogsRepository
 * @Create By: chenxihua
 * @Author: Administrator
 * @Date: 2019/12/2 8:46
 **/
@Repository
public interface LogsRepository extends ElasticsearchRepository<Logs, Long> {
}
