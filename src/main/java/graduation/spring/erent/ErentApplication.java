package graduation.spring.erent;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("graduation.spring.erent.app.dao")
public class ErentApplication {

    public static void main(String[] args) {
        SpringApplication.run(ErentApplication.class, args);
    }

}
