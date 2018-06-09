package application;
import java.util.Scanner;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.FileReader;
import java.lang.Integer;
import java.lang.Float;
//import java.io.serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.*;



public class DBModule {

   DBModule(){//constructor
      try{
            FileInputStream Input = new FileInputStream("FoodDB.txt");

               int i = 0;
                   
               
               if(Input.read()==-1) {
                  System.out.println("Not crawled yet!");
                  Crawling crawl = new Crawling(); //ũ�Ѹ� ��� ����
                  crawl.Crawling();
                             
               }
               else {
            	   /*
                  while((i = Input.read()) != -1) {
                     System.out.write(i);
                  }*/
               }
       } catch (IOException e) {
    	   System.out.println("Not crawled yet!");
           Crawling crawl = new Crawling(); //ũ�Ѹ� ��� ����
           crawl.Crawling();
       } finally {
          /*
          try{
              Input.close();
           } catch(IOException io) {}
           */
          
       }
   }

   
   public ArrayList<FoodInfo> getFoodDB() {

	   ArrayList<FoodInfo> foodnames = new ArrayList<>();

	  

	   

	   try {

	         File input = new File("FoodDB.txt");

	         FileReader filereader = new FileReader(input);

	         BufferedReader bufReader = new BufferedReader(filereader);

	         String line="";

	         String split[];

	      

	         while((line = bufReader.readLine()) !=null) {

	        	 FoodInfo myFoodInfo = new FoodInfo();

	        	 

	             split = line.split(":");

	             myFoodInfo.setFoodName(split[0]);      

	             myFoodInfo.setKcal(split[1]);

	             myFoodInfo.setCatbo(split[2]);

	             myFoodInfo.setProtein(split[3]);

	             myFoodInfo.setFat(split[4]);

	                      

	             foodnames.add(myFoodInfo);

	         }

	       	        

	         bufReader.close();

	         return foodnames;

	      }catch(FileNotFoundException e) {

	    	  System.out.println(e);

	    	  return foodnames;

	      }catch(IOException e) {

	         System.out.println(e);

	         return foodnames;

	      }

   }
   
