/**
 * 
 *//*
package admin.services;

import java.io.Serializable;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import admin.dao.GenericDao;

*//**
 * @author YenDV
 *
 *//*
@Service
@Transactional
public abstract class GenericServiceImpl<T extends Serializable> implements GenericService {
	
	GenericDao<T> genericDao;
	
	public T findById(Long id){
		return (T) genericDao.findById(id);
	}
	
	public List<T> findAll(Long begin, Long end){
		return genericDao.findAll(begin, end);
	}
	
//	public T save(T t){
//		return (T) genericDao.save(t);
//	}
//	
//	public T delete(T t){
//		return (T) genericDao.delete(t);
//	}
//	
//	public Boolean validate(T t){
//		return true;
//	}
}
*/