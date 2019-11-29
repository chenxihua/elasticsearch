package com.gosuncn.esdemo.constant;

/**
 * @ClassName: EsData
 * @Create By: chenxihua
 * @Author: Administrator
 * @Date: 2019/11/29 10:24
 *
 * 这里设置默认常量
 *
 **/
public class EsData {

    /**
     * 记录一次我设置的setting， 其实在 DEFAULT_SETTING 的最外层，是不再需要 {\"setting\"} 的了
     */
    public static final String DEFAULT_SETTING = "{" +
        "\"analysis\": {" +
            "\"analyzer\": {" +
                "\"myanalyzer\": {" +
                    "\"tokenizer\": \"mytokenizer\"" +
                "}" +
            "}," +
            "\"tokenizer\": {" +
                "\"mytokenizer\": {" +
                    "\"type\": \"ngram\"," +
                    "\"min_gram\": 1," +
                    "\"max_gram\": 2," +
                    "\"token_chars\": [" +
                        "\"letter\"," +
                        "\"digit\"," +
                        "\"whitespace\"," +
                        "\"punctuation\"," +
                        "\"symbol\"" +
                    "]" +
                "}" +
            "}" +
        "}" +
    "}";


}
