/**
 * 
 */
package admin.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import admin.dao.InfomationDao;
import admin.entity.InfomationUser;

/**
 * @author YenDV
 *
 */
@Service
@Transactional
public class InfomationUserServiceImpl implements InfomationUserService {
	@Autowired
	InfomationDao infomationDao;
	
	public List<InfomationUser> getList(){
		return infomationDao.getList();
	}
}
