package test

import org.apache.flink.api.scala.{AggregateDataSet, DataSet, ExecutionEnvironment}
import org.apache.flink.api.scala.createTypeInformation

import scala.io.Source

object test {
  def main(args: Array[String]): Unit = {
    val env: ExecutionEnvironment = ExecutionEnvironment.getExecutionEnvironment
    val input = "C:\\Users\\1\\Desktop\\word.txt"
    val ds: DataSet[String] = env.readTextFile(input)
    //其中flatMap和Map中，需要引入隐式转换
    val aggDs: AggregateDataSet[(String, Int)] = ds.flatMap(_.split("，")).map((_, 1 )).groupBy(0).sum(1)
    println(aggDs)
//    aggDs.print()
  }
}
