package PRACTICE;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/*
 * 아래와 같이 studnent 사전(map)에 이름과 점수가 저장되어 있다.
 * (이름이 "키"이므로 같은 이름이 없다고 가정한다)
 *  키보드 입력 : Enter Name : kim
 * 	Out : park : 87, jong :95 , Lee : 90, bbb: 85, hong :88
 * * 
 */

//

public class P_0328_Dictionary {
	static Map <String, Integer> student = new HashMap<String, Integer>();
	public static void main(String[] args) {
		
		student.put("park", 87); student.put("jong", 95);
		student.put("kim", 79); student.put("Scott", 78);
		student.put("Lee", 90); student.put("bbb", 85);
		student.put("Hong", 88); student.put("bbb", 79);

	      Scanner scn=new Scanner(System.in);
	      System.out.println("키보드입력 : ");
	      String na=scn.next();
	      
	      scn.close();
	      
	      int age=0;
	      if(student.containsKey(na)) {
	         age=student.get(na);
	      }
	      
	      Set<String> set = student.keySet();
	      Iterator<String> iter =set.iterator();
	      while(iter.hasNext()) {
	         String key =(String)iter.next();
	         if(student.get(key)>age)
	            System.out.println(key + ":" + student.get(key));
	      }
	   }

	}
				
				
				

