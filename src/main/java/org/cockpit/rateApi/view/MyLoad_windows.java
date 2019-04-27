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

import bean.V_FACT_JTGLJSC_PREM;
import bean.V_FACT_JTGLJSC_RENEWALRATE;
import utils.fileOutUtils;
import dao.findTableDao;

public class MyLoad_windows {

	public static void main(String[] args) {

		System.out.println("*********程序开始执行**********");
		System.out.println();

		String path = "";
		String path2 = "";
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
			System.out.println("**********yesterDay：" + yesterDay);
			
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
			String formatyyyyMMdd = sdf.format(yesterDay);
			
			// D:\software\aud_txt
			// 创建时间文件夹
			File file_windows = new File("D:\\softwares\\aud_txt" + formatyyyyMMdd); // D:\\
			
			if (!file_windows.exists()) {
				file_windows.mkdirs();
			}
			try {
				path = file_windows.getCanonicalPath();
				System.out.println("path:" + path);
			} catch (IOException e1) {
				e1.printStackTrace();
			}

			String path1 = path.replace("\\", "/");

			/* 直接执行jar */
			SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
			
			/*
			 * times = sdf2.format(date); System.out.println("times被赋值为:" +
			 * times);
			 */

			String yesterDayString = sdf2.format(yesterDay);
			System.out.println("**********yesterDayString：" + yesterDayString);

			// 获取查询list结果集
			findTableDao ftDao = new findTableDao();
			FileOutputStreamUtils fo = new FileOutputStreamUtils();
			FileOutputStreamUtils fo2 = new FileOutputStreamUtils();

			try {
				tableName = "mc_sell_quality_16_" + formatyyyyMMdd;
				//    /UAGENT/ETL/DATA/SOURCEFILE/16
				File f = new File(path + "/" + tableName + ".txt.flag");
				BufferedWriter writer = new BufferedWriter(new FileWriter(f));
				List<V_FACT_JTGLJSC_RENEWALRATE> list1 = ftDao.queryRate("2019-03-13");

				// 取大小
				FileChannel fc = null;
				
				File queryfile = new File(path1 + "/" + tableName + ".txt");
				String filePath = queryfile.getPath();
				
				String fileflagPath = "";
				
				System.out.println(filePath);
				String fileName = queryfile.getName();
				System.out.println(fileName);
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
				// 创建txt
				fo.copy(list1, path1, tableName);
				
				
				tableName2 = "mc_sell_perform_16_" + formatyyyyMMdd;
				File f2 = new File(path1 + "/" + tableName2 + ".txt.flag");
				BufferedWriter writer2 = new BufferedWriter(new FileWriter(f2));
				List<V_FACT_JTGLJSC_PREM> list2 = ftDao.queryBusiness("2019-03-13");
				fo2.copy(list2, path1, tableName2);
				// 取大小
				FileChannel fc2 = null;
				
				File queryfile2 = new File(path1 + "/" + tableName2 + ".txt");
				String filePath2 = queryfile2.getPath();
				
				String fileflagPath2 = "";
				
				System.out.println(filePath2);
				String fileName2 = queryfile2.getName();
				System.out.println(fileName2);
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
				/*Socket s = new Socket("25.1.0.15", 16022);

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
				
				Socket socketflag = new Socket("25.1.0.15", 16022);
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
				*/
				
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
