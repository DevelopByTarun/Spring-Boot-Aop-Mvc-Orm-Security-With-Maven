package com.app.MavenSpringBootManyToManyRelationWithJpaRepositoryAndMysqlThruAnnotation.dto;

import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Entity
@Table(name = "subject_springBoot_manyToMany")
public class Subject {
	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	
	@ManyToMany(mappedBy = "subjects")
	private Set<Student> students;
	
    public Subject(){
    }
    
    public Subject(String name){
    	this.name = name;
    }
    
    public Subject(String name, Set<Student> students){
    	this.name = name;
    	this.students = students;
    }
	
	// name
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	// students
	public Set<Student> getStudents() {
		return students;
	}
	
	public void setStudents(Set<Student> students) {
		this.students = students;
	}
	
	@Override
	public String toString(){
		String info = "";
		JSONObject jsonInfo = new JSONObject();
		try {
			jsonInfo.put("name",this.name);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		JSONArray studentArray = new JSONArray();
		if(this.students != null && students.size() > 0){
			this.students.forEach(student->{
				JSONObject subJson = new JSONObject();
				try {
					subJson.put("name", student.getName());
				} catch (JSONException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				studentArray.put(subJson);
			});
		}
		try {
			jsonInfo.put("students", studentArray);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		info = jsonInfo.toString();
		return info;
	}
}
