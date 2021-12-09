package test

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class AppConfig

object ScalaApplication extends App {
  SpringApplication.run(classOf[AppConfig])
}

