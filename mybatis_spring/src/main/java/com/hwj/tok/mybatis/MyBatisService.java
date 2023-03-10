package com.hwj.tok.mybatis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hwj.tok.model.Student;

@Service
public class MyBatisService {
	@Autowired
	private MyBatisDao myBatisDao;
	
	
	public List<Student> findAllStudent(){
		return myBatisDao.findAllStudendt();
	}
	
	public Student findStudent(Integer seq) {
		return myBatisDao.findStudent(seq);
	}
	
	public Integer updateStudent(Student student) {
		return myBatisDao.updateStudent(student);
	}
	
	public Integer deleteStudent(Integer seq) {
		return myBatisDao.deleteStudent(seq);
	}
	
	public List<Student> findStudentById(String id ){
		return myBatisDao.dynamicStudent(id);
	}
}
