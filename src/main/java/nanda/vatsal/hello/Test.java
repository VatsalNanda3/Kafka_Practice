package nanda.vatsal.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {
	
	
	
	@RequestMapping("/")
	public String test() {
		return "Testing";
	}

}
