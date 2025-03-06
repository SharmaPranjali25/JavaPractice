package com.today;

import static org.hamcrest.CoreMatchers.hasItems;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.Arrays;
import java.util.List;

import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.junit.rules.ExpectedException;

import com.today.Tasktoday;

public class TasktodayTest {
	public void testCollectionObjects() {
		List<Tasktoday> listActual= Arrays.asList(new Tasktoday(101,"Ball",234),
				new Tasktoday(102,"Badminton",300),
				new Tasktoday(103, "Basketball",240),
				new Tasktoday(104,"Stick",120));
	
		assertThat(listActual, hasItems(new Tasktoday(102, "Badminton",300)));
}
		@Test
		public void TasktodayCategoryIsNull1()
		{
			assertThrows(IllegalArgumentException.class, new Executable() {
				
				@Override
				public void execute() throws Throwable {
					Tasktoday data = new Tasktoday();
					
					data.setCategory(null);
					
				}
			});
		}
		
		@Test
		public void TasktodayCategoryIsNull()
		{
			Throwable exception = assertThrows(IllegalArgumentException.class, ()->{
				
				Tasktoday obj = new Tasktoday();
				
				obj.setCategory(null);
			});
			
			assertEquals("category can't be blank", exception.getMessage());
			
			System.out.println(exception.getMessage());
		}
		
		@Test
		public void testNameShortLength()
		{
			Throwable exception = assertThrows(IllegalArgumentException.class, ()->{
				
				Tasktoday obj = new Tasktoday();
				
				obj.setCategory("ro");
			});
			
			assertEquals("name is too short", exception.getMessage());
			System.out.println(exception.getMessage());
		}
		
		@Test
		public void testNameLongLength()
		{
			Throwable exception = assertThrows(IllegalArgumentException.class, ()->{
				
				Tasktoday obj = new Tasktoday();
				
				obj.setCategory("rofdafasfdfasasfsfssfdsafadsafsafssafsfsdsssfafsaafsadsfsa");
			});
			
			assertEquals("name is too long", exception.getMessage());
			System.out.println(exception.getMessage());
		}
		
//		@Rule
//		public ExpectedException exception = ExpectedException.none();
//		
//		@Test(expected = IllegalArgumentException.class)
//		public void testNameValues()
//		{
//			Tasktoday obj = new Tasktoday();
//			
//			obj.setCategory(null);
//		}

	}


