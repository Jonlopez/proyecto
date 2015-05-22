/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bdudalekuakPU;

import bdudalekuakPU.exceptions.NonexistentEntityException;
import bdudalekuakPU.exceptions.PreexistingEntityException;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author Jon
 */
public class SorteoJpaController implements Serializable {

    public SorteoJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Sorteo sorteo) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(sorteo);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findSorteo(sorteo.getIdSorteo()) != null) {
                throw new PreexistingEntityException("Sorteo " + sorteo + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Sorteo sorteo) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            sorteo = em.merge(sorteo);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Short id = sorteo.getIdSorteo();
                if (findSorteo(id) == null) {
                    throw new NonexistentEntityException("The sorteo with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Short id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Sorteo sorteo;
            try {
                sorteo = em.getReference(Sorteo.class, id);
                sorteo.getIdSorteo();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The sorteo with id " + id + " no longer exists.", enfe);
            }
            em.remove(sorteo);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Sorteo> findSorteoEntities() {
        return findSorteoEntities(true, -1, -1);
    }

    public List<Sorteo> findSorteoEntities(int maxResults, int firstResult) {
        return findSorteoEntities(false, maxResults, firstResult);
    }

    private List<Sorteo> findSorteoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Sorteo.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Sorteo findSorteo(Short id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Sorteo.class, id);
        } finally {
            em.close();
        }
    }

    public int getSorteoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Sorteo> rt = cq.from(Sorteo.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
