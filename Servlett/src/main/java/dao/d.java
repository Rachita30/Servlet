package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;



import dto.dd;

public class d {
 EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
 EntityManager em=emf.createEntityManager();
 EntityTransaction t=em.getTransaction();

 
 public void create(dd a){
	 t.begin();
	 em.persist(a);
	 t.commit();
 }

public void update(int id, long phno) {
         dd d1= em.find(dd.class, id)	;
         d1.setPhno(phno);
        
         t.begin();
         em.persist(d1);
         t.commit();
}

public String fetch(int oo) {
	dd z=em.find(dd.class, oo);
	String o= "Student id: "+z.getSid()+" ||Student name: "+z.getSname()+" ||Student gender: "+z.getGender()+" ||Student Contact: "+z.getPhno();
	if(z!=null){
    System.out.println(z.getSid());
    System.out.println(z.getSname());
    System.out.println(z.getPhno());
    System.out.println(z.getGender()); 
    return "fetched";
	}
	else{
		return "data not found";
	}
}

public List<dd> fethall() {
   Query q=em.createQuery( "select x from student");
List<dd> w  =q.getResultList();
	return null;
}

// //create method for remove 
// //from new class remove

public String delete(int g) {
	dd z=em.find(dd.class, g);
	if(z!=null){
			t.begin();
		em.remove(z);
		t.commit();
		return "data deleted";
	}else{
	return "data not found";
}

}
public List<dd> fetchall()
{
	
Query q = em.createQuery("select x from student x");
List <dd> d1=q.getResultList();
return d1;
}

public void deleted(int cid) {
       dd d2=  em.find(dd.class, cid)	;
       t.begin();
       em.remove(d2);
       t.commit();
}

public void uppp(dd d2) {
	
	t.begin();
	em.merge(d2);
	t.commit();
}

}
