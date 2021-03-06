/**
 * 
 */
package admin.entity;

import java.io.Serializable;

/**
 * @author YenDV
 *
 */
public interface InfomationUser extends Serializable {

	/**
	 * @return
	 */
	public Long getId();

	/**
	 * @param id
	 */
	public void setId(Long id);

	/**
	 * @return
	 */
	public String getName();

	/**
	 * @param name
	 */
	public void setName(String name);

	/**
	 * @return
	 */
	public String getPhone();

	/**
	 * @param phone
	 */
	public void setPhone(String phone);

	/**
	 * @return
	 */
	public String getAddress();

	/**
	 * @param address
	 */
	public void setAddress(String address);
	
}
