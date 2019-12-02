package com.gosuncn.esdemo.controller;

import com.gosuncn.esdemo.domin.Logs;
import com.gosuncn.esdemo.service.LogsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName: LogsController
 * @Create By: chenxihua
 * @Author: Administrator
 * @Date: 2019/12/2 9:29
 **/
@RestController
@RequestMapping(value = "/es")
public class LogsController {

    @Autowired
    LogsService logsService;

    @GetMapping(value = "/search")
    public List<Logs> searchLogsByConditions(@RequestParam String msg){
        return logsService.getLogsByConditions(msg);
    }

}
