package com.example.code.build;


import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.Collections;

@Component
public class MyBuildCode {

    @Autowired
    private DataSource dataSource;

    public void excute(){
        FastAutoGenerator.create("localhost:3306", "root", "123456")
                .globalConfig(builder -> {
                    builder.author("lizhou") // 设置作者
                            .enableSwagger() // 开启 swagger 模式
                            .fileOverride() // 覆盖已生成文件
                            .outputDir("D://back//code//src//main//java"); // 指定输出目录
                })
                .packageConfig(builder -> {
                    builder.parent("com.example.code") // 设置父包名
                            .moduleName("system") // 设置父包模块名
                            .pathInfo(Collections.singletonMap(OutputFile.xml, "D://back//code//src//main//java")); // 设置mapperXml生成路径
                })
                .strategyConfig(builder -> {
                    builder.addInclude("demand") // 设置需要生成的表名
                            .addTablePrefix(); // 设置过滤表前缀
                })
                .templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .execute();
    }
}
