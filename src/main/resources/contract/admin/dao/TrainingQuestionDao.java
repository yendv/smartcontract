/**
 * 
 */
package admin.dao;

import org.springframework.stereotype.Repository;

import admin.entity.TrainingGroupImpl;
import admin.entity.TrainingQuestionImpl;

/**
 * @author YenDV
 *
 */
@Repository
public class TrainingQuestionDao extends GenericDao<TrainingQuestionImpl> {
	
	public TrainingQuestionDao() {
		super();
		setClass(TrainingQuestionImpl.class);
	}

	@Override
	public Boolean validate(TrainingQuestionImpl t){
		return true;
	}
}
