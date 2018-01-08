/**
 * 
 */
package admin.dao;

import java.util.List;

import admin.entity.InfomationUser;

/**
 * @author YenDV
 *
 */
public interface InfomationDao {
	InfomationUser findByID(Long idUser);
	
	InfomationUser saveInfomationUser(InfomationUser user);
	
	List<InfomationUser> getList();
	
	void deleteInfomationUser(InfomationUser user);
}
