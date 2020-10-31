package com.mybatisplus_rud.service.impl;

import com.mybatisplus_rud.pojo.Student;
import com.mybatisplus_rud.mapper.StudentMapper;
import com.mybatisplus_rud.service.StudentService;
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
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements StudentService {

}
