package graduation.spring.erent.sys.config;

import graduation.spring.erent.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.env.Environment;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
@EnableWebSecurity //启动spring security的web支持
public class AppConfig extends WebSecurityConfigurerAdapter implements WebMvcConfigurer {
    @Autowired
    private UserService userService;
    @Autowired
    private Environment env;
    /**
     * 全局配置跨域
     * @param registry
     */
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/api/**")  //哪些请求需要跨域
                .allowedOrigins("*")    //代表允许所有的地址和端口对本服务进行访问
                .allowedHeaders("token")    //允许请求中有哪些自定义的请求头
                .exposedHeaders("token") //返回的响应头
                .allowCredentials(true)  //是否允许密钥
                .allowedMethods("DELETE","POST","GET","PUT") //允许请求方法
                .maxAge(3600);//请求超时时间1小时，以秒为单位
    }






}
