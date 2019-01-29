package com.app.MavenSpringBootMvcAopOrmSecurityCrudWithLog4jEmailJpaEntityManagerAndMysqlThruAnnotation.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.TableGenerator;

@Entity
@Table(name = "Account_SpringBootMvcAopOrmSecurityCrud_JpaEntityManager")
public class AccountDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE , generator="account_id_generator")
    @TableGenerator(
            name = "account_id_generator",
            table = "Account_JpaEntityManager_Id_Generator",
            pkColumnName = "myid",
            valueColumnName = "next",
            pkColumnValue = "course",
            allocationSize = 10
    )
    @Column(name = "account_id", precision = 6, nullable = false)
    private int id;

    @Column(name = "account_number", precision = 9, insertable = true, updatable = true, nullable = false)
    private int number;

    @Column(name = "account_type", length = 10, insertable = true, updatable = true, nullable = false)
    private String type;

    @Column(name = "account_bank", length = 20, insertable = true, updatable = true, nullable = false)
    private String bank;

    @Column(name = "account_status", length = 10, insertable = true, updatable = true, nullable = false)
    private String status;

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the number
	 */
	public int getNumber() {
		return number;
	}

	/**
	 * @param number the number to set
	 */
	public void setNumber(int number) {
		this.number = number;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the bank
	 */
	public String getBank() {
		return bank;
	}

	/**
	 * @param bank the bank to set
	 */
	public void setBank(String bank) {
		this.bank = bank;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
}
