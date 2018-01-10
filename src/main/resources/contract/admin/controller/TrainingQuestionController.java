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

import admin.entity.TrainingGroup;
import admin.entity.TrainingGroupImpl;
import admin.entity.TrainingQuestion;
import admin.entity.TrainingQuestionImpl;
import admin.services.TrainingGroupService;
import admin.services.TrainingQuestionService;

/**
 * @author YenDV
 *
 */
@RestController
public class TrainingQuestionController {
	@Autowired
	TrainingQuestionService traningService;
	
	@RequestMapping(value="trainingquestion/getall" , method = RequestMethod.GET)
	public ResponseEntity<List<TrainingQuestion>> getAll(){
		return new ResponseEntity<List<TrainingQuestion>>(traningService.findAll(null, null),
				HttpStatus.OK);
	}
	
	@RequestMapping(value="trainingquestion/save" , method = RequestMethod.POST)
	public ResponseEntity<TrainingQuestion> saveInfomationUser(@RequestBody TrainingQuestionImpl trainingGroup){
		Object successStr = null;
		return new ResponseEntity<TrainingQuestion>(traningService.save(trainingGroup), HttpStatus.OK);
	}
	
	@RequestMapping(value="trainingquestion/delete" , method = RequestMethod.POST)
	public ResponseEntity<TrainingQuestion> deleteInfomationUser(@RequestBody TrainingQuestionImpl trainingGroup){
		traningService.delete(trainingGroup);
		return new ResponseEntity<TrainingQuestion>(trainingGroup , HttpStatus.OK);
	}
}
