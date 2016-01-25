package com.itpro.dao;
import java.io.Serializable;
import java.util.List;

public interface GenericDAO<E,PK extends Serializable> {
    
	public void add(E entity) ;
    public void saveOrUpdate(E entity) ;
    public void update(E entity) ;
    public void remove(E entity);
    public E find(PK key);
    public List<E> getAll() ;

}