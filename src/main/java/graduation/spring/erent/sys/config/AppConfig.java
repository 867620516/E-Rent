package graduation.spring.erent.sys.config;


import org.springframework.context.annotation.Configuration;

import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
public class AppConfig implements WebMvcConfigurer {

    /**
     * 全局配置跨域
     * @param registry
     */
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/api/**")  //哪些请求需要跨域
                .allowedOrigins("*")    //代表允许所有的地址和端口对本服务进行访问
                .allowedHeaders("*")
                /*.allowedHeaders("token")    //允许请求中有哪些自定义的请求头
                .exposedHeaders("token") //返回的响应头*/
                .allowCredentials(true)  //是否允许密钥
                .allowedMethods("DELETE","POST","GET","PUT") //允许请求方法
                .maxAge(3600);//请求超时时间1小时，以秒为单位
    }






}
