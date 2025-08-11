package com.ktdsuniversity.edu.fp.shop;

import java.util.List;

@FunctionalInterface
public interface Extracter {

	Product get(List<Product> product, Product searchProduct);
}
