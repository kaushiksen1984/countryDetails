package com.country.model;

public class CountryDetail {
	
	private String countryName;
	private String countryCapital;
	private String continent;
	
	public String getCountryName() {
		return countryName;
	}
	
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	
	public String getCountryCapital() {
		return countryCapital;
	}
	
	public void setCountryCapital(String countryCapital) {
		this.countryCapital = countryCapital;
	}
	
	public String getContinent() {
		return continent;
	}
	
	public void setContinent(String continent) {
		this.continent = continent;
	}

	@Override
	public String toString() {
		return "CountryDetail [countryName=" + countryName + ", countryCapital=" + countryCapital + ", continent="
				+ continent + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((continent == null) ? 0 : continent.hashCode());
		result = prime * result + ((countryCapital == null) ? 0 : countryCapital.hashCode());
		result = prime * result + ((countryName == null) ? 0 : countryName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CountryDetail other = (CountryDetail) obj;
		if (continent == null) {
			if (other.continent != null)
				return false;
		} else if (!continent.equals(other.continent))
			return false;
		if (countryCapital == null) {
			if (other.countryCapital != null)
				return false;
		} else if (!countryCapital.equals(other.countryCapital))
			return false;
		if (countryName == null) {
			if (other.countryName != null)
				return false;
		} else if (!countryName.equals(other.countryName))
			return false;
		return true;
	}

}

