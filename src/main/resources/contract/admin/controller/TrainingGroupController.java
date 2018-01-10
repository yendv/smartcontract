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
import admin.entity.TrainingGroup;
import admin.entity.TrainingGroupImpl;
import admin.services.TrainingGroupService;

/**
 * @author YenDV
 *
 */
@RestController
public class TrainingGroupController {
	@Autowired
	TrainingGroupService traningService;
	
	@RequestMapping(value="traininggroup/getall" , method = RequestMethod.GET)
	public ResponseEntity<List<TrainingGroup>> getAll(){
		return new ResponseEntity<List<TrainingGroup>>(traningService.findAll(null, null),
				HttpStatus.OK);
	}
	
	@RequestMapping(value="traininggroup/save" , method = RequestMethod.POST)
	public ResponseEntity<TrainingGroup> saveInfomationUser(@RequestBody TrainingGroupImpl trainingGroup){
		Object successStr = null;
		return new ResponseEntity<TrainingGroup>(traningService.save(trainingGroup), HttpStatus.OK);
	}
	
	@RequestMapping(value="traininggroup/delete" , method = RequestMethod.POST)
	public ResponseEntity<TrainingGroup> deleteInfomationUser(@RequestBody TrainingGroupImpl trainingGroup){
		traningService.delete(trainingGroup);
		return new ResponseEntity<TrainingGroup>(trainingGroup , HttpStatus.OK);
	}
}
