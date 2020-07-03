package cn.itech4u.banner;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BannerApplication {

    public static void main(String[] args) {
//        SpringApplication.run(BannerApplication.class, args);
        SpringApplication springApplication = new SpringApplication(BannerApplication.class);
        springApplication.setBannerMode(Banner.Mode.CONSOLE);
        springApplication.run(args);
    }

}
