package com.gosuncn.esdemo;

import com.gosuncn.esdemo.constant.EsData;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @ClassName: OtherTest
 * @Create By: chenxihua
 * @Author: Administrator
 * @Date: 2019/11/29 10:35
 **/
public class OtherTest {

    private static final Logger logger = LoggerFactory.getLogger(OtherTest.class);

    @Test
    public void testStr(){
        String defaultSetting = EsData.DEFAULT_SETTING;
        logger.warn("--->"+defaultSetting);
    }

}
