package com.covid.service;

 
public class CovidExeption extends Exception {

	private static final long serialVersionUID = -470180507998010368L;

	public CovidExeption() {
		super();
	}

	public CovidExeption(final String message) {
		super(message);
	}
}