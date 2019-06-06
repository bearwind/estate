package com.novawind.estate.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.novawind.estate.utils.DateUtil;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.util.unit.DataSize;
import org.springframework.util.unit.DataUnit;

import javax.servlet.MultipartConfigElement;
import java.text.SimpleDateFormat;
import java.util.Collections;

/**
 * Web相关配置
 * @author Jeremy Xiong<br>
 * 2018-06-29 10:04
 */
@Configuration
public class WebConfig {

    @Bean
    public MultipartConfigElement multipartConfigElement() {
        MultipartConfigFactory factory = new MultipartConfigFactory();
        //文件最大 KB,MB
        factory.setMaxFileSize(DataSize.of(10, DataUnit.MEGABYTES));
        // 设置总上传数据总大小
        factory.setMaxRequestSize(DataSize.of(20, DataUnit.MEGABYTES));
        return factory.createMultipartConfig();
    }
    @Bean
    public HttpMessageConverters getJacksonHttpMessageConverters() {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.setDateFormat(new SimpleDateFormat(DateUtil.YYYYMMDDHHMMSS));
        MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter(objectMapper);
        converter.setSupportedMediaTypes(Collections.singletonList(MediaType.APPLICATION_JSON_UTF8));

        return new HttpMessageConverters(converter);
    }

}
