package controllers


import java.util.concurrent.atomic.AtomicLong
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import scala.collection.JavaConversions._
import org.springframework.context.annotation.ComponentScan

import java.util.Date
import collection.JavaConverters._
import scala.beans.BeanProperty
import scala.collection.mutable.HashMap
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RequestBody
import scala.util.parsing.json.JSON
import org.apache.log4j.Logger
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.http.HttpStatus
import javax.validation.Valid
import org.springframework.validation.BindingResult
import org.springframework.web.bind.annotation.ExceptionHandler
import com.sun.xml.internal.ws.api.message.ExceptionHasMessage
import org.springframework.http.HttpHeaders
import javax.servlet.http.HttpServletResponse
import javax.servlet.http.HttpServletRequest
import org.springframework.web.client.RestTemplate
import org.springframework.http.MediaType
import org.springframework.http.HttpEntity
import org.springframework.http.HttpMethod
import org.springframework.http.ResponseEntity
import com.fasterxml.jackson.databind.ObjectMapper


@RestController
class WalletController {

  var logger = Logger.getLogger(classOf[WalletController])

  @ResponseStatus(HttpStatus.OK)
  @RequestMapping(method = Array(RequestMethod.GET), value = Array("/"))
  def sayHello(): String = {
    
    "Elastic Load Balancer By Live Wires"
  }
  
  @ResponseStatus(HttpStatus.OK)
  @RequestMapping(method = Array(RequestMethod.GET), value = Array("/healthcheck"))
  def healthcheck(): String = {
    
    "I am fine!!"
  }

  
}
