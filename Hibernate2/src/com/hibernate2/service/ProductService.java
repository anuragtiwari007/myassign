package com.hibernate2.service;

import java.util.Iterator;


import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hibernate.main.*;
import com.hibernate2.util.*;
public class ProductService {

	static SessionFactory sessionFactoryObj;
	static Session sessionObj;

	//////////////// POST request//////////////////////////////////////////

	/* Method to CREATE an product in the database business logic */
	public Integer addProduct(int productid, String productname,String productmodel,int productprice) {

		Transaction tx = null;
		Integer ProductId = null;

		try {

			sessionObj = HibernateUtil.buildSessionFactory().openSession();
			tx = sessionObj.beginTransaction();

			Product product = new Product(productid, productname, productmodel, productprice);// created the object of product class
			ProductId = (Integer) sessionObj.save(product); // save the object or insert the recording

			tx.commit();// explictiy call the commit esure that auto commite should be false
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			sessionObj.close();
		}
		return ProductId;
	}

	//////////////// GET request//////////////////////////////////////////

	// list

	/* Method to CREATE an product in the database business logic */
	public void ListAllProduct() {
		System.out.println(" *************from inside  ListAllProduct()**********************  ");
		Transaction tx = null;
		try {

			sessionObj = HibernateUtil.buildSessionFactory().openSession();
			tx = sessionObj.beginTransaction();
			// retrive logic
			List product = sessionObj.createQuery("from Product").list(); // select * from product: "product refer
																				// product class
			Iterator iterator = product.iterator();
			while (iterator.hasNext()) {
				Product product1 = (Product) iterator.next();
				//System.out.println("Product id  " + product1.getProductid());
				System.out.println("Product name  " + product1.getProductname());
				System.out.println("product model  " + product1.getProductmodel());
				System.out.println("product price    " + product1.getProductprice());
			}

			tx.commit();// explictiy call the commit esure that auto commite should be false
		} catch (

		HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			sessionObj.close();
		}
	}

// update

////////////////PUT request   id//////////////////////////////////////////

	/* Method to update an product in the database business logic */
	public void updateProductDetails(int productId, int productprice ) {
		System.out.println(" *************from inside  updateProductDetails()**********************  ");
		Transaction tx = null;
		try {

			sessionObj = HibernateUtil.buildSessionFactory().openSession();
			tx = sessionObj.beginTransaction();
			// update logic

			Product product = (Product) sessionObj.get(Product.class, productId);

			
			product.setProductprice(productprice);
			sessionObj.update(product);// hibernate will form update query automatically

			System.out.println("update sucessfully...");

			tx.commit();// explictiy call the commit esure that auto commite should be false
		} catch (

		HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			sessionObj.close();
		}

	}

// delete

////////////////PUT request   id//////////////////////////////////////////

	/* Method to update an product in the database business logic */
	public void deleteProductDetailsById(Integer productId, int salary) {
		System.out.println(" *************from inside  deleteProductDetailsById()**********************  ");
		Transaction tx = null;
		try {

			sessionObj = HibernateUtil.buildSessionFactory().openSession();
			tx = sessionObj.beginTransaction();
//update logic

			Product product = (Product) sessionObj.get(Product.class, productId);

			product.setProductprice(salary);

			sessionObj.delete(product);// hibernate will form delete query automatically

			System.out.println("deleted sucessfully..."+product.getId());

			tx.commit();// explictiy call the commit esure that auto commite should be false
		} catch (

		HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			sessionObj.close();
		}

	}

}