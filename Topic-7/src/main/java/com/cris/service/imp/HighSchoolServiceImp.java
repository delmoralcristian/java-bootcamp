package com.cris.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cris.dao.HighSchoolDao;
import com.cris.model.Course;
import com.cris.model.Student;
import com.cris.model.Teacher;
import com.cris.service.HighSchoolService;

@Service
public class HighSchoolServiceImp implements HighSchoolService {

	@Autowired
	private HighSchoolDao highSchoolDao;
	
	
	@Transactional
	public void addTeacher(Teacher teacher) {
		highSchoolDao.addTeacher(teacher);

	}

	@Transactional
	public void addStudent(Student student) {
		highSchoolDao.addStudent(student);

	}

	@Transactional
	public void addCourse(Course course) {
		highSchoolDao.addCourse(course);

	}

	@Transactional
	public List<Student> getAllStudents() {
		return highSchoolDao.getAllStudents();
	}

	@Transactional
	public List<Teacher> getAllTeachers() {
		return highSchoolDao.getAllTeachers();
	}

	@Transactional
	public List<Course> getAllCourses() {
		return highSchoolDao.getAllCourses();
	}

	@Transactional
	public List<Student> getStudentsPerCourse(int id_course) {
		return highSchoolDao.getStudentsPerCourse(id_course);
	}

	@Transactional
	public List<Course> getCoursesPerStudent(int id_student) {
		return highSchoolDao.getCoursesPerStudent(id_student);
	}
	
}
