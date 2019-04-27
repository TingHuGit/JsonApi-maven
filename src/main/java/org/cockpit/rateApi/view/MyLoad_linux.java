package org.cockpit.rateApi.view;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.channels.FileChannel;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.cockpit.rateApi.dao.queryTableDao;


public class MyLoad_linux {

	public static void main(String[] args) {

		System.out.println("*********程序开始执行**********" + "\n");

		String path_linux = "";
		String times = "";
		String tableName = "";
		String tableName2 = "";
		
		try {
			/* 业务代码 */
			// 获取系统时间
			Date date = new Date();

			Date yesterDay = null;
			Calendar calendar = Calendar.getInstance();
			
			/*
			 * calendar.setTime(date); System.out.println("*********calendar：" +
			 * calendar);
			 */
			
			calendar.add(Calendar.DAY_OF_MONTH, -1);
			yesterDay = calendar.getTime();
			System.out.println("**********yesterDay：" + yesterDay  + "\n");
			
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
			String formatyyyyMMdd = sdf.format(yesterDay);
			
			// 创建时间文件夹
			File file_linux = new File("/UAGENT/ETL/DATA/SOURCEFILE/16");
			
			if (!file_linux.exists()) {
				file_linux.mkdirs();
			}
			
			try {
				path_linux = file_linux.getCanonicalPath();
				System.out.println("path_linux:" + path_linux  + "\n");
			} catch (IOException e1) {
				e1.printStackTrace();
			}

			//String path1 = path_linux.replace("\\", "/");

			/* 直接执行jar */
			SimpleDateFormat sdf2 = new SimpleDateFormat("yyyyMMdd");
			
			times = sdf2.format(date); 
			System.out.println("times被赋值为:" + times);

			String yesterDayString = sdf2.format(yesterDay);
			System.out.println("**********yesterDayString：" + yesterDayString  + "\n");

			// 获取查询list结果集
			queryTableDao ftDao = new queryTableDao();
			FileOutputStreamUtils fo = new FileOutputStreamUtils();
			FileOutputStreamUtils fo2 = new FileOutputStreamUtils();

			try {
				tableName = "mc_sell_quality_16_" + formatyyyyMMdd;
				
				//   /UAGENT/ETL/DATA/SOURCEFILE/16
				File f = new File(path_linux + "/" + tableName + ".txt.flag");
				BufferedWriter writer = new BufferedWriter(new FileWriter(f));
				List<V_FACT_JTGLJSC_RENEWALRATE> list1 = ftDao.queryRate(yesterDayString);
				// 创建txt
				fo.copy(list1, path_linux, tableName);

				// 取大小
				FileChannel fc = null;
				
				File queryfile = new File(path_linux + "/" + tableName + ".txt");
				String filePath = queryfile.getPath();
				
				String fileflagPath = "";
				
				System.out.println("路径名：" + filePath);
				String fileName = queryfile.getName();
				System.out.println("文件名字：" + fileName  + "\n");
				try {
					if (queryfile.exists() && queryfile.isFile()) {
						//获取file名字
						FileInputStream fis = new FileInputStream(queryfile);
						fc = fis.getChannel();
						System.out.println("文件" + fileName + "的大小是：" + fc.size() + "\n");
						writer.write(tableName + ".txt " + fc.size());
						writer.newLine();
						writer.flush();
					}
				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					if (null != fc) {
						try {
							fc.close();
							writer.close();
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
				}
				
				tableName2 = "mc_sell_perform_16_" + formatyyyyMMdd;
				
				//   /UAGENT/ETL/DATA/SOURCEFILE/16
				File f2 = new File(path_linux + "/" + tableName2 + ".txt.flag");
				BufferedWriter writer2 = new BufferedWriter(new FileWriter(f2));
				List<V_FACT_JTGLJSC_PREM> list2 = ftDao.queryBusiness(yesterDayString);
				fo2.copy(list2, path_linux, tableName2);
				
				// 取大小
				FileChannel fc2 = null;
				
				File queryfile2 = new File(path_linux + "/" + tableName2 + ".txt");
				String filePath2 = queryfile2.getPath();
				
				String fileflagPath2 = "";
				
				System.out.println("路径名：" + filePath2);
				String fileName2 = queryfile2.getName();
				System.out.println("文件名字：" + fileName2 + "\n");
				try {
					if (queryfile2.exists() && queryfile2.isFile()) {
						//获取file名字
						FileInputStream fis2 = new FileInputStream(queryfile2);
						fc2 = fis2.getChannel();
						System.out.println("文件" + fileName2 + "的大小是：" + fc2.size() + "\n");
						writer2.write(tableName2 + ".txt " + fc2.size());
						writer2.newLine();
						writer2.flush();
					}
				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					if (null != fc2) {
						try {
							fc2.close();
							writer2.close();
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
				}
				
				System.out.println();
				System.out.println();
				System.out.println("*********TCP 开始**********");
				
				// 创建客户端套接字对象
				//Socket s = new Socket("25.1.0.15", 16022);
				Socket s = new Socket("10.156.38.165", 8080);
				
				// 获取输出流
				OutputStream os = s.getOutputStream();
				// 2.将Socket中封装好的字节输出流包装成缓冲字节输出流
				//BufferedOutputStream bos = new BufferedOutputStream(os);
				
				// 查找指定文件
				// File file = new File("D:\\test.jpg");
				//String fileName = file.getName();
				// 创建文件输入流
				//FileInputStream fis = new FileInputStream(queryfile);
				
				// 3.从指定的路径中读取要上传的文件上传到服务端
				FileInputStream fis = new FileInputStream(filePath);// 创建文件输入流
				//BufferedInputStream bis = new BufferedInputStream(fis);
				
				// 写入文件长度（方便在服务端接收是需要知道传递的字节长度）
				os.write(fileName.length());
				// 写入文件名
				os.write(fileName.getBytes());
				// 读取指定文件内容
				
				// IO流经典4行代码
				byte[] by = new byte[1024];
				int len;
				while ((len = fis.read(by)) != -1) {
					os.write(by, 0, len);
				}
				
				// 禁掉输出流 告诉服务端，客户端已经上传完毕
				s.shutdownOutput();
				
				// 4.获取服务端的返回结果
				// 将Socket中封装好的字节输入流包装成字节缓冲输入流
				//BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
				// 读取
				//String string = br.readLine();
				//System.out.println(string);
				// 关流
				s.close();
				fis.close();
				os.close();
				
				Socket socketflag = new Socket("10.156.38.165", 8080);
				// 获取输出流
				OutputStream osflag = s.getOutputStream();
				FileInputStream fisflag = new FileInputStream(fileflagPath);// 创建文件输入流
				os.write(fileName.length());
				// 写入文件名
				os.write(fileName.getBytes());
				// 读取指定文件内容
				
				// IO流经典4行代码
				byte[] byflag = new byte[1024];
				int lenflag;
				while ((lenflag = fisflag.read(byflag)) != -1) {
					osflag.write(byflag, 0, lenflag);
				}
				socketflag.shutdownOutput();
				// 关流
				socketflag.close();
				fisflag.close();
				osflag.close();
				
				
				System.out.println();
				System.out.println();
				System.out.println("*********程序执行结束**********");
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
