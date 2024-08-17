package com.becoder.service;

import java.util.List;

import com.becoder.dto.ProductDto;
import com.becoder.dto.ProductResponse;
import com.becoder.model.Product;

public interface ProductService {

	public Boolean saveProduct(ProductDto productDto);

	public List<ProductDto> getAllProducts();

	public ProductDto getProductById(Integer id);

	public Boolean deleteProduct(Integer id);

	public ProductResponse getProductsWithPagination(int pageNo, int pageSize, String sortBy, String sortDir);

}
