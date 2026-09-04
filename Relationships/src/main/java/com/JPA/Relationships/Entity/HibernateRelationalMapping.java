package com.JPA.Relationships.Entity;

public class HibernateRelationalMapping {

/**
 * Relational Mapping (ORM) means:	👉 Converting Java Objects ↔ Database Tables
									Java class → Table
									Object → Row
									Fields → Columns
   This is handled by:
					JPA (Specification)
					Hibernate (Implementation of JPA)
 * 👉 ORM does: SQL generation, Mapping, Data conversion
 * 
 * 🔷 Types of Relationships: 1️ One-to-One Mapping, 2️ One-to-Many Mapping, 3️ Many-to-One Mapping
 * 													4️ Many-to-Many Mapping
 * 
 * 	🔷 How It Works Internally :
 *			You create entity classes -> Hibernate reads annotations -> Generates tables
 * 			-> Manages relationships using:  Foreign keys, Join tables
 * 
 * 🔥 Important Rule: In a typical One-to-Many / Many-to-One relationship:
 *  -> The foreign key is stored on the Many side. Why? - Because every individual student needs to know which department they belong to.
 * 
 * @ManyToOne -> in order class private Customer customer;The relationship from the perspective of Order is:Many Orders → One Customer
 * 				Therefore, we use: @ManyToOne But Hibernate still needs to know: Where should the foreign key be stored?
 * 					We tell it using: @JoinColumn(name = "customer_id") You are essentially telling Hibernate:
 * 				Many Order objects can belong to one Customer, and the ORDERS table should contain a foreign key called customer_id.
 * 
 * @OneToMany -> One Customer → Many Orders   From the opposite direction: Many Orders → One Customer
 * 				This is important because the same database relationship can be viewed from two directions.
 * 				Since one customer has many orders, ORDERS is the many side.
 * 				Database: customer_id = 1 | Java: Customer customer - Hibernate will connect these two concepts.
 * 
 * You should not think of @ManyToOne as something that creates the relationship by magic.
 * The actual relationship exists because of the database foreign key: customer_id → customer.id
 * @ManyToOne simply tells Hibernate: "This Java object reference represents that database relationship."
 * 
 * 
 * Now you know:  Customer → OneToMany → Orders
 * 				  Order → ManyToOne → Customer
 *  If the relationship is the same, why do we need both @OneToMany and @ManyToOne ?
 *  That's where unidirectional vs bidirectional relationships begin—and it is one of the most important concepts in Hibernate.
 * 
 * 

 */
	
	
}
