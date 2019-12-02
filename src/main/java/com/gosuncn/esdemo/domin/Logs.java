package com.gosuncn.esdemo.domin;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.io.Serializable;

/**
 * @ClassName: Logs
 * @Create By: chenxihua
 * @Author: Administrator
 * @Date: 2019/12/2 8:42
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Document(indexName = "local_vgis", type = "vgis", shards = 4, replicas = 0,  createIndex = false)
public class Logs implements Serializable {


    @Id
    @Field(store = true, index = false, type = FieldType.Long)
    private Long id;

    @Field(store = true, analyzer = "myanalyzer", type = FieldType.text)
    private String username;

    @Field(store = true, analyzer = "myanalyzer", type = FieldType.text)
    private String operation;

    @Field(store = true, analyzer = "myanalyzer", type = FieldType.text)
    private String ip;

    @Field(store = true, analyzer = "myanalyzer", type = FieldType.text)
    private String contents;

    @Field(store = true, index = false, type = FieldType.Long)
    private Long times;


}
