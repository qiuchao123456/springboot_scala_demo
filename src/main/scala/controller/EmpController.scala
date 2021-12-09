package controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.{GetMapping, PathVariable, RequestMapping, ResponseBody}
import pojo.entity.Emp
import service.impl.EmpServiceImpl

@Controller
class EmpController @Autowired()(empService: EmpServiceImpl){

  @RequestMapping(Array("/api"))
  def getEmpList(id: Int): Emp = {
    val emp:Emp = empService.getEmp(id)
    println(emp.id)
    println(emp.name)
    println(emp.age)

    emp
  }
}
