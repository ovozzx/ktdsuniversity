package com.ktdsuniversity.edu.fp.shop;

import java.util.List;

@FunctionalInterface
public interface Contains {

	boolean contains(List<Product> product, Product searchProduct);
}
