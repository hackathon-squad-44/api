package br.com.squad44.api.controllers.form;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import br.com.squad44.api.entities.Student;
import br.com.squad44.api.repositories.ParentRepository;
import br.com.squad44.api.repositories.SchoolRepository;

public class StudentForm {
    
    @NotNull @NotEmpty @Length(min = 5)
    private String name;
    
    @NotNull @Min(1)
    private Integer idade;

    @NotNull
    private Long schoolId;

    @NotNull
	private Long parentId;

    public StudentForm(String name, Long schoolId, Long parentId, Integer idade) {
        this.name = name;
        this.schoolId = schoolId;
        this.parentId = parentId;
        this.idade = idade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setSchoolId(Long schoolId) {
        this.schoolId = schoolId;
    }

    public Long getSchoolId() {
        return schoolId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public Long getParentId() {
        return parentId;
    }

    public Student convert(SchoolRepository schoolRepository, ParentRepository parentRepository) {
        return new Student(name, schoolRepository.findById(schoolId).get(), parentRepository.findById(parentId).get(), idade);
    }
    
}
