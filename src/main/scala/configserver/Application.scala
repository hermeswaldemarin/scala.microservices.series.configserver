package configserver

import org.springframework.boot.{ApplicationRunner, SpringApplication}
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.config.server.EnableConfigServer
import org.springframework.context.annotation.{Bean, ComponentScan}
import org.springframework.web.client.RestTemplate

@SpringBootApplication
@ComponentScan(basePackages = Array("configserver"))
@EnableConfigServer
class Application{

  @Bean
  def init(): ApplicationRunner = _ => {

  }

  @Bean
  def restTemplate() : RestTemplate = new RestTemplate()
}


object Application extends App {
  SpringApplication.run(classOf[Application], args: _*)
}
