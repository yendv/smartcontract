/**
 * 
 */
package admin.entity;

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
@Table(name = "trainning_question")
public class TrainingQuestionImpl implements TrainingQuestion {
	@Id
	@SequenceGenerator(name = "trainning_question_seq", sequenceName = "trainning_question_seq")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="trainning_question_seq")
	@Column(name = "id_trainning_group", updatable = false, nullable = false)
    private Long id;
	
	@Column(name = "question_content")
	private String questionContent;
	
	@Column(name = "answer_content")
	private String answerContent;
	
	@Column(name = "tranning_group_id")
	private Long tranningGroupId;
	
	@Column(name = "status")
	private Long status;

	/**
	 * @return the id
	 */
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
	 * @return the questionContent
	 */
	public String getQuestionContent() {
		return questionContent;
	}

	/**
	 * @param questionContent the questionContent to set
	 */
	public void setQuestionContent(String questionContent) {
		this.questionContent = questionContent;
	}

	/**
	 * @return the answerContent
	 */
	public String getAnswerContent() {
		return answerContent;
	}

	/**
	 * @param answerContent the answerContent to set
	 */
	public void setAnswerContent(String answerContent) {
		this.answerContent = answerContent;
	}

	/**
	 * @return the tranningGroupId
	 */
	public Long getTranningGroupId() {
		return tranningGroupId;
	}

	/**
	 * @param tranningGroupId the tranningGroupId to set
	 */
	public void setTranningGroupId(Long tranningGroupId) {
		this.tranningGroupId = tranningGroupId;
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
