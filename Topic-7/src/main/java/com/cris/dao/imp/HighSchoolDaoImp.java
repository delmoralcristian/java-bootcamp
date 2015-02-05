package com.cris.dao.imp;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cris.dao.HighSchoolDao;
import com.cris.model.Course;

import com.cris.model.Student;
import com.cris.model.Teacher;

@Repository
public class HighSchoolDaoImp implements HighSchoolDao {

	@Autowired
	private SessionFactory session;
	
	@Override
	public void addTeacher(Teacher teacher) {
		session.getCurrentSession().save(teacher);

	}

	@Override
	public void addStudent(Student student) {
		session.getCurrentSession().save(student);

	}

	@Override
	public void addCourse(Course course) {
		session.getCurrentSession().save(course);

	}

	@Override
	public List<Student> getAllStudents() {
		return session.getCurrentSession().createQuery("from Student").list();
	}

	@Override
	public List<Teacher> getAllTeachers() {
		return session.getCurrentSession().createQuery("from Teacher").list();
	}

	@Override
	public List<Course> getAllCourses() {
		return session.getCurrentSession().createQuery("from Course").list();
	}

	@Override
	public List<Student> getStudentsPerCourse(int id_course) {
		
		return session.getCurrentSession().createQuery("select Student.* from Assists inner join Student on Assists.id_student= Student.id_student where Assists.id_course=?").list();
		
	}

	@Override
	public List<Course> getCoursesPerStudent(int id_student) {
		
		return session.getCurrentSession().createQuery("select Course.* from Assists inner join Course on Assists.id_course= Student.id_course where Assists.id_student=?").list();
	}

}
