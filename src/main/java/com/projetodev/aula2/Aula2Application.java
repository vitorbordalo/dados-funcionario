package com.projetodev.aula2;

import com.vitorbordalo.entities.Employee;
import com.vitorbordalo.services.SalaryService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.vitorbordalo"})
public class Aula2Application implements CommandLineRunner {

	private SalaryService salaryService;

	public Aula2Application(SalaryService salaryService) {
		this.salaryService = salaryService;
	}

	public static void main(String[] args) {

		SpringApplication.run(Aula2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Employee employee = new Employee("Maria", 4000.0);
		System.out.println(salaryService.netSalary(employee));
	}
}
