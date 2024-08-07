package org.example.kotlingrpc

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinGrpcApplication

fun main(args: Array<String>) {
    runApplication<KotlinGrpcApplication>(*args)
}
