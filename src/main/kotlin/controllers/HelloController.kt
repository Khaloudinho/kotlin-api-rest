package controllers

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController {

    @GetMapping("/hello/{fname}/{lname}")
    fun hello(@PathVariable fname:String, @PathVariable lname:String) = "Firstname : $fname\n Lastname : $lname"

}