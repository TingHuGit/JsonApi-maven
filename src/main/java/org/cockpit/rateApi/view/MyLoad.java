package org.cockpit.rateApi.view;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import bean.FACT_SJQT_FXZB;
import utils.fileOutUtils;
import dao.findTableDao;


public class MyLoad  {
	
	public static void main(String[] args) {
		
		System.out.println("*********程序开始执行**********");
		System.out.println();
		
		String path = "";
		String times = "";
		String tableName = "";
		
        try {
        	 /*  业务代码  */
            //获取系统时间
    		Date date = new Date();
    		
    		Date yesterDay = null;
    		Calendar calendar = Calendar.getInstance();
    		/*calendar.setTime(date);
    		System.out.println("*********calendar：" + calendar);*/
    		calendar.add(Calendar.DAY_OF_MONTH, -1);
    		yesterDay = calendar.getTime();
    		System.out.println("**********yesterDay：" + yesterDay);
    		
    		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
    		String formatyyyyMMdd = sdf.format(date);
    		
    		//D:\software\aud_txt
    		//创建时间文件夹
			File file = new File("D:\\softwareaaaa\\aud_txt" + formatyyyyMMdd);  //D:\\
			if(!file.exists()){
				file.mkdirs();
			}
			try {
				path = file.getCanonicalPath();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			String path1 = path.replace("\\", "/");
			
			/*  直接执行jar  */
			SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
			/*times = sdf2.format(date);
			System.out.println("times被赋值为:" + times);*/
			String yesterDayString = sdf2.format(yesterDay);
			System.out.println("**********yesterDayString：" + yesterDayString);
			
			//获取查询list结果集
			findTableDao ftDao =new findTableDao();
			FileOutputStreamUtils fo = new FileOutputStreamUtils();
			
			try {
				File f = new File(path + "/" + formatyyyyMMdd +".OK");
				BufferedWriter writer=new BufferedWriter(new FileWriter(f));
				
				List<FACT_SJQT_FXZB> list1 = ftDao.findFACT_SJQT_FXZB(yesterDayString);
				tableName = "FACT_SJQT_FXZB";
						
				fo.copy(list1,path1,tableName);
				if(list1.size()==1){
					if(list1.get(0).getMAKEDATE()==null){
						writer.write(tableName+"="+"0");
						writer.newLine();
			            writer.flush();
					}else{
						writer.write(tableName+"="+"1");
						writer.newLine();
			            writer.flush();
					}
					
				}else{
					writer.write(tableName+"="+list1.size());
					writer.newLine();
		            writer.flush();
				}
				
				writer.close();
			System.out.println();
			System.out.println();
			System.out.println("*********程序执行结束**********");
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
    }
}
