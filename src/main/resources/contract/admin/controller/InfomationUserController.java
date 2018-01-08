/**
 * 
 */
package admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import admin.entity.InfomationUser;
import admin.services.InfomationUserService;

/**
 * @author YenDV
 *
 */
@RestController
public class InfomationUserController {
	@Autowired
	InfomationUserService infomationUserService;
	
	@RequestMapping(value="/getall" , method = RequestMethod.GET)
	public ResponseEntity<List<InfomationUser>> getUser(){
		return new ResponseEntity<List<InfomationUser>>(infomationUserService.getList(),
				HttpStatus.OK);
	}
}
