package com.ayeeta.restAPI

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
@RestController
class RestApiApplication{
	
	@GetMapping
	fun hi():Person{
		return Person()
	}
}

fun main(args: Array<String>) {
	runApplication<RestApiApplication>(*args)
}
