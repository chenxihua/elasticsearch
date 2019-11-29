package com.gosuncn.esdemo.repository;


import com.gosuncn.esdemo.domin.Library;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LibraryRepository extends ElasticsearchRepository<Library, Long> {

}
