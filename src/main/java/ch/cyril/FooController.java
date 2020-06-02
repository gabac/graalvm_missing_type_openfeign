package ch.cyril;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@RestController
public class FooController {
	
	@GetMapping("/foo")
	public Mono<String> bar() {
		return Mono.just("bar");
	}
}
