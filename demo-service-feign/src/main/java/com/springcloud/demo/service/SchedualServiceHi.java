package com.springcloud.demo.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("service-hi")
@Service
public interface SchedualServiceHi {

    @RequestMapping(value="hi", method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value="name") String name);
}
