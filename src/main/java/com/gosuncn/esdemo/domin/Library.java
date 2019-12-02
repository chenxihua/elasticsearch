package com.gosuncn.esdemo.domin;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

/**
 * 这个创建索引的过程，最主要是从 @Document 注解中的 createIndex = false 这个属性开始，
 *      因为 createIndex默认是true， 所以项目启动的时候，默认就会初始化这个索引，（但是此时还没有加 settings 等设置）
 *      所以，就必须把它设置为 false。
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(indexName = "local_library", type = "book", shards = 4, createIndex = false)
public class Library {
    /**
     *     index：是否设置分词
     *     analyzer：存储时使用的分词器
     *          ik_max_word
     *          ik_word
     *     searchAnalyze：搜索时使用的分词器
     *     store：是否存储
     *     type: 数据类型
     */
    @Id
    @Field(type = FieldType.Integer)
    private Integer book_id;

    @Field(store = true, analyzer = "myanalyzer", type = FieldType.text)
    private String book_code;

    @Field(store = true, analyzer = "myanalyzer", type = FieldType.text)
    private String book_name;

    @Field(store = true, analyzer = "myanalyzer", type = FieldType.Integer)
    private Integer book_price;

    @Field(store = true, analyzer = "myanalyzer", type = FieldType.text)
    private String book_author;

    @Field(store = true, analyzer = "myanalyzer", type = FieldType.text)
    private String book_desc;

}
