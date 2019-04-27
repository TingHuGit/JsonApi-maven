package org.cockpit.rateApi.view;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.swing.*;

import bean.FACT_SJQT_FXZB;
import utils.fileOutUtils;
import dao.findTableDao;

//����̳���JFrame����, ʵ��ActionListener�ӿ�
public class MyFrame extends JFrame  implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}/*
	
	JLabel jtl;//��ǩ
	JLabel jtl2;//��ǩ
    JTextField jtf;//�ı���
    JTextField jtf2;//�ı���
    JButton jbt;//��ť
    
    public  MyFrame() throws IOException{
	    	jtl = new JLabel("�����ѯ���ڣ�");
	    	jtl2 = new JLabel("���յ������ڣ�");
	    	jtf = new JTextField(8);//�ı���ĳ�ʼ��
	    	jtf2 = new JTextField(8);//�ı���ĳ�ʼ��
	        jbt = new JButton("����");//��ť�ĳ�ʼ��
	        jbt.addActionListener(this);//����ť��Ӧ����¼�
	        add(jtl);
	        add(jtf);
	        add(jbt);
	        add(jtl2);
	        add(jtf2);
	        setLayout(new FlowLayout(FlowLayout.LEFT,20,40));
	        setTitle("����");
	        setSize(350, 220);
	        setLocationRelativeTo(null);//���ھ���
	        setDefaultCloseOperation(EXIT_ON_CLOSE);
	        setVisible(false);  //���ڿɼ�
		}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("*********����ʼִ��**********");
		
		// TODO Auto-generated method stub
		if (jbt == e.getSource()) {//�����jbt�����ť�������,
            
			String str = jtf.getText();//��ôȡ�ð�ť�ϵ�����,
			jtf2.setText(str);//�Ѱ�ť��������ʾ���ı�����
			
              ҵ�����  
            //��ȡϵͳʱ��
    		Date date = new Date();
    		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
    		String format = sdf.format(date);
    		
    		//����ʱ���ļ���
			File file = new File("D:\\"+format);
			if(!file.exists()){
				file.mkdirs();
			}
			String path = "";
			try {
				path = file.getCanonicalPath();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			String path1 = path.replace("\\", "/");
			
			String times = "";
			System.out.println("dateText:" + str);
			if(str!= null){
				//times = "%" + str + "%";
				times = str;
			}
			
			  
			 *  ֱ��ִ��jar  
			SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/MM/dd");
    		String format2 = sdf2.format(date);
			times = format2;
			System.out.println("times����ֵΪ:" + times);
			
			
			//��ȡ��ѯlist�����
			findTableDao ftDao =new findTableDao();
			fileOutUtils fo = new fileOutUtils();
			try {
				File f=new File(path+"/"+format+".OK");
				BufferedWriter bw=new BufferedWriter(new FileWriter(f));
				
				List<FACT_SJQT_FXZB> list1 = ftDao.findFACT_SJQT_FXZB(times);
				
				fo.copy(list1,path1);
				String name1 = list1.get(0).getClass().getName().substring(5);
				if(list1.size()==1){
					if(list1.get(0).getMAKEDATE()==null){
						bw.write(name1+"="+"0");
						bw.newLine();
			            bw.flush();
					}else{
						bw.write(name1+"="+"1");
						bw.newLine();
			            bw.flush();
					}
					
				}else{
					bw.write(name1+"="+list1.size());
					bw.newLine();
		            bw.flush();
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
				
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
    		
        }
	}
	
	
	public static void main(String[] args) {
        try {
			new MyFrame();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // ��������ʵ��
    }*/
}
