package com.JPA.ConnectDBTable.Entity;

public class JPA_Annotations {

/**
 *  JPA annotations tell Java and JPA how your Java objects should be mapped to database tables.
 *  For example:
			Java Class       → Database Table
			Java Object      → Table Row
			Java Field       → Table Column
 *   So we use JPA annotations to give JPA this information.
 * @Entity - This Java class represents a database table. Now JPA treats Student as an entity.
 * 
 * @Table - By default, JPA generally uses the class name as the table name.    
 * 			But suppose your database table should be named students.
 * Why use @Table?   To customize: table name, schema, unique constraints
 * 
 * @Id - Every database table should have a way to uniquely identify a record.id is the Primary Key.
 * 
 * @GeneratedValue - Suppose you don't want to manually provide IDs.the ID can be generated automatically.	
 *    Generation strategies -> 
 *      IDENTITY - @GeneratedValue(strategy = GenerationType.IDENTITY) The database generates the ID.
 *      SEQUENCE - Uses a database sequence.
 *      AUTO - JPA chooses an appropriate strategy.
 * 
 * @Column - By default, JPA uses the field name as the column name.If you want explicit control:
 *            @Column(name = "student_name"), nullable, unique, length
 * 
 * @Transient - Sometimes a field exists in your Java class, but you don't want to save it in the database.
 *              JPA will ignore. 								       
 * 																	    @Enumerated(EnumType.STRING)
 * @Enumerated - We use @Enumerated to tell JPA how to store the enum.   private Gender gender;      
 *        
 * @OneToOne - Used when one object is connected to exactly one other object.  Person → Passport
 * 				Default fetch type is EAGER.
 * @OneToMany- One object has many objects. Department → Employees. MappedBy -> Avoid extra table
 *              Default fetch type is LAZY.                       without it hibernate create extra table.
 * @ManyToOne- Many objects belong to one object.    Many Students → One Department
 * 				Default fetch type is EAGER.
 * @ManyToMany-Many objects are related to many objects. Students ↔ Courses
 * 				Default fetch type is LAZY.
 * @JoinColumn- This is used to specify the foreign key column.To explicitly control the foreign key column name.
 * 
 * @JoinTable - Mostly used in @ManyToMany relationships. The middle table is called a join table.
 * 
 * @Lob - Used for large objects. Used when storing: large text, images, files
 * 
 * @Temporal - This annotation was traditionally used with older Java date/time classes:
 *             @Temporal(TemporalType.DATE)
			   private Date date;
 * 			For modern Java applications, prefer java.time types such as:
 * 				private LocalDate date;
				private LocalDateTime createdAt;
 * 
 * @CreationTimestamp and @UpdateTimestamp - These are commonly used Hibernate-specific annotations.
 *  Automatically store creation time, Automatically update modification time.
 * 
 */
	
}
