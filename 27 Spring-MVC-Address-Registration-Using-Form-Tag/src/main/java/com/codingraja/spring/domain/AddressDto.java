package com.codingraja.spring.domain;

public class AddressDto {
		private long id;
		private String houseNo;
		private String street;
		private String city;
		private String state;
		private long zipcode;
		
		public AddressDto(){}

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public String getHouseNo() {
			return houseNo;
		}

		public void setHouseNo(String houseNo) {
			this.houseNo = houseNo;
		}

		public String getStreet() {
			return street;
		}

		public void setStreet(String street) {
			this.street = street;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getState() {
			return state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public long getZipcode() {
			return zipcode;
		}

		public void setZipcode(long zipcode) {
			this.zipcode = zipcode;
		}
		
}
