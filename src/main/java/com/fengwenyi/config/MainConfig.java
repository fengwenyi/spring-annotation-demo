package com.fengwenyi.config;

import com.fengwenyi.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 配置类 = 配置文件
 * @author Erwin Feng
 * @since 2020-10-15
 */
@Configuration // 告诉Spring，这是一个配置类
public class MainConfig {

    // 给容器中注册一个Bean：类型是返回值的类型，id默认是用方法名作为id
//    @Bean
    @Bean("person")
//    public Person person() {
    public Person person01() {
        return new Person("lisi", 20);
    }
}
