package org.cockpit.rateApi.view;


import java.awt.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import javax.swing.*;

import utils.fileOutUtils;
import bean.FACT_SJQT_FXZB;
import dao.findTableDao;

public class CopyOfStart extends JFrame{
	public static void main(String[] args) throws IOException {/*
		
			
		
			JTextField textField = new JTextField();
	        JPasswordField passwordField = new JPasswordField();

	        JPanel northPanel = new JPanel();
	        northPanel.setLayout(new GridLayout(2, 2));
	        northPanel.add(new JLabel("User name: ", SwingConstants.RIGHT));
	        northPanel.add(textField);
	        //add(northPanel, BorderLayout.NORTH);


	        //add button to append text into the text area
	        JPanel southPanel = new JPanel();

	        JButton insertButton = new JButton("Insert");
	        southPanel.add(insertButton);
	        
	        String dateText = textField.getText();
	        

	    //获取系统时间
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
		String format = sdf.format(date);
		String format2 = sdf2.format(date);
		//System.out.println(format);
		
		//创建时间文件夹
		File file = new File("D:\\"+format);
		if(!file.exists()){
			file.mkdirs();
		}
		String path = file.getCanonicalPath();
		String path1 = path.replace("\\", "/");
		//System.out.println(path1);
		
		String times = "";
		
		// 1、自动传入系统时间当参数
		times = "%" + format2 + "%";
		System.out.println("准备传入times:" + times);
		
		//2、获取用户输入的日期
		System.out.println("请输入要卸载数据的日期：（日期格式为YYYY-MM-DD）");
		Scanner read = new Scanner(System.in);
		if(read.hasNext()){
			times = read.nextLine();
			
			//times = ("%"+times+"%");
			System.out.println("获取用户输入的日期：" + times);
			}
		else{
			System.out.println("这是空的！");
		}
		
		
		System.out.println("dateText:" + dateText);
		if(dateText!= null){
			times = dateText;
		}
		
		
		//获取查询list结果集
		findTableDao ftDao =new findTableDao();
		fileOutUtils fo = new fileOutUtils();
		try {
			//创建OK文件
			File f=new File(path+"/"+format+".OK");
			BufferedWriter bw=new BufferedWriter(new FileWriter(f));
			
			FileOutputStream writerStream = new FileOutputStream(f); 
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(writerStream, "UTF-8")); 
			
			
			List<FACT_SJQT_FXZB> list1 = ftDao.findFACT_SJQT_FXZB(times);
			//System.out.println(list1);
			fo.copy(list1,path1);
			String name1 = list1.get(0).getClass().getName().substring(5);
			if(list1.size()==1){
				if(list1.get(0).getMAKEDATE()==null){
					bw.write(name1+"="+"0");
					bw.newLine();
		            bw.flush();
		            
		            writer.write(name1+"="+"0");
		            writer.newLine();
					writer.flush();
		            writer.close();
				}else{
					bw.write(name1+"="+"1");
					bw.newLine();
		            bw.flush();
					
					writer.write(name1+"="+"1");
					writer.newLine();
					writer.flush();
		            writer.close();
				}
				
			}else{
				bw.write(name1+"="+list1.size());
				bw.newLine();
	            bw.flush();
				
				writer.write(name1+"="+list1.size());
				writer.newLine();
				writer.flush();
	            writer.close();
			}
			
			List<FACT_SJQT_RISKPREM> list2 = ftDao.findFACT_SJQT_RISKPREM(times);
			fo.copy(list2,path1);
			String name2 = list2.get(0).getClass().getName().substring(5);
			if(list2.size()==1){
				if(list2.get(0).getMAKEDATE()==null){
					bw.write(name2+"="+"0");
					bw.newLine();
		            bw.flush();
				}else{
					bw.write(name2+"="+"1");
					bw.newLine();
		            bw.flush();
				}
			}else{
				bw.write(name2+"="+list2.size());
				bw.newLine();
	            bw.flush();
			}


			List<FACT_SJQT_WYZB> list3 = ftDao.findFACT_SJQT_WYZB(times);
			fo.copy(list3,path1);
			String name3 = list3.get(0).getClass().getName().substring(5);
			if(list3.size()==1){
				if(list3.get(0).getMAKEDATE()==null){
					bw.write(name3+"="+"0");
					bw.newLine();
		            bw.flush();
				}else{
					bw.write(name3+"="+"1");
					bw.newLine();
		            bw.flush();
				}
			}else{
				bw.write(name3+"="+list3.size());
				bw.newLine();
	            bw.flush();
			}
			
			
			
			List<FACT_SJQT_ZBGL> list4 = ftDao.findFACT_SJQT_ZBGL(times);
			fo.copy(list4,path1);
			String name4 = list4.get(0).getClass().getName().substring(5);
			if(list4.size()==1){
				if(list4.get(0).getMAKEDATE()==null){
					bw.write(name4+"="+"0");
					bw.newLine();
		            bw.flush();
				}else{
					bw.write(name4+"="+"1");
					bw.newLine();
		            bw.flush();
				}
			}else{
				bw.write(name4+"="+list4.size());
				bw.newLine();
	            bw.flush();
			}
			
			List<FACT_SJQT_ZGYW> list5 = ftDao.findFACT_SJQT_ZGYW(times);
			fo.copy(list5,path1);
			String name5 = list5.get(0).getClass().getName().substring(5);
			if(list5.size()==1){
				if(list5.get(0).getMAKEDATE()==null){
					bw.write(name5+"="+"0");
					bw.newLine();
		            bw.flush();
				}else{
					bw.write(name5+"="+"1");
					bw.newLine();
		            bw.flush();
				}
			}else{
				bw.write(name5+"="+list5.size());
				bw.newLine();
	            bw.flush();
			}
			
			List<FACT_SJQT_TYYW> list6 = ftDao.findFACT_SJQT_TYYW(times);
			fo.copy(list6,path1);
			String name6 = list6.get(0).getClass().getName().substring(5);
			if(list6.size()==1){
				if(list6.get(0).getMAKEDATE()==null){
					bw.write(name6+"="+"0");
					bw.newLine();
		            bw.flush();
				}else{
					bw.write(name6+"="+"1");
					bw.newLine();
		            bw.flush();
				}
			}else{
				bw.write(name6+"="+list6.size());
				bw.newLine();
	            bw.flush();
			}
			
			List<FACT_SJQT_GQTZMX> list7 = ftDao.findFACT_SJQT_GQTZMX(times);
			fo.copy(list7,path1);
			String name7 = list7.get(0).getClass().getName().substring(5);
			if(list7.size()==1){
				if(list7.get(0).getMAKEDATE()==null){
					bw.write(name7+"="+"0");
					bw.newLine();
		            bw.flush();
				}else{
					bw.write(name7+"="+"1");
					bw.newLine();
		            bw.flush();
				}
			}else{
				bw.write(name7+"="+list7.size());
				bw.newLine();
	            bw.flush();
			}
			
			List<FACT_SJQT_GQTZZD> list8 = ftDao.findFACT_SJQT_GQTZZD(times);
			fo.copy(list8,path1);
			String name8 = list8.get(0).getClass().getName().substring(5);
			if(list8.size()==1){
				if(list8.get(0).getMAKEDATE()==null){
					bw.write(name8+"="+"0");
					bw.newLine();
		            bw.flush();
				}else{
					bw.write(name8+"="+"1");
					bw.newLine();
		            bw.flush();
				}
			}else{
				bw.write(name8+"="+list8.size());
				bw.newLine();
	            bw.flush();
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	}
}
	
