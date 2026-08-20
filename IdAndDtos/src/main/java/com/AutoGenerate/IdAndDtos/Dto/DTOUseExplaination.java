package com.AutoGenerate.IdAndDtos.Dto;

public class DTOUseExplaination {

	/**
	 * 
	 * DTO => Data Transfer Object
	 * A DTO is a simple java class used to transfer data between layers(like Controller ↔ Service ↔ DAO)
	 * It does not contain business logic, only data(fields + getter/setters)
	 * 
	 * Why we use?
	 * -> Security - only safe data is exposed, 
	 * -> Control API Response - you don't expose full database structure,
	 * -> Improve Performance - Dto contains only required data -> less data transfer
	 * -> Loose Coupling - Your database structure can change, but API stays same(bcause DTO is separate)
	 * 
	 * How to use DTO 
	 * - Create DTO class
	 * - Use DTO in controller
	 * - Convert DTO -> Entity in Service
	 * 
	 * Advanced (for future)
	 * Later you can tools like: ModelMapper, MapStruct
	 * These automatically convert DTO ↔ Entity
	 * 
	 */
	
}
