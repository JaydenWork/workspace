package edu.kh.jdbc.common;

import java.io.FileInputStream;
import java.util.Properties;

public class LoadXMLFile {
	
	FileInputStream fis = new FileInputStream("test.xml");
	
	String fileName = sc.nextLine();
	
	//Properties 객체 생성
	Properties prop = new Properties();
	
	
	
	//FileInputStream에 연결된 xml 파일을 읽어와
	//Properties 객체에 저장
	prop.loadFromXml(fis);
	
	System.out.println(prop.toString());
	
	//Properties.getProperty("key")
	
	}catch(Exception e) {
		e.printStackTrace();
	}
	
}
