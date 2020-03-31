package co.edu.utp.isc.gia.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping(value="calc")
public class HelloApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloApplication.class, args);
	}
        
        @GetMapping("/{firstName}/{lastName}")
        public String hello(@PathVariable("firstName") String firstName, @PathVariable("lastName") String lastName){
            return String.format("Hello %s %s", firstName,lastName);
        }    
        //insersion sin atributos en GetMapping    
        @GetMapping()
        public String hello2(@RequestParam("firstName") String firstName, @RequestParam("lastName") String lastName){
            return "hello" + firstName+" "+lastName;
        }
        
        @GetMapping("suma")
        public String suma(@RequestParam("num1") Double num1,@RequestParam("num2") Double num2){
            Double resultado = num1 + num2;
            return String.format("Suma = %.2f"+resultado);
            }
    
        @GetMapping("resta")
        public String resta(@RequestParam("num1") Double num1,@RequestParam("num2") Double num2){
            Double resultado = num1 - num2;
            return String.format("Resta = %.2f",resultado);
            }
    
        @GetMapping("multiplicacion")
        public String multiplicacion(@RequestParam("num1") Double num1,@RequestParam("num2") Double num2){
            Double resultado = num1 * num2;
            return String.format("Multiplicacion = %.2f",resultado);
            }
    
        @GetMapping("division")
        public String division(@RequestParam("num1") Double num1,@RequestParam("num2") Double num2){
            Double resultado = num1 / num2;
            return String.format("Division = %.2f",resultado);
                    
            }

}
