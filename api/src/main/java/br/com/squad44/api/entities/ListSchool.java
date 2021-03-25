package br.com.squad44.api.entities;

import java.io.Serializable;

public class ListSchool implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private ItemList list;
	private School school;
	
	public ListSchool(){		
	}

	public ListSchool(Long id, ItemList list, School school) {
		super();
		this.id = id;
		this.list = list;
		this.school = school;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public ItemList getList() {
		return list;
	}

	public void setList(ItemList list) {
		this.list = list;
	}

	public School getSchool() {
		return school;
	}

	public void setSchool(School school) {
		this.school = school;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ListSchool other = (ListSchool) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	
}
