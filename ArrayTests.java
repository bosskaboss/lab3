import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}
	@Test 
	public void testReverseInPlaceMulti() {
    int[] input1 = { 3 ,5,8};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 8,5,3 }, input1);
	}

  @Test
  public void testReversedEmpty() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReversed() {
    int[] input1 = {1,2,3};
    assertArrayEquals(new int[]{3,2,1 }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testAVGnormal(){
    double[] input1 = {5,5,5,2,5};
    assertEquals(5, ArrayExamples.averageWithoutLowest(input1), 0);
  }
  @Test
  public void testAVGallLow(){
    double[] input1 = {5,5,5,5,5};
    assertEquals(5, ArrayExamples.averageWithoutLowest(input1), 0);
  }
}
