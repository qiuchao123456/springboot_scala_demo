package service

import pojo.entity.Emp

abstract class EmpService {
  def getEmp(id:Int): Emp
}
