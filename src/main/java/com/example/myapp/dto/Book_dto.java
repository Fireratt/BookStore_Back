package com.example.myapp.dto ;

import lombok.Data;

@Data
public class Book_dto
{
    private int bookId ; 

	private String Author ; 

	private String Name ; 

    private double Price ; 

	private String Description ; 

	private int Storage ; 

    private double RealPrice ; 
// Byte array should encode it in the base64 format in this string
	private String cover ; 
    public Book_dto(int Book_Id , String iName, String iAuthor 
		, String iDescription, double iPrice,double real_price , int iStorage , String cover)
	{
		this.bookId = Book_Id ; 
		this.Name = iName ; 
		this.Price = iPrice ; 
		Author = iAuthor ; 
		Description = iDescription ; 
        Storage = iStorage ; 
        RealPrice = real_price ; 
		this.cover = cover ; 
	}

}