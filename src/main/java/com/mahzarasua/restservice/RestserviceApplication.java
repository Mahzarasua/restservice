package com.mahzarasua.restservice;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(title = "${info.app.name}"
				, version = "${info.app.version}"
				, description = "${info.app.description}"
				, license = @License(name = "${info.app.license.name}", url = "${info.app.license.url}")
				, contact = @Contact(name = "${info.app.contact.name}", url = "${info.app.contact.url}", email = "${info.app.contact.email}"))
)
public class RestserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestserviceApplication.class, args);
	}

}
