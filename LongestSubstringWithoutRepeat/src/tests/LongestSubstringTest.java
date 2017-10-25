package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import solution.LongestSubstringWithoutRepeat;

public class LongestSubstringTest {

	@Test
	public void test1() 
	{
		String testString = "quertyisthe man of -  - all styles 1dkkgju 7mgndkalkkkfhdufkbloadu";
		assertEquals("test 1 failed", LongestSubstringWithoutRepeat.lengthOfLongestSubstring(testString), 11);
	}
	
	@Test
	public void test2()
	{
		String testString = "to be or not to be that is the question; whether tis' nobler in the mind to suffer kkkdkdkdkdkdkdkdkdkkkkkdhgjdkaldlkgj kjkl;ajd;kfjgnkaklbjlk;ajdflk;jilbjakdk;lsjbiujl;k;kljkldjf;lkajdk;aslsjf;lbubuaeknrabnb;luid;i47r9g9mem";
		assertEquals("test 2 failed", LongestSubstringWithoutRepeat.lengthOfLongestSubstring(testString), 12);
	}
	
	@Test
	public void test3()
	{
		String testString = "ordering messages is important kttreebstdatastructurealgorithmsyisthishappyen";
		assertEquals("test 3 failed", LongestSubstringWithoutRepeat.lengthOfLongestSubstring(testString), 12);
	}
	
	@Test
	public void test4()
	{
		String testString = "~````````-djfgikkdpoasnm8653hdkvoe8o1p,d";
		assertEquals("test 4 failed", LongestSubstringWithoutRepeat.lengthOfLongestSubstring(testString), 14);
	}

}
