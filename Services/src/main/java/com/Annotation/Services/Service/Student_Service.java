package com.Annotation.Services.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.Annotation.Services.Model.Students;

@Service
public class Student_Service {

	
	List<Students> list = new ArrayList<>();
	
	Students stud = new Students();
	
	public String addStudent(Students stud) {
		list.add(stud);
		return stud.getName() + ": succefully added";
	}
	
	
	public List<Students> getall(){
		return list;
	}
	
	public String addStude(int a,String n,String c, List<Integer> m) {
		this.stud.setId(a);
		this.stud.setName(n);
		this.stud.setCity(c);
		this.stud.setMarks(m);
		
		list.add(stud);
		return stud.getName()+ " added student";
	}
	
	public Students get() {
		return stud;
	}
	
	public int getHighest() {
		
		List<List<Integer>> marks = list.stream().map((i) -> (i.getMarks())).collect(Collectors.toList());
		List<Integer> li2 = marks.stream().map((mn) -> {
			return mn.stream().reduce(0,(z,x) ->(z+x));
		}).collect(Collectors.toList());
		
		Optional<Integer> max = li2.stream().max((i,j) -> (i.compareTo(j)));
		return  max.get();
	}
}
