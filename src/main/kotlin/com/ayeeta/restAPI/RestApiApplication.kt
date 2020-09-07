package com.ayeeta.restAPI

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
@RestController
class RestApiApplication{
	
	@GetMapping
	fun hi():String{
		return "Hello World"
	}
}

fun main(args: Array<String>) {
	runApplication<RestApiApplication>(*args)
}
