package com.restful.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
	
	
		private Integer cNo;
		private String cName;
		private String cAddress;
		private Float billAmount;

}
