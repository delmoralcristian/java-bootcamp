package com.cris.dao;

import java.util.List;

import com.cris.model.Course;
import com.cris.model.Student;
import com.cris.model.Teacher;

public interface HighSchoolDao {
	
	public void addTeacher(Teacher teacher);
	public void addStudent(Student student);
	public void addCourse(Course course);
	public List<Student> getAllStudents();
	public List<Teacher> getAllTeachers();
	public List<Course> getAllCourses();
	public List<Student> getStudentsPerCourse(int id_course);
	public List<Course> getCoursesPerStudent(int id_student);
	

}
