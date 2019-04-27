package org.cockpit.rateApi.utils;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.List;


public class CopyOffileOutUtils {
	public void copy(List list,String filePath) throws IOException{
		
		if(list!=null && list.size() >1){
			
			String name = list.get(0).getClass().getName().substring(5);
			System.out.println("当前表名：" + name);
			
			File f = new File(filePath + "/" + name + ".txt");
	       
			FileOutputStream writerStream = new FileOutputStream(f); 
			
	        //BufferedWriter bw=new BufferedWriter(new FileWriter(f));
	        
	        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(writerStream, "UTF-8")); 
	        
	        for(int i=0;i<list.size();i++){
	        	/* bw.write(list.get(i).toString());
	            bw.newLine();
	            bw.flush();*/
	        	writer.write(list.get(i).toString());
	            writer.newLine();
				writer.flush();
	        }
	        writer.close();
	        //bw.close();
		}else{
			
			String name = list.get(0).getClass().getName().substring(5);
			System.out.println("当前表名：" + name);
			
			File f = new File(filePath + "/" + name + ".txt");
			/*BufferedWriter bw=new BufferedWriter(new FileWriter(f));
			bw.write("");
            bw.flush();
            bw.close();*/
			//System.out.println("0");
			FileOutputStream writerStream = new FileOutputStream(f); 
			
	        //BufferedWriter bw=new BufferedWriter(new FileWriter(f));
	        
	        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(writerStream, "UTF-8")); 
	        writer.write("");
	        writer.newLine();
			writer.flush();
	        writer.close();
		}
		
	}
	
}
