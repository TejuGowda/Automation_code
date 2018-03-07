package programs;

import java.util.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class FileRead {
	
	static int i=0;
	static char[] arr;
	static int j=1;
	static String required="";
	static String temp="";
	public static int getIndex(String str)
	{
		
		arr = str.toCharArray();
		i=0;
	
		while(i<=arr.length)
		{
			if(Character.isAlphabetic(arr[i])||Character.isDigit(arr[i]))
			{
				break;
			}
			else
				i++;
		}
		return i;
	}
	
	public static void main(String[] args) throws IOException {
		
		String temp="";
		String required = "";
		File file = new File("C:/Users/TEJU/Downloads/quiz (1).input");
		BufferedReader br = new BufferedReader(new FileReader(file));
		br.readLine();
		br.readLine();
		br.readLine();
		String str = br.readLine();
		br.close();
		System.out.println(str);
		
		String[] ss = str.split(" ");
		List lst = new ArrayList();
		
		for(String s :ss)
			lst.add(s);
		
		System.out.println("size "+lst.size());
		
		Object obj = lst.get(2);
		for(int i=0;i<lst.size();i++)
		{
			
			if(obj.equals(lst.get(i)))
				lst.remove(lst.get(i));
		}
		
		System.out.println("size 2-"+ lst.size());
		
		while(j<((lst.size()/2)+1))
		{
			temp = str.substring(getIndex(str), str.indexOf(' ',getIndex(str)));
			required = required+temp+" ";
			str = str.replace(temp, " ");
			j++;
		}
		
		System.out.println(required+str.split(" ")[str.split(" ").length-1]);
		
	}
}
