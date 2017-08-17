import org.scalatest.FunSuite

/**
  * @author zhisheng 
  **/
class CubeCalculatorTest extends FunSuite {
    test("CubeCalculator.cube") {
      assert(CubeCalculator.cube(3) === 27)
    }
}
