package com.mybatisplus_rud.service.impl;

import com.mybatisplus_rud.pojo.Customer;
import com.mybatisplus_rud.mapper.CustomerMapper;
import com.mybatisplus_rud.service.CustomerService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author AnHua
 * @since 2020-11-01
 */
@Service
public class CustomerServiceImpl extends ServiceImpl<CustomerMapper, Customer> implements CustomerService {

}
