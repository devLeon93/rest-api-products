package com.rapi.rapi.maper;

import com.rapi.rapi.dto.ProductDTO;
import com.rapi.rapi.model.Product;
import org.springframework.stereotype.Component;

/**
 * @author leonid.barsucovschi
 */
@Component
public class ProductDtoMapper {

    public ProductDTO mapToProduct(Product product){
        final ProductDTO productDTO = new ProductDTO();
        productDTO.setTitle(product.getTitle());
        productDTO.setDescription(product.getDescription());
        productDTO.setPrice(product.getPrice());

        return productDTO;
    }

}
