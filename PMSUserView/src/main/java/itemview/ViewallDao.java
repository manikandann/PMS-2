package itemview;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class ViewallDao {
	
	@Autowired
    private SessionFactory sessionFactory;

	private Session getSession() {
        return sessionFactory.getCurrentSession();
    }
	
	
    public List getAllItem() {
    
        return getSession().createQuery("from Item").list();
    }
	
	
	
	

}