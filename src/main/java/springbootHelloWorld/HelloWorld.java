package springbootHelloWorld;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
@EnableAutoConfiguration
public class HelloWorld{
	
	@RequestMapping("/")
	@ResponseBody
	String home() {
		return "Hello World from maste";
	}
	
	public static void main(String[]args) throws Exception {
		SpringApplication.run(HelloWorld.class, args);
	}
	
}