   public void changeUserDBInfo(String ageN, String heightN, String weightN) {

	   try {

		   	 DBModule myDBModule = new DBModule();

	         File input = new File("RecentUser.txt");

	         FileReader filereader = new FileReader(input);

	         BufferedReader bufReader = new BufferedReader(filereader);

	         

	         String line = bufReader.readLine();

	         String[] split = line.split(":");

	         String u_id = split[0];
	         System.out.println(u_id);

	         //filereader.close();

	         

	         File input2 = new File("UserDB.txt");

	         FileWriter fw = new FileWriter(input2,true);

	         BufferedWriter bufWriter = new BufferedWriter(fw);

	         

	         while((line = bufWriter.writeLine()) !=null) {

	        	 split = line.split(":");

	        	 String id = split[0];
	        	 System.out.println(id);
	                         

	             if(u_id.equals(id)) {
	            	 System.out.println("in");
	            	String pw = split[1];

	                String sex = split[2];	                

	                float height = Float.parseFloat(split[3]);

	                float weight = Float.parseFloat(split[4]);

	                int age = Integer.parseInt(split[5]);

	                float firstWeight = Float.parseFloat(split[6]);

	       

	                fw.write(String.format("%s",id));

	                fw.write(String.format(":"));

	                fw.write(String.format("%s",pw));

	                fw.write(String.format(":"));

	                fw.write(String.format("%s",sex));

	                fw.write(String.format(":"));

	                fw.write(String.format("%f",heightN));  //       

	                fw.write(String.format(":"));

	                fw.write(String.format("%f",weightN));	//

	                fw.write(String.format(":"));

	                fw.write(String.format("%d",ageN));		//

	                fw.write(String.format(":"));

	                fw.write(String.format("%d",firstWeight));

	                fw.flush();

	                fw.write(LINE_SEPARATOR);

	                System.out.println("DONE");

	                fw.close();

	                break;

	             }

	         }

	         

	         System.out.println("DONE");

	         filereader.close();

	      }catch(FileNotFoundException e) {

	         

	      }catch(IOException e) {

	         System.out.println(e);

	      }

   }
   
   
   private static final String LINE_SEPARATOR = System
               .getProperty("line.separator");

   
   public void setUserDBInfo(String strId, String strPw,String sex, float height, float weight, int age) {
      try {
         File output = new File("UserDB.txt");
         FileWriter fw = new FileWriter(output,true);
        
         fw.write(String.format("%s",strId));
         fw.write(String.format(":"));
         fw.write(String.format("%s",strPw));
         fw.write(String.format(":"));
         fw.write(String.format("%s",sex));
         fw.write(String.format(":"));
         fw.write(String.format("%f",height));         
         fw.write(String.format(":"));
         fw.write(String.format("%f",weight));
         fw.write(String.format(":"));
         fw.write(String.format("%d",age));
         fw.flush();
         fw.write(LINE_SEPARATOR);
         System.out.println("DONE");
         fw.close();
      }catch(FileNotFoundException e) {
         
      }catch(IOException e) {
         System.out.println(e);
      }
      
   }//���� Ŭ�����ȿ��� setUserInfo �Լ� �ȿ��� ����� �Լ��� �Ķ���ͷ�  ȸ������ �� �Էµ� ������ ����� User Ŭ������ �޾� �������� DB�� ����Ѵ�.
   public void setUserDBInfoFirst(String strId, String strPw,String sex, float height, float weight, int age) {
	      try {
	         File output = new File("UserDB.txt");
	         FileWriter fw = new FileWriter(output,true);
	        
	         fw.write(String.format("%s",strId));
	         fw.write(String.format(":"));
	         fw.write(String.format("%s",strPw));
	         fw.write(String.format(":"));
	         fw.write(String.format("%s",sex));
	         fw.write(String.format(":"));
	         fw.write(String.format("%f",height));         
	         fw.write(String.format(":"));
	         fw.write(String.format("%f",weight));
	         fw.write(String.format(":"));
	         fw.write(String.format("%d",age));
	         fw.write(String.format(":"));
	         fw.write(String.format("%f",weight));
	         fw.flush();
	         fw.write(LINE_SEPARATOR);
	         System.out.println("DONE");
	         fw.close();
	      }catch(FileNotFoundException e) {
	         
	      }catch(IOException e) {
	         System.out.println(e);
	      }
	      
	   }
   public void setUserDBInfoRecent(String strId, String strPw,String sex, float height, float weight, int age,float firstweight) {
	      try {
	    	 String filename = "RecentUser.txt";
	         File output = new File(filename);
	         FileWriter fw = new FileWriter(output);
	        
	         fw.write(String.format("%s",strId));
	         fw.write(String.format(":"));
	         fw.write(String.format("%s",strPw));
	         fw.write(String.format(":"));
	         fw.write(String.format("%s",sex));
	         fw.write(String.format(":"));
	         fw.write(String.format("%f",height));         
	         fw.write(String.format(":"));
	         fw.write(String.format("%f",weight));
	         fw.write(String.format(":"));
	         fw.write(String.format("%d",age));
	         fw.write(String.format(":"));
	         fw.write(String.format("%f",firstweight));
	         fw.flush();
	         fw.write(LINE_SEPARATOR);
	         System.out.println("DONE");
	         fw.close();
	      }catch(FileNotFoundException e) {
	         
	      }catch(IOException e) {
	         System.out.println(e);
	      }
	      
	   }
   public void getUserDBInfo(String u_id,User user) {
      try {
         File input = new File("UserDB.txt");
         FileReader filereader = new FileReader(input);
         BufferedReader bufReader = new BufferedReader(filereader);
      
         String line="";
         String split[];
         String DB_id="";
         String DB_pw="";
         while((line = bufReader.readLine()) !=null) {
            
            split = line.split(":");
            DB_id = split[0];
            DB_pw = split[1]; 
            if(u_id.equals(DB_id)) {
               String sex = split[2];
               
               float height = Float.parseFloat(split[3]);
               float weight = Float.parseFloat(split[4]);
               int age = Integer.parseInt(split[5]);
               float firstWeight = Float.parseFloat(split[6]);
      
               user.setUserInfoFirst(DB_id,DB_pw,sex, height, weight, age,firstWeight);
               break;
            }
         }
         bufReader.close();
      }catch(FileNotFoundException e) {
         
      }catch(IOException e) {
         System.out.println(e);
      }
   
   }
   public void getRecentUserDBInfo(User user) {
	      try {
	         File input = new File("RecentUser.txt");
	         FileReader filereader = new FileReader(input);
	         BufferedReader bufReader = new BufferedReader(filereader);
	      
	         String line="";
	         String split[];
	         String DB_id="";
	         String DB_pw="";
	        
	            line = bufReader.readLine();
	            split = line.split(":");
	            DB_id = split[0];
	            DB_pw = split[1]; 
	           
	               String sex = split[2];
	               
	               float height = Float.parseFloat(split[3]);
	               float weight = Float.parseFloat(split[4]);
	               int age = Integer.parseInt(split[5]);
	               float firstWeight = Float.parseFloat(split[6]);
	      
	               user.setUserInfoFirst(DB_id,DB_pw,sex, height, weight, age,firstWeight);
	               
	            
	         
	         bufReader.close();
	      }catch(FileNotFoundException e) {
	         
	      }catch(IOException e) {
	         System.out.println(e);
	      }
	   
	   }
   public boolean search(String name) {
	   try {
	         File input = new File("UserDB.txt");
	         FileReader filereader = new FileReader(input);
	         BufferedReader bufReader = new BufferedReader(filereader);
	      
	         String line="";
	         String split[];
	         String DB_id="";
	         
	         while((line = bufReader.readLine()) !=null) {
	            
	            split = line.split(":");
	            DB_id = split[0];
	            
	            if(name.equals(DB_id)) {
	              return true;	    
	            }
	         }
	         bufReader.close();
	         return false;
	         
	      }catch(FileNotFoundException e) {
	    	  return false;
	         
	      }catch(IOException e) {
	         System.out.println(e);
	         return false;
	      }
	   
	   
   }// �̸��� ��ġ�ϴ� ������ ���� �׸��� DB�ȿ� �ִ� �� �˻��ϰ� �� ��ġ�� ����
   
}