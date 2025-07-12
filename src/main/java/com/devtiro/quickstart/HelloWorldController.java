package main.java.com.devtiro.quickstart;

@RestController
public class HelloWorldController {

	@GetMapping("/hello")
    public String helloWorld() {
        return "Hello, World!";
    }
}
