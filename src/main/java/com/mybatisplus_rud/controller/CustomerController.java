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
    public void an(){
        System.out.println("2222222");
    }
    public void an(String name){
        System.out.println("2222222");
    }
    public void an2(String name){
        System.out.println("2222222");
    }
}

