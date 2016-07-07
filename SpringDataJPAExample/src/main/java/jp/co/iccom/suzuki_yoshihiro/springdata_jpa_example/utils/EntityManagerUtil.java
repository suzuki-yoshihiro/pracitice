package jp.co.iccom.suzuki_yoshihiro.springdata_jpa_example.utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerUtil {

	public EntityManager getEntityManager(){
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("SpringDataJPAExample");
		EntityManager em = emf.createEntityManager();
		return em;
	}
}
