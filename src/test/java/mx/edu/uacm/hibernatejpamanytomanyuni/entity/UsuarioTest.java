package mx.edu.uacm.hibernatejpamanytomanyuni.entity;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

@SpringBootTest
public class UsuarioTest {
	
	private static final Logger log = LogManager.getLogger(UsuarioTest.class);
	
	@PersistenceContext
	private EntityManager em;
	@Test
	@Transactional
	@Rollback(false)
	public void debeGuardarUsua() {
	log.debug(">Entrando al metodo ");

	Usuario u1 = new Usuario();
	Permiso permiso1 = new Permiso("lectura");


	Rol rol = new Rol("Administrador");
	rol.getPermiso().add(permiso1);
	u1.setCorreo("rene@gmail.com");
	u1.setContrasena("123");
	u1.getRol().add(rol);

	Rol rol2 = new Rol("Desarrollador");
	u1.getRol().add(rol2);

	em.persist(u1);

	em.flush();



	}
}
