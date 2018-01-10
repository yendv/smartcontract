/**
 * 
 */
package admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import admin.entity.InfomationUser;
import admin.entity.InfomationUserImpl;
import admin.services.InfomationUserService;

/**
 * @author YenDV
 *
 */
@RestController
public class InfomationUserController {
	@Autowired
	InfomationUserService infomationUserService;
	
	@RequestMapping(value="infomationuser/getall" , method = RequestMethod.GET)
	public ResponseEntity<List<InfomationUser>> getUser(){
		return new ResponseEntity<List<InfomationUser>>(infomationUserService.getList(),
				HttpStatus.OK);
	}
	
	@RequestMapping(value="infomationuser/save" , method = RequestMethod.POST)
	public ResponseEntity<Void> saveInfomationUser(@RequestBody InfomationUserImpl infomationUser){
		Object successStr = null;
		infomationUserService.saveInfomationUser(infomationUser);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	@RequestMapping(value="infomationuser/delete" , method = RequestMethod.POST)
	public ResponseEntity<InfomationUser> deleteInfomationUser(@RequestBody InfomationUser infomationUser){
		infomationUserService.deleteInfomationUser(infomationUser);
		return new ResponseEntity<InfomationUser>(infomationUser , HttpStatus.OK);
	}
}
