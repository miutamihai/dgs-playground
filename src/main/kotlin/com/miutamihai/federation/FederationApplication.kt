package com.miutamihai.federation

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class FederationApplication

fun main(args: Array<String>) {
	runApplication<FederationApplication>(*args)
}
