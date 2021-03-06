package br.com.squad44.api.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import br.com.squad44.api.entities.Order;


public class OrderDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	private Long studentId;
	private String studentName;	
	private List<ItemOrderDTO> items = new ArrayList<>();
	
	public OrderDTO() {
		
	}
	
	public OrderDTO(Order order) {
		this.id = order.getId();
		this.items = order.getItems().stream().map(itemOrder -> new ItemOrderDTO(itemOrder))
				.collect(Collectors.toList());
		if (order.getStudent() != null) {
		this.studentId = order.getStudent().getId();
		this.studentName = order.getStudent().getName();
		}
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getStudentId() {
		return studentId;
	}

	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public List<ItemOrderDTO> getItems() {
		return items;
	}
	
}
