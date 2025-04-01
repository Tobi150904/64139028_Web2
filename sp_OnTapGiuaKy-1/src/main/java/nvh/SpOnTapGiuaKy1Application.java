package nvh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class SpOnTapGiuaKy1Application {
    public static void main(String[] args) {
        SpringApplication.run(SpOnTapGiuaKy1Application.class, args);
    }
}