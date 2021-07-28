package testePrimeFace;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestePersistence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory factory = Persistence.
	              createEntityManagerFactory("testePrimeFace");

	        factory.close();
	}

}
