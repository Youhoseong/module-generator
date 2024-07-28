package test.group.mg

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MgApplication

fun main(args: Array<String>) {
	runApplication<MgApplication>(*args)
}
