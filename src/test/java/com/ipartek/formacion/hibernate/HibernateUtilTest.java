package com.ipartek.formacion.hibernate;

import static org.junit.Assert.assertNotNull;

import org.hibernate.Session;
import org.junit.Test;

/**
 * Utilidad para obtener Session de Hibernate
 * 
 * @author ur00
 *
 */
public class HibernateUtilTest {

	@Test
	public void testSession() {

		Session session = HibernateUtil.getSession();
		assertNotNull("No se puede obtener Session Hibernate, la configuracion no es correcta o la BBDD esta parada",
				session);

	}

}
