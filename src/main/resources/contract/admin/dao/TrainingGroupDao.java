/**
 * 
 */
package admin.dao;

import org.springframework.stereotype.Repository;

import admin.entity.TrainingGroupImpl;

/**
 * @author YenDV
 *
 */
@Repository
public class TrainingGroupDao extends GenericDao<TrainingGroupImpl> {
	
	public TrainingGroupDao() {
		super();
		setClass(TrainingGroupImpl.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Boolean validate(TrainingGroupImpl t){
		System.err.println("TrainningGroup break here");
		return true;
	}
	
	
}
