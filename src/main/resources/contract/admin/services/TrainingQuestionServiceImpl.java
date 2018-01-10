/**
 * 
 */
package admin.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import admin.dao.TrainingQuestionDao;
import admin.entity.TrainingGroup;
import admin.entity.TrainingQuestion;
import admin.entity.TrainingQuestionImpl;

/**
 * @author YenDV
 *
 */
@Service
@Transactional
public class TrainingQuestionServiceImpl implements TrainingQuestionService {
	@Autowired
	TrainingQuestionDao trainingDao;
	
	public TrainingQuestion findById(Long id) {
		return trainingDao.findById(id);
	}

	
	public List<TrainingQuestion> findAll(Long begin, Long end) {
		return (List<TrainingQuestion>)trainingDao.findAll(begin , end);
	}

	
	public TrainingQuestion save(TrainingQuestion t) {
		TrainingQuestionImpl t1 = (TrainingQuestionImpl) t;
		return (TrainingQuestion)trainingDao.save(t1);
	}

	
	public TrainingGroup delete(TrainingQuestion t) {
		TrainingQuestionImpl t1 = (TrainingQuestionImpl) t;
		return (TrainingGroup)trainingDao.delete(t1);
	}
	
	public Boolean validate(TrainingQuestion t) {
		return null;
	}
}
