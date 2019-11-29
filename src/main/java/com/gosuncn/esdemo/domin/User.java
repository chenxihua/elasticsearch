//package com.gosuncn.esdemo.domin;
//
//
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//import org.springframework.data.annotation.Id;
//import org.springframework.data.elasticsearch.annotations.Document;
//import org.springframework.data.elasticsearch.annotations.Field;
//import org.springframework.data.elasticsearch.annotations.FieldType;
//
//@Data
//@NoArgsConstructor
//@AllArgsConstructor
//@Document(indexName = "my_user", type = "user")
//public class User {
//    /**
//     *     index：是否设置分词
//     *     analyzer：存储时使用的分词器
//     *     searchAnalyze：搜索时使用的分词器
//     *     store：是否存储
//     *     type: 数据类型
//     */
//
//    @Id
//    @Field(store = true, index = false, type =FieldType.Integer)
//    private Integer id;
//    @Field(store = true, index = true, type = FieldType.keyword, analyzer = "myanalyzer", searchAnalyzer = "myanalyzer")
//    private String username;
//    @Field(store = true, index = true, type = FieldType.keyword, analyzer = "myanalyzer", searchAnalyzer = "myanalyzer")
//    private String password;
//    @Field(store = true, index = true, type = FieldType.Integer, analyzer = "myanalyzer", searchAnalyzer = "myanalyzer")
//    private Integer age;
//    @Field(store = true, index = true, type = FieldType.keyword, analyzer = "myanalyzer", searchAnalyzer = "myanalyzer")
//    private String ip;
//
//}
