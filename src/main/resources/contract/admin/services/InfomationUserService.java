/**
 * 
 */
package admin.services;

import java.util.List;

import admin.entity.InfomationUser;

/**
 * @author YenDV
 *
 */

public interface InfomationUserService {
	public List<InfomationUser> getList();
	
	public InfomationUser saveInfomationUser(InfomationUser infoUser);
	
	public Boolean validate(InfomationUser infoUser);
	
	public InfomationUser deleteInfomationUser(InfomationUser infoUser);
}
