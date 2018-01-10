/**
 * 
 */
package admin.services;

import java.util.List;

import admin.entity.TrainingGroup;
import admin.entity.TrainingQuestion;

/**
 * @author YenDV
 *
 */
public interface TrainingQuestionService {
	public TrainingQuestion findById(Long id);
	
	public List<TrainingQuestion> findAll(Long begin, Long end);
	
	public TrainingQuestion save(TrainingQuestion t);
	
	public TrainingGroup delete(TrainingQuestion t);
	
	public Boolean validate(TrainingQuestion t);
}
