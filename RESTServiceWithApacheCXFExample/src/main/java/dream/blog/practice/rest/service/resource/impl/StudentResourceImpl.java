package dream.blog.practice.rest.service.resource.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import dream.blog.practice.rest.service.model.Student;
import dream.blog.practice.rest.service.resource.StudentResource;

public class StudentResourceImpl implements StudentResource {

	private Map<Integer, Student> students = new HashMap<>();
	
	{
		students.put(1, new Student(10,"Tom"));
		students.put(2, new Student(20,"Jack"));
	}
	
	@Override
	public List<Student> getAllStudents() {
		Collection<Student> studentCollection = students.values();
		return new ArrayList<>(studentCollection);
	}

	@Override
	public Student getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
