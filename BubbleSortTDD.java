package in.test.bubblesort;
import junit.framework.Assert;
import org.junit.*;
import java.util.Arrays;
import in.bubblesort.BubbleSortCleanCode;

public class BubbleSortTDD {
	
	@BeforeClass
    public static void avc() {
        System.out.println("@Before method will execute before every JUnit4 test Class");
    }
  
	@Before
	public void settingUp()
	{
		System.out.println("@Before method will execute before every JUnit4 test.");
	}
	
	@Test
	public void SortEmptyList_ReturnEmptyList()
	{
		Assert.assertTrue(Arrays.equals(new int[]{},
				BubbleSortCleanCode.Sort(new int[]{})));
	}

	@Test
	public void SortWithOneElement_ReturnSortedList()
	{
		Assert.assertTrue(Arrays.equals(new int[]{1}, BubbleSortCleanCode.Sort(new int[]{1})));
	}


	@Test
	public void SortElementsInCorrectOrder_ReturnSameList()
	{
		Assert.assertTrue(Arrays.equals(new int[]{4,5,7,9,10}, BubbleSortCleanCode.Sort(new int[]{4,5,7,9,10})));
	}
	
	@Ignore
	public void SortTwoSameElements_ReturnSameList()
	{
		Assert.assertTrue(Arrays.equals(new int[]{4,4}, BubbleSortCleanCode.Sort(new int[]{4,4})));	
	}
	
	@Test
	public void SortTwoElementsInReverseOrder_ReturnSortedList()
	{
		Assert.assertTrue(Arrays.equals(new int[]{4,5}, BubbleSortCleanCode.Sort(new int[]{5,4})));	
	}
	
	@Test
	public void SortSevenElementsInReverseOrder_ReturnSortedList()
	{
		Assert.assertTrue(Arrays.equals(new int[]{4,5,7,7,8,9,10}, BubbleSortCleanCode.Sort(new int[]{10,9,8,7,7,5,4})));	
	}
	
	@Test
	public void SortRandomElementsInAnyOrder_ReturnSortedList()
	{
		Assert.assertTrue(Arrays.equals(new int[]{-100,44,55,77,79,85,91}, BubbleSortCleanCode.Sort(new int[]{44,91,79,85,77,55,-100})));
	}
	
	@Test
	public void SortCharactersInIntegerArray_ReturnSortedCharacterList()
	{
		Assert.assertTrue(Arrays.equals(new int[]{'a','b','e','h','k','m','o'}, BubbleSortCleanCode.Sort(new int[]{'o','m','k','h','e','b','a'})));
	}
	
	@Test
	public void SortIntegerCharacterArray_ReturnSortedList()
	{
		Assert.assertTrue(Arrays.equals(new int[]{-4,5,7,7,'a','b','d'}, BubbleSortCleanCode.Sort(new int[]{'a','b','d',7,7,-4,5})));
	}
	
	@Test
	public void SortStringsInIntegerArrayUsingTypeCast_ReturnSortedList()
	{
		Assert.assertTrue(Arrays.equals(new int[]{Integer.valueOf("1234"),Integer.valueOf("456789")}, BubbleSortCleanCode.Sort(new int[]{Integer.valueOf("456789"),Integer.valueOf("1234")})));
	}
	
	@Test(expected=NumberFormatException.class)
	public void SortStringsCharacterInIntegerArrayUsingTypeCast_ReturnNumberFormatException()
	{
		Assert.assertTrue(Arrays.equals(new int[]{Integer.valueOf("abc"),Integer.valueOf("xyz")}, BubbleSortCleanCode.Sort(new int[]{Integer.valueOf("xyz"),Integer.valueOf("abc")})));
	}
	
	@AfterClass
	public static void tearDown()
	{
		System.out.println("@After method will execute after every JUnit4 test class");
	}
	
	@After
	public void tearingDown()
	{
		System.out.println("@After method will execute after every JUnit4 test.");
	}
	
}
