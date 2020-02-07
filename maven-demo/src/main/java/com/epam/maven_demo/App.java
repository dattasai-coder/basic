package com.epam.maven_demo;
import java.util.*;
class Choclates
{
	Choclates()
	{
        System.out.println("In Choclates");    
	}
}
class Sweets extends Choclates
{
	Sweets() {
        System.out.println("Sweets");    
	}
	
}
class NewYear extends Choclates
{
	public NewYear() {
        System.out.println("NewYear");    

	}
}
class ChildrensGift
{
	double totalWeight()
	{
		return 0;
	}
    public static HashMap<String, Integer> sortByValue(HashMap<String, Integer> hm) 
    { 
        List<Map.Entry<String, Integer> > list = 
               new LinkedList<Map.Entry<String, Integer> >(hm.entrySet()); 
        Collections.sort(list, new Comparator<Map.Entry<String, Integer> >() { 
            public int compare(Map.Entry<String, Integer> o1,  
                               Map.Entry<String, Integer> o2) 
            { 
                return (o1.getValue()).compareTo(o2.getValue()); 
            } 
        }); 
        HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>(); 
        for (Map.Entry<String, Integer> aa : list) { 
            temp.put(aa.getKey(), aa.getValue()); 
        } 
        return temp; 
}
}
public class App 
{
    public static void main(String[] args )
    {
    	Sweets s1 = new Sweets();
    	Sweets s2 = new Sweets();
    	Sweets s3 = new Sweets();
        HashMap<String, Integer> hm = new HashMap<String, Integer>(); 
        hm.put("Ram", 38); 
        hm.put("Ajay", 21); 
        hm.put("Anil", 42); 
        hm.put("Java", 95); 
        ChildrensGift cg = new ChildrensGift();
        Map<String, Integer> hm1 = cg.sortByValue(hm); 
        for (Map.Entry<String, Integer> en : hm1.entrySet()) { 
            System.out.println(en.getKey() + "  " + en.getValue());  
    }
        }
}