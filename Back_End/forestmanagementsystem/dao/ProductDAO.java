package com.cagemini.forestmanagementsystem.dao;

import java.util.List;

import com.capgemini.forestmanagementsystem.bean.Product;

public interface ProductDAO 
{
public boolean addproduct(Product pobj);
public boolean deleteProduct(int prodid);
public boolean modifyProductName(int prodid,String product_name);
public boolean modifyProductDate(int prodid,String product_date);
public Product searchProduct(int prodid);
public List<Product>  getAllProduct();
}
