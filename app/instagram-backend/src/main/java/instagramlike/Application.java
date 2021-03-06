package instagramlike;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import instagramlike.models.Korisnik;
import instagramlike.services.KorisnikService;


@SpringBootApplication
@EnableTransactionManagement
public class Application {
	
    public static void main(String[] args) {
    	
		
		SpringApplication.run(Application.class, args);
	}

	@Bean
 	public WebMvcConfigurer corsConfigurer() {
			return new WebMvcConfigurerAdapter() {
				@Override
				public void addCorsMappings(CorsRegistry registry) {
					registry.addMapping("/**");
				}
			};
		}
}