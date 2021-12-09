package mapper

import org.apache.ibatis.annotations.{Mapper, Param}
import pojo.entity.Emp


@Mapper
trait EmpMapper {
  def getEmp(@Param("id") id: Int): Emp
}
