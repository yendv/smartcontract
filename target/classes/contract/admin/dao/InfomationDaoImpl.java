/**
 * 
 */
package admin.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import admin.entity.InfomationUser;

/**
 * @author YenDV
 *
 */
@Repository
public class InfomationDaoImpl implements InfomationDao {
	@Autowired
	private SessionFactory sessionFactory;
	
	public List<InfomationUser> getList(){
		List<InfomationUser> iuLst = new ArrayList<InfomationUser>();
		StringBuffer queryStr = new StringBuffer("from InfomationUserImpl");//select o 
		//queryStr = new StringBuffer("select a.table_name from information_schema.tables a where a.table_schema = 'public'");
		try {
			Session session = sessionFactory.getCurrentSession();
			Query query = session.createQuery(queryStr.toString());
			//Query query = session.createNativeQuery("SELECT a.\"NAME\" FROM \"INFOMATION_USER\" a WHERE a.\"NAME\" = 't'");
			iuLst = query.getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return iuLst;
	}
	
	public InfomationUser saveInfomationUser(InfomationUser user){
		return (InfomationUser)sessionFactory.getCurrentSession().save(user);
	}
	
	public void deleteInfomationUser(InfomationUser user){
		sessionFactory.getCurrentSession().delete(user);
	}

	public InfomationUser findByID(Long idUser) {
		return sessionFactory.getCurrentSession().find(InfomationUser.class, idUser);
	}
	
}
