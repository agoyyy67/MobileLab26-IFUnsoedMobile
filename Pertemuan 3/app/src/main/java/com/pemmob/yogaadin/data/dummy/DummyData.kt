package com.pemmob.yogaadin.data.dummy

import com.pemmob.yogaadin.data.model.Category
import com.pemmob.yogaadin.data.model.Product

object DummyData {
    val categories = listOf(
        Category(id = 1, name = "Makanan", description = "Aneka Makanan Lokal", products_count = 5),
        Category(id = 2, name = "Minuman", description = "Minuman Segar", products_count = 5),
        Category(id = 3, name = "Kerajinan", description = "Kerajinan Tangan", products_count = 5)
    )

    val products = listOf(
        // Makanan (category_id = 1)
        Product(id = 1, category_id = 1, category = categories[0], name = "Kripik Singkong", description = "Kripik gurih", price = 15000.0, stock = 20, img = "dummy_product"),
        Product(id = 2, category_id = 1, category = categories[0], name = "Mendoan", description = "Tempe mendoan lezat", price = 20000.0, stock = 15, img = "dummy_product"),
        Product(id = 3, category_id = 1, category = categories[0], name = "Sale Pisang", description = "Sale manis legit", price = 25000.0, stock = 30, img = "dummy_product"),
        Product(id = 4, category_id = 1, category = categories[0], name = "Getuk Goreng", description = "Getuk khas Sokaraja", price = 30000.0, stock = 40, img = "dummy_product"),
        Product(id = 5, category_id = 1, category = categories[0], name = "Nopia", description = "Kue nopia khas", price = 22000.0, stock = 25, img = "dummy_product"),

        // Minuman (category_id = 2)
        Product(id = 6, category_id = 2, category = categories[1], name = "Es Dawet", description = "Dawet ayu segar", price = 10000.0, stock = 50, img = "dummy_product"),
        Product(id = 7, category_id = 2, category = categories[1], name = "Wedang Jahe", description = "Hangat menyehatkan", price = 8000.0, stock = 30, img = "dummy_product"),
        Product(id = 8, category_id = 2, category = categories[1], name = "Kopi Banyumas", description = "Kopi robusta pilihan", price = 12000.0, stock = 40, img = "dummy_product"),
        Product(id = 9, category_id = 2, category = categories[1], name = "Teh Poci", description = "Teh seduh tanah liat", price = 7000.0, stock = 60, img = "dummy_product"),
        Product(id = 10, category_id = 2, category = categories[1], name = "Sirup Pala", description = "Manis menyegarkan", price = 18000.0, stock = 15, img = "dummy_product"),

        // Kerajinan (category_id = 3)
        Product(id = 11, category_id = 3, category = categories[2], name = "Batik Banyumasan", description = "Kain batik khas", price = 150000.0, stock = 10, img = "dummy_product"),
        Product(id = 12, category_id = 3, category = categories[2], name = "Sandal Bandol", description = "Sandal ban bekas awet", price = 35000.0, stock = 25, img = "dummy_product"),
        Product(id = 13, category_id = 3, category = categories[2], name = "Sapu Glagah", description = "Sapu alami berkualitas", price = 25000.0, stock = 50, img = "dummy_product"),
        Product(id = 14, category_id = 3, category = categories[2], name = "Anyaman Bambu", description = "Peralatan rumah tangga", price = 40000.0, stock = 20, img = "dummy_product"),
        Product(id = 15, category_id = 3, category = categories[2], name = "Ukiran Kayu", description = "Hiasan dinding estetik", price = 95000.0, stock = 8, img = "dummy_product")
    )
}