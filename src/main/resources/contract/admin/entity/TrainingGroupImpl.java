/**
 * 
 */
package admin.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * @author YenDV
 *
 */
@Entity
@Table(name = "trainning_group")
public class TrainingGroupImpl implements TrainingGroup{
	@Id
	@SequenceGenerator(name = "trainning_group_seq", sequenceName = "trainning_group_seq")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="trainning_group_seq")
	@Column(name = "id_trainning_group", updatable = false, nullable = false)
    private Long id;
	
	@Column(name = "title" )
	private String title;
	
	@Column(name = "status")
	private Long status;
	
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the status
	 */
	public Long getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(Long status) {
		this.status = status;
	}
	
	
}
