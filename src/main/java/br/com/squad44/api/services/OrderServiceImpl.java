package br.com.squad44.api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.squad44.api.dto.OrderDTO;
import br.com.squad44.api.entities.Order;
import br.com.squad44.api.entities.Student;
import br.com.squad44.api.repositories.OrderRepository;
import br.com.squad44.api.repositories.StudentRepository;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	OrderRepository repository;

	@Autowired
	StudentRepository studentRepository;
	
	@Override
	public ResponseEntity<OrderDTO> register(Student form) {
		Order order = new Order(form);
		repository.save(order);			
		return ResponseEntity.ok().body(new OrderDTO(order));
	}
}
