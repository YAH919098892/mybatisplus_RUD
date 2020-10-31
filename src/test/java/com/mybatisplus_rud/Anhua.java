package com.mybatisplus_rud;


import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.core.exceptions.MybatisPlusException;
import com.baomidou.mybatisplus.core.toolkit.StringPool;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.po.TableFill;
import com.baomidou.mybatisplus.generator.config.po.TableInfo;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//代码自动生成类
public class Anhua {



    public static void main(String[] args) {
        // 代码生成器
        AutoGenerator mpg = new AutoGenerator();

        // 全局配置
        GlobalConfig gc = new GlobalConfig();
        String projectPath = System.getProperty("user.dir");
//        输出地址
        gc.setOutputDir(projectPath + "/src/main/java");
//        作者信息
        gc.setAuthor("AnHua");
        gc.setOpen(false);
//        是否覆盖原来生成的
        gc.setFileOverride(false);
        gc.setServiceName("%sService");//去service的I前缀
        gc.setIdType(IdType.ID_WORKER);
        gc.setDateType(DateType.ONLY_DATE);//日期的类型
        //gc.setSwagger2(true); //实体属性 Swagger2 注解
        //把配置放到走到生成器里面
        mpg.setGlobalConfig(gc);

        // 数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setUrl("jdbc:mysql://localhost:3306/mybatis?serverTimezone=Asia/Shanghai&characterEncoding=utf-8");
        // dsc.setSchemaName("public");
        dsc.setDriverName("com.mysql.cj.jdbc.Driver");
        dsc.setUsername("root");
        dsc.setPassword("123456");
//        sql类型
        dsc.setDbType(DbType.MYSQL);
        mpg.setDataSource(dsc);

        // 包配置
        PackageConfig pc = new PackageConfig();
//        pc.setModuleName("blog");
//        放到哪个包下
        pc.setParent("com.mybatisplus_rud");
//        设置包名
        pc.setMapper("mapper");
        pc.setEntity("pojo");
        pc.setController("controller");
        mpg.setPackageInfo(pc);

        // 策略配置
        StrategyConfig strategy = new StrategyConfig();
        //  设置要表名映射
        strategy.setInclude("myimages");
        //下划线转驼峰命名
        strategy.setNaming(NamingStrategy.underline_to_camel);
        strategy.setColumnNaming(NamingStrategy.underline_to_camel);
//        strategy.setSuperEntityClass("你自己的父类实体,没有就不用设置!");
//        是否开启Lombok开启注解
        strategy.setEntityLombokModel(true);
//        逻辑删除的名字
//        strategy.setLogicDeleteFieldName("delect");
        strategy.setRestControllerStyle(true);
//自动填充配置 比如修改执行的时间
        TableFill gmt_creater = new TableFill("gmt_creater", FieldFill.INSERT);
        TableFill gmt_modified = new TableFill("gmt_modified", FieldFill.INSERT_UPDATE);
        ArrayList<TableFill> objects = new ArrayList<>();
        objects.add(gmt_creater);
        objects.add(gmt_modified);
        strategy.setTableFillList(objects);
//        乐观锁
        strategy.setVersionFieldName("version");
        mpg.setStrategy(strategy);
        mpg.execute();
    }
}
