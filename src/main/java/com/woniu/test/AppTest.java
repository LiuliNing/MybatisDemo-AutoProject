package com.woniu.test;

import static org.junit.Assert.*;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.woniu.dao.DeptMapper;
import com.woniu.entity.Dept;
import com.woniu.entity.DeptExample;

public class AppTest {
@Test
public void testName() throws Exception {
	//���������ļ�
	InputStream in = //
			AppTest.class.getClassLoader().getResourceAsStream("mybatis-config.xml");
	//sqlsession������������ļ��е���Ϣ�����뵽�ڴ���
	SqlSessionFactory sf = new SqlSessionFactoryBuilder().build(in);
	//��һ���Ự
	SqlSession s = sf.openSession(true);
	//*****************************************************************************
	
	DeptMapper mapper = s.getMapper(DeptMapper.class);
	DeptExample ex = new DeptExample();
	ex.or().andDidBetween(1, 1000);
	List<Dept> list = mapper.selectByExample(ex);
	for (Dept dept : list) {
		System.out.println(dept);
	}
	
	//*********************************************************************************
	s.close();
	
	
}

}
