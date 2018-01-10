/**
 * 
 */
package admin.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * @author YenDV
 *
 */
@Repository
public abstract class GenericDao<T extends Serializable> {
	private Class<T> classT;
	
	@Autowired
	SessionFactory sessionFactory;
	
	public GenericDao() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void setClass(Class<T> classSet){
		this.classT = classSet;
	}
	
	public T findById(Long id){
		return (T) sessionFactory.getCurrentSession().find(classT, id);
	}
	
	public List<?> findAll(Long begin, Long end){
		List<?> tLst = null;
		String queryStr = "from " + classT.getName();
		Query query = sessionFactory.getCurrentSession().createQuery(queryStr);
		query = begin != null ? query.setFirstResult(begin.intValue()) : query;
		query = end != null ? query.setMaxResults(end.intValue()) : query;
		tLst = (List<?>) query.getResultList();
		return tLst;
	}
	
	public T save(T t){
		if(!validate(t)) return null;
		Long id = (Long)sessionFactory.getCurrentSession().save(t);
		return findById(id);
	}
	
	public T delete(T t){
		if(!validate(t)) return null;
		sessionFactory.getCurrentSession().delete(t);
		return t;
	}
	
	public Boolean validate(T t){
		return true;
	}
}
