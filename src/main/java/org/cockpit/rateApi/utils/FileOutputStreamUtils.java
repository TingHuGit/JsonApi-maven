package org.cockpit.rateApi.utils;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.List;

public class FileOutputStreamUtils {
	public void copy(List list, String filePath, String tableName) throws IOException{
		
		//String name = list.get(0).getClass().getName().substring(5);
		
		//System.out.println("当前表名：" + tableName);
		
		File f = new File(filePath + "/" + tableName + ".txt");
		
		System.out.println("生成的txt路径：" + f.toString());
		
		FileOutputStream writerStream = new FileOutputStream(f);
		
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(writerStream, "UTF-8"));
		
		if(list != null && list.size() > 0){
			
	        for(int i=0;i<list.size();i++){
	            writer.write(list.get(i).toString());
	            writer.newLine();
				writer.flush();
	        }
		}
		writer.close();
	}
}
