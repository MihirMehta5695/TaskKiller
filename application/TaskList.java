package application;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

//This class gets the list of all the processes running in the system

public class TaskList 
{

	public void getTaskList()
	{
		ArrayList<String> arr=new ArrayList<>();
		try 
		{
			String line;
			String result[];
			Process p = Runtime.getRuntime().exec(System.getenv("windir") +"\\system32\\"+"tasklist.exe");
			BufferedReader input =new BufferedReader(new InputStreamReader(p.getInputStream()));
			input.readLine();
			input.readLine();
			input.readLine();
			while ((line = input.readLine()) != null) 
			{
				result=line.split("  ");
				arr.add(result[0]);
				//System.out.println(line); //<-- Parse data here.
			}
			input.close();
		} 

		catch (Exception err) 
		{
			err.printStackTrace();
		}

		Iterator i= arr.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
}
