package service.impl

import mapper.EmpMapper
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import pojo.entity.Emp
import service.EmpService

@Service
class EmpServiceImpl @Autowired()(val empMapper: EmpMapper) extends EmpService {
  override def getEmp(id: Int) : Emp = {
    empMapper.getEmp(id)
  }
}
