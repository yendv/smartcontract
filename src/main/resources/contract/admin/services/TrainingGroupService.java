/**
 * 
 */
package admin.services;

import java.util.List;

import admin.entity.TrainingGroup;

/**
 * @author YenDV
 *
 */
public interface TrainingGroupService{
	public TrainingGroup findById(Long id);
	
	public List<TrainingGroup> findAll(Long begin, Long end);
	
	public TrainingGroup save(TrainingGroup t);
	
	public TrainingGroup delete(TrainingGroup t);
	
	public Boolean validate(TrainingGroup t);
}
