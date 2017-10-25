package tests;

import static org.junit.Assert.*;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import code.DraftTeam;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DraftTeam_Test {
	
	private long timeLimit = 5000000;	// 5 ms in ns
	@Test
	public void testcase1() 
	{
		long[] teams = {5,1,2};
		long[] picks = {8, 2, 5};
		
		long startTime = System.nanoTime();
		
		for (int i = 0; i < teams.length; i++)
		{
			assertEquals("testcase 1 failed", DraftTeam.draftTeam(teams, i), picks[i]);
		}
		
		long endTime = System.nanoTime();			
		// Must execute in less than 5 ms
		assertTrue("testcase 1 timed out", (endTime - startTime) < timeLimit);
	}
	
	@Test
	public void testcase2()
	{
		long[] teams = {100,3,4,150,5,10,2};
		long[] picks = {223, 16, 22, 274, 28, 44, 14};
		
		long startTime = System.nanoTime();
		
		for (int i = 0; i < teams.length; i++)
		{
			assertEquals("testcase 2 failed", DraftTeam.draftTeam(teams, i), picks[i]);
		}
		
		long endTime = System.nanoTime();			
		// Must execute in less than 5 ms
		assertTrue("testcase 2 timed out", (endTime - startTime) < timeLimit);
	}
	
	@Test
	public void testcase3()
	{
		long[] teams = {100000000, 4, 8, 100000000, 9, 100000000};
		long[] picks = {300000019, 20, 41, 300000020, 47, 300000021};
		
		long startTime = System.nanoTime();
		
		for (int i = 0; i < teams.length; i++)
		{
			assertEquals("testcase 3 timed out", DraftTeam.draftTeam(teams, i), picks[i]);
		}
		
		long endTime = System.nanoTime();			
		// Must execute in less than 5 ms
		assertTrue("testcase 3 timed out", (endTime - startTime) < timeLimit);
	}
	
	@Test
	public void testcase4()
	{
		long[] teams = {1,2,3,40,1,2};
		long[] picks = {1, 7, 11, 49, 5, 10};
		
		long startTime = System.nanoTime();
		
		for (int i = 0; i < teams.length; i++)
		{
			assertEquals("testcase 4 failed", DraftTeam.draftTeam(teams, i), picks[i]);
		}
		
		long endTime = System.nanoTime();			
		// Must execute in less than 5 ms
		assertTrue("testcase 4 timed out", (endTime - startTime) < timeLimit);
		
	}
	
	@Test
	public void testcase5()
	{
		long[] teams = {1000,403,207,11};
		long[] picks = {1621, 1024, 632, 44};
		
		long startTime = System.nanoTime();
		
		for (int i = 0; i < teams.length; i++)
		{
			assertEquals("testcase 5 failed", DraftTeam.draftTeam(teams, i), picks[i]);
		}
		
		long endTime = System.nanoTime();			
		// Must execute in less than 5 ms
		assertTrue("testcase 5 timed out", (endTime - startTime) < timeLimit);
	}
	
	

}
