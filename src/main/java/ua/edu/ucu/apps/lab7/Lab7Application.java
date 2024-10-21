package ua.edu.ucu.apps.lab7;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Lab7Application {

	public static void main(String[] args) {
		SpringApplication.run(Lab7Application.class, args);
		List<String> list = List.of("", "1", "123", "1");
		Set<String> set = list.stream()
			.collect(Collectors.toSet());
		System.out.println(set.size() == list.size());
	}

}
