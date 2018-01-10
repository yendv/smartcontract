/**
 * 
 */
package admin.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import admin.dao.TrainingGroupDao;
import admin.entity.TrainingGroup;
import admin.entity.TrainingGroupImpl;

/**
 * @author YenDV
 *
 */
@Service
@Transactional
public class TrainingGroupServiceImpl implements TrainingGroupService {
	@Autowired
	TrainingGroupDao trainingDao;
	
	public TrainingGroup findById(Long id) {
		return trainingDao.findById(id);
	}

	
	public List<TrainingGroup> findAll(Long begin, Long end) {
		return (List<TrainingGroup>)trainingDao.findAll(begin , end);
	}

	
	public TrainingGroup save(TrainingGroup t) {
		TrainingGroupImpl t1 = (TrainingGroupImpl)t;
		return trainingDao.save(t1);
	}

	
	public TrainingGroup delete(TrainingGroup t) {
		TrainingGroupImpl t1 = (TrainingGroupImpl)t;
		return trainingDao.delete(t1);
	}

	
	public Boolean validate(TrainingGroup t) {
		return true;
	}
}
