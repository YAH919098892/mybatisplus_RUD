package com.mybatisplus_rud.controller;


import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author AnHua
 * @since 2020-11-01
 */
@RestController
@RequestMapping("/customer")
public class CustomerController {
public void ann(){
    System.out.println("我是杨安华");
}


    public void an(){
        System.out.println("bbbbbbbbbbbbb");
    }
    public void a(){
        System.out.println("aaaaaaaaaa");
    }
}

